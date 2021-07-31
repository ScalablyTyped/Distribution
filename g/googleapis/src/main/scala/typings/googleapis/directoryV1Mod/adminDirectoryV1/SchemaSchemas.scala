package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List Schema operation in Directory API.
  */
trait SchemaSchemas extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * List of UserSchema objects.
    */
  var schemas: js.UndefOr[js.Array[SchemaSchema]] = js.undefined
}
object SchemaSchemas {
  
  @scala.inline
  def apply(): SchemaSchemas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchemas]
  }
  
  @scala.inline
  implicit class SchemaSchemasMutableBuilder[Self <: SchemaSchemas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setSchemas(value: js.Array[SchemaSchema]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    @scala.inline
    def setSchemasVarargs(value: SchemaSchema*): Self = StObject.set(x, "schemas", js.Array(value :_*))
  }
}
