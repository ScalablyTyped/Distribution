package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RecordTranslation {
  
  @js.native
  trait IndexMap extends StObject {
    
    def clear(): Unit = js.native
    
    def getLength(): Double = js.native
    
    def getValueAtIndex(index: Double): js.Any = js.native
    
    def getValues(): js.Array[_] = js.native
    
    def setValueAtIndex(index: Double, value: js.Any): Boolean = js.native
    
    def setValues(values: js.Array[_]): Unit = js.native
  }
  object IndexMap {
    
    @scala.inline
    def apply(
      clear: () => Unit,
      getLength: () => Double,
      getValueAtIndex: Double => js.Any,
      getValues: () => js.Array[_],
      setValueAtIndex: (Double, js.Any) => Boolean,
      setValues: js.Array[_] => Unit
    ): IndexMap = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), getLength = js.Any.fromFunction0(getLength), getValueAtIndex = js.Any.fromFunction1(getValueAtIndex), getValues = js.Any.fromFunction0(getValues), setValueAtIndex = js.Any.fromFunction2(setValueAtIndex), setValues = js.Any.fromFunction1(setValues))
      __obj.asInstanceOf[IndexMap]
    }
    
    @scala.inline
    implicit class IndexMapMutableBuilder[Self <: IndexMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetValueAtIndex(value: Double => js.Any): Self = StObject.set(x, "getValueAtIndex", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetValues(value: () => js.Array[_]): Self = StObject.set(x, "getValues", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSetValueAtIndex(value: (Double, js.Any) => Boolean): Self = StObject.set(x, "setValueAtIndex", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSetValues(value: js.Array[_] => Unit): Self = StObject.set(x, "setValues", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IndexMapper extends StObject {
    
    def executeBatchOperations(wrappedOperations: js.Function0[_]): Unit = js.native
    
    def getFirstNotHiddenIndex(fromVisualIndex: Double, incrementBy: Double): Double | Null = js.native
    def getFirstNotHiddenIndex(
      fromVisualIndex: Double,
      incrementBy: Double,
      searchAlsoOtherWayAround: js.UndefOr[scala.Nothing],
      indexForNextSearch: Double
    ): Double | Null = js.native
    def getFirstNotHiddenIndex(fromVisualIndex: Double, incrementBy: Double, searchAlsoOtherWayAround: Boolean): Double | Null = js.native
    def getFirstNotHiddenIndex(
      fromVisualIndex: Double,
      incrementBy: Double,
      searchAlsoOtherWayAround: Boolean,
      indexForNextSearch: Double
    ): Double | Null = js.native
    
    def getIndexesSequence(): js.Array[Double] = js.native
    
    def getNotHiddenIndexes(): js.Array[Double] = js.native
    def getNotHiddenIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getNotHiddenIndexesLength(): Double = js.native
    
    def getNotTrimmedIndexes(): js.Array[Double] = js.native
    def getNotTrimmedIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getNotTrimmedIndexesLength(): Double = js.native
    
    def getNumberOfIndexes(): Double = js.native
    
    def getPhysicalFromRenderableIndex(renderableIndex: Double): Double | Null = js.native
    
    def getPhysicalFromVisualIndex(visualIndex: Double): Double | Null = js.native
    
    def getRenderableFromVisualIndex(visualIndex: Double): Double | Null = js.native
    
    def getRenderableIndexes(): js.Array[Double] = js.native
    def getRenderableIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getRenderableIndexesLength(): Double = js.native
    
    def getVisualFromPhysicalIndex(physicalIndex: Double): Double | Null = js.native
    
    def getVisualFromRenderableIndex(renderableIndex: Double): Double | Null = js.native
    
    def initToLength(): Unit = js.native
    def initToLength(length: Double): Unit = js.native
    
    def isHidden(physicalIndex: Double): Boolean = js.native
    
    def isTrimmed(physicalIndex: Double): Boolean = js.native
    
    def moveIndexes(movedIndexes: js.Array[Double], finalIndex: Double): Unit = js.native
    def moveIndexes(movedIndexes: Double, finalIndex: Double): Unit = js.native
    
    def registerMap(uniqueName: String, indexMap: IndexMap): IndexMap = js.native
    
    def setIndexesSequence(indexes: js.Array[Double]): Unit = js.native
    
    def unregisterMap(name: String): Unit = js.native
  }
}
