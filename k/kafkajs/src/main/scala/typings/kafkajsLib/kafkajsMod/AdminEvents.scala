package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminEvents extends js.Object {
  var CONNECT: kafkajsLib.kafkajsLibStrings.adminDOTconnect
  var DISCONNECT: kafkajsLib.kafkajsLibStrings.adminDOTdisconnect
  var REQUEST: kafkajsLib.kafkajsLibStrings.adminDOTrequest
  var REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.adminDOTrequest_queue_size
  var REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.adminDOTrequest_timeout
}

object AdminEvents {
  @scala.inline
  def apply(
    CONNECT: kafkajsLib.kafkajsLibStrings.adminDOTconnect,
    DISCONNECT: kafkajsLib.kafkajsLibStrings.adminDOTdisconnect,
    REQUEST: kafkajsLib.kafkajsLibStrings.adminDOTrequest,
    REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.adminDOTrequest_queue_size,
    REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.adminDOTrequest_timeout
  ): AdminEvents = {
    val __obj = js.Dynamic.literal(CONNECT = CONNECT, DISCONNECT = DISCONNECT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT)
  
    __obj.asInstanceOf[AdminEvents]
  }
}

