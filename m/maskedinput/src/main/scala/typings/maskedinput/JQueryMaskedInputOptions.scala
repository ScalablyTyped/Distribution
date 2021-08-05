package typings.maskedinput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryMaskedInputOptions extends StObject {
  
  var alias: js.UndefOr[String] = js.undefined
  
  var autoUnmask: js.UndefOr[Boolean] = js.undefined
  
  var clearIncomplete: js.UndefOr[Boolean] = js.undefined
  
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.undefined
  
  var greedy: js.UndefOr[Boolean] = js.undefined
  
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.undefined
  
  var mask: js.UndefOr[String] = js.undefined
  
  var numeric: js.UndefOr[Boolean] = js.undefined
  
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, Unit]] = js.undefined
  
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, Unit]] = js.undefined
  
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.undefined
  
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, Unit]] = js.undefined
  
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var radixPoint: js.UndefOr[String] = js.undefined
  
  var repeat: js.UndefOr[Double] = js.undefined
  
  var rightAlignNumerics: js.UndefOr[Boolean] = js.undefined
  
  var showMaskOnFocus: js.UndefOr[Boolean] = js.undefined
  
  var showMaskOnHover: js.UndefOr[Boolean] = js.undefined
  
  var showToolTip: js.UndefOr[Boolean] = js.undefined
  
  var skipOptionalPartCharacter: js.UndefOr[String] = js.undefined
}
object JQueryMaskedInputOptions {
  
  inline def apply(): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
  
  extension [Self <: JQueryMaskedInputOptions](x: Self) {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAutoUnmask(value: Boolean): Self = StObject.set(x, "autoUnmask", value.asInstanceOf[js.Any])
    
    inline def setAutoUnmaskUndefined: Self = StObject.set(x, "autoUnmask", js.undefined)
    
    inline def setClearIncomplete(value: Boolean): Self = StObject.set(x, "clearIncomplete", value.asInstanceOf[js.Any])
    
    inline def setClearIncompleteUndefined: Self = StObject.set(x, "clearIncomplete", js.undefined)
    
    inline def setClearMaskOnLostFocus(value: Boolean): Self = StObject.set(x, "clearMaskOnLostFocus", value.asInstanceOf[js.Any])
    
    inline def setClearMaskOnLostFocusUndefined: Self = StObject.set(x, "clearMaskOnLostFocus", js.undefined)
    
    inline def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    inline def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
    
    inline def setIsComplete(value: (/* buffer */ js.Any, /* options */ js.Any) => js.Object): Self = StObject.set(x, "isComplete", js.Any.fromFunction2(value))
    
    inline def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    inline def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    inline def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    inline def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    inline def setOnBeforeMask(value: /* initialValue */ js.Any => Unit): Self = StObject.set(x, "onBeforeMask", js.Any.fromFunction1(value))
    
    inline def setOnBeforeMaskUndefined: Self = StObject.set(x, "onBeforeMask", js.undefined)
    
    inline def setOnBeforePaste(value: /* pastedValue */ js.Any => Unit): Self = StObject.set(x, "onBeforePaste", js.Any.fromFunction1(value))
    
    inline def setOnBeforePasteUndefined: Self = StObject.set(x, "onBeforePaste", js.undefined)
    
    inline def setOnKeyValidation(value: /* result */ js.Any => Unit): Self = StObject.set(x, "onKeyValidation", js.Any.fromFunction1(value))
    
    inline def setOnKeyValidationUndefined: Self = StObject.set(x, "onKeyValidation", js.undefined)
    
    inline def setOnUnMask(value: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Unit): Self = StObject.set(x, "onUnMask", js.Any.fromFunction2(value))
    
    inline def setOnUnMaskUndefined: Self = StObject.set(x, "onUnMask", js.undefined)
    
    inline def setOncleared(value: () => Unit): Self = StObject.set(x, "oncleared", js.Any.fromFunction0(value))
    
    inline def setOnclearedUndefined: Self = StObject.set(x, "oncleared", js.undefined)
    
    inline def setOncomplete(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
    
    inline def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
    
    inline def setOnincomplete(value: () => Unit): Self = StObject.set(x, "onincomplete", js.Any.fromFunction0(value))
    
    inline def setOnincompleteUndefined: Self = StObject.set(x, "onincomplete", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setRadixPoint(value: String): Self = StObject.set(x, "radixPoint", value.asInstanceOf[js.Any])
    
    inline def setRadixPointUndefined: Self = StObject.set(x, "radixPoint", js.undefined)
    
    inline def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    inline def setRightAlignNumerics(value: Boolean): Self = StObject.set(x, "rightAlignNumerics", value.asInstanceOf[js.Any])
    
    inline def setRightAlignNumericsUndefined: Self = StObject.set(x, "rightAlignNumerics", js.undefined)
    
    inline def setShowMaskOnFocus(value: Boolean): Self = StObject.set(x, "showMaskOnFocus", value.asInstanceOf[js.Any])
    
    inline def setShowMaskOnFocusUndefined: Self = StObject.set(x, "showMaskOnFocus", js.undefined)
    
    inline def setShowMaskOnHover(value: Boolean): Self = StObject.set(x, "showMaskOnHover", value.asInstanceOf[js.Any])
    
    inline def setShowMaskOnHoverUndefined: Self = StObject.set(x, "showMaskOnHover", js.undefined)
    
    inline def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
    
    inline def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
    
    inline def setSkipOptionalPartCharacter(value: String): Self = StObject.set(x, "skipOptionalPartCharacter", value.asInstanceOf[js.Any])
    
    inline def setSkipOptionalPartCharacterUndefined: Self = StObject.set(x, "skipOptionalPartCharacter", js.undefined)
  }
}
