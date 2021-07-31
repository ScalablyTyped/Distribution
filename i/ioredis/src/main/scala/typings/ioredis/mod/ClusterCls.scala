package typings.ioredis.mod

import typings.ioredis.anon.Lua
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("ioredis", "Cluster")
@js.native
class ClusterCls protected () extends Cluster {
  def this(nodes: js.Array[ClusterNode]) = this()
  def this(nodes: js.Array[ClusterNode], options: ClusterOptions) = this()
  
  /* CompleteClass */
  override def createBuiltinCommand(commandName: String): js.Object = js.native
  
  /* CompleteClass */
  override def defineCommand(name: String, definition: Lua): Unit = js.native
  
  /* CompleteClass */
  override def getBuiltinCommands(): js.Array[String] = js.native
  
  /* CompleteClass */
  override def sendCommand(): Unit = js.native
}
