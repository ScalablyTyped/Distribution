package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Detected start or end of a structural component.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak extends js.Object {
  /**
    * True if break prepends the element.
    */
  var isPrefix: js.UndefOr[Boolean] = js.native
  /**
    * Detected break type.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreakOps[Self <: SchemaGoogleCloudVisionV1p3beta1TextAnnotationDetectedBreak] (val x: Self) extends AnyVal {
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
    def setIsPrefix(value: Boolean): Self = this.set("isPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrefix: Self = this.set("isPrefix", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

