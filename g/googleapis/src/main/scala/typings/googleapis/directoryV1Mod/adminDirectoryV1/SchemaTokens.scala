package typings.googleapis.directoryV1Mod.adminDirectoryV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON response template for List tokens operation in Directory API.
  */
@js.native
trait SchemaTokens extends StObject {
  
  /**
    * ETag of the resource.
    */
  var etag: js.UndefOr[String] = js.native
  
  /**
    * A list of Token resources.
    */
  var items: js.UndefOr[js.Array[SchemaToken]] = js.native
  
  /**
    * The type of the API resource. This is always admin#directory#tokenList.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaTokens {
  
  @scala.inline
  def apply(): SchemaTokens = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTokens]
  }
  
  @scala.inline
  implicit class SchemaTokensMutableBuilder[Self <: SchemaTokens] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[SchemaToken]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: SchemaToken*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
