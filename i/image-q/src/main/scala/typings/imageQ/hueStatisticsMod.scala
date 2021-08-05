package typings.imageQ

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hueStatisticsMod {
  
  @JSImport("image-q/dist/utils/hueStatistics", "HueStatistics")
  @js.native
  class HueStatistics protected () extends StObject {
    def this(numGroups: Double, minCols: Double) = this()
    
    /* private */ var _groupsFull: js.Any = js.native
    
    /* private */ var _minCols: js.Any = js.native
    
    /* private */ var _numGroups: js.Any = js.native
    
    /* private */ var _stats: js.Any = js.native
    
    def check(i32: Double): Unit = js.native
    
    def injectIntoArray(histG: js.Array[String]): Unit = js.native
    
    def injectIntoDictionary(histG: StringDictionary[Double]): Unit = js.native
  }
}
