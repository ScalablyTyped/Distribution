package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservableArrayStatic * / any */ @js.native
trait EditableArrayStatic extends js.Object {
  def apply[T](): EditableArray[T] = js.native
  def apply[T](value: js.Array[T]): EditableArray[T] = js.native
  def makeEditable(target: js.Any): Unit = js.native
}

