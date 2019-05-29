package typings
package atIonicCoreLib.distTypesComponentsRouterUtilsInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteNode extends RouteEntry {
  var children: RouteTree
}

object RouteNode {
  @scala.inline
  def apply(
    children: RouteTree,
    id: java.lang.String,
    path: js.Array[java.lang.String],
    params: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): RouteNode = {
    val __obj = js.Dynamic.literal(children = children, id = id, path = path)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[RouteNode]
  }
}

