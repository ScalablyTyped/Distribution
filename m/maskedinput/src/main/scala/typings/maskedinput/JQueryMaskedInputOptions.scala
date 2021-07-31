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
  
  @scala.inline
  def apply(): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
  
  @scala.inline
  implicit class JQueryMaskedInputOptionsMutableBuilder[Self <: JQueryMaskedInputOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    @scala.inline
    def setAutoUnmask(value: Boolean): Self = StObject.set(x, "autoUnmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUnmaskUndefined: Self = StObject.set(x, "autoUnmask", js.undefined)
    
    @scala.inline
    def setClearIncomplete(value: Boolean): Self = StObject.set(x, "clearIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearIncompleteUndefined: Self = StObject.set(x, "clearIncomplete", js.undefined)
    
    @scala.inline
    def setClearMaskOnLostFocus(value: Boolean): Self = StObject.set(x, "clearMaskOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClearMaskOnLostFocusUndefined: Self = StObject.set(x, "clearMaskOnLostFocus", js.undefined)
    
    @scala.inline
    def setGreedy(value: Boolean): Self = StObject.set(x, "greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreedyUndefined: Self = StObject.set(x, "greedy", js.undefined)
    
    @scala.inline
    def setIsComplete(value: (/* buffer */ js.Any, /* options */ js.Any) => js.Object): Self = StObject.set(x, "isComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def setIsCompleteUndefined: Self = StObject.set(x, "isComplete", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = StObject.set(x, "numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumericUndefined: Self = StObject.set(x, "numeric", js.undefined)
    
    @scala.inline
    def setOnBeforeMask(value: /* initialValue */ js.Any => Unit): Self = StObject.set(x, "onBeforeMask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforeMaskUndefined: Self = StObject.set(x, "onBeforeMask", js.undefined)
    
    @scala.inline
    def setOnBeforePaste(value: /* pastedValue */ js.Any => Unit): Self = StObject.set(x, "onBeforePaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBeforePasteUndefined: Self = StObject.set(x, "onBeforePaste", js.undefined)
    
    @scala.inline
    def setOnKeyValidation(value: /* result */ js.Any => Unit): Self = StObject.set(x, "onKeyValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnKeyValidationUndefined: Self = StObject.set(x, "onKeyValidation", js.undefined)
    
    @scala.inline
    def setOnUnMask(value: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Unit): Self = StObject.set(x, "onUnMask", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnUnMaskUndefined: Self = StObject.set(x, "onUnMask", js.undefined)
    
    @scala.inline
    def setOncleared(value: () => Unit): Self = StObject.set(x, "oncleared", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnclearedUndefined: Self = StObject.set(x, "oncleared", js.undefined)
    
    @scala.inline
    def setOncomplete(value: /* value */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOncompleteUndefined: Self = StObject.set(x, "oncomplete", js.undefined)
    
    @scala.inline
    def setOnincomplete(value: () => Unit): Self = StObject.set(x, "onincomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnincompleteUndefined: Self = StObject.set(x, "onincomplete", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    @scala.inline
    def setRadixPoint(value: String): Self = StObject.set(x, "radixPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadixPointUndefined: Self = StObject.set(x, "radixPoint", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
    
    @scala.inline
    def setRightAlignNumerics(value: Boolean): Self = StObject.set(x, "rightAlignNumerics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightAlignNumericsUndefined: Self = StObject.set(x, "rightAlignNumerics", js.undefined)
    
    @scala.inline
    def setShowMaskOnFocus(value: Boolean): Self = StObject.set(x, "showMaskOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMaskOnFocusUndefined: Self = StObject.set(x, "showMaskOnFocus", js.undefined)
    
    @scala.inline
    def setShowMaskOnHover(value: Boolean): Self = StObject.set(x, "showMaskOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMaskOnHoverUndefined: Self = StObject.set(x, "showMaskOnHover", js.undefined)
    
    @scala.inline
    def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
    
    @scala.inline
    def setSkipOptionalPartCharacter(value: String): Self = StObject.set(x, "skipOptionalPartCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOptionalPartCharacterUndefined: Self = StObject.set(x, "skipOptionalPartCharacter", js.undefined)
  }
}
