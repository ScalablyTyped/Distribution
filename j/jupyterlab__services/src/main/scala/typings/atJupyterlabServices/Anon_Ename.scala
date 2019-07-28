package typings.atJupyterlabServices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ename extends js.Object {
  var ename: String
  var evalue: String
  var traceback: js.Array[String]
}

object Anon_Ename {
  @scala.inline
  def apply(ename: String, evalue: String, traceback: js.Array[String]): Anon_Ename = {
    val __obj = js.Dynamic.literal(ename = ename, evalue = evalue, traceback = traceback)
  
    __obj.asInstanceOf[Anon_Ename]
  }
}

