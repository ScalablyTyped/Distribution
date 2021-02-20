package typings.jestSourceMap

import typings.callsites.mod.CallSite
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getCallsiteMod {
  
  @JSImport("@jest/source-map/build/getCallsite", JSImport.Default)
  @js.native
  def default(level: Double): CallSite = js.native
  @JSImport("@jest/source-map/build/getCallsite", JSImport.Default)
  @js.native
  def default(level: Double, sourceMaps: Record[String, String]): CallSite = js.native
}
