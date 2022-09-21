package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1ParentRelation extends StObject {
  
  /**
    * Output only. The custom name of the relation -- e.g., structure/room where the device is assigned to.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The name of the relation -- e.g., structure/room where the device is assigned to. For example: "enterprises/XYZ/structures/ABC" or "enterprises/XYZ/structures/ABC/rooms/123"
    */
  var parent: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1ParentRelation {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1ParentRelation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1ParentRelation]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1ParentRelation](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentNull: Self = StObject.set(x, "parent", null)
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
