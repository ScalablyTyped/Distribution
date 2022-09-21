package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTag extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var blockingRuleId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var blockingTriggerId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever the tag is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Firing rule IDs. A tag will fire when any of the listed rules are true and all of its blockingRuleIds (if any specified) are false. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var firingRuleId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its blockingTriggerIds (if any specified) are false. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var firingTriggerId: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  /**
    * If set to true, this tag will only fire in the live environment (e.g. not in preview or debug mode). @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var liveOnly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Tag display name. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User notes on how to apply this tag in the container. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The tag's parameters. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * True if the tag is paused. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var paused: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority. Tags with higher numeric value fire first. A tag's priority can be a positive or negative value. The default value is 0. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var priority: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The end timestamp in milliseconds to schedule a tag. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var scheduleEndMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The start timestamp in milliseconds to schedule a tag. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var scheduleStartMs: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of setup tags. Currently we only allow one.
    */
  var setupTag: js.UndefOr[js.Array[SchemaSetupTag]] = js.undefined
  
  /**
    * Option to fire this tag.
    */
  var tagFiringOption: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The Tag ID uniquely identifies the GTM Tag.
    */
  var tagId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The list of teardown tags. Currently we only allow one.
    */
  var teardownTag: js.UndefOr[js.Array[SchemaTeardownTag]] = js.undefined
  
  /**
    * GTM Tag Type. @mutable tagmanager.accounts.containers.tags.create @mutable tagmanager.accounts.containers.tags.update
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaTag {
  
  inline def apply(): SchemaTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTag]
  }
  
  extension [Self <: SchemaTag](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setBlockingRuleId(value: js.Array[String]): Self = StObject.set(x, "blockingRuleId", value.asInstanceOf[js.Any])
    
    inline def setBlockingRuleIdNull: Self = StObject.set(x, "blockingRuleId", null)
    
    inline def setBlockingRuleIdUndefined: Self = StObject.set(x, "blockingRuleId", js.undefined)
    
    inline def setBlockingRuleIdVarargs(value: String*): Self = StObject.set(x, "blockingRuleId", js.Array(value*))
    
    inline def setBlockingTriggerId(value: js.Array[String]): Self = StObject.set(x, "blockingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setBlockingTriggerIdNull: Self = StObject.set(x, "blockingTriggerId", null)
    
    inline def setBlockingTriggerIdUndefined: Self = StObject.set(x, "blockingTriggerId", js.undefined)
    
    inline def setBlockingTriggerIdVarargs(value: String*): Self = StObject.set(x, "blockingTriggerId", js.Array(value*))
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setFiringRuleId(value: js.Array[String]): Self = StObject.set(x, "firingRuleId", value.asInstanceOf[js.Any])
    
    inline def setFiringRuleIdNull: Self = StObject.set(x, "firingRuleId", null)
    
    inline def setFiringRuleIdUndefined: Self = StObject.set(x, "firingRuleId", js.undefined)
    
    inline def setFiringRuleIdVarargs(value: String*): Self = StObject.set(x, "firingRuleId", js.Array(value*))
    
    inline def setFiringTriggerId(value: js.Array[String]): Self = StObject.set(x, "firingTriggerId", value.asInstanceOf[js.Any])
    
    inline def setFiringTriggerIdNull: Self = StObject.set(x, "firingTriggerId", null)
    
    inline def setFiringTriggerIdUndefined: Self = StObject.set(x, "firingTriggerId", js.undefined)
    
    inline def setFiringTriggerIdVarargs(value: String*): Self = StObject.set(x, "firingTriggerId", js.Array(value*))
    
    inline def setLiveOnly(value: Boolean): Self = StObject.set(x, "liveOnly", value.asInstanceOf[js.Any])
    
    inline def setLiveOnlyNull: Self = StObject.set(x, "liveOnly", null)
    
    inline def setLiveOnlyUndefined: Self = StObject.set(x, "liveOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
    
    inline def setNotesNull: Self = StObject.set(x, "notes", null)
    
    inline def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    
    inline def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    inline def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    inline def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value*))
    
    inline def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    inline def setParentFolderIdNull: Self = StObject.set(x, "parentFolderId", null)
    
    inline def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPausedNull: Self = StObject.set(x, "paused", null)
    
    inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
    
    inline def setPriority(value: SchemaParameter): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setScheduleEndMs(value: String): Self = StObject.set(x, "scheduleEndMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleEndMsNull: Self = StObject.set(x, "scheduleEndMs", null)
    
    inline def setScheduleEndMsUndefined: Self = StObject.set(x, "scheduleEndMs", js.undefined)
    
    inline def setScheduleStartMs(value: String): Self = StObject.set(x, "scheduleStartMs", value.asInstanceOf[js.Any])
    
    inline def setScheduleStartMsNull: Self = StObject.set(x, "scheduleStartMs", null)
    
    inline def setScheduleStartMsUndefined: Self = StObject.set(x, "scheduleStartMs", js.undefined)
    
    inline def setSetupTag(value: js.Array[SchemaSetupTag]): Self = StObject.set(x, "setupTag", value.asInstanceOf[js.Any])
    
    inline def setSetupTagUndefined: Self = StObject.set(x, "setupTag", js.undefined)
    
    inline def setSetupTagVarargs(value: SchemaSetupTag*): Self = StObject.set(x, "setupTag", js.Array(value*))
    
    inline def setTagFiringOption(value: String): Self = StObject.set(x, "tagFiringOption", value.asInstanceOf[js.Any])
    
    inline def setTagFiringOptionNull: Self = StObject.set(x, "tagFiringOption", null)
    
    inline def setTagFiringOptionUndefined: Self = StObject.set(x, "tagFiringOption", js.undefined)
    
    inline def setTagId(value: String): Self = StObject.set(x, "tagId", value.asInstanceOf[js.Any])
    
    inline def setTagIdNull: Self = StObject.set(x, "tagId", null)
    
    inline def setTagIdUndefined: Self = StObject.set(x, "tagId", js.undefined)
    
    inline def setTeardownTag(value: js.Array[SchemaTeardownTag]): Self = StObject.set(x, "teardownTag", value.asInstanceOf[js.Any])
    
    inline def setTeardownTagUndefined: Self = StObject.set(x, "teardownTag", js.undefined)
    
    inline def setTeardownTagVarargs(value: SchemaTeardownTag*): Self = StObject.set(x, "teardownTag", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
