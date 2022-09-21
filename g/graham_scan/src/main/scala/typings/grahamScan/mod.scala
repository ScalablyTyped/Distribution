package typings.grahamScan

import typings.grahamScan.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graham_scan", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ConvexHullGrahamScan {
    
    /* CompleteClass */
    override def addPoint(x: Double, y: Double): Unit = js.native
    
    /* CompleteClass */
    override def getHull(): js.Array[X] = js.native
  }
  
  trait ConvexHullGrahamScan extends StObject {
    
    def addPoint(x: Double, y: Double): Unit
    
    def getHull(): js.Array[X]
  }
  object ConvexHullGrahamScan {
    
    inline def apply(addPoint: (Double, Double) => Unit, getHull: () => js.Array[X]): ConvexHullGrahamScan = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2(addPoint), getHull = js.Any.fromFunction0(getHull))
      __obj.asInstanceOf[ConvexHullGrahamScan]
    }
    
    extension [Self <: ConvexHullGrahamScan](x: Self) {
      
      inline def setAddPoint(value: (Double, Double) => Unit): Self = StObject.set(x, "addPoint", js.Any.fromFunction2(value))
      
      inline def setGetHull(value: () => js.Array[X]): Self = StObject.set(x, "getHull", js.Any.fromFunction0(value))
    }
  }
}
