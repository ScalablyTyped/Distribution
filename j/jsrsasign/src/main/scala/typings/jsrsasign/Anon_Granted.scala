package typings.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Granted extends js.Object {
  var granted: Double
  var grantedWithMods: Double
  var rejection: Double
  var revocationNotification: Double
  var revocationWarning: Double
  var waiting: Double
}

object Anon_Granted {
  @scala.inline
  def apply(
    granted: Double,
    grantedWithMods: Double,
    rejection: Double,
    revocationNotification: Double,
    revocationWarning: Double,
    waiting: Double
  ): Anon_Granted = {
    val __obj = js.Dynamic.literal(granted = granted, grantedWithMods = grantedWithMods, rejection = rejection, revocationNotification = revocationNotification, revocationWarning = revocationWarning, waiting = waiting)
  
    __obj.asInstanceOf[Anon_Granted]
  }
}

