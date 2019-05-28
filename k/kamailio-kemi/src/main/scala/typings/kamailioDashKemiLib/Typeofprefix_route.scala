package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofprefix_route extends js.Object {
  def prefix_route(ruser: java.lang.String): scala.Double
  def prefix_route_uri(): scala.Double
}

object Typeofprefix_route {
  @scala.inline
  def apply(prefix_route: java.lang.String => scala.Double, prefix_route_uri: () => scala.Double): Typeofprefix_route = {
    val __obj = js.Dynamic.literal(prefix_route = js.Any.fromFunction1(prefix_route), prefix_route_uri = js.Any.fromFunction0(prefix_route_uri))
  
    __obj.asInstanceOf[Typeofprefix_route]
  }
}

