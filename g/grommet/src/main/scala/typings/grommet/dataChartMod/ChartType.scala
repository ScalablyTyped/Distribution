package typings.grommet.dataChartMod

import typings.grommet.anon.Color
import typings.grommet.anon.Key
import typings.grommet.anon.Value
import typings.grommet.grommetStrings.area
import typings.grommet.grommetStrings.bar
import typings.grommet.grommetStrings.hair
import typings.grommet.grommetStrings.large
import typings.grommet.grommetStrings.line
import typings.grommet.grommetStrings.medium
import typings.grommet.grommetStrings.none
import typings.grommet.grommetStrings.point
import typings.grommet.grommetStrings.small
import typings.grommet.grommetStrings.xlarge
import typings.grommet.grommetStrings.xsmall
import typings.grommet.utilsMod.A11yTitleType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartType extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var bounds: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  var color: js.UndefOr[String | Color | js.Array[Value]] = js.native
  var dash: js.UndefOr[Boolean] = js.native
  var key: js.UndefOr[String] = js.native
  var keys: js.UndefOr[js.Array[Key]] = js.native
  var onClick: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var onHover: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var overflow: js.UndefOr[Boolean] = js.native
  var round: js.UndefOr[Boolean] = js.native
  var thickness: js.UndefOr[hair | xsmall | small | medium | large | xlarge | none | String] = js.native
  var `type`: js.UndefOr[bar | line | area | point] = js.native
}

object ChartType {
  @scala.inline
  def apply(): ChartType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartType]
  }
  @scala.inline
  implicit class ChartTypeOps[Self <: ChartType] (val x: Self) extends AnyVal {
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
    def setA11yTitle(value: A11yTitleType): Self = this.set("a11yTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteA11yTitle: Self = this.set("a11yTitle", js.undefined)
    @scala.inline
    def setBoundsVarargs(value: js.Array[Double]*): Self = this.set("bounds", js.Array(value :_*))
    @scala.inline
    def setBounds(value: js.Array[js.Array[Double]]): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setColorVarargs(value: Value*): Self = this.set("color", js.Array(value :_*))
    @scala.inline
    def setColor(value: String | Color | js.Array[Value]): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setDash(value: Boolean): Self = this.set("dash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDash: Self = this.set("dash", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setKeysVarargs(value: Key*): Self = this.set("keys", js.Array(value :_*))
    @scala.inline
    def setKeys(value: js.Array[Key]): Self = this.set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    @scala.inline
    def setOnClick(value: /* repeated */ js.Any => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setOnHover(value: /* repeated */ js.Any => _): Self = this.set("onHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnHover: Self = this.set("onHover", js.undefined)
    @scala.inline
    def setOverflow(value: Boolean): Self = this.set("overflow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverflow: Self = this.set("overflow", js.undefined)
    @scala.inline
    def setRound(value: Boolean): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setThickness(value: hair | xsmall | small | medium | large | xlarge | none | String): Self = this.set("thickness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThickness: Self = this.set("thickness", js.undefined)
    @scala.inline
    def setType(value: bar | line | area | point): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

