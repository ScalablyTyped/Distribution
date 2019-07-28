package typings.karma.karmaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigFile extends js.Object {
  var configFile: String
}

object ConfigFile {
  @scala.inline
  def apply(configFile: String): ConfigFile = {
    val __obj = js.Dynamic.literal(configFile = configFile)
  
    __obj.asInstanceOf[ConfigFile]
  }
}

