package typings.hdrHistogramJs

import typings.hdrHistogramJs.jsHistogramMod.JsHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordedValuesIteratorMod {
  
  /**
    * Used for iterating through all recorded histogram values using the finest granularity steps supported by the
    * underlying representation. The iteration steps through all non-zero recorded value counts, and terminates when
    * all recorded histogram values are exhausted.
    */
  @JSImport("hdr-histogram-js/dist/RecordedValuesIterator", JSImport.Default)
  @js.native
  open class default protected () extends RecordedValuesIterator {
    /**
      * @param histogram The histogram this iterator will operate on
      */
    def this(histogram: JsHistogram) = this()
  }
  
  /**
    * Used for iterating through all recorded histogram values using the finest granularity steps supported by the
    * underlying representation. The iteration steps through all non-zero recorded value counts, and terminates when
    * all recorded histogram values are exhausted.
    */
  @js.native
  trait RecordedValuesIterator
    extends typings.hdrHistogramJs.jsHistogramIteratorMod.default {
    
    /* private */ var doReset: Any = js.native
    
    /**
      * Reset iterator for re-use in a fresh iteration over the same histogram data set.
      */
    def reset(): Unit = js.native
    
    var visitedIndex: Double = js.native
  }
}
