package typings.kdbush

import typings.std.ArrayConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kdbush", JSImport.Namespace)
  @js.native
  class ^[T] protected ()
    extends StObject
       with KDBush[T] {
    def this(points: Points) = this()
    def this(points: js.Array[T], getX: Get[T], getY: Get[T]) = this()
    def this(points: js.Array[T], getX: Get[T], getY: Get[T], nodeSize: Double) = this()
    def this(
      points: js.Array[T],
      getX: Get[T],
      getY: Get[T],
      nodeSize: Double,
      ArrayType: typings.kdbush.mod.ArrayType
    ) = this()
    def this(
      points: js.Array[T],
      getX: Get[T],
      getY: Get[T],
      nodeSize: Unit,
      ArrayType: typings.kdbush.mod.ArrayType
    ) = this()
    
    /* CompleteClass */
    var coords: js.Array[Double] = js.native
    
    /* CompleteClass */
    var ids: js.Array[Double] = js.native
    
    /* CompleteClass */
    var nodeSize: Double = js.native
    
    /* CompleteClass */
    var points: js.Array[T] = js.native
    
    /* CompleteClass */
    override def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def within(x: Double, y: Double, r: Double): js.Array[Double] = js.native
  }
  
  type ArrayType = Int8ArrayConstructor | Int16ArrayConstructor | Int32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor | ArrayConstructor
  
  type Get[T] = js.Function1[/* point */ T, Double]
  
  trait KDBush[T] extends StObject {
    
    var coords: js.Array[Double]
    
    var ids: js.Array[Double]
    
    var nodeSize: Double
    
    var points: js.Array[T]
    
    def range(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double]
    
    def within(x: Double, y: Double, r: Double): js.Array[Double]
  }
  object KDBush {
    
    inline def apply[T](
      coords: js.Array[Double],
      ids: js.Array[Double],
      nodeSize: Double,
      points: js.Array[T],
      range: (Double, Double, Double, Double) => js.Array[Double],
      within: (Double, Double, Double) => js.Array[Double]
    ): KDBush[T] = {
      val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any], ids = ids.asInstanceOf[js.Any], nodeSize = nodeSize.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], range = js.Any.fromFunction4(range), within = js.Any.fromFunction3(within))
      __obj.asInstanceOf[KDBush[T]]
    }
    
    extension [Self <: KDBush[?], T](x: Self & KDBush[T]) {
      
      inline def setCoords(value: js.Array[Double]): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      inline def setCoordsVarargs(value: Double*): Self = StObject.set(x, "coords", js.Array(value :_*))
      
      inline def setIds(value: js.Array[Double]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
      
      inline def setIdsVarargs(value: Double*): Self = StObject.set(x, "ids", js.Array(value :_*))
      
      inline def setNodeSize(value: Double): Self = StObject.set(x, "nodeSize", value.asInstanceOf[js.Any])
      
      inline def setPoints(value: js.Array[T]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
      
      inline def setPointsVarargs(value: T*): Self = StObject.set(x, "points", js.Array(value :_*))
      
      inline def setRange(value: (Double, Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "range", js.Any.fromFunction4(value))
      
      inline def setWithin(value: (Double, Double, Double) => js.Array[Double]): Self = StObject.set(x, "within", js.Any.fromFunction3(value))
    }
  }
  
  type Points = js.Array[js.Array[Double]]
}
