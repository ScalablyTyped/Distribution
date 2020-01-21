package typings.knockoutEs5

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KnockoutStatic extends js.Object {
  var es5: KnockoutEs5 = js.native
  def defineProperty[T](obj: T, propertyName: String, evaluator: js.Function): T = js.native
  def defineProperty[T](obj: T, propertyName: String, options: KnockoutDefinePropertyOptions): T = js.native
  def getObservable(obj: js.Any, propertyName: String): KnockoutObservable[_] = js.native
  def track[T](obj: T): T = js.native
  def track[T](obj: T, propertyNames: Array[String]): T = js.native
  def untrack(obj: js.Any): Unit = js.native
  def untrack(obj: js.Any, propertyNames: Array[String]): Unit = js.native
  def valueHasMutated(obj: js.Any, propertyName: String): Unit = js.native
}

