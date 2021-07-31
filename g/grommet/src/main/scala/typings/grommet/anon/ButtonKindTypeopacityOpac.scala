package typings.grommet.anon

import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.BackgroundType
import typings.grommet.utilsMod.ColorType
import typings.grommet.utilsMod.OpacityType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined grommet.grommet/themes/base.ButtonKindType & {  opacity :grommet.grommet/utils.OpacityType | undefined} */
trait ButtonKindTypeopacityOpac extends StObject {
  
  var background: js.UndefOr[BackgroundType] = js.undefined
  
  var border: js.UndefOr[ColorWidth | Boolean] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var font: js.UndefOr[`10`] = js.undefined
  
  var opacity: js.UndefOr[OpacityType] = js.undefined
  
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
}
object ButtonKindTypeopacityOpac {
  
  @scala.inline
  def apply(): ButtonKindTypeopacityOpac = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKindTypeopacityOpac]
  }
  
  @scala.inline
  implicit class ButtonKindTypeopacityOpacMutableBuilder[Self <: ButtonKindTypeopacityOpac] (val x: Self) extends AnyVal {
    
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
    def setOpacity(value: OpacityType): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    @scala.inline
    def setPadding(value: HorizontalVertical): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
  }
}
