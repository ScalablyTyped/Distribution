package typings.jasmineGiven

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  def And(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  
  def Given(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  
  def Invariant(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  
  def Then(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  def Then(label: String, func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
  
  def When(func: js.Function1[/* done */ DoneFn, Unit]): Unit = js.native
}
