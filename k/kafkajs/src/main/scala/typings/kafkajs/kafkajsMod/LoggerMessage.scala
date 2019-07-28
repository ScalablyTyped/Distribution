package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoggerMessage extends js.Object {
  /** @var label Logger level label. */
  val label: String
  /** @var level Logger level. */
  val level: logLevel
  /** @var log Content of the logger entry. */
  val log: LoggerMessageContent
  /** @var namespace Context from which the logger was called. */
  val namespace: String
}

object LoggerMessage {
  @scala.inline
  def apply(label: String, level: logLevel, log: LoggerMessageContent, namespace: String): LoggerMessage = {
    val __obj = js.Dynamic.literal(label = label, level = level, log = log, namespace = namespace)
  
    __obj.asInstanceOf[LoggerMessage]
  }
}

