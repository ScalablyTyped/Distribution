package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.FromPoint
import typings.jointjs.anon.UseModelGeometry
import typings.jointjs.mod.dia.CellView.FlagLabel
import typings.jointjs.mod.dia.CellView.Options
import typings.jointjs.mod.dia.CellView.PresentationAttributes
import typings.jointjs.mod.dia.Link.EndJSON
import typings.jointjs.mod.g.Rect
import typings.jointjs.mod.mvc.View
import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.std.SVGElement
import typings.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia.CellViewGeneric")
@js.native
abstract class CellViewGeneric[T /* <: Cell */] () extends View[T] {
  def this(opt: Options[T]) = this()
  var initFlag: Double = js.native
  var paper: Paper | Null = js.native
  var presentationAttributes: PresentationAttributes = js.native
  def addTools(tools: ToolsView): this.type = js.native
  def can(feature: String): Boolean = js.native
  def checkMouseleave(evt: Event): Unit = js.native
  /* protected */ def contextmenu(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def customizeLinkEnd(end: EndJSON, magnet: SVGElement, x: Double, y: Double, link: Link, endType: LinkEnd): EndJSON = js.native
  def findBySelector(selector: String): JQuery[HTMLElement] = js.native
  def findBySelector(selector: String, root: String): JQuery[HTMLElement] = js.native
  def findBySelector(selector: String, root: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def findBySelector(selector: String, root: SVGElement): JQuery[HTMLElement] = js.native
  def findMagnet(el: String): js.UndefOr[SVGElement] = js.native
  def findMagnet(el: JQuery[HTMLElement]): js.UndefOr[SVGElement] = js.native
  def findMagnet(el: SVGElement): js.UndefOr[SVGElement] = js.native
  def getBBox(): Rect = js.native
  def getBBox(opt: UseModelGeometry): Rect = js.native
  def getEventTarget(evt: Event): Element = js.native
  def getEventTarget(evt: Event, opt: FromPoint): Element = js.native
  def getFlag(label: FlagLabel): Double = js.native
  /* protected */ def getLinkEnd(magnet: SVGElement, x: Double, y: Double, link: Link, endType: LinkEnd): EndJSON = js.native
  def getNodeBBox(node: SVGElement): Rect = js.native
  def getNodeBoundingRect(node: SVGElement): Rect = js.native
  def getNodeMatrix(node: SVGElement): SVGMatrix = js.native
  def getNodeUnrotatedBBox(node: SVGElement): Rect = js.native
  def getSelector(el: SVGElement): String = js.native
  def getSelector(el: SVGElement, prevSelector: String): String = js.native
  /* protected */ def hasFlag(flags: Double, label: FlagLabel): Boolean = js.native
  def hasTools(): Boolean = js.native
  def hasTools(name: String): Boolean = js.native
  def hideTools(): this.type = js.native
  def highlight(): this.type = js.native
  def highlight(el: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def highlight(el: String): this.type = js.native
  def highlight(el: String, opt: StringDictionary[js.Any]): this.type = js.native
  def highlight(el: JQuery[HTMLElement]): this.type = js.native
  def highlight(el: JQuery[HTMLElement], opt: StringDictionary[js.Any]): this.type = js.native
  def highlight(el: SVGElement): this.type = js.native
  def highlight(el: SVGElement, opt: StringDictionary[js.Any]): this.type = js.native
  def isNodeConnection(node: SVGElement): Boolean = js.native
  /* protected */ def mouseenter(evt: Event): Unit = js.native
  /* protected */ def mouseleave(evt: Event): Unit = js.native
  /* protected */ def mouseout(evt: Event): Unit = js.native
  /* protected */ def mouseover(evt: Event): Unit = js.native
  /* protected */ def mousewheel(evt: Event, x: Double, y: Double, delta: Double): Unit = js.native
  def notify(eventName: String, eventArguments: js.Any*): Unit = js.native
  /* protected */ def onToolEvent(eventName: String): Unit = js.native
  /* protected */ def onevent(evt: Event, eventName: String, x: Double, y: Double): Unit = js.native
  /* protected */ def onmagnet(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def pointerclick(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def pointerdblclick(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def pointerdown(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def pointermove(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def pointerup(evt: Event, x: Double, y: Double): Unit = js.native
  /* protected */ def removeFlag(flags: Double, label: FlagLabel): Double = js.native
  def removeTools(): this.type = js.native
  /* protected */ def setFlags(): Unit = js.native
  def showTools(): this.type = js.native
  def unhighlight(): this.type = js.native
  def unhighlight(el: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): this.type = js.native
  def unhighlight(el: String): this.type = js.native
  def unhighlight(el: String, opt: StringDictionary[js.Any]): this.type = js.native
  def unhighlight(el: JQuery[HTMLElement]): this.type = js.native
  def unhighlight(el: JQuery[HTMLElement], opt: StringDictionary[js.Any]): this.type = js.native
  def unhighlight(el: SVGElement): this.type = js.native
  def unhighlight(el: SVGElement, opt: StringDictionary[js.Any]): this.type = js.native
  def updateTools(): this.type = js.native
  def updateTools(opt: StringDictionary[js.Any]): this.type = js.native
}

/* static members */
@JSImport("jointjs", "dia.CellViewGeneric")
@js.native
object CellViewGeneric extends js.Object {
  def addPresentationAttributes(attributes: PresentationAttributes): PresentationAttributes = js.native
}

