package typings
package knockoutDotEs5Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var es5: KnockoutEs5 = js.native
  def defineProperty[T](obj: T, propertyName: java.lang.String, evaluator: js.Function): T = js.native
  def defineProperty[T](obj: T, propertyName: java.lang.String, options: KnockoutDefinePropertyOptions): T = js.native
  def getObservable(obj: js.Any, propertyName: java.lang.String): knockoutLib.KnockoutObservable[_] = js.native
  def track[T](obj: T): T = js.native
  def track[T](obj: T, propertyNames: Array[java.lang.String]): T = js.native
  def untrack(obj: js.Any): scala.Unit = js.native
  def untrack(obj: js.Any, propertyNames: Array[java.lang.String]): scala.Unit = js.native
  def valueHasMutated(obj: js.Any, propertyName: java.lang.String): scala.Unit = js.native
}

