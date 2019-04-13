package typings
package koaDashHelmetLib.koaDashHelmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmet extends js.Object {
  def apply(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def apply(options: helmetLib.helmetMod.IHelmetConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def contentSecurityPolicy(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def dnsPrefetchControl(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def dnsPrefetchControl(options: helmetLib.helmetMod.IHelmetDnsPrefetchControlConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def frameguard(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def frameguard(options: helmetLib.helmetMod.IHelmetFrameguardConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def hpkp(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def hpkp(options: helmetLib.helmetMod.IHelmetHpkpConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def hsts(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def hsts(options: helmetLib.helmetMod.IHelmetHstsConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def ieNoOpen(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def noCache(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def noCache(options: js.Any): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def noSniff(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def referrerPolicy(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def referrerPolicy(options: helmetLib.helmetMod.IHelmetReferrerPolicyConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def xssFilter(): koaLib.koaMod.Middleware[_, js.Object] = js.native
  def xssFilter(options: helmetLib.helmetMod.IHelmetXssFilterConfiguration): koaLib.koaMod.Middleware[_, js.Object] = js.native
}

