package typings.hdrHistogramJs.percentileIteratorMod

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Used for iterating through histogram values according to percentile levels. The iteration is
  * performed in steps that start at 0% and reduce their distance to 100% according to the
  * <i>percentileTicksPerHalfDistance</i> parameter, ultimately reaching 100% when all recorded histogram
  * values are exhausted.
  */
@JSImport("hdr-histogram-js/PercentileIterator", JSImport.Default)
@js.native
class default protected () extends PercentileIterator {
  /**
    * @param histogram The histogram this iterator will operate on
    * @param percentileTicksPerHalfDistance The number of equal-sized iteration steps per half-distance to 100%.
    */
  def this(histogram: AbstractHistogram, percentileTicksPerHalfDistance: Double) = this()
}
