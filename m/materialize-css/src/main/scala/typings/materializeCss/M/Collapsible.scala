package typings.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Component<CollapsibleOptions> * / any */ @js.native
trait Collapsible extends js.Object {
  /**
    * Close collapsible section
    * @param n Nth section to close
    */
  def close(n: Double): Unit = js.native
  /**
    * Open collapsible section
    * @param n Nth section to open
    */
  def open(n: Double): Unit = js.native
}

object Collapsible {
  @scala.inline
  def apply(close: Double => Unit, open: Double => Unit): Collapsible = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction1(close), open = js.Any.fromFunction1(open))
    __obj.asInstanceOf[Collapsible]
  }
  @scala.inline
  implicit class CollapsibleOps[Self <: Collapsible] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: Double => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def setOpen(value: Double => Unit): Self = this.set("open", js.Any.fromFunction1(value))
  }
  
}

