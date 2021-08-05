package typings.inboxsdk.mod.ButterBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SavingResolver extends StObject {
  
  def reject(): Unit
  
  def resolve(): Unit
}
object SavingResolver {
  
  inline def apply(reject: () => Unit, resolve: () => Unit): SavingResolver = {
    val __obj = js.Dynamic.literal(reject = js.Any.fromFunction0(reject), resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[SavingResolver]
  }
  
  extension [Self <: SavingResolver](x: Self) {
    
    inline def setReject(value: () => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction0(value))
    
    inline def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
  }
}
