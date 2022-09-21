package typings.makerjs.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.makerjs.MakerJs.IPoint
import typings.makerjs.MakerJs.IPointGraphIndexElement
import typings.makerjs.anon.Existed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A graph of items which may be located on the same points.
  */
@JSImport("makerjs", "PointGraph")
@js.native
open class PointGraph[T] ()
  extends StObject
     with typings.makerjs.MakerJs.PointGraph[T] {
  
  /**
    * Iterate over points in the index.
    * @param cb Callback for each point in the index.
    */
  /* CompleteClass */
  override def forEachPoint(
    cb: js.Function4[
      /* p */ IPoint, 
      /* values */ js.Array[T], 
      /* pointId */ js.UndefOr[Double], 
      /* el */ js.UndefOr[IPointGraphIndexElement], 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Get the index element of a point, after merging.
    * @param p Point to look up index element.
    */
  /* CompleteClass */
  override def getElementAtPoint(p: IPoint): IPointGraphIndexElement = js.native
  
  /**
    * Gets the id of a point, after merging.
    * @param p Point to look up id.
    */
  /* CompleteClass */
  override def getIdOfPoint(p: IPoint): Double = js.native
  
  /**
    * Map of unique points by x, then y, to a point id. This will remain intact even after merging.
    */
  /* CompleteClass */
  var graph: NumberDictionary[NumberDictionary[Double]] = js.native
  
  /**
    * Index of points by id.
    */
  /* CompleteClass */
  var index: NumberDictionary[IPointGraphIndexElement] = js.native
  
  /**
    * Insert a value.
    * @param value Value associated with this point.
    * @returns valueId of the inserted value.
    */
  /* CompleteClass */
  override def insertValue(value: T): Double = js.native
  
  /**
    * Insert a value at a point.
    * @param p Point.
    * @param value Value associated with this point.
    */
  /* CompleteClass */
  override def insertValueIdAtPoint(valueId: Double, p: IPoint): Existed = js.native
  
  /**
    * Number of points inserted
    */
  /* CompleteClass */
  var insertedCount: Double = js.native
  
  /**
    * KD tree object.
    */
  /* private */ /* CompleteClass */
  var kdbush: Any = js.native
  
  /* private */ /* CompleteClass */
  var mergeIndexElements: Any = js.native
  
  /**
    * Finds all points which have only one value associated. Then, merge to the nearest other point within this set.
    * Call this after inserting values.
    * @param withinDistance Distance to consider points equal.
    */
  /* CompleteClass */
  override def mergeNearestSinglePoints(withinDistance: Double): Unit = js.native
  
  /**
    * Merge points within a given distance from each other. Call this after inserting values.
    * @param withinDistance Distance to consider points equal.
    */
  /* CompleteClass */
  override def mergePoints(withinDistance: Double): Unit = js.native
  
  /**
    * Map of point ids which once existed but have been merged into another id due to close proximity.
    */
  /* CompleteClass */
  var merged: NumberDictionary[Double] = js.native
  
  /**
    * Reset the stored points, graphs, lists, to initial state.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /**
    * List of values inserted at points.
    */
  /* CompleteClass */
  var values: js.Array[T] = js.native
}
