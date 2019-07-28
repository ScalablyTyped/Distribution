package typings.knockoutDashPaging

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPageGenerator extends js.Object {
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[Double]
}

object KnockoutPageGenerator {
  @scala.inline
  def apply(generate: KnockoutPagedObservableArray[js.Any] => js.Array[Double]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal(generate = js.Any.fromFunction1(generate))
  
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
}

