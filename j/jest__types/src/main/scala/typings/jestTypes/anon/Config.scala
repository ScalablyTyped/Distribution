package typings.jestTypes.anon

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: Record[String, _]
  var path: String
}

object Config {
  @scala.inline
  def apply(config: Record[String, _], path: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

