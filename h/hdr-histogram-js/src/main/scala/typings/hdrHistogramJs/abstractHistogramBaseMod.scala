package typings.hdrHistogramJs

import typings.hdrHistogramJs.encodableHistogramMod.EncodableHistogram
import typings.hdrHistogramJs.percentileIteratorMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hdr-histogram-js/AbstractHistogramBase", JSImport.Namespace)
@js.native
object abstractHistogramBaseMod extends js.Object {
  
  val NO_TAG: /* "NO TAG" */ String = js.native
  
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
  @js.native
  object AbstractHistogramBase extends js.Object {
    
    var identityBuilder: Double = js.native
  }
}
