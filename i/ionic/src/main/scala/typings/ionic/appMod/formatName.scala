package typings.ionic.appMod

import typings.ionic.definitionsMod.App
import typings.ionic.ionicStrings.name
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/app", "formatName")
@js.native
object formatName extends js.Object {
  def apply(app: Pick[App, name | typings.ionic.ionicStrings.org]): String = js.native
}

