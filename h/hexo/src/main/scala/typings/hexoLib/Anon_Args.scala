package typings
package hexoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Args extends js.Object {
  val args: minimistLib.minimistMod.minimistNs.ParsedArgs
  val debug: scala.Boolean
  val env: java.lang.String
  val init: scala.Boolean
  val safe: scala.Boolean
  val silent: scala.Boolean
  val version: java.lang.String
}

object Anon_Args {
  @scala.inline
  def apply(
    args: minimistLib.minimistMod.minimistNs.ParsedArgs,
    debug: scala.Boolean,
    env: java.lang.String,
    init: scala.Boolean,
    safe: scala.Boolean,
    silent: scala.Boolean,
    version: java.lang.String
  ): Anon_Args = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("args")(args)
    __obj.updateDynamic("debug")(debug)
    __obj.updateDynamic("env")(env)
    __obj.updateDynamic("init")(init)
    __obj.updateDynamic("safe")(safe)
    __obj.updateDynamic("silent")(silent)
    __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Args]
  }
}

