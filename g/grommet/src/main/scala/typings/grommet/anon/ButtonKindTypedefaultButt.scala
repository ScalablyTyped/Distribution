package typings.grommet.anon

import typings.grommet.baseMod.ButtonKindType
import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/themes/base.ButtonKindType & {  default :grommet.grommet/themes/base.ButtonKindType | undefined,   primary :grommet.grommet/themes/base.ButtonKindType | undefined,   secondary :grommet.grommet/themes/base.ButtonKindType | undefined} */
trait ButtonKindTypedefaultButt extends StObject {
  
  var default: js.UndefOr[ButtonKindType] = js.undefined
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[ColorWidth | Boolean] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var font: js.UndefOr[`10`] = js.undefined
  
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
  
  var primary: js.UndefOr[ButtonKindType] = js.undefined
  
  var secondary: js.UndefOr[ButtonKindType] = js.undefined
}
object ButtonKindTypedefaultButt {
  
  @scala.inline
  def apply(): ButtonKindTypedefaultButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKindTypedefaultButt]
  }
  
  @scala.inline
  implicit class ButtonKindTypedefaultButtMutableBuilder[Self <: ButtonKindTypedefaultButt] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: BackgroundType): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorWidth | Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    @scala.inline
    def setColor(value: ColorType): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setDefault(value: ButtonKindType): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setFont(value: `10`): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setPadding(value: HorizontalVertical): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    @scala.inline
    def setPrimary(value: ButtonKindType): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryUndefined: Self = StObject.set(x, "primary", js.undefined)
    
    @scala.inline
    def setSecondary(value: ButtonKindType): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
  }
}
