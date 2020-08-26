package typings.grommet.anon

import typings.grommet.diagramMod.DiagramConnectionAnchor
import typings.grommet.diagramMod.DiagramConnectionType
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xsmall
import typings.grommet.grommetStrings.xxsmall
import typings.grommet.utilsMod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anchor extends js.Object {
  var anchor: js.UndefOr[DiagramConnectionAnchor] = js.native
  var color: js.UndefOr[ColorType] = js.native
  var fromTarget: String | js.Object = js.native
  var label: js.UndefOr[String] = js.native
  var offset: js.UndefOr[xsmall | small | medium | large | String] = js.native
  var thickness: js.UndefOr[hair | xxsmall | xsmall | small | medium | large | String] = js.native
  var toTarget: String | js.Object = js.native
  var `type`: js.UndefOr[DiagramConnectionType] = js.native
}

object Anchor {
  @scala.inline
  def apply(fromTarget: String | js.Object, toTarget: String | js.Object): Anchor = {
    val __obj = js.Dynamic.literal(fromTarget = fromTarget.asInstanceOf[js.Any], toTarget = toTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anchor]
  }
  @scala.inline
  implicit class AnchorOps[Self <: Anchor] (val x: Self) extends AnyVal {
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
    def setFromTarget(value: String | js.Object): Self = this.set("fromTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setToTarget(value: String | js.Object): Self = this.set("toTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnchor(value: DiagramConnectionAnchor): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setOffset(value: xsmall | small | medium | large | String): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setThickness(value: hair | xxsmall | xsmall | small | medium | large | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setType(value: DiagramConnectionType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

