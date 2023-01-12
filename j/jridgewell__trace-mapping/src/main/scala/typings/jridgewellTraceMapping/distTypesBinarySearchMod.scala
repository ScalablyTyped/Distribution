package typings.jridgewellTraceMapping

import typings.jridgewellTraceMapping.distTypesSourcemapSegmentMod.ReverseSegment
import typings.jridgewellTraceMapping.distTypesSourcemapSegmentMod.SourceMapSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBinarySearchMod {
  
  @JSImport("@jridgewell/trace-mapping/dist/types/binary-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def binarySearch(haystack: js.Array[ReverseSegment | SourceMapSegment], needle: Double, low: Double, high: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("binarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSImport("@jridgewell/trace-mapping/dist/types/binary-search", "found")
  @js.native
  def found: Boolean = js.native
  inline def found_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("found")(x.asInstanceOf[js.Any])
  
  inline def lowerBound(haystack: js.Array[ReverseSegment | SourceMapSegment], needle: Double, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lowerBound")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def memoizedBinarySearch(
    haystack: js.Array[ReverseSegment | SourceMapSegment],
    needle: Double,
    state: MemoState,
    key: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("memoizedBinarySearch")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], state.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def memoizedState(): MemoState = ^.asInstanceOf[js.Dynamic].applyDynamic("memoizedState")().asInstanceOf[MemoState]
  
  inline def upperBound(haystack: js.Array[ReverseSegment | SourceMapSegment], needle: Double, index: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("upperBound")(haystack.asInstanceOf[js.Any], needle.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait MemoState extends StObject {
    
    var lastIndex: Double
    
    var lastKey: Double
    
    var lastNeedle: Double
  }
  object MemoState {
    
    inline def apply(lastIndex: Double, lastKey: Double, lastNeedle: Double): MemoState = {
      val __obj = js.Dynamic.literal(lastIndex = lastIndex.asInstanceOf[js.Any], lastKey = lastKey.asInstanceOf[js.Any], lastNeedle = lastNeedle.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MemoState] (val x: Self) extends AnyVal {
      
      inline def setLastIndex(value: Double): Self = StObject.set(x, "lastIndex", value.asInstanceOf[js.Any])
      
      inline def setLastKey(value: Double): Self = StObject.set(x, "lastKey", value.asInstanceOf[js.Any])
      
      inline def setLastNeedle(value: Double): Self = StObject.set(x, "lastNeedle", value.asInstanceOf[js.Any])
    }
  }
}
