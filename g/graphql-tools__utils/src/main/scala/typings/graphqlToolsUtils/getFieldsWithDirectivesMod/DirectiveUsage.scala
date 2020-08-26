package typings.graphqlToolsUtils.getFieldsWithDirectivesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectiveUsage extends js.Object {
  var args: DirectiveArgs = js.native
  var name: String = js.native
}

object DirectiveUsage {
  @scala.inline
  def apply(args: DirectiveArgs, name: String): DirectiveUsage = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectiveUsage]
  }
  @scala.inline
  implicit class DirectiveUsageOps[Self <: DirectiveUsage] (val x: Self) extends AnyVal {
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
    def setArgs(value: DirectiveArgs): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

