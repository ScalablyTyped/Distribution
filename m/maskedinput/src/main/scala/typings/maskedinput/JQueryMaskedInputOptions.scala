package typings.maskedinput

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JQueryMaskedInputOptions extends js.Object {
  
  var alias: js.UndefOr[String] = js.native
  
  var autoUnmask: js.UndefOr[Boolean] = js.native
  
  var clearIncomplete: js.UndefOr[Boolean] = js.native
  
  var clearMaskOnLostFocus: js.UndefOr[Boolean] = js.native
  
  var greedy: js.UndefOr[Boolean] = js.native
  
  var isComplete: js.UndefOr[js.Function2[/* buffer */ js.Any, /* options */ js.Any, js.Object]] = js.native
  
  var mask: js.UndefOr[String] = js.native
  
  var numeric: js.UndefOr[Boolean] = js.native
  
  var onBeforeMask: js.UndefOr[js.Function1[/* initialValue */ js.Any, Unit]] = js.native
  
  var onBeforePaste: js.UndefOr[js.Function1[/* pastedValue */ js.Any, Unit]] = js.native
  
  var onKeyValidation: js.UndefOr[js.Function1[/* result */ js.Any, Unit]] = js.native
  
  var onUnMask: js.UndefOr[js.Function2[/* maskedValue */ js.Any, /* unmaskedValue */ js.Any, Unit]] = js.native
  
  var oncleared: js.UndefOr[js.Function0[Unit]] = js.native
  
  var oncomplete: js.UndefOr[js.Function1[/* value */ js.UndefOr[js.Any], Unit]] = js.native
  
  var onincomplete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var radixPoint: js.UndefOr[String] = js.native
  
  var repeat: js.UndefOr[Double] = js.native
  
  var rightAlignNumerics: js.UndefOr[Boolean] = js.native
  
  var showMaskOnFocus: js.UndefOr[Boolean] = js.native
  
  var showMaskOnHover: js.UndefOr[Boolean] = js.native
  
  var showToolTip: js.UndefOr[Boolean] = js.native
  
  var skipOptionalPartCharacter: js.UndefOr[String] = js.native
}
object JQueryMaskedInputOptions {
  
  @scala.inline
  def apply(): JQueryMaskedInputOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQueryMaskedInputOptions]
  }
  
  @scala.inline
  implicit class JQueryMaskedInputOptionsOps[Self <: JQueryMaskedInputOptions] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAutoUnmask(value: Boolean): Self = this.set("autoUnmask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUnmask: Self = this.set("autoUnmask", js.undefined)
    
    @scala.inline
    def setClearIncomplete(value: Boolean): Self = this.set("clearIncomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearIncomplete: Self = this.set("clearIncomplete", js.undefined)
    
    @scala.inline
    def setClearMaskOnLostFocus(value: Boolean): Self = this.set("clearMaskOnLostFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearMaskOnLostFocus: Self = this.set("clearMaskOnLostFocus", js.undefined)
    
    @scala.inline
    def setGreedy(value: Boolean): Self = this.set("greedy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreedy: Self = this.set("greedy", js.undefined)
    
    @scala.inline
    def setIsComplete(value: (/* buffer */ js.Any, /* options */ js.Any) => js.Object): Self = this.set("isComplete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteIsComplete: Self = this.set("isComplete", js.undefined)
    
    @scala.inline
    def setMask(value: String): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setNumeric(value: Boolean): Self = this.set("numeric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumeric: Self = this.set("numeric", js.undefined)
    
    @scala.inline
    def setOnBeforeMask(value: /* initialValue */ js.Any => Unit): Self = this.set("onBeforeMask", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforeMask: Self = this.set("onBeforeMask", js.undefined)
    
    @scala.inline
    def setOnBeforePaste(value: /* pastedValue */ js.Any => Unit): Self = this.set("onBeforePaste", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnBeforePaste: Self = this.set("onBeforePaste", js.undefined)
    
    @scala.inline
    def setOnKeyValidation(value: /* result */ js.Any => Unit): Self = this.set("onKeyValidation", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyValidation: Self = this.set("onKeyValidation", js.undefined)
    
    @scala.inline
    def setOnUnMask(value: (/* maskedValue */ js.Any, /* unmaskedValue */ js.Any) => Unit): Self = this.set("onUnMask", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnUnMask: Self = this.set("onUnMask", js.undefined)
    
    @scala.inline
    def setOncleared(value: () => Unit): Self = this.set("oncleared", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOncleared: Self = this.set("oncleared", js.undefined)
    
    @scala.inline
    def setOncomplete(value: /* value */ js.UndefOr[js.Any] => Unit): Self = this.set("oncomplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOncomplete: Self = this.set("oncomplete", js.undefined)
    
    @scala.inline
    def setOnincomplete(value: () => Unit): Self = this.set("onincomplete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnincomplete: Self = this.set("onincomplete", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRadixPoint(value: String): Self = this.set("radixPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadixPoint: Self = this.set("radixPoint", js.undefined)
    
    @scala.inline
    def setRepeat(value: Double): Self = this.set("repeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepeat: Self = this.set("repeat", js.undefined)
    
    @scala.inline
    def setRightAlignNumerics(value: Boolean): Self = this.set("rightAlignNumerics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightAlignNumerics: Self = this.set("rightAlignNumerics", js.undefined)
    
    @scala.inline
    def setShowMaskOnFocus(value: Boolean): Self = this.set("showMaskOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaskOnFocus: Self = this.set("showMaskOnFocus", js.undefined)
    
    @scala.inline
    def setShowMaskOnHover(value: Boolean): Self = this.set("showMaskOnHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowMaskOnHover: Self = this.set("showMaskOnHover", js.undefined)
    
    @scala.inline
    def setShowToolTip(value: Boolean): Self = this.set("showToolTip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowToolTip: Self = this.set("showToolTip", js.undefined)
    
    @scala.inline
    def setSkipOptionalPartCharacter(value: String): Self = this.set("skipOptionalPartCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOptionalPartCharacter: Self = this.set("skipOptionalPartCharacter", js.undefined)
  }
}
