package typings
package liftoffLib.liftoffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Liftoff
  extends nodeLib.eventsMod.EventEmitter {
  @JSName("addListener")
  def addListener_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("addListener")
  def addListener_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
   // tslint:disable-line:ban-types
  @JSName("emit")
  def emit_require(
    event: liftoffLib.liftoffLibStrings.require,
    name: java.lang.String,
    module: interpretLib.interpretMod.ExtensionDescriptor
  ): scala.Boolean = js.native
  @JSName("emit")
  def emit_requireFail(event: liftoffLib.liftoffLibStrings.requireFail, name: java.lang.String, err: js.Any): scala.Boolean = js.native
  @JSName("emit")
  def emit_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    flags: js.Array[java.lang.String],
    child: nodeLib.NodeJSNs.Process
  ): scala.Boolean = js.native
  /**
    * Launches your application with provided options, builds an environment,
    * and invokes your callback, passing the calculated environment as the first argument.
    */
  def launch(
    opts: LaunchOptions,
    callback: js.ThisFunction1[/* this */ this.type, /* env */ LiftoffEnv, scala.Unit]
  ): scala.Unit = js.native
  @JSName("listenerCount")
  def listenerCount_require(`type`: liftoffLib.liftoffLibStrings.require): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_requireFail(`type`: liftoffLib.liftoffLibStrings.requireFail): scala.Double = js.native
  @JSName("listenerCount")
  def listenerCount_respawn(`type`: liftoffLib.liftoffLibStrings.respawn): scala.Double = js.native
  @JSName("listeners")
  def listeners_require(event: liftoffLib.liftoffLibStrings.require): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_requireFail(event: liftoffLib.liftoffLibStrings.requireFail): js.Array[js.Function] = js.native
  @JSName("listeners")
  def listeners_respawn(event: liftoffLib.liftoffLibStrings.respawn): js.Array[js.Function] = js.native
  @JSName("off")
  def off_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("off")
  def off_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("once")
  def once_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("once")
  def once_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependListener")
  def prependListener_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
   // tslint:disable-line:ban-types
  @JSName("rawListeners")
  def rawListeners_require(event: liftoffLib.liftoffLibStrings.require): js.Array[js.Function] = js.native
  @JSName("rawListeners")
  def rawListeners_requireFail(event: liftoffLib.liftoffLibStrings.requireFail): js.Array[js.Function] = js.native
  @JSName("rawListeners")
  def rawListeners_respawn(event: liftoffLib.liftoffLibStrings.respawn): js.Array[js.Function] = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_require(event: liftoffLib.liftoffLibStrings.require): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_requireFail(event: liftoffLib.liftoffLibStrings.requireFail): this.type = js.native
  @JSName("removeAllListeners")
  def removeAllListeners_respawn(event: liftoffLib.liftoffLibStrings.respawn): this.type = js.native
  @JSName("removeListener")
  def removeListener_require(
    event: liftoffLib.liftoffLibStrings.require,
    listener: js.Function2[
      /* name */ java.lang.String, 
      /* module */ interpretLib.interpretMod.ExtensionDescriptor, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_requireFail(
    event: liftoffLib.liftoffLibStrings.requireFail,
    listener: js.Function2[/* name */ java.lang.String, /* err */ js.Any, scala.Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_respawn(
    event: liftoffLib.liftoffLibStrings.respawn,
    listener: js.Function2[
      /* flags */ js.Array[java.lang.String], 
      /* child */ nodeLib.NodeJSNs.Process, 
      scala.Unit
    ]
  ): this.type = js.native
}

