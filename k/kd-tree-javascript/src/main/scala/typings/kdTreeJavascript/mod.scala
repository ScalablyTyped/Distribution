package typings.kdTreeJavascript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("kd-tree-javascript", "kdTree")
  @js.native
  class kdTree[T] protected () extends StObject {
    // Create a new tree from a list of points, a distance function, and a
    // list of dimensions.
    def this(
      points: js.Array[T],
      distance: js.Function2[/* a */ T, /* b */ T, Double],
      dimensions: js.Array[/* keyof T */ String]
    ) = this()
    
    // Get an approximation of how unbalanced the tree is.
    // The higher this number, the worse query performance will be.
    // It indicates how many times worse it is than the optimal tree.
    // Minimum is 1. Unreliable for small trees.
    def balanceFactor(): Double = js.native
    
    // Insert a new point into the tree.  Must be consistent with previous
    // contents.
    def insert(point: T): Unit = js.native
    
    // Query the nearest *count* neighbors to a point, with an optional
    // maximal search distance.
    // Result is an array with *count* elements.
    // Each element is an array with two components: the searched point and
    // the distance to it.
    def nearest(point: T, count: Double): js.Array[js.Tuple2[T, Double]] = js.native
    def nearest(point: T, count: Double, maxDistance: Double): js.Array[js.Tuple2[T, Double]] = js.native
    
    // Remove a point from the tree by reference.
    def remove(point: T): Unit = js.native
  }
}
