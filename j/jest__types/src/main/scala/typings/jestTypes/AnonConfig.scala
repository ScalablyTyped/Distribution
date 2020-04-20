package typings.jestTypes

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: Record[String, _]
  var path: String
}

object AnonConfig {
  @scala.inline
  def apply(config: Record[String, _], path: String): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

