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
  def apply(attributes: SchemaAttributes = null, description: SchemaTruncatableString = null): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAnnotation]
  }
}

