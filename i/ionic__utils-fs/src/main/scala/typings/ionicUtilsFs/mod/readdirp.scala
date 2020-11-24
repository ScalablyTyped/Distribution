package typings.ionicUtilsFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs", "readdirp")
@js.native
object readdirp extends js.Object {
  
  def apply(dir: String): js.Promise[js.Array[String]] = js.native
  def apply(dir: String, hasFilterOnErrorWalkerOptions: ReaddirPOptions): js.Promise[js.Array[String]] = js.native
}
