package typings.grommet.anon

import typings.grommet.grommetStrings.`bottom-left`
import typings.grommet.grommetStrings.`bottom-right`
import typings.grommet.grommetStrings.`top-left`
import typings.grommet.grommetStrings.`top-right`
import typings.grommet.grommetStrings.bottom
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.left
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.right
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.top
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod._RoundType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Corner extends _RoundType {
  var corner: js.UndefOr[
    top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.native
  var size: js.UndefOr[xsmall | small | medium | large | xlarge | String] = js.native
}

object Corner {
  @scala.inline
  def apply(): Corner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Corner]
  }
  @scala.inline
  implicit class CornerOps[Self <: Corner] (val x: Self) extends AnyVal {
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
    def setCorner(value: top | left | bottom | right | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = this.set("corner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCorner: Self = this.set("corner", js.undefined)
    @scala.inline
    def setSize(value: xsmall | small | medium | large | xlarge | String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
  }
  
}

