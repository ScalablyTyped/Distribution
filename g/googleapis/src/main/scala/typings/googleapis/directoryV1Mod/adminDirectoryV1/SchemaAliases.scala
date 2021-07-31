package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template to list aliases in Directory API.
  */
trait SchemaAliases extends StObject {
  
  /**
    * List of alias objects.
    */
  var aliases: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaAliases {
  
  @scala.inline
  def apply(): SchemaAliases = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAliases]
  }
  
  @scala.inline
  implicit class SchemaAliasesMutableBuilder[Self <: SchemaAliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[js.Any]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: js.Any*): Self = StObject.set(x, "aliases", js.Array(value :_*))
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
