package typings.koPlus

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Sortable type extensions
//
// extends the KnockoutObservableArray to add sorting methods
// see https://github.com/stevegreatrex/ko.plus#properties-and-functions
//
trait KnockoutObservableArray[T] extends StObject {
  
  def setSourceKey(key: String): Unit
  
  var sortDescending: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
  
  var sortKey: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
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
  implicit class KnockoutObservableArrayMutableBuilder[Self <: KnockoutObservableArray[?], T] (val x: Self & KnockoutObservableArray[T]) extends AnyVal {
    
    @scala.inline
    def setSetSourceKey(value: String => Unit): Self = StObject.set(x, "setSourceKey", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSortDescending(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<boolean> */ js.Any
    ): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify KnockoutObservable<string> */ js.Any
    ): Self = StObject.set(x, "sortKey", value.asInstanceOf[js.Any])
  }
}
