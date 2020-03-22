package typings.helmet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type HelmetCspDirectiveValue = java.lang.String | typings.helmet.mod.IHelmetContentSecurityPolicyDirectiveFunction
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.helmet.helmetStrings.script
    - typings.helmet.helmetStrings.style
  */
  type HelmetCspRequireSriForValue = typings.helmet.mod._HelmetCspRequireSriForValue | java.lang.String
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
  type HelmetCspSandboxDirective = typings.helmet.mod._HelmetCspSandboxDirective | java.lang.String
  type IHelmetContentSecurityPolicyDirectiveFunction = js.Function2[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_[js.Any], 
    java.lang.String
  ]
  type IHelmetSetIfFunction = js.Function2[
    /* req */ typings.express.mod.Request_[typings.expressServeStaticCore.mod.ParamsDictionary], 
    /* res */ typings.express.mod.Response_[js.Any], 
    scala.Boolean
  ]
}
