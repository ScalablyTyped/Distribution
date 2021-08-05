package typings.jasmine.jasmine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSuite extends StObject {
  
  def execute(): Unit
}
object XSuite {
  
  inline def apply(execute: () => Unit): XSuite = {
    val __obj = js.Dynamic.literal(execute = js.Any.fromFunction0(execute))
    __obj.asInstanceOf[XSuite]
  }
  
  extension [Self <: XSuite](x: Self) {
    
    inline def setExecute(value: () => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
  }
}
