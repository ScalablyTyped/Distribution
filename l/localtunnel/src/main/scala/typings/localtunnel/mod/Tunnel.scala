package typings.localtunnel.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tunnel extends EventEmitter {
  
  def close(): Unit = js.native
  
  def open(cb: js.Function0[Unit]): Unit = js.native
  def open(cb: js.Function1[/* err */ String, Unit]): Unit = js.native
  
  var tunnelCluster: TunnelCluster = js.native
  
  var url: String = js.native
}
