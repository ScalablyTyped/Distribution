package typings.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object helmetMod {
  import typings.express.expressMod.Request
  import typings.express.expressMod.Response

  type HelmetCspDirectiveValue = String | IHelmetContentSecurityPolicyDirectiveFunction
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.helmet.helmetStrings.script
    - typings.helmet.helmetStrings.style
  */
  type HelmetCspRequireSriForValue = _HelmetCspRequireSriForValue | String
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.helmet.helmetStrings.`allow-forms`
    - typings.helmet.helmetStrings.`allow-modals`
    - typings.helmet.helmetStrings.`allow-orientation-lock`
    - typings.helmet.helmetStrings.`allow-pointer-lock`
    - typings.helmet.helmetStrings.`allow-popups-to-escape-sandbox`
    - typings.helmet.helmetStrings.`allow-popups`
    - typings.helmet.helmetStrings.`allow-presentation`
    - typings.helmet.helmetStrings.`allow-same-origin`
    - typings.helmet.helmetStrings.`allow-scripts`
    - typings.helmet.helmetStrings.`allow-top-navigation`
  */
  type HelmetCspSandboxDirective = _HelmetCspSandboxDirective | String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[/* req */ Request, /* res */ Response, String]
  type IHelmetSetIfFunction = js.Function2[/* req */ Request, /* res */ Response, Boolean]
}
