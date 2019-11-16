package typings.jestDashWatcher.buildTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsageData extends js.Object {
  var key: String
  var prompt: String
}

object UsageData {
  @scala.inline
  def apply(key: String, prompt: String): UsageData = {
    val __obj = js.Dynamic.literal(key = key, prompt = prompt)
  
    __obj.asInstanceOf[UsageData]
  }
}

