package typings
package jqueryDotFingerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryStatic extends js.Object {
  var Finger: jqueryDotFingerLib.JQueryFingerNs.JQueryFingerOptions
}

object JQueryStatic {
  @scala.inline
  def apply(Finger: jqueryDotFingerLib.JQueryFingerNs.JQueryFingerOptions): JQueryStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Finger")(Finger)
    __obj.asInstanceOf[JQueryStatic]
  }
}

