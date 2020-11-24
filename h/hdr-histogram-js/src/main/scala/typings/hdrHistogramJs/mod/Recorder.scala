package typings.hdrHistogramJs.mod

import typings.hdrHistogramJs.recorderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Records integer values, and provides stable interval {@link Histogram} samples from
  * live recorded data without interrupting or stalling active recording of values. Each interval
  * histogram provided contains all value counts accumulated since the previous interval histogram
  * was taken.
  * <p>
  * This pattern is commonly used in logging interval histogram information while recording is ongoing.
  * <p>
  * {@link Recorder} supports concurrent
  * {@link Recorder#recordValue} or
  * {@link Recorder#recordValueWithExpectedInterval} calls.
  *
  */
@JSImport("hdr-histogram-js", "Recorder")
@js.native
/**
  * Construct an auto-resizing {@link Recorder} with a lowest discernible value of
  * 1 and an auto-adjusting highestTrackableValue. Can auto-resize up to track values up to Number.MAX_SAFE_INTEGER.
  *
  * @param numberOfSignificantValueDigits Specifies the precision to use. This is the number of significant
  *                                       decimal digits to which the histogram will maintain value resolution
  *                                       and separation. Must be a non-negative integer between 0 and 5.
  * @param packed Specifies whether the recorder will uses a packed internal representation or not.
  * @param clock (for testing purpose) an action that give current time in ms since 1970
  */
class Recorder () extends default {
  def this(numberOfSignificantValueDigits: Double) = this()
  def this(numberOfSignificantValueDigits: js.UndefOr[scala.Nothing], packed: Boolean) = this()
  def this(numberOfSignificantValueDigits: Double, packed: Boolean) = this()
  def this(
    numberOfSignificantValueDigits: js.UndefOr[scala.Nothing],
    packed: js.UndefOr[scala.Nothing],
    clock: js.Function0[Double]
  ) = this()
  def this(
    numberOfSignificantValueDigits: js.UndefOr[scala.Nothing],
    packed: Boolean,
    clock: js.Function0[Double]
  ) = this()
  def this(
    numberOfSignificantValueDigits: Double,
    packed: js.UndefOr[scala.Nothing],
    clock: js.Function0[Double]
  ) = this()
  def this(numberOfSignificantValueDigits: Double, packed: Boolean, clock: js.Function0[Double]) = this()
}
/* static members */
@JSImport("hdr-histogram-js", "Recorder")
@js.native
object Recorder extends js.Object {
  
  var idGenerator: Double = js.native
}
