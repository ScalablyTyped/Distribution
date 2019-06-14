package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProducerEvents extends js.Object {
  var CONNECT: kafkajsLib.kafkajsLibStrings.producerDOTconnect
  var DISCONNECT: kafkajsLib.kafkajsLibStrings.producerDOTdisconnect
  var REQUEST: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest
  var REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest_queue_size
  var REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest_timeout
}

object ProducerEvents {
  @scala.inline
  def apply(
    CONNECT: kafkajsLib.kafkajsLibStrings.producerDOTconnect,
    DISCONNECT: kafkajsLib.kafkajsLibStrings.producerDOTdisconnect,
    REQUEST: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest,
    REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest_queue_size,
    REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.producerDOTnetworkDOTrequest_timeout
  ): ProducerEvents = {
    val __obj = js.Dynamic.literal(CONNECT = CONNECT, DISCONNECT = DISCONNECT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT)
  
    __obj.asInstanceOf[ProducerEvents]
  }
}

