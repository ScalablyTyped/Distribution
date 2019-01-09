package typings
package lobiboxLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DEFAULTSOPTIONS extends js.Object {
  var DEFAULTS: js.UndefOr[lobiboxLib.LobiboxModuleNs.NotifyDefault] = js.native
  var OPTIONS: js.UndefOr[lobiboxLib.LobiboxModuleNs.NotifyOptions] = js.native
  def apply[T /* <: lobiboxLib.LobiboxModuleNs.NotifyDefault */](`type`: java.lang.String): T = js.native
  def apply[T /* <: lobiboxLib.LobiboxModuleNs.NotifyDefault */](`type`: java.lang.String, options: lobiboxLib.LobiboxModuleNs.NotifyOptions): T = js.native
}

@js.native
trait Anon_DEFAULTSOptions extends js.Object {
  var DEFAULTS: lobiboxLib.LobiboxModuleNs.AlertOptions = js.native
  def apply[T /* <: lobiboxLib.LobiboxModuleNs.MessageBoxesDefault */](`type`: java.lang.String): lobiboxLib.LobiboxModuleNs.LobiboxStatic = js.native
  def apply[T /* <: lobiboxLib.LobiboxModuleNs.MessageBoxesDefault */](`type`: java.lang.String, options: T): lobiboxLib.LobiboxModuleNs.LobiboxStatic = js.native
}

