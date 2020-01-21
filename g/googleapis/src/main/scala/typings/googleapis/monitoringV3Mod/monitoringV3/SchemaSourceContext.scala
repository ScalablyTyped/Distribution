package typings.googleapis.monitoringV3Mod.monitoringV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SourceContext represents information about the source of a protobuf
  * element, like the file in which it is defined.
  */
@js.native
trait SchemaSourceContext extends js.Object {
  /**
    * The path-qualified name of the .proto file that contained the associated
    * protobuf element. For example:
    * &quot;google/protobuf/source_context.proto&quot;.
    */
  var fileName: js.UndefOr[String] = js.native
}

object SchemaSourceContext {
  @scala.inline
  def apply(fileName: String = null): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaSourceContext]
  }
}

