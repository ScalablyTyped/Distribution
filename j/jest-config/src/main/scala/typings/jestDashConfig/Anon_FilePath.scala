package typings.jestDashConfig

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FilePath extends js.Object {
  var filePath: String
  var humanOptionName: String
  var optionName: String
  var prefix: String
  var rootDir: String
}

object Anon_FilePath {
  @scala.inline
  def apply(filePath: String, humanOptionName: String, optionName: String, prefix: String, rootDir: String): Anon_FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], humanOptionName = humanOptionName.asInstanceOf[js.Any], optionName = optionName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FilePath]
  }
}

