package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Tag.
  */
trait SchemaTag extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.undefined
  
  /**
    * Blocking rule IDs. If any of the listed rules evaluate to true, the tag
    * will not fire.
    */
  var blockingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Blocking trigger IDs. If any of the listed triggers evaluate to true, the
    * tag will not fire.
    */
  var blockingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.undefined
  
  /**
    * The fingerprint of the GTM Tag as computed at storage time. This value is
    * recomputed whenever the tag is modified.
    */
  var fingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * Firing rule IDs. A tag will fire when any of the listed rules are true
    * and all of its blockingRuleIds (if any specified) are false.
    */
  var firingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Firing trigger IDs. A tag will fire when any of the listed triggers are
    * true and all of its blockingTriggerIds (if any specified) are false.
    */
  var firingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If set to true, this tag will only fire in the live environment (e.g. not
    * in preview or debug mode).
    */
  var liveOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Tag display name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * User notes on how to apply this tag in the container.
    */
  var notes: js.UndefOr[String] = js.undefined
  
  /**
    * The tag&#39;s parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.undefined
  
  /**
    * True if the tag is paused.
    */
  var paused: js.UndefOr[Boolean] = js.undefined
  
  /**
    * User defined numeric priority of the tag. Tags are fired asynchronously
    * in order of priority. Tags with higher numeric value fire first. A
    * tag&#39;s priority can be a positive or negative value. The default value
    * is 0.
    */
  var priority: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The end timestamp in milliseconds to schedule a tag.
    */
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  
  /**
    * The start timestamp in milliseconds to schedule a tag.
    */
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  
  /**
    * The list of setup tags. Currently we only allow one.
    */
  var setupTag: js.UndefOr[js.Array[SchemaSetupTag]] = js.undefined
  
  /**
    * Option to fire this tag.
    */
  var tagFiringOption: js.UndefOr[String] = js.undefined
  
  /**
    * The Tag ID uniquely identifies the GTM Tag.
    */
  var tagId: js.UndefOr[String] = js.undefined
  
  /**
    * The list of teardown tags. Currently we only allow one.
    */
  var teardownTag: js.UndefOr[js.Array[SchemaTeardownTag]] = js.undefined
  
  /**
    * GTM Tag Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaTag {
  
  inline def apply(): SchemaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTag]
  }
  
  extension [Self <: SchemaTag](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBlockingRuleId(value: js.Array[String]): Self = StObject.set(x, "blockingRuleId", value.asInstanceOf[js.Any])
    
    inline def setBlockingRuleIdUndefined: Self = StObject.set(x, "blockingRuleId", js.undefined)
    
    inline def setBlockingRuleIdVarargs(value: String*): Self = StObject.set(x, "blockingRuleId", js.Array(value :_*))
    
    inline def setBlockingTriggerId(value: js.Array[String]): Self = StObject.set(x, "blockingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setBlockingTriggerIdUndefined: Self = StObject.set(x, "blockingTriggerId", js.undefined)
    
    inline def setBlockingTriggerIdVarargs(value: String*): Self = StObject.set(x, "blockingTriggerId", js.Array(value :_*))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFiringRuleId(value: js.Array[String]): Self = StObject.set(x, "firingRuleId", value.asInstanceOf[js.Any])
    
    inline def setFiringRuleIdUndefined: Self = StObject.set(x, "firingRuleId", js.undefined)
    
    inline def setFiringRuleIdVarargs(value: String*): Self = StObject.set(x, "firingRuleId", js.Array(value :_*))
    
    inline def setFiringTriggerId(value: js.Array[String]): Self = StObject.set(x, "firingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setFiringTriggerIdUndefined: Self = StObject.set(x, "firingTriggerId", js.undefined)
    
    inline def setFiringTriggerIdVarargs(value: String*): Self = StObject.set(x, "firingTriggerId", js.Array(value :_*))
    
    inline def setLiveOnly(value: Boolean): Self = StObject.set(x, "liveOnly", value.asInstanceOf[js.Any])
    
    inline def setLiveOnlyUndefined: Self = StObject.set(x, "liveOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setPriority(value: SchemaParameter): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    inline def setSetupTag(value: js.Array[SchemaSetupTag]): Self = StObject.set(x, "setupTag", value.asInstanceOf[js.Any])
    
    inline def setSetupTagUndefined: Self = StObject.set(x, "setupTag", js.undefined)
    
    inline def setSetupTagVarargs(value: SchemaSetupTag*): Self = StObject.set(x, "setupTag", js.Array(value :_*))
    
    inline def setTagFiringOption(value: String): Self = StObject.set(x, "tagFiringOption", value.asInstanceOf[js.Any])
    
    inline def setTagFiringOptionUndefined: Self = StObject.set(x, "tagFiringOption", js.undefined)
    
    inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
    
    inline def setTeardownTag(value: js.Array[SchemaTeardownTag]): Self = StObject.set(x, "teardownTag", value.asInstanceOf[js.Any])
    
    inline def setTeardownTagUndefined: Self = StObject.set(x, "teardownTag", js.undefined)
    
    inline def setTeardownTagVarargs(value: SchemaTeardownTag*): Self = StObject.set(x, "teardownTag", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
