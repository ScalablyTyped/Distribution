package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video processing progress and completion time estimate.
  */
@js.native
trait SchemaVideoProcessingDetailsProcessingProgress extends js.Object {
  /**
    * The number of parts of the video that YouTube has already processed. You
    * can estimate the percentage of the video that YouTube has already
    * processed by calculating: 100 * parts_processed / parts_total  Note that
    * since the estimated number of parts could increase without a
    * corresponding increase in the number of parts that have already been
    * processed, it is possible that the calculated progress could periodically
    * decrease while YouTube processes a video.
    */
  var partsProcessed: js.UndefOr[String] = js.native
  /**
    * An estimate of the total number of parts that need to be processed for
    * the video. The number may be updated with more precise estimates while
    * YouTube processes the video.
    */
  var partsTotal: js.UndefOr[String] = js.native
  /**
    * An estimate of the amount of time, in millseconds, that YouTube needs to
    * finish processing the video.
    */
  var timeLeftMs: js.UndefOr[String] = js.native
}

object SchemaVideoProcessingDetailsProcessingProgress {
  @scala.inline
  def apply(): SchemaVideoProcessingDetailsProcessingProgress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVideoProcessingDetailsProcessingProgress]
  }
  @scala.inline
  implicit class SchemaVideoProcessingDetailsProcessingProgressOps[Self <: SchemaVideoProcessingDetailsProcessingProgress] (val x: Self) extends AnyVal {
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
    def setPartsProcessed(value: String): Self = this.set("partsProcessed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartsProcessed: Self = this.set("partsProcessed", js.undefined)
    @scala.inline
    def setPartsTotal(value: String): Self = this.set("partsTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartsTotal: Self = this.set("partsTotal", js.undefined)
    @scala.inline
    def setTimeLeftMs(value: String): Self = this.set("timeLeftMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLeftMs: Self = this.set("timeLeftMs", js.undefined)
  }
  
}

