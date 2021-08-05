package typings.jestSourceMap

import typings.callsites.mod.CallSite
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCallsiteMod {
  
  @JSImport("@jest/source-map/build/getCallsite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(level: Double): CallSite = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(level.asInstanceOf[js.Any]).asInstanceOf[CallSite]
  inline def default(level: Double, sourceMaps: Record[String, String]): CallSite = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(level.asInstanceOf[js.Any], sourceMaps.asInstanceOf[js.Any])).asInstanceOf[CallSite]
}
