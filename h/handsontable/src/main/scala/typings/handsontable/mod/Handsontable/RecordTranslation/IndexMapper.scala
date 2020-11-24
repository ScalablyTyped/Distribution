package typings.handsontable.mod.Handsontable.RecordTranslation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IndexMapper extends js.Object {
  
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
