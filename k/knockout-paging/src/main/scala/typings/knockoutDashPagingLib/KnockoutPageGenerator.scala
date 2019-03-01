package typings
package knockoutDashPagingLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutPageGenerator extends js.Object {
  def generate[T](pagedObservable: KnockoutPagedObservableArray[T]): js.Array[scala.Double]
}

object KnockoutPageGenerator {
  @scala.inline
  def apply(generate: js.Function1[KnockoutPagedObservableArray[js.Any], js.Array[scala.Double]]): KnockoutPageGenerator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("generate")(generate)
    __obj.asInstanceOf[KnockoutPageGenerator]
  }
}

