package typings
package luscaLib.luscaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): expressLib.expressMod.eNs.RequestHandler = js.native
  def apply(options: luscaLib.luscaMod.luscaNs.LuscaOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def csp(): expressLib.expressMod.eNs.RequestHandler = js.native
  def csp(options: luscaLib.luscaMod.luscaNs.cspOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def csrf(): expressLib.expressMod.eNs.RequestHandler = js.native
  def csrf(options: luscaLib.luscaMod.luscaNs.csrfOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def hsts(): expressLib.expressMod.eNs.RequestHandler = js.native
  def hsts(options: luscaLib.luscaMod.luscaNs.hstsOptions): expressLib.expressMod.eNs.RequestHandler = js.native
  def nosniff(): expressLib.expressMod.eNs.RequestHandler = js.native
  def p3p(value: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def referrerPolicy(value: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def xframe(value: java.lang.String): expressLib.expressMod.eNs.RequestHandler = js.native
  def xssProtection(): expressLib.expressMod.eNs.RequestHandler = js.native
  def xssProtection(options: luscaLib.luscaLibNumbers.`true`): expressLib.expressMod.eNs.RequestHandler = js.native
  def xssProtection(options: luscaLib.luscaMod.luscaNs.xssProtectionOptions): expressLib.expressMod.eNs.RequestHandler = js.native
}

