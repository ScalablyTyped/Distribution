package typings.grommet.anon

import typings.grommet.themesBaseMod.ExtendProps
import typings.grommet.themesBaseMod.ExtendType
import typings.grommet.themesBaseMod.ExtendValue
import typings.grommet.themesBaseMod.FormFieldLabelType
import typings.grommet.utilsMod.BorderType
import typings.grommet.utilsMod.MarginType
import typings.grommet.utilsMod.RoundType
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckBox extends StObject {
  
  var border: js.UndefOr[BorderType & Error] = js.undefined
  
  var checkBox: js.UndefOr[`20`] = js.undefined
  
  var content: js.UndefOr[Margin] = js.undefined
  
  var disabled: js.UndefOr[BorderLabel] = js.undefined
  
  var error: js.UndefOr[BorderColor] = js.undefined
  
  var extend: js.UndefOr[ExtendType[Record[String, Any]]] = js.undefined
  
  var focus: js.UndefOr[`21`] = js.undefined
  
  var help: js.UndefOr[ColorMargin] = js.undefined
  
  var info: js.UndefOr[ColorContainer] = js.undefined
  
  var label: js.UndefOr[FormFieldLabelType] = js.undefined
  
  var margin: js.UndefOr[MarginType] = js.undefined
  
  var round: js.UndefOr[RoundType] = js.undefined
}
object CheckBox {
  
  inline def apply(): CheckBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckBox]
  }
  
  extension [Self <: CheckBox](x: Self) {
    
    inline def setBorder(value: BorderType & Error): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
    
    inline def setCheckBox(value: `20`): Self = StObject.set(x, "checkBox", value.asInstanceOf[js.Any])
    
    inline def setCheckBoxUndefined: Self = StObject.set(x, "checkBox", js.undefined)
    
    inline def setContent(value: Margin): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setDisabled(value: BorderLabel): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setError(value: BorderColor): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setExtend(value: ExtendType[Record[String, Any]]): Self = StObject.set(x, "extend", value.asInstanceOf[js.Any])
    
    inline def setExtendFunction1(value: /* props */ ExtendProps[Record[String, Any]] => ExtendValue[Record[String, Any]]): Self = StObject.set(x, "extend", js.Any.fromFunction1(value))
    
    inline def setExtendUndefined: Self = StObject.set(x, "extend", js.undefined)
    
    inline def setFocus(value: `21`): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setFocusUndefined: Self = StObject.set(x, "focus", js.undefined)
    
    inline def setHelp(value: ColorMargin): Self = StObject.set(x, "help", value.asInstanceOf[js.Any])
    
    inline def setHelpUndefined: Self = StObject.set(x, "help", js.undefined)
    
    inline def setInfo(value: ColorContainer): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setLabel(value: FormFieldLabelType): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMargin(value: MarginType): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setRound(value: RoundType): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
    
    inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
  }
}
