package typings.hyperformula

import typings.hyperformula.typingsArraySizeMod.ArraySize
import typings.hyperformula.typingsCellMod.CellError
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InternalScalarValue
import typings.hyperformula.typingsInterpreterInterpreterValueMod.InterpreterValue
import typings.hyperformula.typingsInterpreterSimpleRangeValueMod.SimpleRangeValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsArrayValueMod {
  
  @JSImport("hyperformula/typings/ArrayValue", "ArrayValue")
  @js.native
  open class ArrayValue protected ()
    extends StObject
       with IArray {
    def this(array: js.Array[js.Array[InternalScalarValue]]) = this()
    
    def addColumns(aboveColumn: Double, numberOfColumns: Double): Unit = js.native
    
    def addRows(aboveRow: Double, numberOfRows: Double): Unit = js.native
    
    /* private */ val array: Any = js.native
    
    /* CompleteClass */
    override def get(col: Double, row: Double): InternalScalarValue = js.native
    
    /* CompleteClass */
    override def height(): Double = js.native
    
    def nullArrays(count: Double, size: Double): js.Array[js.Array[Any]] = js.native
    
    /* private */ var outOfBound: Any = js.native
    
    def raw(): js.Array[js.Array[InternalScalarValue]] = js.native
    
    def removeColumns(leftmostColumn: Double, rightmostColumn: Double): Unit = js.native
    
    def removeRows(startRow: Double, endRow: Double): Unit = js.native
    
    def resize(newSize: ArraySize): Unit = js.native
    
    def set(col: Double, row: Double, value: Double): Unit = js.native
    
    /* CompleteClass */
    override def simpleRangeValue(): SimpleRangeValue | CellError = js.native
    
    /* CompleteClass */
    var size: ArraySize = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
  }
  /* static members */
  object ArrayValue {
    
    @JSImport("hyperformula/typings/ArrayValue", "ArrayValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromInterpreterValue(value: InterpreterValue): ArrayValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInterpreterValue")(value.asInstanceOf[js.Any]).asInstanceOf[ArrayValue]
  }
  
  @JSImport("hyperformula/typings/ArrayValue", "ErroredArray")
  @js.native
  open class ErroredArray protected ()
    extends StObject
       with IArray {
    def this(error: CellError, size: ArraySize) = this()
    
    /* private */ val error: Any = js.native
    
    /* CompleteClass */
    override def get(col: Double, row: Double): InternalScalarValue = js.native
    
    /* CompleteClass */
    override def height(): Double = js.native
    
    /* CompleteClass */
    override def simpleRangeValue(): SimpleRangeValue | CellError = js.native
    
    /* CompleteClass */
    var size: ArraySize = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
  }
  
  @JSImport("hyperformula/typings/ArrayValue", "NotComputedArray")
  @js.native
  open class NotComputedArray protected ()
    extends StObject
       with IArray {
    def this(size: ArraySize) = this()
    
    /* CompleteClass */
    override def get(col: Double, row: Double): InternalScalarValue = js.native
    
    /* CompleteClass */
    override def height(): Double = js.native
    
    /* CompleteClass */
    override def simpleRangeValue(): SimpleRangeValue | CellError = js.native
    
    /* CompleteClass */
    var size: ArraySize = js.native
    
    /* CompleteClass */
    override def width(): Double = js.native
  }
  
  trait IArray extends StObject {
    
    def get(col: Double, row: Double): InternalScalarValue
    
    def height(): Double
    
    def simpleRangeValue(): SimpleRangeValue | CellError
    
    var size: ArraySize
    
    def width(): Double
  }
  object IArray {
    
    inline def apply(
      get: (Double, Double) => InternalScalarValue,
      height: () => Double,
      simpleRangeValue: () => SimpleRangeValue | CellError,
      size: ArraySize,
      width: () => Double
    ): IArray = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), height = js.Any.fromFunction0(height), simpleRangeValue = js.Any.fromFunction0(simpleRangeValue), size = size.asInstanceOf[js.Any], width = js.Any.fromFunction0(width))
      __obj.asInstanceOf[IArray]
    }
    
    extension [Self <: IArray](x: Self) {
      
      inline def setGet(value: (Double, Double) => InternalScalarValue): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
      
      inline def setHeight(value: () => Double): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setSimpleRangeValue(value: () => SimpleRangeValue | CellError): Self = StObject.set(x, "simpleRangeValue", js.Any.fromFunction0(value))
      
      inline def setSize(value: ArraySize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: () => Double): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
    }
  }
}
