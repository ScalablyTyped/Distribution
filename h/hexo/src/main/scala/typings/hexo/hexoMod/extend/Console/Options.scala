package typings.hexo.hexoMod.extend.Console

import typings.hexo.Anon_Desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The description of each argument of a console command.
    */
  var arguments: js.UndefOr[js.Array[Anon_Desc]] = js.undefined
  /**
    * More detailed information about a console command.
    */
  var desc: js.UndefOr[String] = js.undefined
  /**
    * The description of each option of a console command.
    */
  var options: js.UndefOr[js.Array[Anon_Desc]] = js.undefined
  /**
    * The usage of a console command.
    */
  var usage: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    arguments: js.Array[Anon_Desc] = null,
    desc: String = null,
    options: js.Array[Anon_Desc] = null,
    usage: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (desc != null) __obj.updateDynamic("desc")(desc)
    if (options != null) __obj.updateDynamic("options")(options)
    if (usage != null) __obj.updateDynamic("usage")(usage)
    __obj.asInstanceOf[Options]
  }
}

