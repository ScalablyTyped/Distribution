package typings.hdrHistogramJs

import typings.hdrHistogramJs.abstractHistogramMod.AbstractHistogram
import typings.hdrHistogramJs.abstractHistogramMod.HistogramConstructor
import typings.hdrHistogramJs.anon.HistogramConstr
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object histogramLogReaderMod {
  
  /**
    * A histogram log reader.
    * <p>
    * Histogram logs are used to capture full fidelity, per-time-interval
    * histograms of a recorded value.
    * <p>
    * For example, a histogram log can be used to capture high fidelity
    * reaction-time logs for some measured system or subsystem component.
    * Such a log would capture a full reaction time histogram for each
    * logged interval, and could be used to later reconstruct a full
    * HdrHistogram of the measured reaction time behavior for any arbitrary
    * time range within the log, by adding [only] the relevant interval
    * histograms.
    * <h3>Histogram log format:</h3>
    * A histogram log file consists of text lines. Lines beginning with
    * the "#" character are optional and treated as comments. Lines
    * containing the legend (starting with "Timestamp") are also optional
    * and ignored in parsing the histogram log. All other lines must
    * be valid interval description lines. Text fields are delimited by
    * commas, spaces.
    * <p>
    * A valid interval description line contains an optional Tag=tagString
    * text field, followed by an interval description.
    * <p>
    * A valid interval description must contain exactly four text fields:
    * <ul>
    * <li>StartTimestamp: The first field must contain a number parse-able as a Double value,
    * representing the start timestamp of the interval in seconds.</li>
    * <li>intervalLength: The second field must contain a number parse-able as a Double value,
    * representing the length of the interval in seconds.</li>
    * <li>Interval_Max: The third field must contain a number parse-able as a Double value,
    * which generally represents the maximum value of the interval histogram.</li>
    * <li>Interval_Compressed_Histogram: The fourth field must contain a text field
    * parse-able as a Base64 text representation of a compressed HdrHistogram.</li>
    * </ul>
    * The log file may contain an optional indication of a starting time. Starting time
    * is indicated using a special comments starting with "#[StartTime: " and followed
    * by a number parse-able as a double, representing the start time (in seconds)
    * that may be added to timestamps in the file to determine an absolute
    * timestamp (e.g. since the epoch) for each interval.
    */
  @JSImport("hdr-histogram-js/HistogramLogReader", JSImport.Default)
  @js.native
  class default protected () extends HistogramLogReader {
    def this(logContent: String) = this()
    def this(logContent: String, options: HistogramConstr) = this()
  }
  
  @JSImport("hdr-histogram-js/HistogramLogReader", "listTags")
  @js.native
  def listTags(content: String): js.Array[String] = js.native
  
  /**
    * A histogram log reader.
    * <p>
    * Histogram logs are used to capture full fidelity, per-time-interval
    * histograms of a recorded value.
    * <p>
    * For example, a histogram log can be used to capture high fidelity
    * reaction-time logs for some measured system or subsystem component.
    * Such a log would capture a full reaction time histogram for each
    * logged interval, and could be used to later reconstruct a full
    * HdrHistogram of the measured reaction time behavior for any arbitrary
    * time range within the log, by adding [only] the relevant interval
    * histograms.
    * <h3>Histogram log format:</h3>
    * A histogram log file consists of text lines. Lines beginning with
    * the "#" character are optional and treated as comments. Lines
    * containing the legend (starting with "Timestamp") are also optional
    * and ignored in parsing the histogram log. All other lines must
    * be valid interval description lines. Text fields are delimited by
    * commas, spaces.
    * <p>
    * A valid interval description line contains an optional Tag=tagString
    * text field, followed by an interval description.
    * <p>
    * A valid interval description must contain exactly four text fields:
    * <ul>
    * <li>StartTimestamp: The first field must contain a number parse-able as a Double value,
    * representing the start timestamp of the interval in seconds.</li>
    * <li>intervalLength: The second field must contain a number parse-able as a Double value,
    * representing the length of the interval in seconds.</li>
    * <li>Interval_Max: The third field must contain a number parse-able as a Double value,
    * which generally represents the maximum value of the interval histogram.</li>
    * <li>Interval_Compressed_Histogram: The fourth field must contain a text field
    * parse-able as a Base64 text representation of a compressed HdrHistogram.</li>
    * </ul>
    * The log file may contain an optional indication of a starting time. Starting time
    * is indicated using a special comments starting with "#[StartTime: " and followed
    * by a number parse-able as a double, representing the start time (in seconds)
    * that may be added to timestamps in the file to determine an absolute
    * timestamp (e.g. since the epoch) for each interval.
    */
  @js.native
  trait HistogramLogReader extends StObject {
    
    var baseTimeSec: Double = js.native
    
    var currentLineIndex: Double = js.native
    
    var histogramConstr: HistogramConstructor = js.native
    
    var lines: js.Array[String] = js.native
    
    /**
      * Read the next interval histogram from the log. Returns a Histogram object if
      * an interval line was found, or null if not.
      * <p>Upon encountering any unexpected format errors in reading the next interval
      * from the file, this method will return a null.
      * @return a DecodedInterval, or a null if no appropriate interval found
      */
    def nextIntervalHistogram(): AbstractHistogram | Null = js.native
    def nextIntervalHistogram(rangeStartTimeSec: js.UndefOr[scala.Nothing], rangeEndTimeSec: Double): AbstractHistogram | Null = js.native
    def nextIntervalHistogram(rangeStartTimeSec: Double): AbstractHistogram | Null = js.native
    def nextIntervalHistogram(rangeStartTimeSec: Double, rangeEndTimeSec: Double): AbstractHistogram | Null = js.native
    
    var parseBaseTimeFromLine: js.Any = js.native
    
    var parseStartTimeFromLine: js.Any = js.native
    
    var startTimeSec: Double = js.native
  }
}
