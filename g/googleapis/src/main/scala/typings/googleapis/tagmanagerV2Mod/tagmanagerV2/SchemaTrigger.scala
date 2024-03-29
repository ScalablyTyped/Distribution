package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTrigger extends StObject {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Used in the case of auto event tracking. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var autoEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Whether or not we should only fire tags if the form submit or link click event is not cancelled by some other event handler (e.g. because of validation). Only valid for Form Submission and Link Click triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var checkValidation: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A visibility trigger minimum continuous visible time (in milliseconds). Only valid for AMP Visibility trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var continuousTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Used in the case of custom event, which is fired iff all Conditions are true. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var customEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * Name of the GTM event that is fired. Only valid for Timer triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var eventName: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The trigger will only fire iff all Conditions are true. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var filter: js.UndefOr[js.Array[SchemaCondition]] = js.undefined
  
  /**
    * The fingerprint of the GTM Trigger as computed at storage time. This value is recomputed whenever the trigger is modified.
    */
  var fingerprint: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of integer percentage values for scroll triggers. The trigger will fire when each percentage is reached when the view is scrolled horizontally. Only valid for AMP scroll triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var horizontalScrollPercentageList: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Time between triggering recurring Timer Events (in milliseconds). Only valid for Timer triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var interval: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Time between Timer Events to fire (in seconds). Only valid for AMP Timer trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var intervalSeconds: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Limit of the number of GTM events this Timer Trigger will fire. If no limit is set, we will continue to fire GTM events until the user leaves the page. Only valid for Timer triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var limit: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Max time to fire Timer Events (in seconds). Only valid for AMP Timer trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var maxTimerLengthSeconds: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Trigger display name. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * User notes on how to apply this trigger in the container. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var notes: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Additional parameters. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.undefined
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * GTM Trigger's API relative path.
    */
  var path: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A click trigger CSS selector (i.e. "a", "button" etc.). Only valid for AMP Click trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var selector: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A visibility trigger minimum total visible time (in milliseconds). Only valid for AMP Visibility trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var totalTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * The Trigger ID uniquely identifies the GTM Trigger.
    */
  var triggerId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Defines the data layer event that causes this trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Globally unique id of the trigger that auto-generates this (a Form Submit, Link Click or Timer listener) if any. Used to make incompatible auto-events work together with trigger filtering based on trigger ids. This value is populated during output generation since the tags implied by triggers don't exist until then. Only valid for Form Submit, Link Click and Timer triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var uniqueTriggerId: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * List of integer percentage values for scroll triggers. The trigger will fire when each percentage is reached when the view is scrolled vertically. Only valid for AMP scroll triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var verticalScrollPercentageList: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * A visibility trigger CSS selector (i.e. "#id"). Only valid for AMP Visibility trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var visibilitySelector: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * A visibility trigger maximum percent visibility. Only valid for AMP Visibility trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var visiblePercentageMax: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * A visibility trigger minimum percent visibility. Only valid for AMP Visibility trigger. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var visiblePercentageMin: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * Whether or not we should delay the form submissions or link opening until all of the tags have fired (by preventing the default action and later simulating the default action). Only valid for Form Submission and Link Click triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var waitForTags: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * How long to wait (in milliseconds) for tags to fire when 'waits_for_tags' above evaluates to true. Only valid for Form Submission and Link Click triggers. @mutable tagmanager.accounts.containers.workspaces.triggers.create @mutable tagmanager.accounts.containers.workspaces.triggers.update
    */
  var waitForTagsTimeout: js.UndefOr[SchemaParameter] = js.undefined
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String | Null] = js.undefined
}
object SchemaTrigger {
  
  inline def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  
  extension [Self <: SchemaTrigger](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdNull: Self = StObject.set(x, "accountId", null)
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setAutoEventFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "autoEventFilter", value.asInstanceOf[js.Any])
    
    inline def setAutoEventFilterUndefined: Self = StObject.set(x, "autoEventFilter", js.undefined)
    
    inline def setAutoEventFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "autoEventFilter", js.Array(value*))
    
    inline def setCheckValidation(value: SchemaParameter): Self = StObject.set(x, "checkValidation", value.asInstanceOf[js.Any])
    
    inline def setCheckValidationUndefined: Self = StObject.set(x, "checkValidation", js.undefined)
    
    inline def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    inline def setContainerIdNull: Self = StObject.set(x, "containerId", null)
    
    inline def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    inline def setContinuousTimeMinMilliseconds(value: SchemaParameter): Self = StObject.set(x, "continuousTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setContinuousTimeMinMillisecondsUndefined: Self = StObject.set(x, "continuousTimeMinMilliseconds", js.undefined)
    
    inline def setCustomEventFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "customEventFilter", value.asInstanceOf[js.Any])
    
    inline def setCustomEventFilterUndefined: Self = StObject.set(x, "customEventFilter", js.undefined)
    
    inline def setCustomEventFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "customEventFilter", js.Array(value*))
    
    inline def setEventName(value: SchemaParameter): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    inline def setFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setFingerprintNull: Self = StObject.set(x, "fingerprint", null)
    
    inline def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    inline def setHorizontalScrollPercentageList(value: SchemaParameter): Self = StObject.set(x, "horizontalScrollPercentageList", value.asInstanceOf[js.Any])
    
    inline def setHorizontalScrollPercentageListUndefined: Self = StObject.set(x, "horizontalScrollPercentageList", js.undefined)
    
    inline def setInterval(value: SchemaParameter): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalSeconds(value: SchemaParameter): Self = StObject.set(x, "intervalSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalSecondsUndefined: Self = StObject.set(x, "intervalSeconds", js.undefined)
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setLimit(value: SchemaParameter): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMaxTimerLengthSeconds(value: SchemaParameter): Self = StObject.set(x, "maxTimerLengthSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxTimerLengthSecondsUndefined: Self = StObject.set(x, "maxTimerLengthSeconds", js.undefined)
    
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
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathNull: Self = StObject.set(x, "path", null)
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSelector(value: SchemaParameter): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    inline def setTagManagerUrl(value: String): Self = StObject.set(x, "tagManagerUrl", value.asInstanceOf[js.Any])
    
    inline def setTagManagerUrlNull: Self = StObject.set(x, "tagManagerUrl", null)
    
    inline def setTagManagerUrlUndefined: Self = StObject.set(x, "tagManagerUrl", js.undefined)
    
    inline def setTotalTimeMinMilliseconds(value: SchemaParameter): Self = StObject.set(x, "totalTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setTotalTimeMinMillisecondsUndefined: Self = StObject.set(x, "totalTimeMinMilliseconds", js.undefined)
    
    inline def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    inline def setTriggerIdNull: Self = StObject.set(x, "triggerId", null)
    
    inline def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUniqueTriggerId(value: SchemaParameter): Self = StObject.set(x, "uniqueTriggerId", value.asInstanceOf[js.Any])
    
    inline def setUniqueTriggerIdUndefined: Self = StObject.set(x, "uniqueTriggerId", js.undefined)
    
    inline def setVerticalScrollPercentageList(value: SchemaParameter): Self = StObject.set(x, "verticalScrollPercentageList", value.asInstanceOf[js.Any])
    
    inline def setVerticalScrollPercentageListUndefined: Self = StObject.set(x, "verticalScrollPercentageList", js.undefined)
    
    inline def setVisibilitySelector(value: SchemaParameter): Self = StObject.set(x, "visibilitySelector", value.asInstanceOf[js.Any])
    
    inline def setVisibilitySelectorUndefined: Self = StObject.set(x, "visibilitySelector", js.undefined)
    
    inline def setVisiblePercentageMax(value: SchemaParameter): Self = StObject.set(x, "visiblePercentageMax", value.asInstanceOf[js.Any])
    
    inline def setVisiblePercentageMaxUndefined: Self = StObject.set(x, "visiblePercentageMax", js.undefined)
    
    inline def setVisiblePercentageMin(value: SchemaParameter): Self = StObject.set(x, "visiblePercentageMin", value.asInstanceOf[js.Any])
    
    inline def setVisiblePercentageMinUndefined: Self = StObject.set(x, "visiblePercentageMin", js.undefined)
    
    inline def setWaitForTags(value: SchemaParameter): Self = StObject.set(x, "waitForTags", value.asInstanceOf[js.Any])
    
    inline def setWaitForTagsTimeout(value: SchemaParameter): Self = StObject.set(x, "waitForTagsTimeout", value.asInstanceOf[js.Any])
    
    inline def setWaitForTagsTimeoutUndefined: Self = StObject.set(x, "waitForTagsTimeout", js.undefined)
    
    inline def setWaitForTagsUndefined: Self = StObject.set(x, "waitForTags", js.undefined)
    
    inline def setWorkspaceId(value: String): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdNull: Self = StObject.set(x, "workspaceId", null)
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
