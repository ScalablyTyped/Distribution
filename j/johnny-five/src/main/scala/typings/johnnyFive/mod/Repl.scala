package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Repl extends StObject {
  
  def inject(`object`: Any): Unit
}
object Repl {
  
  inline def apply(inject: Any => Unit): Repl = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1(inject))
    __obj.asInstanceOf[Repl]
  }
  
  extension [Self <: Repl](x: Self) {
    
    inline def setInject(value: Any => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
  }
}
