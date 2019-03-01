package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeystrokeSequence extends js.Object {
  var keystrokeSequence: java.lang.String
  var windows: java.lang.String
}

object Anon_KeystrokeSequence {
  @scala.inline
  def apply(keystrokeSequence: java.lang.String, windows: java.lang.String): Anon_KeystrokeSequence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keystrokeSequence")(keystrokeSequence)
    __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[Anon_KeystrokeSequence]
  }
}

