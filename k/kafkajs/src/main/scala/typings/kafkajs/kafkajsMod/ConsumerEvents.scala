package typings.kafkajs.kafkajsMod

import typings.kafkajs.kafkajsStrings.consumerDOTcommit_offsets
import typings.kafkajs.kafkajsStrings.consumerDOTconnect
import typings.kafkajs.kafkajsStrings.consumerDOTcrash
import typings.kafkajs.kafkajsStrings.consumerDOTdisconnect
import typings.kafkajs.kafkajsStrings.consumerDOTfetch
import typings.kafkajs.kafkajsStrings.consumerDOTgroup_join
import typings.kafkajs.kafkajsStrings.consumerDOTheartbeat
import typings.kafkajs.kafkajsStrings.consumerDOTrequest
import typings.kafkajs.kafkajsStrings.consumerDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.consumerDOTrequest_timeout
import typings.kafkajs.kafkajsStrings.consumerDOTstart_batch_process
import typings.kafkajs.kafkajsStrings.consumerDOTstop
import typings.kafkajs.kafkajsStrings.consumnerDOTend_batch_process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerEvents extends js.Object {
  var COMMIT_OFFSETS: consumerDOTcommit_offsets
  var CONNECT: consumerDOTconnect
  var CRASH: consumerDOTcrash
  var DISCONNECT: consumerDOTdisconnect
  var END_BATCH_PROCESS: consumnerDOTend_batch_process
  var FETCH: consumerDOTfetch
  var GROUP_JOIN: consumerDOTgroup_join
  var HEARTBEAT: consumerDOTheartbeat
  var REQUEST: consumerDOTrequest
  var REQUEST_QUEUE_SIZE: consumerDOTrequest_queue_size
  var REQUEST_TIMEOUT: consumerDOTrequest_timeout
  var START_BATCH_PROCESS: consumerDOTstart_batch_process
  var STOP: consumerDOTstop
}

object ConsumerEvents {
  @scala.inline
  def apply(
    COMMIT_OFFSETS: consumerDOTcommit_offsets,
    CONNECT: consumerDOTconnect,
    CRASH: consumerDOTcrash,
    DISCONNECT: consumerDOTdisconnect,
    END_BATCH_PROCESS: consumnerDOTend_batch_process,
    FETCH: consumerDOTfetch,
    GROUP_JOIN: consumerDOTgroup_join,
    HEARTBEAT: consumerDOTheartbeat,
    REQUEST: consumerDOTrequest,
    REQUEST_QUEUE_SIZE: consumerDOTrequest_queue_size,
    REQUEST_TIMEOUT: consumerDOTrequest_timeout,
    START_BATCH_PROCESS: consumerDOTstart_batch_process,
    STOP: consumerDOTstop
  ): ConsumerEvents = {
    val __obj = js.Dynamic.literal(COMMIT_OFFSETS = COMMIT_OFFSETS, CONNECT = CONNECT, CRASH = CRASH, DISCONNECT = DISCONNECT, END_BATCH_PROCESS = END_BATCH_PROCESS, FETCH = FETCH, GROUP_JOIN = GROUP_JOIN, HEARTBEAT = HEARTBEAT, REQUEST = REQUEST, REQUEST_QUEUE_SIZE = REQUEST_QUEUE_SIZE, REQUEST_TIMEOUT = REQUEST_TIMEOUT, START_BATCH_PROCESS = START_BATCH_PROCESS, STOP = STOP)
  
    __obj.asInstanceOf[ConsumerEvents]
  }
}

