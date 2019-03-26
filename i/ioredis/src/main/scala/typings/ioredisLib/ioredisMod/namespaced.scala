package typings
package ioredisLib.ioredisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ioredis", JSImport.Namespace)
@js.native
class namespaced ()
  extends ioredisLib.ioredisMod.IORedisNs.Redis {
  def this(host: java.lang.String) = this()
  def this(options: ioredisLib.ioredisMod.IORedisNs.RedisOptions) = this()
  def this(port: scala.Double) = this()
  def this(host: java.lang.String, options: ioredisLib.ioredisMod.IORedisNs.RedisOptions) = this()
  def this(port: scala.Double, host: java.lang.String) = this()
  def this(port: scala.Double, host: java.lang.String, options: ioredisLib.ioredisMod.IORedisNs.RedisOptions) = this()
  /* CompleteClass */
  override def createBuiltinCommand(commandName: java.lang.String): js.Object = js.native
  /* CompleteClass */
  override def defineCommand(name: java.lang.String, definition: ioredisLib.Anon_Lua): js.Any = js.native
  /* CompleteClass */
  override def getBuiltinCommands(): js.Array[java.lang.String] = js.native
  /* CompleteClass */
  override def sendCommand(): scala.Unit = js.native
}

