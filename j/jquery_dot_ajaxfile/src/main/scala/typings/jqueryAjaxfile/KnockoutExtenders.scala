package typings.jqueryAjaxfile

import typings.jqueryAjaxfile.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutExtenders extends StObject {
  
  def notify(target: Any, notifyWhen: String): Any = js.native
  
  def rateLimit(target: Any, options: Method): Any = js.native
  def rateLimit(target: Any, timeout: Double): Any = js.native
  
  def throttle(target: Any, timeout: Double): KnockoutComputed[Any] = js.native
  
  def trackArrayChanges(target: Any): Any = js.native
}
