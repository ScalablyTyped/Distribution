package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helmetNs {
  type HelmetCspDirectiveValue = java.lang.String | IHelmetContentSecurityPolicyDirectiveFunction
  type HelmetCspRequireSriForValue = _HelmetCspRequireSriForValue | java.lang.String
  type HelmetCspSandboxDirective = _HelmetCspSandboxDirective | java.lang.String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ expressLib.expressMod.eNs.Response, 
    scala.Boolean
  ]
}
