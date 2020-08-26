package typings.ioredis.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends EventEmitter
     with Commander
     with Commands {
  val options: ClusterOptions = js.native
  val status: String = js.native
  def connect(): js.Promise[Unit] = js.native
  def disconnect(): Unit = js.native
  def nodes(): js.Array[Redis] = js.native
  def nodes(role: NodeRole): js.Array[Redis] = js.native
}

