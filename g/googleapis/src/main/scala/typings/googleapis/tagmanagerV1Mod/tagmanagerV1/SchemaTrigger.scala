package typings.googleapis.tagmanagerV1Mod.tagmanagerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Tag Manager Trigger
  */
@js.native
trait SchemaTrigger extends StObject {
  
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
    * Additional parameters.
    */
  var parameter: js.UndefOr[js.Array[SchemaParameter]] = js.native
  
  /**
    * Parent folder id.
    */
  var parentFolderId: js.UndefOr[String] = js.native
  
  /**
    * A click trigger CSS selector (i.e. &quot;a&quot;, &quot;button&quot;
    * etc.). Only valid for AMP Click trigger.
    */
  var selector: js.UndefOr[SchemaParameter] = js.native
  
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
}
object SchemaTrigger {
  
  @scala.inline
  def apply(): SchemaTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrigger]
  }
  
  @scala.inline
  implicit class SchemaTriggerMutableBuilder[Self <: SchemaTrigger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setAutoEventFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "autoEventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoEventFilterUndefined: Self = StObject.set(x, "autoEventFilter", js.undefined)
    
    @scala.inline
    def setAutoEventFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "autoEventFilter", js.Array(value :_*))
    
    @scala.inline
    def setCheckValidation(value: SchemaParameter): Self = StObject.set(x, "checkValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckValidationUndefined: Self = StObject.set(x, "checkValidation", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = StObject.set(x, "containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerIdUndefined: Self = StObject.set(x, "containerId", js.undefined)
    
    @scala.inline
    def setContinuousTimeMinMilliseconds(value: SchemaParameter): Self = StObject.set(x, "continuousTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousTimeMinMillisecondsUndefined: Self = StObject.set(x, "continuousTimeMinMilliseconds", js.undefined)
    
    @scala.inline
    def setCustomEventFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "customEventFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomEventFilterUndefined: Self = StObject.set(x, "customEventFilter", js.undefined)
    
    @scala.inline
    def setCustomEventFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "customEventFilter", js.Array(value :_*))
    
    @scala.inline
    def setEventName(value: SchemaParameter): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventNameUndefined: Self = StObject.set(x, "eventName", js.undefined)
    
    @scala.inline
    def setFilter(value: js.Array[SchemaCondition]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: SchemaCondition*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setFingerprint(value: String): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFingerprintUndefined: Self = StObject.set(x, "fingerprint", js.undefined)
    
    @scala.inline
    def setHorizontalScrollPercentageList(value: SchemaParameter): Self = StObject.set(x, "horizontalScrollPercentageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalScrollPercentageListUndefined: Self = StObject.set(x, "horizontalScrollPercentageList", js.undefined)
    
    @scala.inline
    def setInterval(value: SchemaParameter): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalSeconds(value: SchemaParameter): Self = StObject.set(x, "intervalSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalSecondsUndefined: Self = StObject.set(x, "intervalSeconds", js.undefined)
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setLimit(value: SchemaParameter): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMaxTimerLengthSeconds(value: SchemaParameter): Self = StObject.set(x, "maxTimerLengthSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimerLengthSecondsUndefined: Self = StObject.set(x, "maxTimerLengthSeconds", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameter(value: js.Array[SchemaParameter]): Self = StObject.set(x, "parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterUndefined: Self = StObject.set(x, "parameter", js.undefined)
    
    @scala.inline
    def setParameterVarargs(value: SchemaParameter*): Self = StObject.set(x, "parameter", js.Array(value :_*))
    
    @scala.inline
    def setParentFolderId(value: String): Self = StObject.set(x, "parentFolderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentFolderIdUndefined: Self = StObject.set(x, "parentFolderId", js.undefined)
    
    @scala.inline
    def setSelector(value: SchemaParameter): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setTotalTimeMinMilliseconds(value: SchemaParameter): Self = StObject.set(x, "totalTimeMinMilliseconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalTimeMinMillisecondsUndefined: Self = StObject.set(x, "totalTimeMinMilliseconds", js.undefined)
    
    @scala.inline
    def setTriggerId(value: String): Self = StObject.set(x, "triggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerIdUndefined: Self = StObject.set(x, "triggerId", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUniqueTriggerId(value: SchemaParameter): Self = StObject.set(x, "uniqueTriggerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUniqueTriggerIdUndefined: Self = StObject.set(x, "uniqueTriggerId", js.undefined)
    
    @scala.inline
    def setVerticalScrollPercentageList(value: SchemaParameter): Self = StObject.set(x, "verticalScrollPercentageList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticalScrollPercentageListUndefined: Self = StObject.set(x, "verticalScrollPercentageList", js.undefined)
    
    @scala.inline
    def setVisibilitySelector(value: SchemaParameter): Self = StObject.set(x, "visibilitySelector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilitySelectorUndefined: Self = StObject.set(x, "visibilitySelector", js.undefined)
    
    @scala.inline
    def setVisiblePercentageMax(value: SchemaParameter): Self = StObject.set(x, "visiblePercentageMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisiblePercentageMaxUndefined: Self = StObject.set(x, "visiblePercentageMax", js.undefined)
    
    @scala.inline
    def setVisiblePercentageMin(value: SchemaParameter): Self = StObject.set(x, "visiblePercentageMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisiblePercentageMinUndefined: Self = StObject.set(x, "visiblePercentageMin", js.undefined)
    
    @scala.inline
    def setWaitForTags(value: SchemaParameter): Self = StObject.set(x, "waitForTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTagsTimeout(value: SchemaParameter): Self = StObject.set(x, "waitForTagsTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForTagsTimeoutUndefined: Self = StObject.set(x, "waitForTagsTimeout", js.undefined)
    
    @scala.inline
    def setWaitForTagsUndefined: Self = StObject.set(x, "waitForTags", js.undefined)
  }
}
