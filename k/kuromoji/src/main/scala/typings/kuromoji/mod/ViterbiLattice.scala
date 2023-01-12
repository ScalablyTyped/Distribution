package typings.kuromoji.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViterbiLattice extends StObject {
  
  def append(node: ViterbiNode): Unit
  
  def appendEos(): Unit
}
object ViterbiLattice {
  
  inline def apply(append: ViterbiNode => Unit, appendEos: () => Unit): ViterbiLattice = {
    val __obj = js.Dynamic.literal(append = js.Any.fromFunction1(append), appendEos = js.Any.fromFunction0(appendEos))
    __obj.asInstanceOf[ViterbiLattice]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViterbiLattice] (val x: Self) extends AnyVal {
    
    inline def setAppend(value: ViterbiNode => Unit): Self = StObject.set(x, "append", js.Any.fromFunction1(value))
    
    inline def setAppendEos(value: () => Unit): Self = StObject.set(x, "appendEos", js.Any.fromFunction0(value))
  }
}
