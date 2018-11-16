package typings
package koaDashHelmetLib.koaDashHelmetMod.koaHelmetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmet extends js.Object {
  def apply(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def apply(options: helmetLib.helmetMod.helmetNs.IHelmetConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def contentSecurityPolicy(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def dnsPrefetchControl(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def dnsPrefetchControl(options: helmetLib.helmetMod.helmetNs.IHelmetDnsPrefetchControlConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def frameguard(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def frameguard(options: helmetLib.helmetMod.helmetNs.IHelmetFrameguardConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def hpkp(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def hpkp(options: helmetLib.helmetMod.helmetNs.IHelmetHpkpConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def hsts(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def hsts(options: helmetLib.helmetMod.helmetNs.IHelmetHstsConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def ieNoOpen(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def noCache(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def noCache(options: js.Any): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def noSniff(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def referrerPolicy(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def referrerPolicy(options: helmetLib.helmetMod.helmetNs.IHelmetReferrerPolicyConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def xssFilter(): koaLib.koaMod.ApplicationNs.Middleware = js.native
  def xssFilter(options: helmetLib.helmetMod.helmetNs.IHelmetXssFilterConfiguration): koaLib.koaMod.ApplicationNs.Middleware = js.native
}

