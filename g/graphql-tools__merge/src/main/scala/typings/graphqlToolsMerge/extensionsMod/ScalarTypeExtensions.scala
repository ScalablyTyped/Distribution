package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.graphqlToolsMergeStrings.scalar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScalarTypeExtensions extends PossibleTypeExtensions {
  var `type`: scalar = js.native
}

object ScalarTypeExtensions {
  @scala.inline
  def apply(`type`: scalar): ScalarTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScalarTypeExtensions]
  }
  @scala.inline
  implicit class ScalarTypeExtensionsOps[Self <: ScalarTypeExtensions] (val x: Self) extends AnyVal {
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
    def setType(value: scalar): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

