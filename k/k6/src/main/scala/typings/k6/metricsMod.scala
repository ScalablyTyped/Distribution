package typings.k6

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("k6/metrics", "Counter")
  @js.native
  class Counter protected () extends Metric {
    /**
      * @param name - Metric name.
      * @param isTime - Whether values are time values.
      */
    def this(name: String) = this()
    def this(name: String, isTime: Boolean) = this()
  }
  
  @JSImport("k6/metrics", "Gauge")
  @js.native
  class Gauge protected () extends Metric {
    /**
      * @param name - Metric name.
      * @param isTime - Whether values are time values.
      */
    def this(name: String) = this()
    def this(name: String, isTime: Boolean) = this()
  }
  
  @JSImport("k6/metrics", "Metric")
  @js.native
  abstract class Metric protected () extends StObject {
    /**
      * @param name - Metric name.
      * @param isTime - Whether values are time values.
      */
    def this(name: String) = this()
    def this(name: String, isTime: Boolean) = this()
    
    def add(value: Boolean): Unit = js.native
    def add(value: Boolean, tags: StringDictionary[String]): Unit = js.native
    /**
      * Add value.
      * @param value - Value to add.
      * @param tags - Tags to attach to data point.
      */
    def add(value: Double): Unit = js.native
    def add(value: Double, tags: StringDictionary[String]): Unit = js.native
  }
  
  @JSImport("k6/metrics", "Rate")
  @js.native
  class Rate protected () extends Metric {
    /**
      * @param name - Metric name.
      * @param isTime - Whether values are time values.
      */
    def this(name: String) = this()
    def this(name: String, isTime: Boolean) = this()
  }
  
  @JSImport("k6/metrics", "Trend")
  @js.native
  class Trend protected () extends Metric {
    /**
      * @param name - Metric name.
      * @param isTime - Whether values are time values.
      */
    def this(name: String) = this()
    def this(name: String, isTime: Boolean) = this()
  }
}
