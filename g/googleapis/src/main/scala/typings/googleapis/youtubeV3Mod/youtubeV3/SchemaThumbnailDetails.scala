package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Internal representation of thumbnails for a YouTube resource.
  */
@js.native
trait SchemaThumbnailDetails extends js.Object {
  /**
    * The default image for this resource.
    */
  var default: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The high quality image for this resource.
    */
  var high: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The maximum resolution quality image for this resource.
    */
  var maxres: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The medium quality image for this resource.
    */
  var medium: js.UndefOr[SchemaThumbnail] = js.native
  /**
    * The standard quality image for this resource.
    */
  var standard: js.UndefOr[SchemaThumbnail] = js.native
}

object SchemaThumbnailDetails {
  @scala.inline
  def apply(
    default: SchemaThumbnail = null,
    high: SchemaThumbnail = null,
    maxres: SchemaThumbnail = null,
    medium: SchemaThumbnail = null,
    standard: SchemaThumbnail = null
  ): SchemaThumbnailDetails = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (maxres != null) __obj.updateDynamic("maxres")(maxres.asInstanceOf[js.Any])
    if (medium != null) __obj.updateDynamic("medium")(medium.asInstanceOf[js.Any])
    if (standard != null) __obj.updateDynamic("standard")(standard.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaThumbnailDetails]
  }
}

