package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Admin extends js.Object {
  var events: AdminEvents = js.native
  def alterConfigs(options: AdminAlterConfigsOptions): js.Promise[scala.Unit] = js.native
  def connect(): js.Promise[scala.Unit] = js.native
  def createTopics(options: AdminCreateTopicsOptions): js.Promise[scala.Unit] = js.native
  def deleteTopics(options: AdminDeleteTopicsOptions): js.Promise[scala.Unit] = js.native
  def describeConfigs(options: AdminDescribeConfigsOptions): js.Promise[AdminConfigDescription] = js.native
  def disconnect(): js.Promise[scala.Unit] = js.native
  def fetchOffsets(options: AdminFetchOffsetsOptions): js.Promise[js.Array[AdminTopicOffset]] = js.native
  def getTopicMetadata(options: kafkajsLib.Anon_TopicsArray): js.Promise[kafkajsLib.Anon_TopicsArrayTopicMetadata] = js.native
  @JSName("on")
  def on_adminconnect(
    event: kafkajsLib.kafkajsLibStrings.adminDOTconnect,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_admindisconnect(
    event: kafkajsLib.kafkajsLibStrings.adminDOTdisconnect,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequest(
    event: kafkajsLib.kafkajsLibStrings.adminDOTrequest,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequest_queue_size(
    event: kafkajsLib.kafkajsLibStrings.adminDOTrequest_queue_size,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  @JSName("on")
  def on_adminrequest_timeout(
    event: kafkajsLib.kafkajsLibStrings.adminDOTrequest_timeout,
    cb: js.Function1[/* e */ InstrumentationEvent, scala.Unit]
  ): js.Function0[this.type] = js.native
  def resetOffsets(options: AdminResetOffsetsOptions): js.Promise[scala.Unit] = js.native
  def setOffsets(options: AdminSetOffsetsOptions): js.Promise[scala.Unit] = js.native
}

