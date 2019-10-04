package typings.koaDashHelmet.koaDashHelmetMod

import typings.helmet.helmetMod.IHelmetConfiguration
import typings.helmet.helmetMod.IHelmetDnsPrefetchControlConfiguration
import typings.helmet.helmetMod.IHelmetFrameguardConfiguration
import typings.helmet.helmetMod.IHelmetHpkpConfiguration
import typings.helmet.helmetMod.IHelmetHstsConfiguration
import typings.helmet.helmetMod.IHelmetReferrerPolicyConfiguration
import typings.helmet.helmetMod.IHelmetXssFilterConfiguration
import typings.koa.koaMod.DefaultContext
import typings.koa.koaMod.DefaultState
import typings.koa.koaMod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KoaHelmet extends js.Object {
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: IHelmetConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def dnsPrefetchControl(): Middleware[DefaultState, DefaultContext] = js.native
  def dnsPrefetchControl(options: IHelmetDnsPrefetchControlConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(options: IHelmetHstsConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def ieNoOpen(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
  def noSniff(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): Middleware[DefaultState, DefaultContext] = js.native
}

