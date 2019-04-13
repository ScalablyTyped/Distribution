package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisStatic
  extends org.scalablytyped.runtime.Instantiable3[
      /* port */ scala.Double, 
      /* host */ java.lang.String, 
      /* options */ RedisOptions, 
      Redis
    ]
     with org.scalablytyped.runtime.Instantiable0[Redis]
     with org.scalablytyped.runtime.Instantiable2[
      (/* port */ scala.Double) | (/* host */ java.lang.String), 
      (/* options */ RedisOptions) | (/* host */ java.lang.String), 
      Redis
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* port */ scala.Double) | (/* options */ RedisOptions) | (/* host */ java.lang.String), 
      Redis
    ] {
  var Cluster: ClusterStatic = js.native
  var Command: ioredisLib.ioredisMod.Command = js.native
  def apply(): Redis = js.native
  def apply(host: java.lang.String): Redis = js.native
  def apply(host: java.lang.String, options: RedisOptions): Redis = js.native
  def apply(options: RedisOptions): Redis = js.native
  def apply(port: scala.Double): Redis = js.native
  def apply(port: scala.Double, host: java.lang.String): Redis = js.native
  def apply(port: scala.Double, host: java.lang.String, options: RedisOptions): Redis = js.native
}

