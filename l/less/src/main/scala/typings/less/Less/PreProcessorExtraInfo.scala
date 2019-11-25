package typings.less.Less

import org.scalablytyped.runtime.StringDictionary
import typings.less.Anon_PluginManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessorExtraInfo extends js.Object {
  var context: Anon_PluginManager
  var fileInfo: RootFileInfo
  var imports: StringDictionary[js.Any]
}

object PreProcessorExtraInfo {
  @scala.inline
  def apply(context: Anon_PluginManager, fileInfo: RootFileInfo, imports: StringDictionary[js.Any]): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], fileInfo = fileInfo.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
}

