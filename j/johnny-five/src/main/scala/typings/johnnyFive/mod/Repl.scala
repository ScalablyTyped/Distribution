package typings.johnnyFive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Repl extends StObject {
  
  def inject(`object`: js.Any): Unit = js.native
}
object Repl {
  
  @scala.inline
  def apply(inject: js.Any => Unit): Repl = {
    val __obj = js.Dynamic.literal(inject = js.Any.fromFunction1(inject))
    __obj.asInstanceOf[Repl]
  }
  
  @scala.inline
  implicit class ReplMutableBuilder[Self <: Repl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInject(value: js.Any => Unit): Self = StObject.set(x, "inject", js.Any.fromFunction1(value))
  }
}
