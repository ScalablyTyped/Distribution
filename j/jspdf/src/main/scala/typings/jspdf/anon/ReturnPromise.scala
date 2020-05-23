package typings.jspdf.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnPromise extends js.Object {
  var returnPromise: Boolean
}

object ReturnPromise {
  @scala.inline
  def apply(returnPromise: Boolean): ReturnPromise = {
    val __obj = js.Dynamic.literal(returnPromise = returnPromise.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnPromise]
  }
}

