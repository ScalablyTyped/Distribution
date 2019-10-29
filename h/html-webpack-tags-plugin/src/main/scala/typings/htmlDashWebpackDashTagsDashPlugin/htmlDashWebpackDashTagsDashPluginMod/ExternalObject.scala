package typings.htmlDashWebpackDashTagsDashPlugin.htmlDashWebpackDashTagsDashPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalObject extends js.Object {
  var packageName: String
  var variableName: String
}

object ExternalObject {
  @scala.inline
  def apply(packageName: String, variableName: String): ExternalObject = {
    val __obj = js.Dynamic.literal(packageName = packageName, variableName = variableName)
  
    __obj.asInstanceOf[ExternalObject]
  }
}

