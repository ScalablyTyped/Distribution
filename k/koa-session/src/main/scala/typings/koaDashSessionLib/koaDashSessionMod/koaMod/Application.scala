package typings
package koaDashSessionLib.koaDashSessionMod.koaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Application extends js.Object {
  @JSName("on")
  def `on_session:expired`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:expired`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
  @JSName("on")
  def `on_session:invalid`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:invalid`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
  @JSName("on")
  def `on_session:missed`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:missed`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
  @JSName("once")
  def `once_session:expired`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:expired`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
  @JSName("once")
  def `once_session:invalid`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:invalid`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
  @JSName("once")
  def `once_session:missed`(
    name: koaDashSessionLib.koaDashSessionLibStrings.`session:missed`,
    data: koaDashSessionLib.Anon_CtxKey
  ): scala.Unit = js.native
}

