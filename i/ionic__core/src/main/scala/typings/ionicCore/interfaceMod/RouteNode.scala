package typings.ionicCore.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteNode extends RouteEntry {
  var children: RouteTree
}

object RouteNode {
  @scala.inline
  def apply(children: RouteTree, id: String, path: js.Array[String], params: StringDictionary[js.Any] = null): RouteNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteNode]
  }
}

