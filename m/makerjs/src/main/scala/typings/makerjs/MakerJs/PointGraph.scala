package typings.makerjs.MakerJs

import org.scalablytyped.runtime.NumberDictionary
import typings.makerjs.anon.Existed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A graph of items which may be located on the same points.
  */
trait PointGraph[T] extends StObject {
  
  /**
    * Iterate over points in the index.
    * @param cb Callback for each point in the index.
    */
  def forEachPoint(
    cb: js.Function4[
      /* p */ IPoint, 
      /* values */ js.Array[T], 
      /* pointId */ js.UndefOr[Double], 
      /* el */ js.UndefOr[IPointGraphIndexElement], 
      Unit
    ]
  ): Unit
  
  /**
    * Get the index element of a point, after merging.
    * @param p Point to look up index element.
    */
  def getElementAtPoint(p: IPoint): IPointGraphIndexElement
  
  /**
    * Gets the id of a point, after merging.
    * @param p Point to look up id.
    */
  def getIdOfPoint(p: IPoint): Double
  
  /**
    * Map of unique points by x, then y, to a point id. This will remain intact even after merging.
    */
  var graph: NumberDictionary[NumberDictionary[Double]]
  
  /**
    * Index of points by id.
    */
  var index: NumberDictionary[IPointGraphIndexElement]
  
  /**
    * Insert a value.
    * @param value Value associated with this point.
    * @returns valueId of the inserted value.
    */
  def insertValue(value: T): Double
  
  /**
    * Insert a value at a point.
    * @param p Point.
    * @param value Value associated with this point.
    */
  def insertValueIdAtPoint(valueId: Double, p: IPoint): Existed
  
  /**
    * Number of points inserted
    */
  var insertedCount: Double
  
  /**
    * KD tree object.
    */
  /* private */ var kdbush: Any
  
  /* private */ var mergeIndexElements: Any
  
  /**
    * Finds all points which have only one value associated. Then, merge to the nearest other point within this set.
    * Call this after inserting values.
    * @param withinDistance Distance to consider points equal.
    */
  def mergeNearestSinglePoints(withinDistance: Double): Unit
  
  /**
    * Merge points within a given distance from each other. Call this after inserting values.
    * @param withinDistance Distance to consider points equal.
    */
  def mergePoints(withinDistance: Double): Unit
  
  /**
    * Map of point ids which once existed but have been merged into another id due to close proximity.
    */
  var merged: NumberDictionary[Double]
  
  /**
    * Reset the stored points, graphs, lists, to initial state.
    */
  def reset(): Unit
  
  /**
    * List of values inserted at points.
    */
  var values: js.Array[T]
}
object PointGraph {
  
  inline def apply[T](
    forEachPoint: js.Function4[
      /* p */ IPoint, 
      /* values */ js.Array[T], 
      /* pointId */ js.UndefOr[Double], 
      /* el */ js.UndefOr[IPointGraphIndexElement], 
      Unit
    ] => Unit,
    getElementAtPoint: IPoint => IPointGraphIndexElement,
    getIdOfPoint: IPoint => Double,
    graph: NumberDictionary[NumberDictionary[Double]],
    index: NumberDictionary[IPointGraphIndexElement],
    insertValue: T => Double,
    insertValueIdAtPoint: (Double, IPoint) => Existed,
    insertedCount: Double,
    kdbush: Any,
    mergeIndexElements: Any,
    mergeNearestSinglePoints: Double => Unit,
    mergePoints: Double => Unit,
    merged: NumberDictionary[Double],
    reset: () => Unit,
    values: js.Array[T]
  ): PointGraph[T] = {
    val __obj = js.Dynamic.literal(forEachPoint = js.Any.fromFunction1(forEachPoint), getElementAtPoint = js.Any.fromFunction1(getElementAtPoint), getIdOfPoint = js.Any.fromFunction1(getIdOfPoint), graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], insertValue = js.Any.fromFunction1(insertValue), insertValueIdAtPoint = js.Any.fromFunction2(insertValueIdAtPoint), insertedCount = insertedCount.asInstanceOf[js.Any], kdbush = kdbush.asInstanceOf[js.Any], mergeIndexElements = mergeIndexElements.asInstanceOf[js.Any], mergeNearestSinglePoints = js.Any.fromFunction1(mergeNearestSinglePoints), mergePoints = js.Any.fromFunction1(mergePoints), merged = merged.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointGraph[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointGraph[?], T] (val x: Self & PointGraph[T]) extends AnyVal {
    
    inline def setForEachPoint(
      value: js.Function4[
          /* p */ IPoint, 
          /* values */ js.Array[T], 
          /* pointId */ js.UndefOr[Double], 
          /* el */ js.UndefOr[IPointGraphIndexElement], 
          Unit
        ] => Unit
    ): Self = StObject.set(x, "forEachPoint", js.Any.fromFunction1(value))
    
    inline def setGetElementAtPoint(value: IPoint => IPointGraphIndexElement): Self = StObject.set(x, "getElementAtPoint", js.Any.fromFunction1(value))
    
    inline def setGetIdOfPoint(value: IPoint => Double): Self = StObject.set(x, "getIdOfPoint", js.Any.fromFunction1(value))
    
    inline def setGraph(value: NumberDictionary[NumberDictionary[Double]]): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: NumberDictionary[IPointGraphIndexElement]): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInsertValue(value: T => Double): Self = StObject.set(x, "insertValue", js.Any.fromFunction1(value))
    
    inline def setInsertValueIdAtPoint(value: (Double, IPoint) => Existed): Self = StObject.set(x, "insertValueIdAtPoint", js.Any.fromFunction2(value))
    
    inline def setInsertedCount(value: Double): Self = StObject.set(x, "insertedCount", value.asInstanceOf[js.Any])
    
    inline def setKdbush(value: Any): Self = StObject.set(x, "kdbush", value.asInstanceOf[js.Any])
    
    inline def setMergeIndexElements(value: Any): Self = StObject.set(x, "mergeIndexElements", value.asInstanceOf[js.Any])
    
    inline def setMergeNearestSinglePoints(value: Double => Unit): Self = StObject.set(x, "mergeNearestSinglePoints", js.Any.fromFunction1(value))
    
    inline def setMergePoints(value: Double => Unit): Self = StObject.set(x, "mergePoints", js.Any.fromFunction1(value))
    
    inline def setMerged(value: NumberDictionary[Double]): Self = StObject.set(x, "merged", value.asInstanceOf[js.Any])
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setValues(value: js.Array[T]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: T*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
