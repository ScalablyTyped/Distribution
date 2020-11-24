package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.PropsOf
import typings.react.mod.FC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontWeight extends js.Object {
  
  var color: js.UndefOr[ColorType] = js.native
  
  var extend: js.UndefOr[ExtendType[PropsOf[FC[AnchorPropsOmitDetailedHT]]]] = js.native
  
  var fontWeight: js.UndefOr[Double] = js.native
  
  var hover: js.UndefOr[TextDecoration] = js.native
  
  var textDecoration: js.UndefOr[String] = js.native
}
object FontWeight {
  
  @scala.inline
  def apply(): FontWeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontWeight]
  }
  
  @scala.inline
  implicit class FontWeightOps[Self <: FontWeight] (val x: Self) extends AnyVal {
    
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
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setExtendFunction1(
      value: /* props */ ExtendProps[PropsOf[FC[AnchorPropsOmitDetailedHT]]] => ExtendValue[PropsOf[FC[AnchorPropsOmitDetailedHT]]]
    ): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: ExtendType[PropsOf[FC[AnchorPropsOmitDetailedHT]]]): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setFontWeight(value: Double): Self = this.set("fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontWeight: Self = this.set("fontWeight", js.undefined)
    
    @scala.inline
    def setHover(value: TextDecoration): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setTextDecoration(value: String): Self = this.set("textDecoration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextDecoration: Self = this.set("textDecoration", js.undefined)
  }
}
