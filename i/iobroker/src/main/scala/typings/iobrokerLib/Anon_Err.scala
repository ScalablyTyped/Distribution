package typings
package iobrokerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: java.lang.String
}

object Anon_Err {
  @scala.inline
  def apply(err: java.lang.String): Anon_Err = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_Err]
  }
}

