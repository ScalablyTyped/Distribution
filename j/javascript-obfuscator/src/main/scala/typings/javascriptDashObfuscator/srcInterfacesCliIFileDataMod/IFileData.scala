package typings.javascriptDashObfuscator.srcInterfacesCliIFileDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileData extends js.Object {
  var content: String
  var filePath: String
}

object IFileData {
  @scala.inline
  def apply(content: String, filePath: String): IFileData = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFileData]
  }
}

