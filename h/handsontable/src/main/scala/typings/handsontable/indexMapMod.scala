package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMapMod {
  
  @JSImport("handsontable/translations/maps/indexMap", "IndexMap")
  @js.native
  open class IndexMap[T] () extends StObject {
    def this(initValueOrFn: T) = this()
    
    def clear(): Unit = js.native
    
    def destroy(): Unit = js.native
    
    def getLength(): Double = js.native
    
    def getValueAtIndex(index: Double): T = js.native
    
    def getValues(): js.Array[T] = js.native
    
    def setValueAtIndex(index: Double, value: T): Boolean = js.native
    
    def setValues(values: js.Array[T]): Unit = js.native
  }
}
