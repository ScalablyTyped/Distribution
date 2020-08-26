package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result of replacing shapes with an image.
  */
@js.native
trait SchemaReplaceAllShapesWithImageResponse extends js.Object {
  /**
    * The number of shapes replaced with images.
    */
  var occurrencesChanged: js.UndefOr[Double] = js.native
}

object SchemaReplaceAllShapesWithImageResponse {
  @scala.inline
  def apply(): SchemaReplaceAllShapesWithImageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReplaceAllShapesWithImageResponse]
  }
  @scala.inline
  implicit class SchemaReplaceAllShapesWithImageResponseOps[Self <: SchemaReplaceAllShapesWithImageResponse] (val x: Self) extends AnyVal {
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
    def setOccurrencesChanged(value: Double): Self = this.set("occurrencesChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOccurrencesChanged: Self = this.set("occurrencesChanged", js.undefined)
  }
  
}

