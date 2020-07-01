package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CollapsibleOptions> * / any */ trait Collapsible extends js.Object {
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
  @scala.inline
  def apply(close: Double => Unit, open: Double => Unit): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[Collapsible]
  }
}

