package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreProcessorExtraInfo extends js.Object {
  var context: lessLib.Anon_PluginManager
  var fileInfo: RootFileInfo
  var imports: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object PreProcessorExtraInfo {
  @scala.inline
  def apply(
    context: lessLib.Anon_PluginManager,
    fileInfo: RootFileInfo,
    imports: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): PreProcessorExtraInfo = {
    val __obj = js.Dynamic.literal(context = context, fileInfo = fileInfo, imports = imports)
  
    __obj.asInstanceOf[PreProcessorExtraInfo]
  }
}

