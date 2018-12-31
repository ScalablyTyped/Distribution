package typings
package jsgraphLib.jsgraphMod.jsgraphNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: jsgraphLib.Anon_E): scala.Unit
  def discoverVertex(req: jsgraphLib.Anon_G): scala.Unit
  def examineEdge(req: jsgraphLib.Anon_E): scala.Unit
  def examineVertex(req: jsgraphLib.Anon_G): scala.Unit
  def finishVertex(req: jsgraphLib.Anon_G): scala.Unit
  def grayTarget(req: jsgraphLib.Anon_E): scala.Unit
  def initializeVertex(req: jsgraphLib.Anon_G): scala.Unit
  def nonTreeEdge(req: jsgraphLib.Anon_E): scala.Unit
  def startVertex(req: jsgraphLib.Anon_G): scala.Unit
}

