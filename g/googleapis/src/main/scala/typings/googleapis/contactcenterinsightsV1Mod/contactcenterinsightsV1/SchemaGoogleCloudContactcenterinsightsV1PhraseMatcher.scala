package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher extends StObject {
  
  /**
    * Output only. The most recent time at which the activation status was updated.
    */
  var activationUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Applies the phrase matcher only when it is active.
    */
  var active: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The human-readable name of the phrase matcher.
    */
  var displayName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The resource name of the phrase matcher. Format: projects/{project\}/locations/{location\}/phraseMatchers/{phrase_matcher\}
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A list of phase match rule groups that are included in this matcher.
    */
  var phraseMatchRuleGroups: js.UndefOr[js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup]] = js.undefined
  
  /**
    * Output only. The timestamp of when the revision was created. It is also the create time when a new matcher is added.
    */
  var revisionCreateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. Immutable. The revision ID of the phrase matcher. A new revision is committed whenever the matcher is changed, except when it is activated or deactivated. A server generated random ID will be used. Example: locations/global/phraseMatchers/my-first-matcher@1234567
    */
  var revisionId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The role whose utterances the phrase matcher should be matched against. If the role is ROLE_UNSPECIFIED it will be matched against any utterances in the transcript.
    */
  var roleMatch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Required. The type of this phrase matcher.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The most recent time at which the phrase matcher was updated.
    */
  var updateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The customized version tag to use for the phrase matcher. If not specified, it will default to `revision_id`.
    */
  var versionTag: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher {
  
  inline def apply(): SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher]
  }
  
  extension [Self <: SchemaGoogleCloudContactcenterinsightsV1PhraseMatcher](x: Self) {
    
    inline def setActivationUpdateTime(value: String): Self = StObject.set(x, "activationUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setActivationUpdateTimeNull: Self = StObject.set(x, "activationUpdateTime", null)
    
    inline def setActivationUpdateTimeUndefined: Self = StObject.set(x, "activationUpdateTime", js.undefined)
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setActiveNull: Self = StObject.set(x, "active", null)
    
    inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPhraseMatchRuleGroups(value: js.Array[SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup]): Self = StObject.set(x, "phraseMatchRuleGroups", value.asInstanceOf[js.Any])
    
    inline def setPhraseMatchRuleGroupsUndefined: Self = StObject.set(x, "phraseMatchRuleGroups", js.undefined)
    
    inline def setPhraseMatchRuleGroupsVarargs(value: SchemaGoogleCloudContactcenterinsightsV1PhraseMatchRuleGroup*): Self = StObject.set(x, "phraseMatchRuleGroups", js.Array(value*))
    
    inline def setRevisionCreateTime(value: String): Self = StObject.set(x, "revisionCreateTime", value.asInstanceOf[js.Any])
    
    inline def setRevisionCreateTimeNull: Self = StObject.set(x, "revisionCreateTime", null)
    
    inline def setRevisionCreateTimeUndefined: Self = StObject.set(x, "revisionCreateTime", js.undefined)
    
    inline def setRevisionId(value: String): Self = StObject.set(x, "revisionId", value.asInstanceOf[js.Any])
    
    inline def setRevisionIdNull: Self = StObject.set(x, "revisionId", null)
    
    inline def setRevisionIdUndefined: Self = StObject.set(x, "revisionId", js.undefined)
    
    inline def setRoleMatch(value: String): Self = StObject.set(x, "roleMatch", value.asInstanceOf[js.Any])
    
    inline def setRoleMatchNull: Self = StObject.set(x, "roleMatch", null)
    
    inline def setRoleMatchUndefined: Self = StObject.set(x, "roleMatch", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUpdateTime(value: String): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
    
    inline def setUpdateTimeNull: Self = StObject.set(x, "updateTime", null)
    
    inline def setUpdateTimeUndefined: Self = StObject.set(x, "updateTime", js.undefined)
    
    inline def setVersionTag(value: String): Self = StObject.set(x, "versionTag", value.asInstanceOf[js.Any])
    
    inline def setVersionTagNull: Self = StObject.set(x, "versionTag", null)
    
    inline def setVersionTagUndefined: Self = StObject.set(x, "versionTag", js.undefined)
  }
}
