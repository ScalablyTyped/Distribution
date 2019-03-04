package typings
package kdbxwebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultSequence extends js.Object {
  var defaultSequence: java.lang.String
  var enabled: scala.Boolean
  var items: Anon_KeystrokeSequence
  var obfuscation: scala.Double
}

object Anon_DefaultSequence {
  @scala.inline
  def apply(
    defaultSequence: java.lang.String,
    enabled: scala.Boolean,
    items: Anon_KeystrokeSequence,
    obfuscation: scala.Double
  ): Anon_DefaultSequence = {
    val __obj = js.Dynamic.literal(defaultSequence = defaultSequence, enabled = enabled, items = items, obfuscation = obfuscation)
  
    __obj.asInstanceOf[Anon_DefaultSequence]
  }
}

