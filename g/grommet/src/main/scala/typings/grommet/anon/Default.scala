package typings.grommet.anon

import typings.grommet.baseMod.ButtonKindType
import typings.grommet.baseMod.ExtendProps
import typings.grommet.baseMod.ExtendType
import typings.grommet.baseMod.ExtendValue
import typings.grommet.utilsMod.ColorType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: js.UndefOr[ButtonKindType] = js.undefined
  
  var active: js.UndefOr[ButtonKindTypedefaultButt] = js.undefined
  
  var border: js.UndefOr[ColorRadius] = js.undefined
  
  var color: js.UndefOr[ColorType] = js.undefined
  
  var disabled: js.UndefOr[ButtonKindTypeopacityOpac] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, js.Any]]] = js.undefined
  
  var hover: js.UndefOr[ButtonKindTypedefaultButt] = js.undefined
  
  var maxWidth: js.UndefOr[String] = js.undefined
  
  var minWidth: js.UndefOr[String] = js.undefined
  
  var option: js.UndefOr[ButtonKindType] = js.undefined
  
  var padding: js.UndefOr[HorizontalVertical] = js.undefined
  
  var primary: js.UndefOr[ButtonKindType] = js.undefined
  
  var secondary: js.UndefOr[ButtonKindType] = js.undefined
  
  var size: js.UndefOr[Small] = js.undefined
  
  var transition: js.UndefOr[Properties] = js.undefined
}
object Default {
  
  @scala.inline
  def apply(): Default = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Default]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: ButtonKindTypedefaultButt): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
    
    @scala.inline
    def setBorder(value: ColorRadius): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
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
    def setDisabled(value: ButtonKindTypeopacityOpac): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setExtend(value: ExtendType[Record[String, js.Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendFunction1(value: /* props */ ExtendProps[Record[String, js.Any]] => ExtendValue[Record[String, js.Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    @scala.inline
    def setHover(value: ButtonKindTypedefaultButt): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    @scala.inline
    def setMinWidth(value: String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setOption(value: ButtonKindType): Self = StObject.set(x, "option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionUndefined: Self = StObject.set(x, "option", js.undefined)
    
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
    
    @scala.inline
    def setSize(value: Small): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    @scala.inline
    def setTransition(value: Properties): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
  }
}
