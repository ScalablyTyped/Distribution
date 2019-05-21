package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteEntry extends js.Object {
  var id: java.lang.String
  var params: js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]] = js.undefined
  var path: js.Array[java.lang.String]
}

object RouteEntry {
  @scala.inline
  def apply(
    id: java.lang.String,
    path: js.Array[java.lang.String],
    params: org.scalablytyped.runtime.StringDictionary[_] = null
  ): RouteEntry = {
    val __obj = js.Dynamic.literal(id = id, path = path)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RouteEntry]
  }
}

