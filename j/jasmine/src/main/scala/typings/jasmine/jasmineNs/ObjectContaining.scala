package typings.jasmine.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectContaining[T] extends _Expected[T] {
  var jasmineToString: js.UndefOr[js.Function0[String]] = js.undefined
  var `new`: js.UndefOr[
    js.Function1[
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with js.Any, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining with js.Any
    ]
  ] = js.undefined
  def jasmineMatches(other: js.Any, mismatchKeys: js.Array[_], mismatchValues: js.Array[_]): Boolean
}

object ObjectContaining {
  @scala.inline
  def apply[T](
    jasmineMatches: (js.Any, js.Array[_], js.Array[_]) => Boolean,
    jasmineToString: () => String = null,
    `new`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ /* sample */ typings.jasmine.jasmineStrings.ObjectContaining with js.Any => /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof T ]:? any}
    */ typings.jasmine.jasmineStrings.ObjectContaining with js.Any = null
  ): ObjectContaining[T] = {
    val __obj = js.Dynamic.literal(jasmineMatches = js.Any.fromFunction3(jasmineMatches))
    if (jasmineToString != null) __obj.updateDynamic("jasmineToString")(js.Any.fromFunction0(jasmineToString))
    if (`new` != null) __obj.updateDynamic("new")(js.Any.fromFunction1(`new`))
    __obj.asInstanceOf[ObjectContaining[T]]
  }
}

