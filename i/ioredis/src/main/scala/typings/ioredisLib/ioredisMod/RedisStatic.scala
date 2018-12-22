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
      /* options */ ioredisLib.ioredisMod.IORedisNs.RedisOptions, 
      ioredisLib.ioredisMod.IORedisNs.Redis
    ]
     with org.scalablytyped.runtime.Instantiable0[ioredisLib.ioredisMod.IORedisNs.Redis]
     with org.scalablytyped.runtime.Instantiable2[
      (/* port */ scala.Double) | (/* host */ java.lang.String), 
      (/* options */ ioredisLib.ioredisMod.IORedisNs.RedisOptions) | (/* host */ java.lang.String), 
      ioredisLib.ioredisMod.IORedisNs.Redis
    ]
     with org.scalablytyped.runtime.Instantiable1[
      (/* port */ scala.Double) | (/* options */ ioredisLib.ioredisMod.IORedisNs.RedisOptions) | (/* host */ java.lang.String), 
      ioredisLib.ioredisMod.IORedisNs.Redis
    ] {
  var Cluster: ioredisLib.ioredisMod.IORedisNs.Cluster = js.native
  var Command: ioredisLib.ioredisMod.IORedisNs.Command = js.native
  def apply(): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(host: java.lang.String): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(host: java.lang.String, options: ioredisLib.ioredisMod.IORedisNs.RedisOptions): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(options: ioredisLib.ioredisMod.IORedisNs.RedisOptions): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(port: scala.Double): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(port: scala.Double, host: java.lang.String): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
  def apply(port: scala.Double, host: java.lang.String, options: ioredisLib.ioredisMod.IORedisNs.RedisOptions): ioredisLib.ioredisMod.IORedisNs.Redis = js.native
}

