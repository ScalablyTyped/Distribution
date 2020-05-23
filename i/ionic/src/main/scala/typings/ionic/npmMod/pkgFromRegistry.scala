package typings.ionic.npmMod

import typings.ionic.anon.PartialPkgManagerOptions
import typings.ionic.definitionsMod.NpmClient
import typings.ionicCliFramework.definitionsMod.PackageJson
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ionic/lib/utils/npm", "pkgFromRegistry")
@js.native
object pkgFromRegistry extends js.Object {
  def apply(npmClient: NpmClient, options: PartialPkgManagerOptions): js.Promise[js.UndefOr[PackageJson]] = js.native
}

