package typings
package jasmineLib.jasmineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queue
  extends org.scalablytyped.runtime.Instantiable1[/* env */ js.Any, js.Any] {
  var abort: scala.Boolean = js.native
  var blocks: js.Array[Block] = js.native
  var ensured: js.Array[scala.Boolean] = js.native
  var env: Env = js.native
  var index: scala.Double = js.native
  var offset: scala.Double = js.native
  var running: scala.Boolean = js.native
  def add(block: js.Any): scala.Unit = js.native
  def add(block: js.Any, ensure: scala.Boolean): scala.Unit = js.native
  def addBefore(block: Block): scala.Unit = js.native
  def addBefore(block: Block, ensure: scala.Boolean): scala.Unit = js.native
  def insertNext(block: js.Any): scala.Unit = js.native
  def insertNext(block: js.Any, ensure: scala.Boolean): scala.Unit = js.native
  def isRunning(): scala.Boolean = js.native
  def next_(): scala.Unit = js.native
  def results(): NestedResults = js.native
  def start(): scala.Unit = js.native
  def start(onComplete: js.Function0[scala.Unit]): scala.Unit = js.native
}

