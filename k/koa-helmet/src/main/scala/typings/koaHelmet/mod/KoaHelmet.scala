package typings.koaHelmet.mod

import typings.koa.mod.DefaultContext
import typings.koa.mod.DefaultState
import typings.koa.mod.Middleware
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KoaHelmet extends js.Object {
  
  def apply(): Middleware[DefaultState, DefaultContext] = js.native
  def apply(options: HelmetOptions): Middleware[DefaultState, DefaultContext] = js.native
  
  def contentSecurityPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  def contentSecurityPolicy(options: KoaHelmetContentSecurityPolicyConfiguration): Middleware[DefaultState, DefaultContext] = js.native
  
  def dnsPrefetchControl(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("dnsPrefetchControl")
  def dnsPrefetchControl_dnsPrefetchControl(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['dnsPrefetchControl'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def expectCt(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("expectCt")
  def expectCt_expectCt(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['expectCt'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def frameguard(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("frameguard")
  def frameguard_frameguard(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['frameguard'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def hidePoweredBy(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("hidePoweredBy")
  def hidePoweredBy_hidePoweredBy(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['hidePoweredBy'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def hsts(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("hsts")
  def hsts_hsts(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['hsts'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def ieNoOpen(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("ieNoOpen")
  def ieNoOpen_ieNoOpen(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['ieNoOpen'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def noSniff(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("noSniff")
  def noSniff_noSniff(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['noSniff'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def permittedCrossDomainPolicies(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("permittedCrossDomainPolicies")
  def permittedCrossDomainPolicies_permittedCrossDomainPolicies(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['permittedCrossDomainPolicies'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def referrerPolicy(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("referrerPolicy")
  def referrerPolicy_referrerPolicy(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['referrerPolicy'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
  
  def xssFilter(): Middleware[DefaultState, DefaultContext] = js.native
  @JSName("xssFilter")
  def xssFilter_xssFilter(
    options: /* import warning: importer.ImportType#apply Failed type conversion: koa-helmet.koa-helmet.HelmetOptions['xssFilter'] */ js.Any
  ): Middleware[DefaultState, DefaultContext] = js.native
}
