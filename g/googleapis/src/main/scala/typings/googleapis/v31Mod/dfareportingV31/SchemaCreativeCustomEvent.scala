package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creative Custom Event.
  */
@js.native
trait SchemaCreativeCustomEvent extends js.Object {
  /**
    * Unique ID of this event used by Reporting and Data Transfer. This is a
    * read-only field.
    */
  var advertiserCustomEventId: js.UndefOr[String] = js.native
  /**
    * User-entered name for the event.
    */
  var advertiserCustomEventName: js.UndefOr[String] = js.native
  /**
    * Type of the event. This is a read-only field.
    */
  var advertiserCustomEventType: js.UndefOr[String] = js.native
  /**
    * Artwork label column, used to link events in Campaign Manager back to
    * events in Studio. This is a required field and should not be modified
    * after insertion.
    */
  var artworkLabel: js.UndefOr[String] = js.native
  /**
    * Artwork type used by the creative.This is a read-only field.
    */
  var artworkType: js.UndefOr[String] = js.native
  /**
    * Exit click-through URL for the event. This field is used only for exit
    * events.
    */
  var exitClickThroughUrl: js.UndefOr[SchemaCreativeClickThroughUrl] = js.native
  /**
    * ID of this event. This is a required field and should not be modified
    * after insertion.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Properties for rich media popup windows. This field is used only for exit
    * events.
    */
  var popupWindowProperties: js.UndefOr[SchemaPopupWindowProperties] = js.native
  /**
    * Target type used by the event.
    */
  var targetType: js.UndefOr[String] = js.native
  /**
    * Video reporting ID, used to differentiate multiple videos in a single
    * creative. This is a read-only field.
    */
  var videoReportingId: js.UndefOr[String] = js.native
}

object SchemaCreativeCustomEvent {
  @scala.inline
  def apply(
    advertiserCustomEventId: String = null,
    advertiserCustomEventName: String = null,
    advertiserCustomEventType: String = null,
    artworkLabel: String = null,
    artworkType: String = null,
    exitClickThroughUrl: SchemaCreativeClickThroughUrl = null,
    id: String = null,
    popupWindowProperties: SchemaPopupWindowProperties = null,
    targetType: String = null,
    videoReportingId: String = null
  ): SchemaCreativeCustomEvent = {
    val __obj = js.Dynamic.literal()
    if (advertiserCustomEventId != null) __obj.updateDynamic("advertiserCustomEventId")(advertiserCustomEventId.asInstanceOf[js.Any])
    if (advertiserCustomEventName != null) __obj.updateDynamic("advertiserCustomEventName")(advertiserCustomEventName.asInstanceOf[js.Any])
    if (advertiserCustomEventType != null) __obj.updateDynamic("advertiserCustomEventType")(advertiserCustomEventType.asInstanceOf[js.Any])
    if (artworkLabel != null) __obj.updateDynamic("artworkLabel")(artworkLabel.asInstanceOf[js.Any])
    if (artworkType != null) __obj.updateDynamic("artworkType")(artworkType.asInstanceOf[js.Any])
    if (exitClickThroughUrl != null) __obj.updateDynamic("exitClickThroughUrl")(exitClickThroughUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (popupWindowProperties != null) __obj.updateDynamic("popupWindowProperties")(popupWindowProperties.asInstanceOf[js.Any])
    if (targetType != null) __obj.updateDynamic("targetType")(targetType.asInstanceOf[js.Any])
    if (videoReportingId != null) __obj.updateDynamic("videoReportingId")(videoReportingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreativeCustomEvent]
  }
}

