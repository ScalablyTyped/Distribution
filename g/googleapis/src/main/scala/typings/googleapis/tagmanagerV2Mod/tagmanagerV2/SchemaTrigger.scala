package typings.googleapis.tagmanagerV2Mod.tagmanagerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Trigger
  */
@js.native
trait SchemaTrigger extends js.Object {
  
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Used in the case of auto event tracking.
    */
  var autoEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  
  /**
    * Whether or not we should only fire tags if the form submit or link click
    * event is not cancelled by some other event handler (e.g. because of
    * validation). Only valid for Form Submission and Link Click triggers.
    */
  var checkValidation: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  
  /**
    * A visibility trigger minimum continuous visible time (in milliseconds).
    * Only valid for AMP Visibility trigger.
    */
  var continuousTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Used in the case of custom event, which is fired iff all Conditions are
    * true.
    */
  var customEventFilter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  
  /**
    * Name of the GTM event that is fired. Only valid for Timer triggers.
    */
  var eventName: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * The trigger will only fire iff all Conditions are true.
    */
  var filter: js.UndefOr[js.Array[SchemaCondition]] = js.native
  
  /**
    * The fingerprint of the GTM Trigger as computed at storage time. This
    * value is recomputed whenever the trigger is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * horizontally. Only valid for AMP scroll triggers.
    */
  var horizontalScrollPercentageList: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Time between triggering recurring Timer Events (in milliseconds). Only
    * valid for Timer triggers.
    */
  var interval: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Time between Timer Events to fire (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var intervalSeconds: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Limit of the number of GTM events this Timer Trigger will fire. If no
    * limit is set, we will continue to fire GTM events until the user leaves
    * the page. Only valid for Timer triggers.
    */
  var limit: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Max time to fire Timer Events (in seconds). Only valid for AMP Timer
    * trigger.
    */
  var maxTimerLengthSeconds: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Trigger display name.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * User notes on how to apply this trigger in the container.
    */
  var notes: js.UndefOr[String] = js.native
  
  /**
    * Additional parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * GTM Trigger&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * A click trigger CSS selector (i.e. &quot;a&quot;, &quot;button&quot;
    * etc.). Only valid for AMP Click trigger.
    */
  var selector: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  
  /**
    * A visibility trigger minimum total visible time (in milliseconds). Only
    * valid for AMP Visibility trigger.
    */
  var totalTimeMinMilliseconds: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * The Trigger ID uniquely identifies the GTM Trigger.
    */
  var triggerId: js.UndefOr[String] = js.native
  
  /**
    * Defines the data layer event that causes this trigger.
    */
  var `type`: js.UndefOr[String] = js.native
  
  /**
    * Globally unique id of the trigger that auto-generates this (a Form
    * Submit, Link Click or Timer listener) if any. Used to make incompatible
    * auto-events work together with trigger filtering based on trigger ids.
    * This value is populated during output generation since the tags implied
    * by triggers don&#39;t exist until then. Only valid for Form Submit, Link
    * Click and Timer triggers.
    */
  var uniqueTriggerId: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * List of integer percentage values for scroll triggers. The trigger will
    * fire when each percentage is reached when the view is scrolled
    * vertically. Only valid for AMP scroll triggers.
    */
  var verticalScrollPercentageList: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * A visibility trigger CSS selector (i.e. &quot;#id&quot;). Only valid for
    * AMP Visibility trigger.
    */
  var visibilitySelector: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * A visibility trigger maximum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMax: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * A visibility trigger minimum percent visibility. Only valid for AMP
    * Visibility trigger.
    */
  var visiblePercentageMin: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * Whether or not we should delay the form submissions or link opening until
    * all of the tags have fired (by preventing the default action and later
    * simulating the default action). Only valid for Form Submission and Link
    * Click triggers.
    */
  var waitForTags: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * How long to wait (in milliseconds) for tags to fire when
    * &#39;waits_for_tags&#39; above evaluates to true. Only valid for Form
    * Submission and Link Click triggers.
    */
  var waitForTagsTimeout: js.UndefOr[SchemaParameter] = js.native
  
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}
object SchemaTrigger {
  
  @scala.inline
  def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  
  @scala.inline
  implicit class SchemaTriggerOps[Self <: SchemaTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setAutoEventFilterVarargs(value: SchemaCondition*): Self = this.set("autoEventFilter", js.Array(value :_*))
    
    @scala.inline
    def setAutoEventFilter(value: js.Array[SchemaCondition]): Self = this.set("autoEventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEventFilter: Self = this.set("autoEventFilter", js.undefined)
    
    @scala.inline
    def setCheckValidation(value: SchemaParameter): Self = this.set("checkValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckValidation: Self = this.set("checkValidation", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setContinuousTimeMinMilliseconds(value: SchemaParameter): Self = this.set("continuousTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousTimeMinMilliseconds: Self = this.set("continuousTimeMinMilliseconds", js.undefined)
    
    @scala.inline
    def setCustomEventFilterVarargs(value: SchemaCondition*): Self = this.set("customEventFilter", js.Array(value :_*))
    
    @scala.inline
    def setCustomEventFilter(value: js.Array[SchemaCondition]): Self = this.set("customEventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomEventFilter: Self = this.set("customEventFilter", js.undefined)
    
    @scala.inline
    def setEventName(value: SchemaParameter): Self = this.set("eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventName: Self = this.set("eventName", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: SchemaCondition*): Self = this.set("filter", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: js.Array[SchemaCondition]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFingerprint: Self = this.set("fingerprint", js.undefined)
    
    @scala.inline
    def setHorizontalScrollPercentageList(value: SchemaParameter): Self = this.set("horizontalScrollPercentageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalScrollPercentageList: Self = this.set("horizontalScrollPercentageList", js.undefined)
    
    @scala.inline
    def setInterval(value: SchemaParameter): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setIntervalSeconds(value: SchemaParameter): Self = this.set("intervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalSeconds: Self = this.set("intervalSeconds", js.undefined)
    
    @scala.inline
    def setLimit(value: SchemaParameter): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setMaxTimerLengthSeconds(value: SchemaParameter): Self = this.set("maxTimerLengthSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTimerLengthSeconds: Self = this.set("maxTimerLengthSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotes(value: String): Self = this.set("notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes: Self = this.set("notes", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: SchemaParameter*): Self = this.set("parameter", js.Array(value :_*))
    
    @scala.inline
    def setParameter(value: js.Array[SchemaParameter]): Self = this.set("parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameter: Self = this.set("parameter", js.undefined)
    
    @scala.inline
    def setParentFolderId(value: String): Self = this.set("parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFolderId: Self = this.set("parentFolderId", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSelector(value: SchemaParameter): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelector: Self = this.set("selector", js.undefined)
    
    @scala.inline
    def setTagManagerUrl(value: String): Self = this.set("tagManagerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagManagerUrl: Self = this.set("tagManagerUrl", js.undefined)
    
    @scala.inline
    def setTotalTimeMinMilliseconds(value: SchemaParameter): Self = this.set("totalTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalTimeMinMilliseconds: Self = this.set("totalTimeMinMilliseconds", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = this.set("triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTriggerId: Self = this.set("triggerId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setUniqueTriggerId(value: SchemaParameter): Self = this.set("uniqueTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUniqueTriggerId: Self = this.set("uniqueTriggerId", js.undefined)
    
    @scala.inline
    def setVerticalScrollPercentageList(value: SchemaParameter): Self = this.set("verticalScrollPercentageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerticalScrollPercentageList: Self = this.set("verticalScrollPercentageList", js.undefined)
    
    @scala.inline
    def setVisibilitySelector(value: SchemaParameter): Self = this.set("visibilitySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilitySelector: Self = this.set("visibilitySelector", js.undefined)
    
    @scala.inline
    def setVisiblePercentageMax(value: SchemaParameter): Self = this.set("visiblePercentageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisiblePercentageMax: Self = this.set("visiblePercentageMax", js.undefined)
    
    @scala.inline
    def setVisiblePercentageMin(value: SchemaParameter): Self = this.set("visiblePercentageMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisiblePercentageMin: Self = this.set("visiblePercentageMin", js.undefined)
    
    @scala.inline
    def setWaitForTags(value: SchemaParameter): Self = this.set("waitForTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTags: Self = this.set("waitForTags", js.undefined)
    
    @scala.inline
    def setWaitForTagsTimeout(value: SchemaParameter): Self = this.set("waitForTagsTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForTagsTimeout: Self = this.set("waitForTagsTimeout", js.undefined)
    
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceId: Self = this.set("workspaceId", js.undefined)
  }
}
