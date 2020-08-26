package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableStatic * / any */ @js.native
trait EditableStatic extends js.Object {
  def apply[T](): Editable[T] = js.native
  def apply[T](value: T): Editable[T] = js.native
  def makeEditable(target: js.Any): Unit = js.native
}

