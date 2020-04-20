package typings.koaHelmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type KoaHelmetContentSecurityPolicyDirectiveFunction = js.Function1[/* ctx */ typings.koa.mod.Context, java.lang.String]
  type KoaHelmetCspDirectiveValue = java.lang.String | typings.koaHelmet.mod.KoaHelmetContentSecurityPolicyDirectiveFunction
  type KoaHelmetFeaturePolicyDirectiveValue = java.lang.String
}
