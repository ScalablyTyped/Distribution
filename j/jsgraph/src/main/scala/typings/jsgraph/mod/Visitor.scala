package typings.jsgraph.mod

import typings.jsgraph.AnonE
import typings.jsgraph.AnonG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Visitor extends js.Object {
  def blackTarget(req: AnonE): Unit
  def discoverVertex(req: AnonG): Unit
  def examineEdge(req: AnonE): Unit
  def examineVertex(req: AnonG): Unit
  def finishVertex(req: AnonG): Unit
  def grayTarget(req: AnonE): Unit
  def initializeVertex(req: AnonG): Unit
  def nonTreeEdge(req: AnonE): Unit
  def startVertex(req: AnonG): Unit
}

object Visitor {
  @scala.inline
  def apply(
    blackTarget: AnonE => Unit,
    discoverVertex: AnonG => Unit,
    examineEdge: AnonE => Unit,
    examineVertex: AnonG => Unit,
    finishVertex: AnonG => Unit,
    grayTarget: AnonE => Unit,
    initializeVertex: AnonG => Unit,
    nonTreeEdge: AnonE => Unit,
    startVertex: AnonG => Unit
  ): Visitor = {
    val __obj = js.Dynamic.literal(blackTarget = js.Any.fromFunction1(blackTarget), discoverVertex = js.Any.fromFunction1(discoverVertex), examineEdge = js.Any.fromFunction1(examineEdge), examineVertex = js.Any.fromFunction1(examineVertex), finishVertex = js.Any.fromFunction1(finishVertex), grayTarget = js.Any.fromFunction1(grayTarget), initializeVertex = js.Any.fromFunction1(initializeVertex), nonTreeEdge = js.Any.fromFunction1(nonTreeEdge), startVertex = js.Any.fromFunction1(startVertex))
  
    __obj.asInstanceOf[Visitor]
  }
}

