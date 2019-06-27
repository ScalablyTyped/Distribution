package typings
package k6Lib.metricsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("k6/metrics", "Metric")
@js.native
abstract class Metric protected () extends js.Object {
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, isTime: scala.Boolean) = this()
  var __brand: scala.Nothing = js.native
  def add(value: scala.Boolean): scala.Unit = js.native
  def add(value: scala.Boolean, tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
  def add(value: scala.Double): scala.Unit = js.native
  def add(value: scala.Double, tags: org.scalablytyped.runtime.StringDictionary[java.lang.String]): scala.Unit = js.native
}

