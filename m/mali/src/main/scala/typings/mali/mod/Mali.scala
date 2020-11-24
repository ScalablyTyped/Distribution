package typings.mali.mod

import typings.grpc.mod.Server
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mali extends EventEmitter {
  
  def addService(path: js.Any, name: String): Unit = js.native
  def addService(path: js.Any, name: String, options: js.Any): Unit = js.native
  def addService(path: js.Any, name: js.Array[String]): Unit = js.native
  def addService(path: js.Any, name: js.Array[String], options: js.Any): Unit = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  var context: js.Object = js.native
  
  var env: String = js.native
  
  def inspect(): js.Any = js.native
  
  var name: String = js.native
  
  var ports: js.Array[Double] = js.native
  
  var silent: Boolean = js.native
  
  def start(port: String): Server = js.native
  def start(port: String, creds: js.UndefOr[scala.Nothing], options: js.Any): Server = js.native
  def start(port: String, creds: js.Any): Server = js.native
  def start(port: String, creds: js.Any, options: js.Any): Server = js.native
  def start(port: Double): Server = js.native
  def start(port: Double, creds: js.UndefOr[scala.Nothing], options: js.Any): Server = js.native
  def start(port: Double, creds: js.Any): Server = js.native
  def start(port: Double, creds: js.Any, options: js.Any): Server = js.native
  
  def toJSON(): js.Any = js.native
  
  def use(): Unit = js.native
  def use(service: js.UndefOr[scala.Nothing], name: js.UndefOr[scala.Nothing], fns: js.Any): Unit = js.native
  def use(service: js.UndefOr[scala.Nothing], name: js.Any): Unit = js.native
  def use(service: js.UndefOr[scala.Nothing], name: js.Any, fns: js.Any): Unit = js.native
  def use(service: js.Any): Unit = js.native
  def use(service: js.Any, name: js.UndefOr[scala.Nothing], fns: js.Any): Unit = js.native
  def use(service: js.Any, name: js.Any): Unit = js.native
  def use(service: js.Any, name: js.Any, fns: js.Any): Unit = js.native
}
