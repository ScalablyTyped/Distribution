package typings.ionicUtilsFs

import typings.fsExtra.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safeMod {
  
  @JSImport("@ionic/utils-fs/dist/safe", "readdir")
  @js.native
  def readdir(dir: String): js.Promise[js.Array[String]] = js.native
  
  @JSImport("@ionic/utils-fs/dist/safe", "stat")
  @js.native
  def stat(p: String): js.Promise[js.UndefOr[Stats]] = js.native
}
