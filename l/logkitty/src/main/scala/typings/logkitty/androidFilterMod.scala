package typings.logkitty

import typings.logkitty.typesMod.Entry
import typings.logkitty.typesMod.IFilter
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidFilterMod {
  
  @JSImport("logkitty/build/android/AndroidFilter", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with AndroidFilter {
    def this(minPriority: Double) = this()
    
    /* CompleteClass */
    override def shouldInclude(entry: Entry): Boolean = js.native
  }
  
  @js.native
  trait AndroidFilter
    extends StObject
       with IFilter {
    
    /* private */ var filter: js.Any = js.native
    
    /* private */ val minPriority: js.Any = js.native
    
    def setCustomFilter(patterns: js.Array[String]): Unit = js.native
    
    def setFilterByApp(applicationId: String): Unit = js.native
    def setFilterByApp(applicationId: String, adbPath: String): Unit = js.native
    
    def setFilterByMatch(regexes: js.Array[RegExp]): Unit = js.native
    
    def setFilterByTag(tags: js.Array[String]): Unit = js.native
  }
}
