package typings
package hexoLib.hexoMod.extendNs.ConsoleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The description of each argument of a console command.
    */
  var arguments: js.UndefOr[js.Array[hexoLib.Anon_Desc]] = js.undefined
  /**
    * More detailed information about a console command.
    */
  var desc: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The description of each option of a console command.
    */
  var options: js.UndefOr[js.Array[hexoLib.Anon_Desc]] = js.undefined
  /**
    * The usage of a console command.
    */
  var usage: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arguments: js.Array[hexoLib.Anon_Desc] = null,
    desc: java.lang.String = null,
    options: js.Array[hexoLib.Anon_Desc] = null,
    usage: java.lang.String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (options != null) __obj.updateDynamic("options")(options)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[Options]
  }
}

