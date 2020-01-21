package typings.ionic.npmMod

import typings.ionic.definitionsMod.NpmClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/npm", "pkgManagerArgs")
@js.native
object pkgManagerArgs extends js.Object {
  def apply(npmClient: NpmClient, options: PkgManagerOptions): js.Promise[js.Array[String]] = js.native
}

