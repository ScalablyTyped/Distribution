package typings.jestConfig.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilePath extends js.Object {
  var filePath: String
  var humanOptionName: String
  var optionName: String
  var prefix: String
  var rootDir: String
}

object FilePath {
  @scala.inline
  def apply(filePath: String, humanOptionName: String, optionName: String, prefix: String, rootDir: String): FilePath = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], humanOptionName = humanOptionName.asInstanceOf[js.Any], optionName = optionName.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any], rootDir = rootDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilePath]
  }
}

