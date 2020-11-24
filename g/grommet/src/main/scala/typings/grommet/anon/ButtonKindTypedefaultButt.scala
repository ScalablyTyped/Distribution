package typings.grommet.anon

import typings.grommet.baseMod.ButtonKindType
import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/themes/base.ButtonKindType & {  default :grommet.grommet/themes/base.ButtonKindType | undefined,   primary :grommet.grommet/themes/base.ButtonKindType | undefined,   secondary :grommet.grommet/themes/base.ButtonKindType | undefined} */
@js.native
trait ButtonKindTypedefaultButt extends js.Object {
  
  var background: js.UndefOr[BackgroundType] = js.native
  
  var border: js.UndefOr[ColorWidth | Boolean] = js.native
  
  var color: js.UndefOr[ColorType] = js.native
  
  var default: js.UndefOr[ButtonKindType] = js.native
  
  var extend: js.UndefOr[ExtendType[Record[String, _]]] = js.native
  
  var font: js.UndefOr[`10`] = js.native
  
  var padding: js.UndefOr[HorizontalVertical] = js.native
  
  var primary: js.UndefOr[ButtonKindType] = js.native
  
  var secondary: js.UndefOr[ButtonKindType] = js.native
}
object ButtonKindTypedefaultButt {
  
  @scala.inline
  def apply(): ButtonKindTypedefaultButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKindTypedefaultButt]
  }
  
  @scala.inline
  implicit class ButtonKindTypedefaultButtOps[Self <: ButtonKindTypedefaultButt] (val x: Self) extends AnyVal {
    
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
    def setBackground(value: BackgroundType): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorWidth | Boolean): Self = this.set("border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBorder: Self = this.set("border", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDefault(value: ButtonKindType): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, _]] => ExtendValue[Record[String, _]]): Self = this.set("extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, _]]): Self = this.set("extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtend: Self = this.set("extend", js.undefined)
    
    @scala.inline
    def setFont(value: `10`): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setPadding(value: HorizontalVertical): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setPrimary(value: ButtonKindType): Self = this.set("primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimary: Self = this.set("primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: ButtonKindType): Self = this.set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondary: Self = this.set("secondary", js.undefined)
  }
}
