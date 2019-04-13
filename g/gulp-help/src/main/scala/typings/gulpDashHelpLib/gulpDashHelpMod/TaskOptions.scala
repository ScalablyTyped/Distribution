package typings
package gulpDashHelpLib.gulpDashHelpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskOptions extends js.Object {
  /**
    * List of aliases for this task
    */
  var aliases: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Object documenting options which can be passed to your task
    */
  var options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]] = js.undefined
}

object TaskOptions {
  @scala.inline
  def apply(
    aliases: js.Array[java.lang.String] = null,
    options: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): TaskOptions = {
    val __obj = js.Dynamic.literal()
    if (aliases != null) __obj.updateDynamic("aliases")(aliases)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[TaskOptions]
  }
}

