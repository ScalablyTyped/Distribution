package typings.kendoUi.kendo.ui

import typings.kendoUi.JQuery
import typings.kendoUi.JQueryPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Captcha
  extends StObject
     with Widget {
  
  def enable(enable: Boolean): Unit = js.native
  
  def getCaptchaId(): String = js.native
  
  def isValid(): Boolean = js.native
  
  @JSName("options")
  var options_Captcha: CaptchaOptions = js.native
  
  def readonly(readonly: Boolean): Unit = js.native
  
  def reset(): JQueryPromise[Any] = js.native
  
  def speak(): JQueryPromise[Any] = js.native
  
  def validate(): JQueryPromise[Any] = js.native
  
  var wrapper: JQuery = js.native
}
