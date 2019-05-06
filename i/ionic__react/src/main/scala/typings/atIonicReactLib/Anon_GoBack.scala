package typings
package atIonicReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GoBack extends js.Object {
  def goBack(): scala.Unit
}

object Anon_GoBack {
  @scala.inline
  def apply(goBack: () => scala.Unit): Anon_GoBack = {
    val __obj = js.Dynamic.literal(goBack = js.Any.fromFunction0(goBack))
  
    __obj.asInstanceOf[Anon_GoBack]
  }
}

