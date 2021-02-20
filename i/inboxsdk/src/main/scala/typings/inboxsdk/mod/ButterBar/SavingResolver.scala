package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavingResolver extends StObject {
  
  def reject(): Unit = js.native
  
  def resolve(): Unit = js.native
}
object SavingResolver {
  
  @scala.inline
  def apply(reject: () => Unit, resolve: () => Unit): SavingResolver = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[SavingResolver]
  }
  
  @scala.inline
  implicit class SavingResolverMutableBuilder[Self <: SavingResolver] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
  }
}
