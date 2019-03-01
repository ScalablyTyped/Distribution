package typings
package hapiLib.hapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsAccessScopeObject extends _RouteOptionsAccessObject {
  var scope: RouteOptionsAccessScope
}

object RouteOptionsAccessScopeObject {
  @scala.inline
  def apply(scope: RouteOptionsAccessScope): RouteOptionsAccessScopeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessScopeObject]
  }
}

