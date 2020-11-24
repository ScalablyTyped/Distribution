package typings.liftoff.mod

import typings.interpret.mod.ExtensionDescriptor
import typings.liftoff.liftoffStrings.require
import typings.liftoff.liftoffStrings.requireFail
import typings.liftoff.liftoffStrings.respawn
import typings.node.eventsMod.EventEmitter
import typings.node.processMod.global.NodeJS.Process
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Liftoff extends EventEmitter {
  
  @JSName("addListener")
  def addListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
   // tslint:disable-line:ban-types
  @JSName("emit")
  def emit_require(event: require, name: String, module: ExtensionDescriptor): Boolean = js.native
  @JSName("emit")
  def emit_requireFail(event: requireFail, name: String, err: js.Any): Boolean = js.native
  @JSName("emit")
  def emit_respawn(event: respawn, flags: js.Array[String], child: Process): Boolean = js.native
  
  /**
    * Launches your application with provided options, builds an environment,
    * and invokes your callback, passing the calculated environment as the first argument.
    */
  def launch(opts: LaunchOptions, callback: js.ThisFunction1[/* this */ this.type, /* env */ LiftoffEnv, Unit]): Unit = js.native
  
  @JSName("listenerCount")
  def listenerCount_require(`type`: require): Double = js.native
  @JSName("listenerCount")
  def listenerCount_requireFail(`type`: requireFail): Double = js.native
  @JSName("listenerCount")
  def listenerCount_respawn(`type`: respawn): Double = js.native
  
  @JSName("listeners")
  def listeners_require(event: require): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_requireFail(event: requireFail): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_respawn(event: respawn): js.Array[js.Function] = js.native
  
  @JSName("off")
  def off_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("off")
  def off_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("off")
  def off_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
  @JSName("on")
  def on_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("on")
  def on_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("on")
  def on_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
  @JSName("once")
  def once_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("once")
  def once_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("once")
  def once_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
  @JSName("prependListener")
  def prependListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
  @JSName("prependOnceListener")
  def prependOnceListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
  
   // tslint:disable-line:ban-types
  @JSName("rawListeners")
  def rawListeners_require(event: require): js.Array[js.Function] = js.native
  @JSName("rawListeners")
  def rawListeners_requireFail(event: requireFail): js.Array[js.Function] = js.native
  @JSName("rawListeners")
  def rawListeners_respawn(event: respawn): js.Array[js.Function] = js.native
  
  @JSName("removeAllListeners")
  def removeAllListeners_require(event: require): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_requireFail(event: requireFail): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_respawn(event: respawn): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_require(event: require, listener: js.Function2[/* name */ String, /* module */ ExtensionDescriptor, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_requireFail(event: requireFail, listener: js.Function2[/* name */ String, /* err */ js.Any, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_respawn(event: respawn, listener: js.Function2[/* flags */ js.Array[String], /* child */ Process, Unit]): this.type = js.native
}
