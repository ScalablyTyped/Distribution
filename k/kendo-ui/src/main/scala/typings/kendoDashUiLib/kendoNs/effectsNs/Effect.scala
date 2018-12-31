package typings
package kendoDashUiLib.kendoNs.effectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Effect extends js.Object {
  def add(effect: Effect): Effect
  def duration(value: scala.Double): Effect
  def play(): kendoDashUiLib.JQueryPromise[_]
  def reverse(): kendoDashUiLib.JQueryPromise[_]
  def stop(): Effect
}

