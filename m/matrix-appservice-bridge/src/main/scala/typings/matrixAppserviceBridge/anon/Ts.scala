package typings.matrixAppserviceBridge.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ts extends StObject {
  
  var ts: Double
}
object Ts {
  
  @scala.inline
  def apply(ts: Double): Ts = {
    val __obj = js.Dynamic.literal(ts = ts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ts]
  }
  
  @scala.inline
  implicit class TsMutableBuilder[Self <: Ts] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTs(value: Double): Self = StObject.set(x, "ts", value.asInstanceOf[js.Any])
  }
}
