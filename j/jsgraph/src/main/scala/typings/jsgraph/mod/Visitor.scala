package typings.jsgraph.mod

import typings.jsgraph.anon.E
import typings.jsgraph.anon.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: E): Unit
  def discoverVertex(req: G): Unit
  def examineEdge(req: E): Unit
  def examineVertex(req: G): Unit
  def finishVertex(req: G): Unit
  def grayTarget(req: E): Unit
  def initializeVertex(req: G): Unit
  def nonTreeEdge(req: E): Unit
  def startVertex(req: G): Unit
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: E => Unit,
    discoverVertex: G => Unit,
    examineEdge: E => Unit,
    examineVertex: G => Unit,
    finishVertex: G => Unit,
    grayTarget: E => Unit,
    initializeVertex: G => Unit,
    nonTreeEdge: E => Unit,
    startVertex: G => Unit
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
    __obj.asInstanceOf[Visitor]
  }
}

