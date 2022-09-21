package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPropertyList extends StObject {
  
  /**
    * The ETag of the list.
    */
  var etag: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of properties.
    */
  var items: js.UndefOr[js.Array[SchemaProperty]] = js.undefined
  
  /**
    * This is always drive#propertyList.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The link back to this list.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaPropertyList {
  
  inline def apply(): SchemaPropertyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPropertyList]
  }
  
  extension [Self <: SchemaPropertyList](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagNull: Self = StObject.set(x, "etag", null)
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setItems(value: js.Array[SchemaProperty]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SchemaProperty*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
