package typings.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentReplacement extends js.Object {
  var field: String = js.native
  var fragment: String = js.native
}

object FragmentReplacement {
  @scala.inline
  def apply(field: String, fragment: String): FragmentReplacement = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragmentReplacement]
  }
  @scala.inline
  implicit class FragmentReplacementOps[Self <: FragmentReplacement] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragment(value: String): Self = this.set("fragment", value.asInstanceOf[js.Any])
  }
  
}

