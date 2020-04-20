package typings.jupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEname extends js.Object {
  var ename: String
  var evalue: String
  var traceback: js.Array[String]
}

object AnonEname {
  @scala.inline
  def apply(ename: String, evalue: String, traceback: js.Array[String]): AnonEname = {
    val __obj = js.Dynamic.literal(ename = ename.asInstanceOf[js.Any], evalue = evalue.asInstanceOf[js.Any], traceback = traceback.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEname]
  }
}

