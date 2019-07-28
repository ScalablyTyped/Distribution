package typings.gulpDashHelp.gulpDashHelpMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  /**
    * List of aliases for this task
    */
  var aliases: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * Object documenting options which can be passed to your task
    */
  var options: js.UndefOr[StringDictionary[String]] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(aliases: js.Array[String] = null, options: StringDictionary[String] = null): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TaskOptions]
  }
}

