package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Text annotation with a set of attributes.
  */
@js.native
trait SchemaAnnotation extends js.Object {
  /**
    * A set of attributes on the annotation. You can have up to 4 attributes
    * per Annotation.
    */
  var attributes: js.UndefOr[SchemaAttributes] = js.native
  /**
    * A user-supplied message describing the event. The maximum length for the
    * description is 256 bytes.
    */
  var description: js.UndefOr[SchemaTruncatableString] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
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
    def setAttributes(value: SchemaAttributes): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    @scala.inline
    def setDescription(value: SchemaTruncatableString): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

