package typings.grahamScan

import typings.grahamScan.anon.X
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("graham_scan", JSImport.Namespace)
  @js.native
  class ^ () extends ConvexHullGrahamScan
  
  @js.native
  trait ConvexHullGrahamScan extends StObject {
    
    def addPoint(x: Double, y: Double): Unit = js.native
    
    def getHull(): js.Array[X] = js.native
  }
  object ConvexHullGrahamScan {
    
    @scala.inline
    def apply(addPoint: (Double, Double) => Unit, getHull: () => js.Array[X]): ConvexHullGrahamScan = {
      val __obj = js.Dynamic.literal(addPoint = js.Any.fromFunction2(addPoint), getHull = js.Any.fromFunction0(getHull))
      __obj.asInstanceOf[ConvexHullGrahamScan]
    }
    
    @scala.inline
    implicit class ConvexHullGrahamScanMutableBuilder[Self <: ConvexHullGrahamScan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddPoint(value: (Double, Double) => Unit): Self = StObject.set(x, "addPoint", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGetHull(value: () => js.Array[X]): Self = StObject.set(x, "getHull", js.Any.fromFunction0(value))
    }
  }
}
