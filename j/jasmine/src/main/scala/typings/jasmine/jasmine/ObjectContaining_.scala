package typings.jasmine.jasmine

import org.scalablytyped.runtime.TopLevel
import typings.jasmine.jasmineStrings.ObjectContaining
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectContaining_[T]
  extends AsymmetricMatcher[js.Any]
     with _Expected[T] {
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ ObjectContaining with TopLevel[js.Any], 
      /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ ObjectContaining with TopLevel[js.Any]
    ]
  ] = js.undefined
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean
}

object ObjectContaining_ {
  @scala.inline
  def apply[T](
    asymmetricMatch: (js.Any, js.Array[CustomEqualityTester]) => Boolean,
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean,
    jasmineToString: () => String = null,
    `new`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ ObjectContaining with TopLevel[js.Any] => /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ ObjectContaining with TopLevel[js.Any] = null
  ): ObjectContaining_[T] = {
    val __obj = js.Dynamic.literal(asymmetricMatch = js.Any.fromFunction2(asymmetricMatch), jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1(`new`))
    __obj.asInstanceOf[ObjectContaining_[T]]
  }
}

