package typings.jotai.anon

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Signal[SetSelf] extends StObject {
  
  val setSelf: SetSelf
  
  val signal: AbortSignal
}
object Signal {
  
  inline def apply[SetSelf](setSelf: SetSelf, signal: AbortSignal): Signal[SetSelf] = {
    val __obj = js.Dynamic.literal(setSelf = setSelf.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[Signal[SetSelf]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Signal[?], SetSelf] (val x: Self & Signal[SetSelf]) extends AnyVal {
    
    inline def setSetSelf(value: SetSelf): Self = StObject.set(x, "setSelf", value.asInstanceOf[js.Any])
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
