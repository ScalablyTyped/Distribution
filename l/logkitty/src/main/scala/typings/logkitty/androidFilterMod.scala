package typings.logkitty

import typings.logkitty.typesMod.IFilter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidFilterMod {
  
  @JSImport("logkitty/build/android/AndroidFilter", JSImport.Default)
  @js.native
  class default () extends AndroidFilter {
    def this(minPriority: Double) = this()
  }
  
  @js.native
  trait AndroidFilter extends IFilter {
    
    var filter: js.Any = js.native
    
    val minPriority: js.Any = js.native
    
    def setCustomFilter(patterns: js.Array[String]): Unit = js.native
    
    def setFilterByApp(applicationId: String): Unit = js.native
    def setFilterByApp(applicationId: String, adbPath: String): Unit = js.native
    
    def setFilterByMatch(regexes: js.Array[RegExp]): Unit = js.native
    
    def setFilterByTag(tags: js.Array[String]): Unit = js.native
  }
}
