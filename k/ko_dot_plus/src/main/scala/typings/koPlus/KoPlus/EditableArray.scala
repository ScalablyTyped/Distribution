package typings.koPlus.KoPlus

import typings.koPlus.KnockoutObservableArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditableArray[T]
  extends KnockoutObservableArray[T]
     with EditableFunctions
object EditableArray {
  
  @scala.inline
  def apply[T](
    beginEdit: () => Unit,
    cancelEdit: () => Unit,
    endEdit: () => Unit,
    isEditing: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    rollback: () => Unit,
    setSourceKey: String => Unit,
    sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  ): EditableArray[T] = {
    val __obj = js.Dynamic.literal(beginEdit = js.Any.fromFunction0(beginEdit), cancelEdit = js.Any.fromFunction0(cancelEdit), endEdit = js.Any.fromFunction0(endEdit), isEditing = isEditing.asInstanceOf[js.Any], rollback = js.Any.fromFunction0(rollback), setSourceKey = js.Any.fromFunction1(setSourceKey), sortDescending = sortDescending.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditableArray[T]]
  }
}
