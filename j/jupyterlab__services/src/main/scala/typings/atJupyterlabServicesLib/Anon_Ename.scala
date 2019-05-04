package typings
package atJupyterlabServicesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ename extends js.Object {
  var ename: java.lang.String
  var evalue: java.lang.String
  var traceback: js.Array[java.lang.String]
}

object Anon_Ename {
  @scala.inline
  def apply(ename: java.lang.String, evalue: java.lang.String, traceback: js.Array[java.lang.String]): Anon_Ename = {
    val __obj = js.Dynamic.literal(ename = ename, evalue = evalue, traceback = traceback)
  
    __obj.asInstanceOf[Anon_Ename]
  }
}

