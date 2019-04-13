package typings
package helmetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helmetMod {
  type HelmetCspDirectiveValue = java.lang.String | IHelmetContentSecurityPolicyDirectiveFunction
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - helmetLib.helmetLibStrings.script
    - helmetLib.helmetLibStrings.style
  */
  type HelmetCspRequireSriForValue = _HelmetCspRequireSriForValue | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - helmetLib.helmetLibStrings.`allow-forms`
    - helmetLib.helmetLibStrings.`allow-modals`
    - helmetLib.helmetLibStrings.`allow-orientation-lock`
    - helmetLib.helmetLibStrings.`allow-pointer-lock`
    - helmetLib.helmetLibStrings.`allow-popups-to-escape-sandbox`
    - helmetLib.helmetLibStrings.`allow-popups`
    - helmetLib.helmetLibStrings.`allow-presentation`
    - helmetLib.helmetLibStrings.`allow-same-origin`
    - helmetLib.helmetLibStrings.`allow-scripts`
    - helmetLib.helmetLibStrings.`allow-top-navigation`
  */
  type HelmetCspSandboxDirective = _HelmetCspSandboxDirective | java.lang.String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    scala.Boolean
  ]
}
