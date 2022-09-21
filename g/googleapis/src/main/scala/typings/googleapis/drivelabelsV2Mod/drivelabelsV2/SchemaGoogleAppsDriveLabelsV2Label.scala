package typings.googleapis.drivelabelsV2Mod.drivelabelsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleAppsDriveLabelsV2Label extends StObject {
  
  /**
    * Output only. The capabilities related to this label on applied metadata.
    */
  var appliedCapabilities: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities] = js.undefined
  
  /**
    * Output only. Behavior of this label when it's applied to Drive items.
    */
  var appliedLabelPolicy: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy] = js.undefined
  
  /**
    * Output only. The time this label was created.
    */
  var createTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user who created this label.
    */
  var creator: js.UndefOr[SchemaGoogleAppsDriveLabelsV2UserInfo] = js.undefined
  
  /**
    * Output only. The time this label was disabled. This value has no meaning when the label is not disabled.
    */
  var disableTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user who disabled this label. This value has no meaning when the label is not disabled.
    */
  var disabler: js.UndefOr[SchemaGoogleAppsDriveLabelsV2UserInfo] = js.undefined
  
  /**
    * Output only. UI display hints for rendering the label.
    */
  var displayHints: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LabelDisplayHints] = js.undefined
  
  /**
    * List of fields in descending priority order.
    */
  var fields: js.UndefOr[js.Array[SchemaGoogleAppsDriveLabelsV2Field]] = js.undefined
  
  /**
    * Output only. Globally unique identifier of this label. ID makes up part of the label `name`, but unlike `name`, ID is consistent between revisions. Matches the regex: `([a-zA-Z0-9])+`
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of label.
    */
  var labelType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Custom URL to present to users to allow them to learn more about this label and how it should be used.
    */
  var learnMoreUri: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The lifecycle state of the label including whether it's published, deprecated, and has draft changes.
    */
  var lifecycle: js.UndefOr[SchemaGoogleAppsDriveLabelsV2Lifecycle] = js.undefined
  
  /**
    * Output only. The LockStatus of this label.
    */
  var lockStatus: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LockStatus] = js.undefined
  
  /**
    * Output only. Resource name of the label. Will be in the form of either: `labels/{id\}` or `labels/{id\}@{revision_id\}` depending on the request. See `id` and `revision_id` below.
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The basic properties of the label.
    */
  var properties: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LabelProperties] = js.undefined
  
  /**
    * Output only. The time this label was published. This value has no meaning when the label is not published.
    */
  var publishTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user who published this label. This value has no meaning when the label is not published.
    */
  var publisher: js.UndefOr[SchemaGoogleAppsDriveLabelsV2UserInfo] = js.undefined
  
  /**
    * Output only. The time this label revision was created.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The user who created this label revision.
    */
  var revisionCreator: js.UndefOr[SchemaGoogleAppsDriveLabelsV2UserInfo] = js.undefined
  
  /**
    * Output only. Revision ID of the label. Revision ID might be part of the label `name` depending on the request issued. A new revision is created whenever revisioned properties of a label are changed. Matches the regex: `([a-zA-Z0-9])+`
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The capabilities the user has on this label.
    */
  var schemaCapabilities: js.UndefOr[SchemaGoogleAppsDriveLabelsV2LabelSchemaCapabilities] = js.undefined
}
object SchemaGoogleAppsDriveLabelsV2Label {
  
  inline def apply(): SchemaGoogleAppsDriveLabelsV2Label = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleAppsDriveLabelsV2Label]
  }
  
  extension [Self <: SchemaGoogleAppsDriveLabelsV2Label](x: Self) {
    
    inline def setAppliedCapabilities(value: SchemaGoogleAppsDriveLabelsV2LabelAppliedCapabilities): Self = StObject.set(x, "appliedCapabilities", value.asInstanceOf[js.Any])
    
    inline def setAppliedCapabilitiesUndefined: Self = StObject.set(x, "appliedCapabilities", js.undefined)
    
    inline def setAppliedLabelPolicy(value: SchemaGoogleAppsDriveLabelsV2LabelAppliedLabelPolicy): Self = StObject.set(x, "appliedLabelPolicy", value.asInstanceOf[js.Any])
    
    inline def setAppliedLabelPolicyUndefined: Self = StObject.set(x, "appliedLabelPolicy", js.undefined)
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeNull: Self = StObject.set(x, "createTime", null)
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setCreator(value: SchemaGoogleAppsDriveLabelsV2UserInfo): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setDisableTime(value: String): Self = StObject.set(x, "disableTime", value.asInstanceOf[js.Any])
    
    inline def setDisableTimeNull: Self = StObject.set(x, "disableTime", null)
    
    inline def setDisableTimeUndefined: Self = StObject.set(x, "disableTime", js.undefined)
    
    inline def setDisabler(value: SchemaGoogleAppsDriveLabelsV2UserInfo): Self = StObject.set(x, "disabler", value.asInstanceOf[js.Any])
    
    inline def setDisablerUndefined: Self = StObject.set(x, "disabler", js.undefined)
    
    inline def setDisplayHints(value: SchemaGoogleAppsDriveLabelsV2LabelDisplayHints): Self = StObject.set(x, "displayHints", value.asInstanceOf[js.Any])
    
    inline def setDisplayHintsUndefined: Self = StObject.set(x, "displayHints", js.undefined)
    
    inline def setFields(value: js.Array[SchemaGoogleAppsDriveLabelsV2Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: SchemaGoogleAppsDriveLabelsV2Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabelType(value: String): Self = StObject.set(x, "labelType", value.asInstanceOf[js.Any])
    
    inline def setLabelTypeNull: Self = StObject.set(x, "labelType", null)
    
    inline def setLabelTypeUndefined: Self = StObject.set(x, "labelType", js.undefined)
    
    inline def setLearnMoreUri(value: String): Self = StObject.set(x, "learnMoreUri", value.asInstanceOf[js.Any])
    
    inline def setLearnMoreUriNull: Self = StObject.set(x, "learnMoreUri", null)
    
    inline def setLearnMoreUriUndefined: Self = StObject.set(x, "learnMoreUri", js.undefined)
    
    inline def setLifecycle(value: SchemaGoogleAppsDriveLabelsV2Lifecycle): Self = StObject.set(x, "lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "lifecycle", js.undefined)
    
    inline def setLockStatus(value: SchemaGoogleAppsDriveLabelsV2LockStatus): Self = StObject.set(x, "lockStatus", value.asInstanceOf[js.Any])
    
    inline def setLockStatusUndefined: Self = StObject.set(x, "lockStatus", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProperties(value: SchemaGoogleAppsDriveLabelsV2LabelProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setPublishTime(value: String): Self = StObject.set(x, "publishTime", value.asInstanceOf[js.Any])
    
    inline def setPublishTimeNull: Self = StObject.set(x, "publishTime", null)
    
    inline def setPublishTimeUndefined: Self = StObject.set(x, "publishTime", js.undefined)
    
    inline def setPublisher(value: SchemaGoogleAppsDriveLabelsV2UserInfo): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    inline def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionCreator(value: SchemaGoogleAppsDriveLabelsV2UserInfo): Self = StObject.set(x, "revisionCreator", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreatorUndefined: Self = StObject.set(x, "revisionCreator", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setSchemaCapabilities(value: SchemaGoogleAppsDriveLabelsV2LabelSchemaCapabilities): Self = StObject.set(x, "schemaCapabilities", value.asInstanceOf[js.Any])
    
    inline def setSchemaCapabilitiesUndefined: Self = StObject.set(x, "schemaCapabilities", js.undefined)
  }
}
