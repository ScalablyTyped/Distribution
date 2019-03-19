package typings
package kamailioDashKemiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dispatch extends js.Object {
  def dispatch(): scala.Double
}

object Anon_Dispatch {
  @scala.inline
  def apply(dispatch: () => scala.Double): Anon_Dispatch = {
    val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction0(dispatch))
  
    __obj.asInstanceOf[Anon_Dispatch]
  }
}

