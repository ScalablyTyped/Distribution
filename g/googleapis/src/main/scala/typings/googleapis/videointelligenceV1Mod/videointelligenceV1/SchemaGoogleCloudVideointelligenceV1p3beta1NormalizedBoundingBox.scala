package typings.googleapis.videointelligenceV1Mod.videointelligenceV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Normalized bounding box. The normalized vertex coordinates are relative to
  * the original image. Range: [0, 1].
  */
@js.native
trait SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox extends js.Object {
  /**
    * Bottom Y coordinate.
    */
  var bottom: js.UndefOr[Double] = js.native
  /**
    * Left X coordinate.
    */
  var left: js.UndefOr[Double] = js.native
  /**
    * Right X coordinate.
    */
  var right: js.UndefOr[Double] = js.native
  /**
    * Top Y coordinate.
    */
  var top: js.UndefOr[Double] = js.native
}

object SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox {
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBoxOps[Self <: SchemaGoogleCloudVideointelligenceV1p3beta1NormalizedBoundingBox] (val x: Self) extends AnyVal {
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
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
  }
  
}

