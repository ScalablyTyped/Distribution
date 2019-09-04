package typings.atJestTypes

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: Record[String, _]
  var path: String
}

object Anon_Config {
  @scala.inline
  def apply(config: Record[String, _], path: String): Anon_Config = {
    val __obj = js.Dynamic.literal(config = config, path = path)
  
    __obj.asInstanceOf[Anon_Config]
  }
}

