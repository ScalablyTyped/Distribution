package typings.ionicCore

import typings.ionicCore.interfaceMod.RouteChain
import typings.ionicCore.interfaceMod.RouterDirection
import typings.std.History
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("@ionic/core/dist/types/components/router/utils/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chainToPath(chain: RouteChain): js.Array[String] | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("chainToPath")(chain.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | Null]
  
  inline def generatePath(segments: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generatePath")(segments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parsePath(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")().asInstanceOf[js.Array[String]]
  inline def parsePath(path: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePath")(path.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def readPath(loc: Location, root: String, useHash: Boolean): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("readPath")(loc.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  inline def removePrefix(prefix: js.Array[String], path: js.Array[String]): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("removePrefix")(prefix.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  inline def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePath")(history.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any], path.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writePath(
    history: History,
    root: String,
    useHash: Boolean,
    path: js.Array[String],
    direction: RouterDirection,
    state: Double,
    queryString: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writePath")(history.asInstanceOf[js.Any], root.asInstanceOf[js.Any], useHash.asInstanceOf[js.Any], path.asInstanceOf[js.Any], direction.asInstanceOf[js.Any], state.asInstanceOf[js.Any], queryString.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
