package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaUserDataMapping extends StObject {
  
  /**
    * Output only. Indicates the time when this mapping was archived.
    */
  var archiveTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Indicates whether this mapping is archived.
    */
  var archived: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. A unique identifier for the mapped resource.
    */
  var dataId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Resource name of the User data mapping, of the form `projects/{project_id\}/locations/{location_id\}/datasets/{dataset_id\}/consentStores/{consent_store_id\}/userDataMappings/{user_data_mapping_id\}`.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Attributes of the resource. Only explicitly set attributes are displayed here. Attribute definitions with defaults set implicitly apply to these User data mappings. Attributes listed here must be single valued, that is, exactly one value is specified for the field "values" in each Attribute.
    */
  var resourceAttributes: js.UndefOr[js.Array[SchemaAttribute]] = js.undefined
  
  /**
    * Required. User's UUID provided by the client.
    */
  var userId: js.UndefOr[String | Null] = js.undefined
}
object SchemaUserDataMapping {
  
  inline def apply(): SchemaUserDataMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserDataMapping]
  }
  
  extension [Self <: SchemaUserDataMapping](x: Self) {
    
    inline def setArchiveTime(value: String): Self = StObject.set(x, "archiveTime", value.asInstanceOf[js.Any])
    
    inline def setArchiveTimeNull: Self = StObject.set(x, "archiveTime", null)
    
    inline def setArchiveTimeUndefined: Self = StObject.set(x, "archiveTime", js.undefined)
    
    inline def setArchived(value: Boolean): Self = StObject.set(x, "archived", value.asInstanceOf[js.Any])
    
    inline def setArchivedNull: Self = StObject.set(x, "archived", null)
    
    inline def setArchivedUndefined: Self = StObject.set(x, "archived", js.undefined)
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setDataIdNull: Self = StObject.set(x, "dataId", null)
    
    inline def setDataIdUndefined: Self = StObject.set(x, "dataId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResourceAttributes(value: js.Array[SchemaAttribute]): Self = StObject.set(x, "resourceAttributes", value.asInstanceOf[js.Any])
    
    inline def setResourceAttributesUndefined: Self = StObject.set(x, "resourceAttributes", js.undefined)
    
    inline def setResourceAttributesVarargs(value: SchemaAttribute*): Self = StObject.set(x, "resourceAttributes", js.Array(value*))
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdNull: Self = StObject.set(x, "userId", null)
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
  }
}
