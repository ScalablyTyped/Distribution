package typings.graphqlToolsMerge.anon

import typings.graphqlToolsMerge.extensionsMod.ExtensionsObject
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Arguments extends js.Object {
  var arguments: Record[String, ExtensionsObject] = js.native
  var extensions: ExtensionsObject = js.native
}

object Arguments {
  @scala.inline
  def apply(arguments: Record[String, ExtensionsObject], extensions: ExtensionsObject): Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arguments]
  }
  @scala.inline
  implicit class ArgumentsOps[Self <: Arguments] (val x: Self) extends AnyVal {
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
    def setArguments(value: Record[String, ExtensionsObject]): Self = this.set("arguments", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: ExtensionsObject): Self = this.set("extensions", value.asInstanceOf[js.Any])
  }
  
}

