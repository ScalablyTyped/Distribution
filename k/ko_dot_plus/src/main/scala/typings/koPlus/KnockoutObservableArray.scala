package typings.koPlus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Sortable type extensions
//
// extends the KnockoutObservableArray to add sorting methods
// see https://github.com/stevegreatrex/ko.plus#properties-and-functions
//
@js.native
trait KnockoutObservableArray[T] extends js.Object {
  var sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any = js.native
  var sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any = js.native
  def setSourceKey(key: String): Unit = js.native
}

object KnockoutObservableArray {
  @scala.inline
  def apply[T](
    setSourceKey: String => Unit,
    sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any,
    sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
  ): KnockoutObservableArray[T] = {
    val __obj = js.Dynamic.literal(setSourceKey = js.Any.fromFunction1(setSourceKey), sortDescending = sortDescending.asInstanceOf[js.Any], sortKey = sortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnockoutObservableArray[T]]
  }
  @scala.inline
  implicit class KnockoutObservableArrayOps[Self <: KnockoutObservableArray[_], T] (val x: Self with KnockoutObservableArray[T]) extends AnyVal {
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
    def setSetSourceKey(value: String => Unit): Self = this.set("setSourceKey", js.Any.fromFunction1(value))
    @scala.inline
    def setSortDescending(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = this.set("sortDescending", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = this.set("sortKey", value.asInstanceOf[js.Any])
  }
  
}

