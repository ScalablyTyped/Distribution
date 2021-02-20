package typings.libp2pGossipsub.anon

import typings.node.NodeJS.Timeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cancel extends StObject {
  
  var _intervalId: js.UndefOr[Timeout] = js.native
  
  def cancel(): Unit = js.native
  
  def runPeriodically(fn: js.Function0[Unit], period: Double): Unit = js.native
}
object Cancel {
  
  @scala.inline
  def apply(cancel: () => Unit, runPeriodically: (js.Function0[Unit], Double) => Unit): Cancel = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), runPeriodically = js.Any.fromFunction2(runPeriodically))
    __obj.asInstanceOf[Cancel]
  }
  
  @scala.inline
  implicit class CancelMutableBuilder[Self <: Cancel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRunPeriodically(value: (js.Function0[Unit], Double) => Unit): Self = StObject.set(x, "runPeriodically", js.Any.fromFunction2(value))
    
    @scala.inline
    def set_intervalId(value: Timeout): Self = StObject.set(x, "_intervalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_intervalIdUndefined: Self = StObject.set(x, "_intervalId", js.undefined)
  }
}
