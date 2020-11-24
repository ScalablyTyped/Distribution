package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastOptions extends js.Object {
  
  /**
    * The percentage of the toast's width it takes for a drag to dismiss a Toast.
    * @default 0.8
    */
  var activationPercent: Double = js.native
  
  /**
    * Classes to be added to the toast element.
    */
  var classes: String = js.native
  
  /**
    * Callback function called when toast is dismissed.
    */
  def completeCallback(): Unit = js.native
  
  /**
    * Length in ms the Toast stays before dismissal.
    * @default 4000
    */
  var displayLength: Double = js.native
  
  /**
    * The HTML content of the Toast.
    */
  var html: String = js.native
  
  /**
    * Transition in duration in milliseconds.
    * @default 300
    */
  var inDuration: Double = js.native
  
  /**
    * Transition out duration in milliseconds.
    * @default 375
    */
  var outDuration: Double = js.native
}
object ToastOptions {
  
  @scala.inline
  def apply(
    activationPercent: Double,
    classes: String,
    completeCallback: () => Unit,
    displayLength: Double,
    html: String,
    inDuration: Double,
    outDuration: Double
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(activationPercent = activationPercent.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], completeCallback = js.Any.fromFunction0(completeCallback), displayLength = displayLength.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], inDuration = inDuration.asInstanceOf[js.Any], outDuration = outDuration.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastOptions]
  }
  
  @scala.inline
  implicit class ToastOptionsOps[Self <: ToastOptions] (val x: Self) extends AnyVal {
    
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
    def setActivationPercent(value: Double): Self = this.set("activationPercent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClasses(value: String): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleteCallback(value: () => Unit): Self = this.set("completeCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisplayLength(value: Double): Self = this.set("displayLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInDuration(value: Double): Self = this.set("inDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutDuration(value: Double): Self = this.set("outDuration", value.asInstanceOf[js.Any])
  }
}
