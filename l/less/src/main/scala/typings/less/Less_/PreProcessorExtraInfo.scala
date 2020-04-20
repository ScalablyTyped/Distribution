package typings.less.Less_

import org.scalablytyped.runtime.StringDictionary
import typings.less.AnonPluginManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessorExtraInfo extends js.Object {
  var context: AnonPluginManager
  var fileInfo: RootFileInfo
  var imports: StringDictionary[js.Any]
}

object PreProcessorExtraInfo {
  @scala.inline
  def apply(context: AnonPluginManager, fileInfo: RootFileInfo, imports: StringDictionary[js.Any]): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
}

