package typings.koaDashHelmet

import typings.koa.koaMod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashHelmetMod {
  type KoaHelmetContentSecurityPolicyDirectiveFunction = js.Function1[/* ctx */ Context, String]
  type KoaHelmetCspDirectiveValue = String | KoaHelmetContentSecurityPolicyDirectiveFunction
}
