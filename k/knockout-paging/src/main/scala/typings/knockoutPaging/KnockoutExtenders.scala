package typings.knockoutPaging

import typings.knockoutPaging.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KnockoutExtenders extends StObject {
  
  def notify(target: js.Any, notifyWhen: String): js.Any = js.native
  
  def paged(target: KnockoutObservableArray[_], options: KnockoutPagedOptions): KnockoutObservableArray[_] = js.native
  
  def rateLimit(target: js.Any, options: Method): js.Any = js.native
  def rateLimit(target: js.Any, timeout: Double): js.Any = js.native
  
  def throttle(target: js.Any, timeout: Double): KnockoutComputed[_] = js.native
  
  def trackArrayChanges(target: js.Any): js.Any = js.native
}
