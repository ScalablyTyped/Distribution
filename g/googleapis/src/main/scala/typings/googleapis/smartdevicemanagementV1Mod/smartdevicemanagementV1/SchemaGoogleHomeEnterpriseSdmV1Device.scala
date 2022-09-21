package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1Device extends StObject {
  
  /**
    * Required. The resource name of the device. For example: "enterprises/XYZ/devices/123".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Assignee details of the device.
    */
  var parentRelations: js.UndefOr[js.Array[SchemaGoogleHomeEnterpriseSdmV1ParentRelation]] = js.undefined
  
  /**
    * Output only. Device traits.
    */
  var traits: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * Output only. Type of the device for general display purposes. For example: "THERMOSTAT". The device type should not be used to deduce or infer functionality of the actual device it is assigned to. Instead, use the returned traits for the device.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1Device {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1Device = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1Device]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1Device](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParentRelations(value: js.Array[SchemaGoogleHomeEnterpriseSdmV1ParentRelation]): Self = StObject.set(x, "parentRelations", value.asInstanceOf[js.Any])
    
    inline def setParentRelationsUndefined: Self = StObject.set(x, "parentRelations", js.undefined)
    
    inline def setParentRelationsVarargs(value: SchemaGoogleHomeEnterpriseSdmV1ParentRelation*): Self = StObject.set(x, "parentRelations", js.Array(value*))
    
    inline def setTraits(value: StringDictionary[Any]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsNull: Self = StObject.set(x, "traits", null)
    
    inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
