package typings
package inversifyDashExpressDashUtilsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthProvider extends js.Object {
  var AuthProvider: js.Symbol
  var Controller: js.Symbol
  var HttpContext: js.Symbol
}

object Anon_AuthProvider {
  @scala.inline
  def apply(AuthProvider: js.Symbol, Controller: js.Symbol, HttpContext: js.Symbol): Anon_AuthProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AuthProvider")(AuthProvider)
    __obj.updateDynamic("Controller")(Controller)
    __obj.updateDynamic("HttpContext")(HttpContext)
    __obj.asInstanceOf[Anon_AuthProvider]
  }
}

