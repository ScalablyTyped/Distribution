package typings.hapi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Route extends js.Object {
  /** routes preferences: */
  var route: Anon_Prefix
}

object Anon_Route {
  @scala.inline
  def apply(route: Anon_Prefix): Anon_Route = {
    val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Route]
  }
}

