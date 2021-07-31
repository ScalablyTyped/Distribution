package typings.hdrHistogramJs

import typings.hdrHistogramJs.encodableHistogramMod.EncodableHistogram
import typings.hdrHistogramJs.percentileIteratorMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractHistogramBaseMod {
  
  @JSImport("hdr-histogram-js/AbstractHistogramBase", "AbstractHistogramBase")
  @js.native
  abstract class AbstractHistogramBase () extends EncodableHistogram {
    
    var autoResize: Boolean = js.native
    
    var bucketCount: Double = js.native
    
    var countsArrayLength: Double = js.native
    
    var endTimeStampMsec: Double = js.native
    
    var highestTrackableValue: Double = js.native
    
    var identity: Double = js.native
    
    var integerToDoubleValueConversionRatio: Double = js.native
    
    var lowestDiscernibleValue: Double = js.native
    
    var numberOfSignificantValueDigits: Double = js.native
    
    var percentileIterator: default = js.native
    
    var recordedValuesIterator: typings.hdrHistogramJs.recordedValuesIteratorMod.default = js.native
    
    var startTimeStampMsec: Double = js.native
    
    /**
      * Power-of-two length of linearly scaled array slots in the counts array. Long enough to hold the first sequence of
      * entries that must be distinguished by a single unit (determined by configured precision).
      */
    var subBucketCount: Double = js.native
    
    var tag: String = js.native
    
    var wordSizeInBytes: Double = js.native
  }
  /* static members */
  object AbstractHistogramBase {
    
    @JSImport("hdr-histogram-js/AbstractHistogramBase", "AbstractHistogramBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js/AbstractHistogramBase", "AbstractHistogramBase.identityBuilder")
    @js.native
    def identityBuilder: Double = js.native
    @scala.inline
    def identityBuilder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identityBuilder")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("hdr-histogram-js/AbstractHistogramBase", "NO_TAG")
  @js.native
  val NO_TAG: /* "NO TAG" */ String = js.native
}
