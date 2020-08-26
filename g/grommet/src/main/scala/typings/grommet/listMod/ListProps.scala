package typings.grommet.listMod

import org.scalablytyped.runtime.StringDictionary
import typings.grommet.anon.Border
import typings.grommet.anon.Index
import typings.grommet.anon.Light
import typings.grommet.utilsMod.A11yTitleType
import typings.grommet.utilsMod.AlignSelfType
import typings.grommet.utilsMod.GridAreaType
import typings.grommet.utilsMod.MarginType
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProps extends js.Object {
  var a11yTitle: js.UndefOr[A11yTitleType] = js.native
  var alignSelf: js.UndefOr[AlignSelfType] = js.native
  var as: js.UndefOr[String] = js.native
  var background: js.UndefOr[String | js.Array[String] | Light] = js.native
  var border: js.UndefOr[BorderType] = js.native
  var data: js.UndefOr[js.Array[js.Object | String]] = js.native
  var gridArea: js.UndefOr[GridAreaType] = js.native
  var itemProps: js.UndefOr[StringDictionary[Border]] = js.native
  var margin: js.UndefOr[MarginType] = js.native
  var onClickItem: js.UndefOr[
    js.Function1[(/* event */ Index) | (/* event */ MouseEvent[Element, NativeMouseEvent]), Unit]
  ] = js.native
  var onMore: js.UndefOr[js.Function0[Unit]] = js.native
  var pad: js.UndefOr[PadType] = js.native
  var primaryKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  var secondaryKey: js.UndefOr[String | (js.Function1[/* repeated */ js.Any, _])] = js.native
  var step: js.UndefOr[Double] = js.native
}

object ListProps {
  @scala.inline
  def apply(): ListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
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
    def setAlignSelf(value: AlignSelfType): Self = this.set("alignSelf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignSelf: Self = this.set("alignSelf", js.undefined)
    @scala.inline
    def setAs(value: String): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setBackgroundVarargs(value: String*): Self = this.set("background", js.Array(value :_*))
    @scala.inline
    def setBackground(value: String | js.Array[String] | Light): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setBorder(value: BorderType): Self = this.set("border", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    @scala.inline
    def setDataVarargs(value: (js.Object | String)*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[js.Object | String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setGridArea(value: GridAreaType): Self = this.set("gridArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridArea: Self = this.set("gridArea", js.undefined)
    @scala.inline
    def setItemProps(value: StringDictionary[Border]): Self = this.set("itemProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemProps: Self = this.set("itemProps", js.undefined)
    @scala.inline
    def setMargin(value: MarginType): Self = this.set("margin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMargin: Self = this.set("margin", js.undefined)
    @scala.inline
    def setOnClickItem(value: (/* event */ Index) | (/* event */ MouseEvent[Element, NativeMouseEvent]) => Unit): Self = this.set("onClickItem", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClickItem: Self = this.set("onClickItem", js.undefined)
    @scala.inline
    def setOnMore(value: () => Unit): Self = this.set("onMore", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnMore: Self = this.set("onMore", js.undefined)
    @scala.inline
    def setPad(value: PadType): Self = this.set("pad", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePad: Self = this.set("pad", js.undefined)
    @scala.inline
    def setPrimaryKeyFunction1(value: /* repeated */ js.Any => _): Self = this.set("primaryKey", js.Any.fromFunction1(value))
    @scala.inline
    def setPrimaryKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("primaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryKey: Self = this.set("primaryKey", js.undefined)
    @scala.inline
    def setSecondaryKeyFunction1(value: /* repeated */ js.Any => _): Self = this.set("secondaryKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSecondaryKey(value: String | (js.Function1[/* repeated */ js.Any, _])): Self = this.set("secondaryKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryKey: Self = this.set("secondaryKey", js.undefined)
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

