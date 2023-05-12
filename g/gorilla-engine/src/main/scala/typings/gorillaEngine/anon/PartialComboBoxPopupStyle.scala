package typings.gorillaEngine.anon

import typings.gorillaEngine.GorillaEngine.UI.ComboBoxPadding
import typings.gorillaEngine.gorillaEngineStrings.left
import typings.gorillaEngine.gorillaEngineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<gorilla-engine.GorillaEngine.UI.ComboBoxPopupStyles & {  separatorColo :string | undefined,   separatorHeight :number,   separatorPadding :number}> */
trait PartialComboBoxPopupStyle extends StObject {
  
  var backgroundColor: js.UndefOr[String] = js.undefined
  
  var checkmarkFloat: js.UndefOr[left | right] = js.undefined
  
  var checkmarkPadding: js.UndefOr[ComboBoxPadding] = js.undefined
  
  var cornerRadius: js.UndefOr[Double] = js.undefined
  
  var itemHighlightedBackgroundColor: js.UndefOr[String] = js.undefined
  
  var itemHighlightedTextColor: js.UndefOr[String] = js.undefined
  
  var itemSelectedBackgroundColor: js.UndefOr[String] = js.undefined
  
  var itemSelectedTextColor: js.UndefOr[String] = js.undefined
  
  var itemTextColor: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[ComboBoxPadding | Double] = js.undefined
  
  var separatorColo: js.UndefOr[String] = js.undefined
  
  var separatorHeight: js.UndefOr[Double] = js.undefined
  
  var separatorPadding: js.UndefOr[Double] = js.undefined
  
  var textAlign: js.UndefOr[String] = js.undefined
}
object PartialComboBoxPopupStyle {
  
  inline def apply(): PartialComboBoxPopupStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialComboBoxPopupStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialComboBoxPopupStyle] (val x: Self) extends AnyVal {
    
    inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setCheckmarkFloat(value: left | right): Self = StObject.set(x, "checkmarkFloat", value.asInstanceOf[js.Any])
    
    inline def setCheckmarkFloatUndefined: Self = StObject.set(x, "checkmarkFloat", js.undefined)
    
    inline def setCheckmarkPadding(value: ComboBoxPadding): Self = StObject.set(x, "checkmarkPadding", value.asInstanceOf[js.Any])
    
    inline def setCheckmarkPaddingUndefined: Self = StObject.set(x, "checkmarkPadding", js.undefined)
    
    inline def setCornerRadius(value: Double): Self = StObject.set(x, "cornerRadius", value.asInstanceOf[js.Any])
    
    inline def setCornerRadiusUndefined: Self = StObject.set(x, "cornerRadius", js.undefined)
    
    inline def setItemHighlightedBackgroundColor(value: String): Self = StObject.set(x, "itemHighlightedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setItemHighlightedBackgroundColorUndefined: Self = StObject.set(x, "itemHighlightedBackgroundColor", js.undefined)
    
    inline def setItemHighlightedTextColor(value: String): Self = StObject.set(x, "itemHighlightedTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemHighlightedTextColorUndefined: Self = StObject.set(x, "itemHighlightedTextColor", js.undefined)
    
    inline def setItemSelectedBackgroundColor(value: String): Self = StObject.set(x, "itemSelectedBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def setItemSelectedBackgroundColorUndefined: Self = StObject.set(x, "itemSelectedBackgroundColor", js.undefined)
    
    inline def setItemSelectedTextColor(value: String): Self = StObject.set(x, "itemSelectedTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemSelectedTextColorUndefined: Self = StObject.set(x, "itemSelectedTextColor", js.undefined)
    
    inline def setItemTextColor(value: String): Self = StObject.set(x, "itemTextColor", value.asInstanceOf[js.Any])
    
    inline def setItemTextColorUndefined: Self = StObject.set(x, "itemTextColor", js.undefined)
    
    inline def setPadding(value: ComboBoxPadding | Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSeparatorColo(value: String): Self = StObject.set(x, "separatorColo", value.asInstanceOf[js.Any])
    
    inline def setSeparatorColoUndefined: Self = StObject.set(x, "separatorColo", js.undefined)
    
    inline def setSeparatorHeight(value: Double): Self = StObject.set(x, "separatorHeight", value.asInstanceOf[js.Any])
    
    inline def setSeparatorHeightUndefined: Self = StObject.set(x, "separatorHeight", js.undefined)
    
    inline def setSeparatorPadding(value: Double): Self = StObject.set(x, "separatorPadding", value.asInstanceOf[js.Any])
    
    inline def setSeparatorPaddingUndefined: Self = StObject.set(x, "separatorPadding", js.undefined)
    
    inline def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
  }
}
