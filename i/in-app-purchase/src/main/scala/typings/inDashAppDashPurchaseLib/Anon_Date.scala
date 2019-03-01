package typings
package inDashAppDashPurchaseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var date: java.lang.String
  var signature: java.lang.String
}

object Anon_Date {
  @scala.inline
  def apply(date: java.lang.String, signature: java.lang.String): Anon_Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("signature")(signature)
    __obj.asInstanceOf[Anon_Date]
  }
}

