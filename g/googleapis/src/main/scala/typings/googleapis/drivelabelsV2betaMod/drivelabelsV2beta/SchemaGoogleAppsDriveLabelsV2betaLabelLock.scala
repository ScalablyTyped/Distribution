package typings.googleapis.drivelabelsV2betaMod.drivelabelsV2beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2betaLabelLock extends StObject {
  
  /**
    * Output only. The user's capabilities on this LabelLock.
    */
  var capabilities: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities] = js.undefined
  
  /**
    * The ID of the Selection Field Choice that should be locked. If present, `field_id` must also be present.
    */
  var choiceId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The time this LabelLock was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user whose credentials were used to create the LabelLock. This will not be present if no user was responsible for creating the LabelLock.
    */
  var creator: js.UndefOr[SchemaGoogleAppsDriveLabelsV2betaUserInfo] = js.undefined
  
  /**
    * Output only. A timestamp indicating when this LabelLock was scheduled for deletion. This will be present only if this LabelLock is in the DELETING state.
    */
  var deleteTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The ID of the Field that should be locked. Empty if the whole Label should be locked.
    */
  var fieldId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Resource name of this LabelLock.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. A URI referring to the policy that created this Lock.
    */
  var policyUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. This LabelLock's state.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2betaLabelLock {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2betaLabelLock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2betaLabelLock]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2betaLabelLock](x: Self) {
    
    inline def setCapabilities(value: SchemaGoogleAppsDriveLabelsV2betaLabelLockCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setChoiceId(value: String): Self = StObject.set(x, "choiceId", value.asInstanceOf[js.Any])
    
    inline def setChoiceIdNull: Self = StObject.set(x, "choiceId", null)
    
    inline def setChoiceIdUndefined: Self = StObject.set(x, "choiceId", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: SchemaGoogleAppsDriveLabelsV2betaUserInfo): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDeleteTime(value: String): Self = StObject.set(x, "deleteTime", value.asInstanceOf[js.Any])
    
    inline def setDeleteTimeNull: Self = StObject.set(x, "deleteTime", null)
    
    inline def setDeleteTimeUndefined: Self = StObject.set(x, "deleteTime", js.undefined)
    
    inline def setFieldId(value: String): Self = StObject.set(x, "fieldId", value.asInstanceOf[js.Any])
    
    inline def setFieldIdNull: Self = StObject.set(x, "fieldId", null)
    
    inline def setFieldIdUndefined: Self = StObject.set(x, "fieldId", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPolicyUri(value: String): Self = StObject.set(x, "policyUri", value.asInstanceOf[js.Any])
    
    inline def setPolicyUriNull: Self = StObject.set(x, "policyUri", null)
    
    inline def setPolicyUriUndefined: Self = StObject.set(x, "policyUri", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
