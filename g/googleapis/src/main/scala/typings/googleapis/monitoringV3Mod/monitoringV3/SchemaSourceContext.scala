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
  def apply(): SchemaSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSourceContext]
  }
  @scala.inline
  implicit class SchemaSourceContextOps[Self <: SchemaSourceContext] (val x: Self) extends AnyVal {
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
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
  }
  
}

