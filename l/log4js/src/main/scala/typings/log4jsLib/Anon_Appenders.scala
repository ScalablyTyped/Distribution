package typings
package log4jsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Appenders extends js.Object {
  var appenders: js.Array[java.lang.String]
  var level: java.lang.String
}

object Anon_Appenders {
  @scala.inline
  def apply(appenders: js.Array[java.lang.String], level: java.lang.String): Anon_Appenders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("appenders")(appenders)
    __obj.updateDynamic("level")(level)
    __obj.asInstanceOf[Anon_Appenders]
  }
}

