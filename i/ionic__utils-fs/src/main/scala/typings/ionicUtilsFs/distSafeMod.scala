package typings.ionicUtilsFs

import typings.fsExtra.mod.Stats
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSafeMod {
  
  @JSImport("@ionic/utils-fs/dist/safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def readdir(dir: String): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdir")(dir.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[String]]]
  
  inline def stat(p: String): js.Promise[js.UndefOr[Stats]] = ^.asInstanceOf[js.Dynamic].applyDynamic("stat")(p.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Stats]]]
}
