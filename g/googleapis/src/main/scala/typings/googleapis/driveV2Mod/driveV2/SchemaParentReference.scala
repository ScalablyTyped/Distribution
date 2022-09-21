package typings.googleapis.driveV2Mod.driveV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaParentReference extends StObject {
  
  /**
    * The ID of the parent.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Whether or not the parent is the root folder.
    */
  var isRoot: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This is always drive#parentReference.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link to the parent.
    */
  var parentLink: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A link back to this reference.
    */
  var selfLink: js.UndefOr[String | Null] = js.undefined
}
object SchemaParentReference {
  
  inline def apply(): SchemaParentReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaParentReference]
  }
  
  extension [Self <: SchemaParentReference](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsRoot(value: Boolean): Self = StObject.set(x, "isRoot", value.asInstanceOf[js.Any])
    
    inline def setIsRootNull: Self = StObject.set(x, "isRoot", null)
    
    inline def setIsRootUndefined: Self = StObject.set(x, "isRoot", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setParentLink(value: String): Self = StObject.set(x, "parentLink", value.asInstanceOf[js.Any])
    
    inline def setParentLinkNull: Self = StObject.set(x, "parentLink", null)
    
    inline def setParentLinkUndefined: Self = StObject.set(x, "parentLink", js.undefined)
    
    inline def setSelfLink(value: String): Self = StObject.set(x, "selfLink", value.asInstanceOf[js.Any])
    
    inline def setSelfLinkNull: Self = StObject.set(x, "selfLink", null)
    
    inline def setSelfLinkUndefined: Self = StObject.set(x, "selfLink", js.undefined)
  }
}
