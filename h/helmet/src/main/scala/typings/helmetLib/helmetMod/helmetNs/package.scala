package typings
package helmetLib.helmetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helmetNs {
  type HelmetCspDirectiveValue = java.lang.String | IHelmetContentSecurityPolicyDirectiveFunction
  type HelmetCspRequireSriForValue = java.lang.String | helmetLib.helmetLibStrings.script | helmetLib.helmetLibStrings.style
  type HelmetCspSandboxDirective = java.lang.String | helmetLib.helmetLibStrings.`allow-forms` | helmetLib.helmetLibStrings.`allow-modals` | helmetLib.helmetLibStrings.`allow-orientation-lock` | helmetLib.helmetLibStrings.`allow-pointer-lock` | helmetLib.helmetLibStrings.`allow-popups-to-escape-sandbox` | helmetLib.helmetLibStrings.`allow-popups` | helmetLib.helmetLibStrings.`allow-presentation` | helmetLib.helmetLibStrings.`allow-same-origin` | helmetLib.helmetLibStrings.`allow-scripts` | helmetLib.helmetLibStrings.`allow-top-navigation`
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
