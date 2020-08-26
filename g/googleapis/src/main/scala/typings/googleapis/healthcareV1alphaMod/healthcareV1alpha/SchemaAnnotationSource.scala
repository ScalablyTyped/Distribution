package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AnnotationSource holds the source information of the annotation.
  */
@js.native
trait SchemaAnnotationSource extends js.Object {
  /**
    * Cloud Healthcare API resource.
    */
  var cloudHealthcareSource: js.UndefOr[SchemaCloudHealthcareSource] = js.native
}

object SchemaAnnotationSource {
  @scala.inline
  def apply(): SchemaAnnotationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotationSource]
  }
  @scala.inline
  implicit class SchemaAnnotationSourceOps[Self <: SchemaAnnotationSource] (val x: Self) extends AnyVal {
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
    def setCloudHealthcareSource(value: SchemaCloudHealthcareSource): Self = this.set("cloudHealthcareSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudHealthcareSource: Self = this.set("cloudHealthcareSource", js.undefined)
  }
  
}

