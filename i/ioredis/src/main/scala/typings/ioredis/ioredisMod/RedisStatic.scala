package typings.ioredis.ioredisMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStatic
  extends Instantiable3[/* port */ Double, /* host */ String, /* options */ RedisOptions, Redis]
     with Instantiable0[Redis]
     with Instantiable1[(/* port */ Double) | (/* options */ RedisOptions) | (/* host */ String), Redis]
     with Instantiable2[
      (/* port */ Double) | (/* host */ String), 
      (/* options */ RedisOptions) | (/* host */ String), 
      Redis
    ] {
  var Cluster: ClusterStatic = js.native
  var Command: typings.ioredis.ioredisMod.Command = js.native
  def apply(): Redis = js.native
  def apply(host: String): Redis = js.native
  def apply(host: String, options: RedisOptions): Redis = js.native
  def apply(options: RedisOptions): Redis = js.native
  def apply(port: Double): Redis = js.native
  def apply(port: Double, host: String): Redis = js.native
  def apply(port: Double, host: String, options: RedisOptions): Redis = js.native
}

