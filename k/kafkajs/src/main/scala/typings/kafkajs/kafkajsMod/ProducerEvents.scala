package typings.kafkajs.kafkajsMod

import typings.kafkajs.kafkajsStrings.producerDOTconnect
import typings.kafkajs.kafkajsStrings.producerDOTdisconnect
import typings.kafkajs.kafkajsStrings.producerDOTrequest
import typings.kafkajs.kafkajsStrings.producerDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.producerDOTrequest_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerEvents extends js.Object {
  var CONNECT: producerDOTconnect
  var DISCONNECT: producerDOTdisconnect
  var REQUEST: producerDOTrequest
  var REQUEST_QUEUE_SIZE: producerDOTrequest_queue_size
  var REQUEST_TIMEOUT: producerDOTrequest_timeout
}

object ProducerEvents {
  @scala.inline
  def apply(
    CONNECT: producerDOTconnect,
    DISCONNECT: producerDOTdisconnect,
    REQUEST: producerDOTrequest,
    REQUEST_QUEUE_SIZE: producerDOTrequest_queue_size,
    REQUEST_TIMEOUT: producerDOTrequest_timeout
  ): ProducerEvents = {
    val __obj = js.Dynamic.literal(CONNECT = CONNECT, DISCONNECT = DISCONNECT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT)
  
    __obj.asInstanceOf[ProducerEvents]
  }
}

