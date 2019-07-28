package typings.jsgraph.jsgraphMod

import typings.jsgraph.Anon_E
import typings.jsgraph.Anon_G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: Anon_E): Unit
  def discoverVertex(req: Anon_G): Unit
  def examineEdge(req: Anon_E): Unit
  def examineVertex(req: Anon_G): Unit
  def finishVertex(req: Anon_G): Unit
  def grayTarget(req: Anon_E): Unit
  def initializeVertex(req: Anon_G): Unit
  def nonTreeEdge(req: Anon_E): Unit
  def startVertex(req: Anon_G): Unit
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: Anon_E => Unit,
    discoverVertex: Anon_G => Unit,
    examineEdge: Anon_E => Unit,
    examineVertex: Anon_G => Unit,
    finishVertex: Anon_G => Unit,
    grayTarget: Anon_E => Unit,
    initializeVertex: Anon_G => Unit,
    nonTreeEdge: Anon_E => Unit,
    startVertex: Anon_G => Unit
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
  
    __obj.asInstanceOf[Visitor]
  }
}

