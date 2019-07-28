package typings.k6.metricsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/metrics", "Metric")
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

