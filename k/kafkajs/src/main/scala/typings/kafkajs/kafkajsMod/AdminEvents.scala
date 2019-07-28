package typings.kafkajs.kafkajsMod

import typings.kafkajs.kafkajsStrings.adminDOTconnect
import typings.kafkajs.kafkajsStrings.adminDOTdisconnect
import typings.kafkajs.kafkajsStrings.adminDOTrequest
import typings.kafkajs.kafkajsStrings.adminDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.adminDOTrequest_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminEvents extends js.Object {
  var CONNECT: adminDOTconnect
  var DISCONNECT: adminDOTdisconnect
  var REQUEST: adminDOTrequest
  var REQUEST_QUEUE_SIZE: adminDOTrequest_queue_size
  var REQUEST_TIMEOUT: adminDOTrequest_timeout
}

object AdminEvents {
  @scala.inline
  def apply(
    CONNECT: adminDOTconnect,
    DISCONNECT: adminDOTdisconnect,
    REQUEST: adminDOTrequest,
    REQUEST_QUEUE_SIZE: adminDOTrequest_queue_size,
    REQUEST_TIMEOUT: adminDOTrequest_timeout
  ): AdminEvents = {
    val __obj = js.Dynamic.literal(CONNECT = CONNECT, DISCONNECT = DISCONNECT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT)
  
    __obj.asInstanceOf[AdminEvents]
  }
}

