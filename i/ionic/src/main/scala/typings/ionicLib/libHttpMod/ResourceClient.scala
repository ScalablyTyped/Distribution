package typings
package ionicLib.libHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "ResourceClient")
@js.native
abstract class ResourceClient () extends js.Object {
  /* protected */ def applyAuthentication(req: superagentLib.superagentMod.Request, token: java.lang.String): scala.Unit = js.native
  /* protected */ def applyModifiers(req: superagentLib.superagentMod.Request): scala.Unit = js.native
  /* protected */ def applyModifiers(
    req: superagentLib.superagentMod.Request,
    modifiers: ionicLib.definitionsMod.ResourceClientRequestModifiers
  ): scala.Unit = js.native
}

