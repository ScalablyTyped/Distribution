package typings.koPlus.KoPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<T> * / any */ @js.native
trait Editable[T] extends EditableFunctions

object Editable {
  @scala.inline
  def apply[T](
    beginEdit: () => Unit,
    cancelEdit: () => Unit,
    endEdit: () => Unit,
    isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    rollback: () => Unit
  ): Editable[T] = {
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback))
    __obj.asInstanceOf[Editable[T]]
  }
}

