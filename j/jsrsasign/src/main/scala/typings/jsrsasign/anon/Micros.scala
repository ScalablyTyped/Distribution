package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Micros extends StObject {
  
  var micros: Double
  
  var millis: Double
  
  var seconds: Double
}
object Micros {
  
  @scala.inline
  def apply(micros: Double, millis: Double, seconds: Double): Micros = {
    val __obj = js.Dynamic.literal(micros = micros.asInstanceOf[js.Any], millis = millis.asInstanceOf[js.Any], seconds = seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Micros]
  }
  
  @scala.inline
  implicit class MicrosMutableBuilder[Self <: Micros] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMicros(value: Double): Self = StObject.set(x, "micros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMillis(value: Double): Self = StObject.set(x, "millis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeconds(value: Double): Self = StObject.set(x, "seconds", value.asInstanceOf[js.Any])
  }
}
