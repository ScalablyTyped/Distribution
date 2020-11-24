package typings.ioredis.mod

import org.scalablytyped.runtime.Instantiable1
import typings.node.eventsMod.EventEmitter
import typings.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Redis
  extends EventEmitter
     with Commander
     with Commands {
  
  var Promise: PromiseConstructor with (Instantiable1[
    /* executor */ js.Function2[
      /* resolve */ js.Function1[
        /* value */ (/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any) | (js.Thenable[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any]), 
        Unit
      ], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
      Unit
    ], 
    typings.std.global.Promise[js.Object]
  ]) = js.native
  
  def connect(): js.Promise[Unit] = js.native
  def connect(callback: js.Function0[Unit]): js.Promise[Unit] = js.native
  
  def disconnect(): Unit = js.native
  
  def duplicate(): Redis = js.native
  
  val options: RedisOptions = js.native
  
  def send_command(command: String, args: ValueType*): js.Promise[_] = js.native
  
  val status: String = js.native
}
