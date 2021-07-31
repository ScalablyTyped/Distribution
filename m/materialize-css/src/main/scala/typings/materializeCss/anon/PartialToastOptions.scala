package typings.materializeCss.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<materialize-css.M.ToastOptions> */
trait PartialToastOptions extends StObject {
  
  var activationPercent: js.UndefOr[Double] = js.undefined
  
  var classes: js.UndefOr[String] = js.undefined
  
  var completeCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var displayLength: js.UndefOr[Double] = js.undefined
  
  var html: js.UndefOr[String] = js.undefined
  
  var inDuration: js.UndefOr[Double] = js.undefined
  
  var outDuration: js.UndefOr[Double] = js.undefined
}
object PartialToastOptions {
  
  @scala.inline
  def apply(): PartialToastOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialToastOptions]
  }
  
  @scala.inline
  implicit class PartialToastOptionsMutableBuilder[Self <: PartialToastOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivationPercent(value: Double): Self = StObject.set(x, "activationPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationPercentUndefined: Self = StObject.set(x, "activationPercent", js.undefined)
    
    @scala.inline
    def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    @scala.inline
    def setCompleteCallback(value: () => Unit): Self = StObject.set(x, "completeCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteCallbackUndefined: Self = StObject.set(x, "completeCallback", js.undefined)
    
    @scala.inline
    def setDisplayLength(value: Double): Self = StObject.set(x, "displayLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayLengthUndefined: Self = StObject.set(x, "displayLength", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDurationUndefined: Self = StObject.set(x, "inDuration", js.undefined)
    
    @scala.inline
    def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDurationUndefined: Self = StObject.set(x, "outDuration", js.undefined)
  }
}
