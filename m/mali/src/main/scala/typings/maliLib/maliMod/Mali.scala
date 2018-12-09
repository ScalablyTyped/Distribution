package typings
package maliLib.maliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mali
  extends nodeLib.eventsMod.EventEmitter {
  var env: java.lang.String = js.native
  var name: java.lang.String = js.native
  var ports: js.Array[scala.Double] = js.native
  var silent: scala.Boolean = js.native
  def addService(path: js.Any, name: java.lang.String): scala.Unit = js.native
  def addService(path: js.Any, name: java.lang.String, options: js.Any): scala.Unit = js.native
  def addService(path: js.Any, name: js.Array[java.lang.String]): scala.Unit = js.native
  def addService(path: js.Any, name: js.Array[java.lang.String], options: js.Any): scala.Unit = js.native
  def close(): js.Promise[scala.Unit] = js.native
  def inspect(): js.Any = js.native
  def start(port: java.lang.String): grpcLib.grpcMod.Server = js.native
  def start(port: java.lang.String, creds: js.Any): grpcLib.grpcMod.Server = js.native
  def start(port: java.lang.String, creds: js.Any, options: js.Any): grpcLib.grpcMod.Server = js.native
  def start(port: scala.Double): grpcLib.grpcMod.Server = js.native
  def start(port: scala.Double, creds: js.Any): grpcLib.grpcMod.Server = js.native
  def start(port: scala.Double, creds: js.Any, options: js.Any): grpcLib.grpcMod.Server = js.native
  def toJSON(): js.Any = js.native
  def use(): scala.Unit = js.native
  def use(service: js.Any): scala.Unit = js.native
  def use(service: js.Any, name: js.Any): scala.Unit = js.native
  def use(service: js.Any, name: js.Any, fns: js.Any): scala.Unit = js.native
}

