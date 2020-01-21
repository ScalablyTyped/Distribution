package typings.ionic.npmMod

import typings.ionic.definitionsMod.NpmClient
import typings.ionicCliFramework.definitionsMod.PackageJson
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/npm", "pkgFromRegistry")
@js.native
object pkgFromRegistry extends js.Object {
  def apply(npmClient: NpmClient, options: Partial[PkgManagerOptions]): js.Promise[js.UndefOr[PackageJson]] = js.native
}

