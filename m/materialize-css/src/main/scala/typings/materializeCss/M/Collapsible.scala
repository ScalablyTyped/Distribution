package typings.materializeCss.M

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CollapsibleOptions> * / any */ trait Collapsible extends StObject {
  
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit
  
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit
}
object Collapsible {
  
  inline def apply(close: Double => Unit, open: Double => Unit): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[Collapsible]
  }
  
  extension [Self <: Collapsible](x: Self) {
    
    inline def setClose(value: Double => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
    
    inline def setOpen(value: Double => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
  }
}
