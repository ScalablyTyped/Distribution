package typings.graphqlToolsMerge.extensionsMod

import typings.graphqlToolsMerge.graphqlToolsMergeStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnionTypeExtensions extends PossibleTypeExtensions {
  var `type`: union = js.native
}

object UnionTypeExtensions {
  @scala.inline
  def apply(`type`: union): UnionTypeExtensions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnionTypeExtensions]
  }
  @scala.inline
  implicit class UnionTypeExtensionsOps[Self <: UnionTypeExtensions] (val x: Self) extends AnyVal {
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
    def setType(value: union): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

