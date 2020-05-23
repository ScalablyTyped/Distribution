package typings.ioredis.mod

import org.scalablytyped.runtime.TopLevel
import typings.ioredis.anon.Lua
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ioredis", JSImport.Namespace)
@js.native
class ^ () extends Redis {
  def this(host: String) = this()
  def this(options: RedisOptions) = this()
  def this(port: Double) = this()
  def this(host: String, options: RedisOptions) = this()
  def this(port: Double, host: String) = this()
  def this(port: Double, host: String, options: RedisOptions) = this()
  /* CompleteClass */
  override def createBuiltinCommand(commandName: String): js.Object = js.native
  /* CompleteClass */
  override def defineCommand(name: String, definition: Lua): Unit = js.native
  /* CompleteClass */
  override def getBuiltinCommands(): js.Array[String] = js.native
  /* CompleteClass */
  override def sendCommand(): Unit = js.native
}

@JSImport("ioredis", JSImport.Namespace)
@js.native
object ^ extends TopLevel[RedisStatic]

