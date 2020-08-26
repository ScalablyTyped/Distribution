package typings.googleapis.manufacturersV1Mod.manufacturersV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A feature description of the product. For more information, see
  * https://support.google.com/manufacturers/answer/6124116#featuredesc.
  */
@js.native
trait SchemaFeatureDescription extends js.Object {
  /**
    * A short description of the feature.
    */
  var headline: js.UndefOr[String] = js.native
  /**
    * An optional image describing the feature.
    */
  var image: js.UndefOr[SchemaImage] = js.native
  /**
    * A detailed description of the feature.
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaFeatureDescription {
  @scala.inline
  def apply(): SchemaFeatureDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFeatureDescription]
  }
  @scala.inline
  implicit class SchemaFeatureDescriptionOps[Self <: SchemaFeatureDescription] (val x: Self) extends AnyVal {
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
    def setHeadline(value: String): Self = this.set("headline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeadline: Self = this.set("headline", js.undefined)
    @scala.inline
    def setImage(value: SchemaImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

