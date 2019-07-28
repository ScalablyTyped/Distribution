package typings.lusca.luscaMod

import typings.express.expressMod.RequestHandler
import typings.lusca.luscaNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("lusca", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(): RequestHandler = js.native
  def apply(options: LuscaOptions): RequestHandler = js.native
  def csp(): RequestHandler = js.native
  def csp(options: cspOptions): RequestHandler = js.native
  def csrf(): RequestHandler = js.native
  def csrf(options: csrfOptions): RequestHandler = js.native
  def hsts(): RequestHandler = js.native
  def hsts(options: hstsOptions): RequestHandler = js.native
  def nosniff(): RequestHandler = js.native
  def p3p(value: String): RequestHandler = js.native
  def referrerPolicy(value: String): RequestHandler = js.native
  def xframe(value: String): RequestHandler = js.native
  def xssProtection(): RequestHandler = js.native
  def xssProtection(options: xssProtectionOptions): RequestHandler = js.native
  @JSName("xssProtection")
  def xssProtection_true(options: `true`): RequestHandler = js.native
}

