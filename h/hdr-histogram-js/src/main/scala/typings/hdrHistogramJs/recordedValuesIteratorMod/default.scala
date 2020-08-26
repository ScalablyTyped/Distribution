package typings.hdrHistogramJs.recordedValuesIteratorMod

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used for iterating through all recorded histogram values using the finest granularity steps supported by the
  * underlying representation. The iteration steps through all non-zero recorded value counts, and terminates when
  * all recorded histogram values are exhausted.
  */
@JSImport("hdr-histogram-js/RecordedValuesIterator", JSImport.Default)
@js.native
class default protected () extends RecordedValuesIterator {
  /**
    * @param histogram The histogram this iterator will operate on
    */
  def this(histogram: AbstractHistogram) = this()
}

