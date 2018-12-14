package typings
package ioredisLib.ioredisMod.IORedisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster
  extends nodeLib.NodeJSNs.EventEmitter
     with ioredisLib.ioredisMod.Commander
     with org.scalablytyped.runtime.Instantiable1[/* nodes */ js.Array[ClusterNode], Redis]
     with org.scalablytyped.runtime.Instantiable2[/* nodes */ js.Array[ClusterNode], /* options */ ClusterOptions, Redis] {
  def connect(callback: js.Function0[scala.Unit]): js.Promise[_] = js.native
  def disconnect(): scala.Unit = js.native
  def nodes(role: java.lang.String): js.Array[Redis] = js.native
}

