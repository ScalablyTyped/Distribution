package typings.hapi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RouteOptionsAccessScopeObject extends _RouteOptionsAccessObject {
  var scope: RouteOptionsAccessScope
}

object RouteOptionsAccessScopeObject {
  @scala.inline
  def apply(scope: RouteOptionsAccessScope): RouteOptionsAccessScopeObject = {
    val __obj = js.Dynamic.literal(scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteOptionsAccessScopeObject]
  }
}

