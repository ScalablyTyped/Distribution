package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends nodeLib.NodeJSNs.EventEmitter
     with ioredisLib.ioredisMod.Commander {
  def connect(callback: js.Function0[scala.Unit]): js.Promise[_] = js.native
  def disconnect(): scala.Unit = js.native
  def nodes(): js.Array[Redis] = js.native
  def nodes(role: NodeRole): js.Array[Redis] = js.native
}

