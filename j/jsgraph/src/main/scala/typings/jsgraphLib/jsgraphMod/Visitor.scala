package typings
package jsgraphLib.jsgraphMod

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

object Visitor {
  @scala.inline
  def apply(
    blackTarget: jsgraphLib.Anon_E => scala.Unit,
    discoverVertex: jsgraphLib.Anon_G => scala.Unit,
    examineEdge: jsgraphLib.Anon_E => scala.Unit,
    examineVertex: jsgraphLib.Anon_G => scala.Unit,
    finishVertex: jsgraphLib.Anon_G => scala.Unit,
    grayTarget: jsgraphLib.Anon_E => scala.Unit,
    initializeVertex: jsgraphLib.Anon_G => scala.Unit,
    nonTreeEdge: jsgraphLib.Anon_E => scala.Unit,
    startVertex: jsgraphLib.Anon_G => scala.Unit
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
  
    __obj.asInstanceOf[Visitor]
  }
}

