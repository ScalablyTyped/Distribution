package typings.ionicUtilsFs

import typings.fsExtra.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ionic/utils-fs/dist/safe", JSImport.Namespace)
@js.native
object safeMod extends js.Object {
  
  def readdir(dir: String): js.Promise[js.Array[String]] = js.native
  
  def stat(p: String): js.Promise[js.UndefOr[Stats]] = js.native
}
