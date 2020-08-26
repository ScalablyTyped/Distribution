package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about an output of a multi-output DoFn.
  */
@js.native
trait SchemaMultiOutputInfo extends js.Object {
  /**
    * The id of the tag the user code will emit to this output by; this should
    * correspond to the tag of some SideInputInfo.
    */
  var tag: js.UndefOr[String] = js.native
}

object SchemaMultiOutputInfo {
  @scala.inline
  def apply(): SchemaMultiOutputInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMultiOutputInfo]
  }
  @scala.inline
  implicit class SchemaMultiOutputInfoOps[Self <: SchemaMultiOutputInfo] (val x: Self) extends AnyVal {
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
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
  }
  
}

