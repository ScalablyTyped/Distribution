package typings.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coordsMod {
  
  @JSImport("handsontable/3rdparty/walkontable/src/cell/coords", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CellCoords {
    def this(row: Double, column: Double) = this()
    
    /* CompleteClass */
    var col: Double = js.native
    
    /* CompleteClass */
    override def isEqual(cellCoords: CellCoords): Boolean = js.native
    
    /* CompleteClass */
    override def isNorthEastOf(testedCoords: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isNorthWestOf(testedCoords: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isSouthEastOf(testedCoords: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isSouthWestOf(testedCoords: Any): Boolean = js.native
    
    /* CompleteClass */
    override def isValid(wot: Any): Boolean = js.native
    
    /* CompleteClass */
    override def normalize(): CellCoords = js.native
    
    /* CompleteClass */
    var row: Double = js.native
    
    /* CompleteClass */
    override def toObject(): Any = js.native
  }
  
  trait CellCoords extends StObject {
    
    var col: Double
    
    def isEqual(cellCoords: CellCoords): Boolean
    
    def isNorthEastOf(testedCoords: Any): Boolean
    
    def isNorthWestOf(testedCoords: Any): Boolean
    
    def isSouthEastOf(testedCoords: Any): Boolean
    
    def isSouthWestOf(testedCoords: Any): Boolean
    
    def isValid(wot: Any): Boolean
    
    def normalize(): CellCoords
    
    var row: Double
    
    def toObject(): Any
  }
  object CellCoords {
    
    inline def apply(
      col: Double,
      isEqual: CellCoords => Boolean,
      isNorthEastOf: Any => Boolean,
      isNorthWestOf: Any => Boolean,
      isSouthEastOf: Any => Boolean,
      isSouthWestOf: Any => Boolean,
      isValid: Any => Boolean,
      normalize: () => CellCoords,
      row: Double,
      toObject: () => Any
    ): CellCoords = {
      val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), isNorthEastOf = js.Any.fromFunction1(isNorthEastOf), isNorthWestOf = js.Any.fromFunction1(isNorthWestOf), isSouthEastOf = js.Any.fromFunction1(isSouthEastOf), isSouthWestOf = js.Any.fromFunction1(isSouthWestOf), isValid = js.Any.fromFunction1(isValid), normalize = js.Any.fromFunction0(normalize), row = row.asInstanceOf[js.Any], toObject = js.Any.fromFunction0(toObject))
      __obj.asInstanceOf[CellCoords]
    }
    
    extension [Self <: CellCoords](x: Self) {
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setIsEqual(value: CellCoords => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setIsNorthEastOf(value: Any => Boolean): Self = StObject.set(x, "isNorthEastOf", js.Any.fromFunction1(value))
      
      inline def setIsNorthWestOf(value: Any => Boolean): Self = StObject.set(x, "isNorthWestOf", js.Any.fromFunction1(value))
      
      inline def setIsSouthEastOf(value: Any => Boolean): Self = StObject.set(x, "isSouthEastOf", js.Any.fromFunction1(value))
      
      inline def setIsSouthWestOf(value: Any => Boolean): Self = StObject.set(x, "isSouthWestOf", js.Any.fromFunction1(value))
      
      inline def setIsValid(value: Any => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      inline def setNormalize(value: () => CellCoords): Self = StObject.set(x, "normalize", js.Any.fromFunction0(value))
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setToObject(value: () => Any): Self = StObject.set(x, "toObject", js.Any.fromFunction0(value))
    }
  }
}
