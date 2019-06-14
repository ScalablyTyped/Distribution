package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerEvents extends js.Object {
  var COMMIT_OFFSETS: kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets
  var CONNECT: kafkajsLib.kafkajsLibStrings.consumerDOTconnect
  var CRASH: kafkajsLib.kafkajsLibStrings.consumerDOTcrash
  var DISCONNECT: kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect
  var END_BATCH_PROCESS: kafkajsLib.kafkajsLibStrings.consumerDOTend_batch_process
  var FETCH: kafkajsLib.kafkajsLibStrings.consumerDOTfetch
  var GROUP_JOIN: kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join
  var HEARTBEAT: kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat
  var REQUEST: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest
  var REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest_queue_size
  var REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest_timeout
  var START_BATCH_PROCESS: kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process
  var STOP: kafkajsLib.kafkajsLibStrings.consumerDOTstop
}

object ConsumerEvents {
  @scala.inline
  def apply(
    COMMIT_OFFSETS: kafkajsLib.kafkajsLibStrings.consumerDOTcommit_offsets,
    CONNECT: kafkajsLib.kafkajsLibStrings.consumerDOTconnect,
    CRASH: kafkajsLib.kafkajsLibStrings.consumerDOTcrash,
    DISCONNECT: kafkajsLib.kafkajsLibStrings.consumerDOTdisconnect,
    END_BATCH_PROCESS: kafkajsLib.kafkajsLibStrings.consumerDOTend_batch_process,
    FETCH: kafkajsLib.kafkajsLibStrings.consumerDOTfetch,
    GROUP_JOIN: kafkajsLib.kafkajsLibStrings.consumerDOTgroup_join,
    HEARTBEAT: kafkajsLib.kafkajsLibStrings.consumerDOTheartbeat,
    REQUEST: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest,
    REQUEST_QUEUE_SIZE: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest_queue_size,
    REQUEST_TIMEOUT: kafkajsLib.kafkajsLibStrings.consumerDOTnetworkDOTrequest_timeout,
    START_BATCH_PROCESS: kafkajsLib.kafkajsLibStrings.consumerDOTstart_batch_process,
    STOP: kafkajsLib.kafkajsLibStrings.consumerDOTstop
  ): ConsumerEvents = {
    val __obj = js.Dynamic.literal(COMMIT_OFFSETS = COMMIT_OFFSETS, CONNECT = CONNECT, CRASH = CRASH, DISCONNECT = DISCONNECT, END_BATCH_PROCESS = END_BATCH_PROCESS, FETCH = FETCH, GROUP_JOIN = GROUP_JOIN, HEARTBEAT = HEARTBEAT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT, START_BATCH_PROCESS = START_BATCH_PROCESS, STOP = STOP)
  
    __obj.asInstanceOf[ConsumerEvents]
  }
}

