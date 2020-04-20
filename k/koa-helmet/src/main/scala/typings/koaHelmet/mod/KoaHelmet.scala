package typings.koaHelmet.mod

import typings.helmet.mod.IHelmetConfiguration
import typings.helmet.mod.IHelmetDnsPrefetchControlConfiguration
import typings.helmet.mod.IHelmetExpectCtConfiguration
import typings.helmet.mod.IHelmetFrameguardConfiguration
import typings.helmet.mod.IHelmetHidePoweredByConfiguration
import typings.helmet.mod.IHelmetHpkpConfiguration
import typings.helmet.mod.IHelmetHstsConfiguration
import typings.helmet.mod.IHelmetPermittedCrossDomainPoliciesConfiguration
import typings.helmet.mod.IHelmetReferrerPolicyConfiguration
import typings.helmet.mod.IHelmetXssFilterConfiguration
import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
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
  def expectCt(): Middleware[DefaultState, DefaultContext] = js.native
  def expectCt(options: IHelmetExpectCtConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def featurePolicy(options: KoaHelmetFeaturePolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(): Middleware[DefaultState, DefaultContext] = js.native
  def frameguard(options: IHelmetFrameguardConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hidePoweredBy(): Middleware[DefaultState, DefaultContext] = js.native
  def hidePoweredBy(options: IHelmetHidePoweredByConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(): Middleware[DefaultState, DefaultContext] = js.native
  def hpkp(options: IHelmetHpkpConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(): Middleware[DefaultState, DefaultContext] = js.native
  def hsts(options: IHelmetHstsConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def ieNoOpen(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(): Middleware[DefaultState, DefaultContext] = js.native
  def noCache(options: js.Any): Middleware[DefaultState, DefaultContext] = js.native
  def noSniff(): Middleware[DefaultState, DefaultContext] = js.native
  def permittedCrossDomainPolicies(): Middleware[DefaultState, DefaultContext] = js.native
  def permittedCrossDomainPolicies(options: IHelmetPermittedCrossDomainPoliciesConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def referrerPolicy(options: IHelmetReferrerPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(): Middleware[DefaultState, DefaultContext] = js.native
  def xssFilter(options: IHelmetXssFilterConfiguration): Middleware[DefaultState, DefaultContext] = js.native
}

