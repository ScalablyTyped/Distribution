package typings.hdrHistogramJs

import typings.hdrHistogramJs.distHistogramMod.Histogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHistogramLogWriterMod {
  
  @JSImport("hdr-histogram-js/dist/HistogramLogWriter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with HistogramLogWriter {
    def this(log: Writable) = this()
  }
  
  @js.native
  trait HistogramLogWriter extends StObject {
    
    /**
      * Base time to subtract from supplied histogram start/end timestamps when
      * logging based on histogram timestamps.
      * Base time is expected to be in msec since the epoch, as histogram start/end times
      * are typically stamped with absolute times in msec since the epoch.
      */
    var baseTime: Double = js.native
    
    /* private */ var log: Any = js.native
    
    /**
      * Log a comment to the log.
      * Comments will be preceded with with the '#' character.
      * @param comment the comment string.
      */
    def outputComment(comment: String): Unit = js.native
    
    /**
      * Output an interval histogram, with the given timestamp information and the [optional] tag
      * associated with the histogram, using a configurable maxValueUnitRatio. (note that the
      * specified timestamp information will be used, and the timestamp information in the actual
      * histogram will be ignored).
      * The max value reported with the interval line will be scaled by the given maxValueUnitRatio.
      * @param startTimeStampSec The start timestamp to log with the interval histogram, in seconds.
      * @param endTimeStampSec The end timestamp to log with the interval histogram, in seconds.
      * @param histogram The interval histogram to log.
      * @param maxValueUnitRatio The ratio by which to divide the histogram's max value when reporting on it.
      */
    def outputIntervalHistogram(histogram: Histogram): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Double): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Double, endTimeStampSec: Double): Unit = js.native
    def outputIntervalHistogram(
      histogram: Histogram,
      startTimeStampSec: Double,
      endTimeStampSec: Double,
      maxValueUnitRatio: Double
    ): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Double, endTimeStampSec: Unit, maxValueUnitRatio: Double): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Unit, endTimeStampSec: Double): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Unit, endTimeStampSec: Double, maxValueUnitRatio: Double): Unit = js.native
    def outputIntervalHistogram(histogram: Histogram, startTimeStampSec: Unit, endTimeStampSec: Unit, maxValueUnitRatio: Double): Unit = js.native
    
    /**
      * Output a legend line to the log.
      */
    def outputLegend(): Unit = js.native
    
    /**
      * Output a log format version to the log.
      */
    def outputLogFormatVersion(): Unit = js.native
    
    /**
      * Log a start time in the log.
      * @param startTimeMsec time (in milliseconds) since the absolute start time (the epoch)
      */
    def outputStartTime(startTimeMsec: Double): Unit = js.native
  }
  
  type Writable = js.Function1[/* c */ String, Unit]
}
