package typings.imageQ

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hueStatisticsMod {
  
  @JSImport("image-q/dist/types/src/utils/hueStatistics", "HueStatistics")
  @js.native
  open class HueStatistics protected () extends StObject {
    def this(numGroups: Double, minCols: Double) = this()
    
    /* private */ var _groupsFull: Any = js.native
    
    /* private */ var _minCols: Any = js.native
    
    /* private */ var _numGroups: Any = js.native
    
    /* private */ var _stats: Any = js.native
    
    def check(i32: Double): Unit = js.native
    
    def injectIntoArray(histG: js.Array[String]): Unit = js.native
    
    def injectIntoDictionary(histG: Record[String, Double]): Unit = js.native
  }
}
