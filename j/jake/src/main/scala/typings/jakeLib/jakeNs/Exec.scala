package typings
package jakeLib.jakeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exec
  extends nodeLib.NodeJSNs.EventEmitter {
  def append(cmd: java.lang.String): scala.Unit = js.native
  def run(): scala.Unit = js.native
}

