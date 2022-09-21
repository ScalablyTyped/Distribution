package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaChildReference extends StObject {
  
  /**
    * A link to the child.
    */
  var childLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the child.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * This is always drive#childReference.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaChildReference {
  
  inline def apply(): SchemaChildReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChildReference]
  }
  
  extension [Self <: SchemaChildReference](x: Self) {
    
    inline def setChildLink(value: String): Self = StObject.set(x, "childLink", value.asInstanceOf[js.Any])
    
    inline def setChildLinkNull: Self = StObject.set(x, "childLink", null)
    
    inline def setChildLinkUndefined: Self = StObject.set(x, "childLink", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
