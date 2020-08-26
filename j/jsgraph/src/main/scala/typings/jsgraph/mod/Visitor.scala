package typings.jsgraph.mod

import typings.jsgraph.anon.E
import typings.jsgraph.anon.G
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Visitor extends js.Object {
  def blackTarget(req: E): Unit = js.native
  def discoverVertex(req: G): Unit = js.native
  def examineEdge(req: E): Unit = js.native
  def examineVertex(req: G): Unit = js.native
  def finishVertex(req: G): Unit = js.native
  def grayTarget(req: E): Unit = js.native
  def initializeVertex(req: G): Unit = js.native
  def nonTreeEdge(req: E): Unit = js.native
  def startVertex(req: G): Unit = js.native
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
  @scala.inline
  implicit class VisitorOps[Self <: Visitor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBlackTarget(value: E => Unit): Self = this.set("blackTarget", js.Any.fromFunction1(value))
    @scala.inline
    def setDiscoverVertex(value: G => Unit): Self = this.set("discoverVertex", js.Any.fromFunction1(value))
    @scala.inline
    def setExamineEdge(value: E => Unit): Self = this.set("examineEdge", js.Any.fromFunction1(value))
    @scala.inline
    def setExamineVertex(value: G => Unit): Self = this.set("examineVertex", js.Any.fromFunction1(value))
    @scala.inline
    def setFinishVertex(value: G => Unit): Self = this.set("finishVertex", js.Any.fromFunction1(value))
    @scala.inline
    def setGrayTarget(value: E => Unit): Self = this.set("grayTarget", js.Any.fromFunction1(value))
    @scala.inline
    def setInitializeVertex(value: G => Unit): Self = this.set("initializeVertex", js.Any.fromFunction1(value))
    @scala.inline
    def setNonTreeEdge(value: E => Unit): Self = this.set("nonTreeEdge", js.Any.fromFunction1(value))
    @scala.inline
    def setStartVertex(value: G => Unit): Self = this.set("startVertex", js.Any.fromFunction1(value))
  }
  
}

