package typings.ionic.libHttpMod

import typings.ionic.definitionsMod.ResourceClientRequestModifiers
import typings.superagent.superagentMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/http", "ResourceClient")
@js.native
abstract class ResourceClient () extends js.Object {
  /* protected */ def applyAuthentication(req: Request, token: String): Unit = js.native
  /* protected */ def applyModifiers(req: Request): Unit = js.native
  /* protected */ def applyModifiers(req: Request, modifiers: ResourceClientRequestModifiers): Unit = js.native
}

