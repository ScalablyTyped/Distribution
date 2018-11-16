package typings
package karmaLib.karmaMod.karmaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Launcher extends js.Object {
  var Launcher: LauncherStatic
  def areAllCaptured(): scala.Boolean
  def kill(id: java.lang.String, callback: js.Function0[scala.Unit]): scala.Boolean
  def killAll(callback: js.Function0[scala.Unit]): scala.Unit
  // TODO: Can this return value ever be typified?
  def launch(
    names: js.Array[java.lang.String],
    protocol: java.lang.String,
    hostname: java.lang.String,
    port: scala.Double,
    urlRoot: java.lang.String
  ): js.Array[_]
  def markCaptured(id: java.lang.String): scala.Unit
  def restart(id: java.lang.String): scala.Boolean
}

