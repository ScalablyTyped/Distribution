package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): expressLib.expressMod.RequestHandler = js.native
  def apply(options: LuscaOptions): expressLib.expressMod.RequestHandler = js.native
  def csp(): expressLib.expressMod.RequestHandler = js.native
  def csp(options: cspOptions): expressLib.expressMod.RequestHandler = js.native
  def csrf(): expressLib.expressMod.RequestHandler = js.native
  def csrf(options: csrfOptions): expressLib.expressMod.RequestHandler = js.native
  def hsts(): expressLib.expressMod.RequestHandler = js.native
  def hsts(options: hstsOptions): expressLib.expressMod.RequestHandler = js.native
  def nosniff(): expressLib.expressMod.RequestHandler = js.native
  def p3p(value: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def referrerPolicy(value: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def xframe(value: java.lang.String): expressLib.expressMod.RequestHandler = js.native
  def xssProtection(): expressLib.expressMod.RequestHandler = js.native
  def xssProtection(options: xssProtectionOptions): expressLib.expressMod.RequestHandler = js.native
  @JSName("xssProtection")
  def xssProtection_true(options: luscaLib.luscaLibNumbers.`true`): expressLib.expressMod.RequestHandler = js.native
}

