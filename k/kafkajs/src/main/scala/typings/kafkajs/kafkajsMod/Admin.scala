package typings.kafkajs.kafkajsMod

import typings.kafkajs.Anon_TopicsArray
import typings.kafkajs.Anon_TopicsArrayTopicMetadata
import typings.kafkajs.kafkajsStrings.adminDOTconnect
import typings.kafkajs.kafkajsStrings.adminDOTdisconnect
import typings.kafkajs.kafkajsStrings.adminDOTrequest
import typings.kafkajs.kafkajsStrings.adminDOTrequest_queue_size
import typings.kafkajs.kafkajsStrings.adminDOTrequest_timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  var events: AdminEvents = js.native
  def alterConfigs(options: AdminAlterConfigsOptions): js.Promise[Unit] = js.native
  def connect(): js.Promise[Unit] = js.native
  def createTopics(options: AdminCreateTopicsOptions): js.Promise[Unit] = js.native
  def deleteTopics(options: AdminDeleteTopicsOptions): js.Promise[Unit] = js.native
  def describeConfigs(options: AdminDescribeConfigsOptions): js.Promise[AdminConfigDescription] = js.native
  def disconnect(): js.Promise[Unit] = js.native
  def fetchOffsets(options: AdminFetchOffsetsOptions): js.Promise[js.Array[AdminTopicOffset]] = js.native
  def getTopicMetadata(options: Anon_TopicsArray): js.Promise[Anon_TopicsArrayTopicMetadata] = js.native
  @JSName("on")
  def on_adminconnect(event: adminDOTconnect, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_admindisconnect(event: adminDOTdisconnect, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequest(event: adminDOTrequest, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequestqueuesize(event: adminDOTrequest_queue_size, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequesttimeout(event: adminDOTrequest_timeout, cb: js.Function1[/* e */ InstrumentationEvent, Unit]): js.Function0[this.type] = js.native
  def resetOffsets(options: AdminResetOffsetsOptions): js.Promise[Unit] = js.native
  def setOffsets(options: AdminSetOffsetsOptions): js.Promise[Unit] = js.native
}

