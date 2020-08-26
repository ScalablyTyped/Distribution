package typings.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectContaining[T]
  extends AsymmetricMatcher[js.Any]
     with _Expected[T] {
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
    ]
  ] = js.native
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean = js.native
}

object ObjectContaining {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
  @scala.inline
  implicit class ObjectContainingOps[Self <: ObjectContaining[_], T] (val x: Self with ObjectContaining[T]) extends AnyVal {
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
    def setJasmineMatches(value: (js.Any, js.Array[_], js.Array[_]) => Boolean): Self = this.set("jasmineMatches", js.Any.fromFunction3(value))
    @scala.inline
    def setNew(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]:? any}
      */ typings.jasmine.jasmineStrings.ObjectContaining with TopLevel[js.Any]
    ): Self = this.set("new", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNew: Self = this.set("new", js.undefined)
  }
  
}

