package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.History
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "chainToPath")
  @js.native
  def chainToPath(chain: RouteChain): js.Array[String] | Null = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "generatePath")
  @js.native
  def generatePath(segments: js.Array[String]): String = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "parsePath")
  @js.native
  def parsePath(): js.Array[String] = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "parsePath")
  @js.native
  def parsePath(path: String): js.Array[String] = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "readPath")
  @js.native
  def readPath(loc: Location, root: String, useHash: Boolean): js.Array[String] | Null = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "removePrefix")
  @js.native
  def removePrefix(prefix: js.Array[String], path: js.Array[String]): js.Array[String] | Null = js.native
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "writePath")
  @js.native
  def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double
  ): Unit = js.native
  @JSImport("@ionic/core/dist/types/components/router/utils/path", "writePath")
  @js.native
  def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double,
    queryString: String
  ): Unit = js.native
}
