package typings
package handlebarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Logger extends js.Object {
  var DEBUG: scala.Double
  var ERROR: scala.Double
  var INFO: scala.Double
  var WARN: scala.Double
  var level: scala.Double
  var methodMap: ScalablyTyped.runtime.NumberDictionary[java.lang.String]
  def log(level: scala.Double, obj: java.lang.String): scala.Unit
}

