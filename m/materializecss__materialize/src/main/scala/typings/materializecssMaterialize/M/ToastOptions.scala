package typings.materializecssMaterialize.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToastOptions extends StObject {
  
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: Double
  
  /**
    * Classes to be added to the toast element.
    */
  var classes: String
  
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): Unit
  
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: Double
  
  /**
    * HTML content that will be appended to text.
    * Only use properly sanitized or otherwise trusted data for html.
    * Will be ignored if unsafeHTML is set.
    * @deprecated Will be removed in a later release.
    */
  var html: String
  
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double
  
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: Double
  
  /**
    * The content of the Toast.
    */
  var text: String
  
  /**
    * HTML content that will be appended to to text.
    * Only use properly sanitized or otherwise trusted data for unsafeHTML.
    */
  var unsafeHTML: String
}
object ToastOptions {
  
  inline def apply(
    activationPercent: Double,
    classes: String,
    completeCallback: () => Unit,
    displayLength: Double,
    html: String,
    inDuration: Double,
    outDuration: Double,
    text: String,
    unsafeHTML: String
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], completeCallback = js.Any.fromFunction0(completeCallback), displayLength = displayLength.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], unsafeHTML = unsafeHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
    inline def setActivationPercent(value: Double): Self = StObject.set(x, "activationPercent", value.asInstanceOf[js.Any])
    
    inline def setClasses(value: String): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setCompleteCallback(value: () => Unit): Self = StObject.set(x, "completeCallback", js.Any.fromFunction0(value))
    
    inline def setDisplayLength(value: Double): Self = StObject.set(x, "displayLength", value.asInstanceOf[js.Any])
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setInDuration(value: Double): Self = StObject.set(x, "inDuration", value.asInstanceOf[js.Any])
    
    inline def setOutDuration(value: Double): Self = StObject.set(x, "outDuration", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setUnsafeHTML(value: String): Self = StObject.set(x, "unsafeHTML", value.asInstanceOf[js.Any])
  }
}
