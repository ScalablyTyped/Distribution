package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Google Cloud Storage location where the input will be read from.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1GcsSource extends js.Object {
  /**
    * Google Cloud Storage URI for the input file. This must only be a Google
    * Cloud Storage object. Wildcards are not currently supported.
    */
  var uri: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudVisionV1p4beta1GcsSource {
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1GcsSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1GcsSource]
  }
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1GcsSourceOps[Self <: SchemaGoogleCloudVisionV1p4beta1GcsSource] (val x: Self) extends AnyVal {
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
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUri: Self = this.set("uri", js.undefined)
  }
  
}

