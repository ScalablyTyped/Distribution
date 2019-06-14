package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogEntry extends js.Object {
  var label: java.lang.String
  var level: logLevel
  var log: java.lang.String
  var namespace: java.lang.String
}

object LogEntry {
  @scala.inline
  def apply(label: java.lang.String, level: logLevel, log: java.lang.String, namespace: java.lang.String): LogEntry = {
    val __obj = js.Dynamic.literal(label = label, level = level, log = log, namespace = namespace)
  
    __obj.asInstanceOf[LogEntry]
  }
}

