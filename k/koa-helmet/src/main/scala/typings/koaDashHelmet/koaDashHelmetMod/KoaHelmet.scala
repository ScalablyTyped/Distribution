package typings.koaDashHelmet.koaDashHelmetMod

import typings.helmet.helmetMod.IHelmetConfiguration
import typings.helmet.helmetMod.IHelmetDnsPrefetchControlConfiguration
import typings.helmet.helmetMod.IHelmetFrameguardConfiguration
import typings.helmet.helmetMod.IHelmetHpkpConfiguration
import typings.helmet.helmetMod.IHelmetHstsConfiguration
import typings.helmet.helmetMod.IHelmetReferrerPolicyConfiguration
import typings.helmet.helmetMod.IHelmetXssFilterConfiguration
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmet extends js.Object {
  def apply(): Middleware[_, js.Object] = js.native
  def apply(options: IHelmetConfiguration): Middleware[_, js.Object] = js.native
  def contentSecurityPolicy(): Middleware[_, js.Object] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[_, js.Object] = js.native
  def dnsPrefetchControl(): Middleware[_, js.Object] = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): Middleware[_, js.Object] = js.native
  def frameguard(): Middleware[_, js.Object] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): Middleware[_, js.Object] = js.native
  def hpkp(): Middleware[_, js.Object] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): Middleware[_, js.Object] = js.native
  def hsts(): Middleware[_, js.Object] = js.native
  def hsts(options: IHelmetHstsConfiguration): Middleware[_, js.Object] = js.native
  def ieNoOpen(): Middleware[_, js.Object] = js.native
  def noCache(): Middleware[_, js.Object] = js.native
  def noCache(options: js.Any): Middleware[_, js.Object] = js.native
  def noSniff(): Middleware[_, js.Object] = js.native
  def referrerPolicy(): Middleware[_, js.Object] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): Middleware[_, js.Object] = js.native
  def xssFilter(): Middleware[_, js.Object] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): Middleware[_, js.Object] = js.native
}

