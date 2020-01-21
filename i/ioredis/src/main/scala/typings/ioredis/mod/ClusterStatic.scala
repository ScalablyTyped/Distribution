package typings.ioredis.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterStatic
  extends EventEmitter
     with Commander
     with Instantiable1[/* nodes */ js.Array[ClusterNode], Cluster]
     with Instantiable2[/* nodes */ js.Array[ClusterNode], /* options */ ClusterOptions, Cluster]

