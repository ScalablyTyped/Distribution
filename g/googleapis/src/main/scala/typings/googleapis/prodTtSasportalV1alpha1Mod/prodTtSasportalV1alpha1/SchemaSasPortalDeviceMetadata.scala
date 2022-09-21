package typings.googleapis.prodTtSasportalV1alpha1Mod.prodTtSasportalV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSasPortalDeviceMetadata extends StObject {
  
  /**
    * If populated, the Antenna Model Pattern to use. Format is: RecordCreatorId:PatternId
    */
  var antennaModel: js.UndefOr[String | Null] = js.undefined
  
  /**
    * CCG. A group of CBSDs in the same ICG requesting a common primary channel assignment. See CBRSA-TS-2001 V3.0.0 for more details.
    */
  var commonChannelGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ICG. A group of CBSDs that manage their own interference with the group. See CBRSA-TS-2001 V3.0.0 for more details.
    */
  var interferenceCoordinationGroup: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Whether a CPI has validated to have coordinated with the National Quiet Zone office.
    */
  var nrqzValidated: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. National Radio Quiet Zone validation info.
    */
  var nrqzValidation: js.UndefOr[SchemaSasPortalNrqzValidation] = js.undefined
}
object SchemaSasPortalDeviceMetadata {
  
  inline def apply(): SchemaSasPortalDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSasPortalDeviceMetadata]
  }
  
  extension [Self <: SchemaSasPortalDeviceMetadata](x: Self) {
    
    inline def setAntennaModel(value: String): Self = StObject.set(x, "antennaModel", value.asInstanceOf[js.Any])
    
    inline def setAntennaModelNull: Self = StObject.set(x, "antennaModel", null)
    
    inline def setAntennaModelUndefined: Self = StObject.set(x, "antennaModel", js.undefined)
    
    inline def setCommonChannelGroup(value: String): Self = StObject.set(x, "commonChannelGroup", value.asInstanceOf[js.Any])
    
    inline def setCommonChannelGroupNull: Self = StObject.set(x, "commonChannelGroup", null)
    
    inline def setCommonChannelGroupUndefined: Self = StObject.set(x, "commonChannelGroup", js.undefined)
    
    inline def setInterferenceCoordinationGroup(value: String): Self = StObject.set(x, "interferenceCoordinationGroup", value.asInstanceOf[js.Any])
    
    inline def setInterferenceCoordinationGroupNull: Self = StObject.set(x, "interferenceCoordinationGroup", null)
    
    inline def setInterferenceCoordinationGroupUndefined: Self = StObject.set(x, "interferenceCoordinationGroup", js.undefined)
    
    inline def setNrqzValidated(value: Boolean): Self = StObject.set(x, "nrqzValidated", value.asInstanceOf[js.Any])
    
    inline def setNrqzValidatedNull: Self = StObject.set(x, "nrqzValidated", null)
    
    inline def setNrqzValidatedUndefined: Self = StObject.set(x, "nrqzValidated", js.undefined)
    
    inline def setNrqzValidation(value: SchemaSasPortalNrqzValidation): Self = StObject.set(x, "nrqzValidation", value.asInstanceOf[js.Any])
    
    inline def setNrqzValidationUndefined: Self = StObject.set(x, "nrqzValidation", js.undefined)
  }
}
