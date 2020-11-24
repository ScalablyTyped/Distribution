package typings.k6

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("k6/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  
  @js.native
  class Counter () extends Metric
  
  @js.native
  class Gauge () extends Metric
  
  @js.native
  abstract class Metric protected () extends js.Object {
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
  
  @js.native
  class Rate () extends Metric
  
  @js.native
  class Trend () extends Metric
}
