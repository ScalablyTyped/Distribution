package typings
package jointjsLib.jointjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jointjs", "dia")
@js.native
object diaNs extends js.Object {
  @js.native
  class Cell ()
    extends backboneLib.backboneMod.Model {
    def this(attributes: jointjsLib.jointjsMod.diaNs.CellNs.Attributes) = this()
    def this(attributes: jointjsLib.jointjsMod.diaNs.CellNs.Attributes, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    var graph: Graph = js.native
    var id: java.lang.String | scala.Double = js.native
    def addTo(graph: Graph): this.type = js.native
    def addTo(graph: Graph, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options): this.type = js.native
    def attr(): js.Any = js.native
    def attr(key: java.lang.String): js.Any = js.native
    def attr(key: java.lang.String, value: js.Any): this.type = js.native
    def attr(key: java.lang.String, value: js.Any, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def attr(`object`: jointjsLib.jointjsMod.diaNs.CellNs.Selectors): this.type = js.native
    def attr(
      `object`: jointjsLib.jointjsMod.diaNs.CellNs.Selectors,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def clone(opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): Cell | js.Array[Cell] = js.native
    def embed(cell: Cell): this.type = js.native
    def embed(cell: Cell, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options): this.type = js.native
    def findView(paper: Paper): CellView = js.native
    def getAncestors(): js.Array[Cell] = js.native
    def getEmbeddedCells(): js.Array[Cell] = js.native
    def getEmbeddedCells(opt: jointjsLib.Anon_BreadthFirst): js.Array[Cell] = js.native
    def getParentCell(): Cell | scala.Null = js.native
    def getTransitions(): js.Array[java.lang.String] = js.native
    def isElement(): scala.Boolean = js.native
    def isEmbedded(): scala.Boolean = js.native
    def isEmbeddedIn(cell: Cell): scala.Boolean = js.native
    def isEmbeddedIn(cell: Cell, opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): scala.Boolean = js.native
    def isLink(): scala.Boolean = js.native
    def parent(): java.lang.String = js.native
    def parent(parentId: java.lang.String): this.type = js.native
    /**
      * @deprecated
      */
    /* protected */ def processPorts(): scala.Unit = js.native
    def prop(key: java.lang.String): js.Any = js.native
    def prop(key: java.lang.String, value: js.Any): this.type = js.native
    def prop(key: java.lang.String, value: js.Any, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def prop(key: js.Array[java.lang.String]): js.Any = js.native
    def prop(key: js.Array[java.lang.String], value: js.Any): this.type = js.native
    def prop(key: js.Array[java.lang.String], value: js.Any, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def prop(`object`: jointjsLib.jointjsMod.diaNs.CellNs.Attributes): this.type = js.native
    def prop(
      `object`: jointjsLib.jointjsMod.diaNs.CellNs.Attributes,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def remove(): this.type = js.native
    def remove(opt: jointjsLib.jointjsMod.diaNs.CellNs.DisconnectableOptions): this.type = js.native
    def removeAttr(path: java.lang.String): this.type = js.native
    def removeAttr(path: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removeAttr(path: js.Array[java.lang.String]): this.type = js.native
    def removeAttr(path: js.Array[java.lang.String], opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removeProp(path: java.lang.String): this.type = js.native
    def removeProp(path: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removeProp(path: js.Array[java.lang.String]): this.type = js.native
    def removeProp(path: js.Array[java.lang.String], opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def startBatch(name: java.lang.String): this.type = js.native
    def startBatch(name: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options): this.type = js.native
    def stopBatch(name: java.lang.String): this.type = js.native
    def stopBatch(name: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options): this.type = js.native
    def stopTransitions(): this.type = js.native
    def stopTransitions(path: java.lang.String): this.type = js.native
    def stopTransitions(path: java.lang.String, delim: java.lang.String): this.type = js.native
    def toBack(): this.type = js.native
    def toBack(opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): this.type = js.native
    def toFront(): this.type = js.native
    def toFront(opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): this.type = js.native
    def toJSON(): js.Any = js.native
    def transition(path: java.lang.String): scala.Double = js.native
    def transition(path: java.lang.String, value: js.Any): scala.Double = js.native
    def transition(path: java.lang.String, value: js.Any, opt: jointjsLib.jointjsMod.diaNs.CellNs.TransitionOptions): scala.Double = js.native
    def transition(
      path: java.lang.String,
      value: js.Any,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.TransitionOptions,
      delim: java.lang.String
    ): scala.Double = js.native
    def unembed(cell: Cell): this.type = js.native
    def unembed(cell: Cell, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options): this.type = js.native
  }
  
  @js.native
  class CellView () extends CellViewGeneric[Cell]
  
  @js.native
  abstract class CellViewGeneric[T /* <: Cell */] ()
    extends jointjsLib.jointjsMod.mvcNs.View[T] {
    def this(opt: jointjsLib.jointjsMod.diaNs.CellViewNs.Options[T]) = this()
    def addTools(tools: ToolsView): this.type = js.native
    def can(feature: java.lang.String): scala.Boolean = js.native
    /* protected */ def contextmenu(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    def findBySelector(selector: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
    def findBySelector(selector: java.lang.String, root: java.lang.String): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
    def findBySelector(selector: java.lang.String, root: jqueryLib.JQuery[stdLib.HTMLElement]): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
    def findBySelector(selector: java.lang.String, root: stdLib.SVGElement): jqueryLib.JQuery[stdLib.HTMLElement] = js.native
    def findMagnet(el: java.lang.String): js.UndefOr[stdLib.SVGElement] = js.native
    def findMagnet(el: jqueryLib.JQuery[stdLib.HTMLElement]): js.UndefOr[stdLib.SVGElement] = js.native
    def findMagnet(el: stdLib.SVGElement): js.UndefOr[stdLib.SVGElement] = js.native
    def getSelector(el: stdLib.SVGElement): java.lang.String = js.native
    def getSelector(el: stdLib.SVGElement, prevSelector: java.lang.String): java.lang.String = js.native
    def getStrokeBBox(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getStrokeBBox(el: stdLib.SVGElement): jointjsLib.jointjsMod.gNs.Rect = js.native
    def hasTools(): scala.Boolean = js.native
    def hasTools(name: java.lang.String): scala.Boolean = js.native
    def hideTools(): this.type = js.native
    def highlight(): this.type = js.native
    def highlight(el: java.lang.String): this.type = js.native
    def highlight(el: java.lang.String, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def highlight(el: jqueryLib.JQuery[stdLib.HTMLElement]): this.type = js.native
    def highlight(el: jqueryLib.JQuery[stdLib.HTMLElement], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def highlight(el: stdLib.SVGElement): this.type = js.native
    def highlight(el: stdLib.SVGElement, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    /* protected */ def mouseenter(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseleave(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseout(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseover(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mousewheel(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double, delta: scala.Double): scala.Unit = js.native
    def notify(eventName: java.lang.String, eventArguments: js.Any*): scala.Unit = js.native
    /* protected */ def onToolEvent(eventName: java.lang.String): scala.Unit = js.native
    /* protected */ def onevent(evt: jqueryLib.JQueryNs.Event, eventName: java.lang.String, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def onmagnet(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def pointerclick(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def pointerdblclick(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def pointerdown(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def pointermove(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def pointerup(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    def removeTools(): this.type = js.native
    def showTools(): this.type = js.native
    def unhighlight(): this.type = js.native
    def unhighlight(el: java.lang.String): this.type = js.native
    def unhighlight(el: java.lang.String, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def unhighlight(el: jqueryLib.JQuery[stdLib.HTMLElement]): this.type = js.native
    def unhighlight(el: jqueryLib.JQuery[stdLib.HTMLElement], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def unhighlight(el: stdLib.SVGElement): this.type = js.native
    def unhighlight(el: stdLib.SVGElement, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def updateTools(): this.type = js.native
    def updateTools(opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  }
  
  @js.native
  class Element () extends Cell {
    def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.Attributes) = this()
    def this(attributes: jointjsLib.jointjsMod.diaNs.ElementNs.Attributes, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    def addPort(port: jointjsLib.jointjsMod.diaNs.ElementNs.Port): this.type = js.native
    def addPort(port: jointjsLib.jointjsMod.diaNs.ElementNs.Port, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def addPorts(ports: js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port]): this.type = js.native
    def addPorts(
      ports: js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port],
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def angle(): scala.Double = js.native
    def fitEmbeds(): this.type = js.native
    def fitEmbeds(opt: jointjsLib.Anon_DeepPadding): this.type = js.native
    def getBBox(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getBBox(opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getPort(id: java.lang.String): jointjsLib.jointjsMod.diaNs.ElementNs.Port = js.native
    def getPortIndex(port: java.lang.String): scala.Double = js.native
    def getPortIndex(port: jointjsLib.jointjsMod.diaNs.ElementNs.Port): scala.Double = js.native
    def getPorts(): js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port] = js.native
    def getPortsPositions(groupName: java.lang.String): org.scalablytyped.runtime.StringDictionary[jointjsLib.jointjsMod.diaNs.ElementNs.PortPosition] = js.native
    def hasPort(id: java.lang.String): scala.Boolean = js.native
    def hasPorts(): scala.Boolean = js.native
    def portProp(portId: java.lang.String, path: js.Any): Element = js.native
    def portProp(portId: java.lang.String, path: js.Any, value: js.Any): Element = js.native
    def portProp(
      portId: java.lang.String,
      path: js.Any,
      value: js.Any,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): Element = js.native
    def position(): jointjsLib.jointjsMod.gNs.Point = js.native
    def position(opt: jointjsLib.Anon_Key): jointjsLib.jointjsMod.gNs.Point = js.native
    def position(x: scala.Double, y: scala.Double): this.type = js.native
    def position(x: scala.Double, y: scala.Double, opt: jointjsLib.Anon_Deep): this.type = js.native
    def removePort(port: java.lang.String): this.type = js.native
    def removePort(port: java.lang.String, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removePort(port: jointjsLib.jointjsMod.diaNs.ElementNs.Port): this.type = js.native
    def removePort(port: jointjsLib.jointjsMod.diaNs.ElementNs.Port, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removePorts(): this.type = js.native
    def removePorts(opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def removePorts(ports: js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port | java.lang.String]): this.type = js.native
    def removePorts(
      ports: js.Array[jointjsLib.jointjsMod.diaNs.ElementNs.Port | java.lang.String],
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def resize(width: scala.Double, height: scala.Double): this.type = js.native
    def resize(width: scala.Double, height: scala.Double, opt: jointjsLib.Anon_Direction): this.type = js.native
    def rotate(deg: scala.Double): this.type = js.native
    def rotate(deg: scala.Double, absolute: scala.Boolean): this.type = js.native
    def rotate(deg: scala.Double, absolute: scala.Boolean, origin: Point): this.type = js.native
    def rotate(
      deg: scala.Double,
      absolute: scala.Boolean,
      origin: Point,
      opt: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): this.type = js.native
    def scale(scaleX: scala.Double, scaleY: scala.Double): this.type = js.native
    def scale(scaleX: scala.Double, scaleY: scala.Double, origin: Point): this.type = js.native
    def scale(
      scaleX: scala.Double,
      scaleY: scala.Double,
      origin: Point,
      opt: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): this.type = js.native
    def size(): Size = js.native
    def size(width: scala.Double): this.type = js.native
    def size(width: scala.Double, height: scala.Double): this.type = js.native
    def size(width: scala.Double, height: scala.Double, opt: jointjsLib.Anon_Direction): this.type = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double, opt: jointjsLib.jointjsMod.diaNs.ElementNs.TranslateOptions): this.type = js.native
  }
  
  @js.native
  class ElementView () extends CellViewGeneric[Element] {
    /* protected */ def addLinkFromMagnet(magnet: stdLib.SVGElement, x: scala.Double, y: scala.Double): LinkView = js.native
    /* protected */ def drag(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragLinkStart(evt: jqueryLib.JQueryNs.Event, magnet: stdLib.SVGElement, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragMagnet(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragMagnetEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragMagnetStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    def getBBox(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getBBox(opt: jointjsLib.Anon_UseModelGeometry): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getDelegatedView(): ElementView | scala.Null = js.native
    def getNodeBBox(magnet: stdLib.SVGElement): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getNodeUnrotatedBBox(magnet: stdLib.SVGElement): jointjsLib.jointjsMod.gNs.Rect = js.native
    /* protected */ def renderJSONMarkup(markup: MarkupJSON): scala.Unit = js.native
    /* protected */ def renderMarkup(): scala.Unit = js.native
    /* protected */ def renderStringMarkup(markup: java.lang.String): scala.Unit = js.native
    def setInteractivity(value: jointjsLib.jointjsMod.diaNs.ElementViewNs.InteractivityOptions): scala.Unit = js.native
    def setInteractivity(value: scala.Boolean): scala.Unit = js.native
    def update(element: Element): scala.Unit = js.native
    def update(element: Element, renderingOnlyAttrs: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  }
  
  @js.native
  class Graph ()
    extends backboneLib.backboneMod.Model {
    def this(attributes: js.Any) = this()
    def this(attributes: js.Any, opt: jointjsLib.Anon_CellModel) = this()
    def addCell(cell: Cell): this.type = js.native
    def addCell(cell: Cell, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def addCell(cell: js.Array[Cell]): this.type = js.native
    def addCell(cell: js.Array[Cell], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def addCells(cells: js.Array[Cell]): this.type = js.native
    def addCells(cells: js.Array[Cell], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def bfs(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean]
    ): scala.Unit = js.native
    def bfs(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean],
      opt: jointjsLib.jointjsMod.diaNs.GraphNs.ConnectionOptions
    ): scala.Unit = js.native
    def clear(): this.type = js.native
    def clear(opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def cloneCells(cells: js.Array[Cell]): org.scalablytyped.runtime.StringDictionary[Cell] = js.native
    def cloneSubgraph(cells: js.Array[Cell]): org.scalablytyped.runtime.StringDictionary[Cell] = js.native
    def cloneSubgraph(cells: js.Array[Cell], opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): org.scalablytyped.runtime.StringDictionary[Cell] = js.native
    def dfs(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean]
    ): scala.Unit = js.native
    def dfs(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean],
      opt: jointjsLib.jointjsMod.diaNs.GraphNs.ConnectionOptions
    ): scala.Unit = js.native
    def disconnectLinks(cell: Cell): scala.Unit = js.native
    def disconnectLinks(cell: Cell, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def findModelsFromPoint(p: Point): js.Array[Element] = js.native
    def findModelsInArea(rect: BBox): js.Array[Element] = js.native
    def findModelsInArea(rect: BBox, opt: jointjsLib.Anon_Strict): js.Array[Element] = js.native
    def findModelsUnderElement(element: Element): js.Array[Element] = js.native
    def findModelsUnderElement(element: Element, opt: jointjsLib.Anon_Bbox): js.Array[Element] = js.native
    def fromGraphLib(glGraph: js.Any): this.type = js.native
    def fromGraphLib(glGraph: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def fromJSON(json: js.Any): this.type = js.native
    def fromJSON(json: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def getBBox(): jointjsLib.jointjsMod.gNs.Rect | scala.Null = js.native
    def getBBox(cells: js.Array[Cell]): jointjsLib.jointjsMod.gNs.Rect | scala.Null = js.native
    def getBBox(cells: js.Array[Cell], opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): jointjsLib.jointjsMod.gNs.Rect | scala.Null = js.native
    def getCell(id: java.lang.String): Cell = js.native
    def getCell(id: Cell): Cell = js.native
    def getCell(id: scala.Double): Cell = js.native
    def getCells(): js.Array[Cell] = js.native
    def getCellsBBox(cells: js.Array[Cell]): jointjsLib.jointjsMod.gNs.Rect | scala.Null = js.native
    def getCellsBBox(cells: js.Array[Cell], opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): jointjsLib.jointjsMod.gNs.Rect | scala.Null = js.native
    def getCommonAncestor(cells: Cell*): js.UndefOr[Element] = js.native
    def getConnectedLinks(cell: Cell): js.Array[Link] = js.native
    def getConnectedLinks(cell: Cell, opt: jointjsLib.jointjsMod.diaNs.GraphNs.ConnectionOptions): js.Array[Link] = js.native
    def getElements(): js.Array[Element] = js.native
    def getFirstCell(): js.UndefOr[Cell] = js.native
    def getLastCell(): js.UndefOr[Cell] = js.native
    def getLinks(): js.Array[Link] = js.native
    def getNeighbors(element: Element): js.Array[Element] = js.native
    def getNeighbors(element: Element, opt: jointjsLib.jointjsMod.diaNs.GraphNs.ConnectionOptions): js.Array[Element] = js.native
    def getPredecessors(element: Element): js.Array[Element] = js.native
    def getPredecessors(element: Element, opt: jointjsLib.jointjsMod.diaNs.GraphNs.ExploreOptions): js.Array[Element] = js.native
    def getSinks(): js.Array[Element] = js.native
    def getSources(): js.Array[Element] = js.native
    def getSubgraph(cells: js.Array[Cell]): js.Array[Cell] = js.native
    def getSubgraph(cells: js.Array[Cell], opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): js.Array[Cell] = js.native
    def getSuccessors(element: Element): js.Array[Element] = js.native
    def getSuccessors(element: Element, opt: jointjsLib.jointjsMod.diaNs.GraphNs.ExploreOptions): js.Array[Element] = js.native
    def hasActiveBatch(): scala.Boolean = js.native
    def hasActiveBatch(name: java.lang.String): scala.Boolean = js.native
    def hasActiveBatch(name: js.Array[java.lang.String]): scala.Boolean = js.native
    def isNeighbor(elementA: Element, elementB: Element): scala.Boolean = js.native
    def isNeighbor(elementA: Element, elementB: Element, opt: jointjsLib.jointjsMod.diaNs.GraphNs.ConnectionOptions): scala.Boolean = js.native
    def isPredecessor(elementA: Element, elementB: Element): scala.Boolean = js.native
    def isSink(element: Element): scala.Boolean = js.native
    def isSource(element: Element): scala.Boolean = js.native
    def isSuccessor(elementA: Element, elementB: Element): scala.Boolean = js.native
    def maxZIndex(): scala.Double = js.native
    def minZIndex(): scala.Double = js.native
    def removeCells(cells: js.Array[Cell]): this.type = js.native
    def removeCells(cells: js.Array[Cell], opt: jointjsLib.jointjsMod.diaNs.CellNs.DisconnectableOptions): this.type = js.native
    def removeLinks(cell: Cell): scala.Unit = js.native
    def removeLinks(cell: Cell, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def resetCells(cells: js.Array[Cell]): this.type = js.native
    def resetCells(cells: js.Array[Cell], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def resize(width: scala.Double, height: scala.Double): this.type = js.native
    def resize(width: scala.Double, height: scala.Double, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def resizeCells(width: scala.Double, height: scala.Double, cells: js.Array[Cell]): this.type = js.native
    def resizeCells(
      width: scala.Double,
      height: scala.Double,
      cells: js.Array[Cell],
      opt: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): this.type = js.native
    def search(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean]
    ): scala.Unit = js.native
    def search(
      element: Element,
      iteratee: js.Function2[/* element */ Element, /* distance */ scala.Double, scala.Boolean],
      opt: jointjsLib.jointjsMod.diaNs.GraphNs.ExploreOptions
    ): scala.Unit = js.native
    def startBatch(name: java.lang.String): this.type = js.native
    def startBatch(name: java.lang.String, data: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def stopBatch(name: java.lang.String): this.type = js.native
    def stopBatch(name: java.lang.String, data: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
    def toGraphLib(): js.Any = js.native
    def toGraphLib(opt: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Any = js.native
    def toJSON(): js.Any = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double, opt: jointjsLib.jointjsMod.diaNs.ElementNs.TranslateOptions): this.type = js.native
  }
  
  @js.native
   // default label props
  class Link () extends Cell {
    def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.Attributes) = this()
    def this(attributes: jointjsLib.jointjsMod.diaNs.LinkNs.Attributes, opt: jointjsLib.jointjsMod.diaNs.GraphNs.Options) = this()
    var arrowHeadMarkup: java.lang.String = js.native
    var doubleToolMarkup: js.UndefOr[java.lang.String] = js.native
    var labelMarkup: js.UndefOr[java.lang.String] = js.native
     // default label markup
    var labelProps: js.UndefOr[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    var markup: java.lang.String = js.native
    var toolMarkup: java.lang.String = js.native
    var vertexMarkup: java.lang.String = js.native
    def appendLabel(label: jointjsLib.jointjsMod.diaNs.LinkNs.Label): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def appendLabel(label: jointjsLib.jointjsMod.diaNs.LinkNs.Label, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def applyToPoints(fn: js.Function1[/* p */ Point, Point]): this.type = js.native
    def applyToPoints(fn: js.Function1[/* p */ Point, Point], opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def connector(): jointjsLib.jointjsMod.connectorsNs.Connector | jointjsLib.jointjsMod.connectorsNs.ConnectorJSON | scala.Null = js.native
    def connector(connector: jointjsLib.jointjsMod.connectorsNs.Connector): this.type = js.native
    def connector(connector: jointjsLib.jointjsMod.connectorsNs.ConnectorJSON): this.type = js.native
    def connector(
      connector: jointjsLib.jointjsMod.connectorsNs.ConnectorJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def connector(
      connector: jointjsLib.jointjsMod.connectorsNs.Connector,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def connector(name: jointjsLib.jointjsMod.connectorsNs.ConnectorType): this.type = js.native
    def connector(
      name: jointjsLib.jointjsMod.connectorsNs.ConnectorType,
      args: jointjsLib.jointjsMod.connectorsNs.ConnectorArguments
    ): this.type = js.native
    def connector(
      name: jointjsLib.jointjsMod.connectorsNs.ConnectorType,
      args: jointjsLib.jointjsMod.connectorsNs.ConnectorArguments,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def disconnect(): this.type = js.native
    def getRelationshipAncestor(): js.UndefOr[Element] = js.native
    def getSourceElement(): scala.Null | Element = js.native
    def getTargetElement(): scala.Null | Element = js.native
    def hasLoop(): scala.Boolean = js.native
    def hasLoop(opt: jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions): scala.Boolean = js.native
    def insertLabel(index: scala.Double, label: jointjsLib.jointjsMod.diaNs.LinkNs.Label): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def insertLabel(
      index: scala.Double,
      label: jointjsLib.jointjsMod.diaNs.LinkNs.Label,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def insertVertex(index: scala.Double, vertex: jointjsLib.jointjsMod.diaNs.LinkNs.Vertex): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def insertVertex(
      index: scala.Double,
      vertex: jointjsLib.jointjsMod.diaNs.LinkNs.Vertex,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def isRelationshipEmbeddedIn(cell: Cell): scala.Boolean = js.native
    def label(): jointjsLib.jointjsMod.diaNs.LinkNs.Label = js.native
    def label(index: scala.Double): jointjsLib.jointjsMod.diaNs.LinkNs.Label = js.native
    def label(index: scala.Double, label: jointjsLib.jointjsMod.diaNs.LinkNs.Label): this.type = js.native
    def label(
      index: scala.Double,
      label: jointjsLib.jointjsMod.diaNs.LinkNs.Label,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def labels(): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def labels(labels: js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label]): this.type = js.native
    def removeLabel(): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def removeLabel(index: scala.Double): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def removeLabel(index: scala.Double, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label] = js.native
    def removeVertex(): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def removeVertex(index: scala.Double): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def removeVertex(index: scala.Double, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def reparent(): Element = js.native
    def reparent(opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): Element = js.native
    def router(): jointjsLib.jointjsMod.routersNs.Router | jointjsLib.jointjsMod.routersNs.RouterJSON | scala.Null = js.native
    def router(name: jointjsLib.jointjsMod.routersNs.RouterType): this.type = js.native
    def router(
      name: jointjsLib.jointjsMod.routersNs.RouterType,
      args: jointjsLib.jointjsMod.routersNs.RouterArguments
    ): this.type = js.native
    def router(
      name: jointjsLib.jointjsMod.routersNs.RouterType,
      args: jointjsLib.jointjsMod.routersNs.RouterArguments,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def router(router: jointjsLib.jointjsMod.routersNs.Router): this.type = js.native
    def router(router: jointjsLib.jointjsMod.routersNs.RouterJSON): this.type = js.native
    def router(
      router: jointjsLib.jointjsMod.routersNs.RouterJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def router(router: jointjsLib.jointjsMod.routersNs.Router, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: Point): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, origin: Point, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def source(): jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON | jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON = js.native
    def source(source: Cell): this.type = js.native
    def source(source: Cell, args: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellArgs): this.type = js.native
    def source(
      source: Cell,
      args: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellArgs,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def source(source: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON): this.type = js.native
    def source(
      source: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def source(source: jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON): this.type = js.native
    def source(
      source: jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def target(): jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON | jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON = js.native
    def target(target: Cell): this.type = js.native
    def target(target: Cell, args: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellArgs): this.type = js.native
    def target(
      target: Cell,
      args: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellArgs,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def target(target: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON): this.type = js.native
    def target(
      target: jointjsLib.jointjsMod.diaNs.LinkNs.EndCellJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def target(target: jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON): this.type = js.native
    def target(
      target: jointjsLib.jointjsMod.diaNs.LinkNs.EndPointJSON,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double, opt: jointjsLib.jointjsMod.diaNs.CellNs.Options): this.type = js.native
    def vertex(): jointjsLib.jointjsMod.diaNs.LinkNs.Vertex = js.native
    def vertex(index: scala.Double): jointjsLib.jointjsMod.diaNs.LinkNs.Vertex = js.native
    def vertex(index: scala.Double, vertex: jointjsLib.jointjsMod.diaNs.LinkNs.Vertex): this.type = js.native
    def vertex(
      index: scala.Double,
      vertex: jointjsLib.jointjsMod.diaNs.LinkNs.Vertex,
      opt: jointjsLib.jointjsMod.diaNs.CellNs.Options
    ): this.type = js.native
    def vertices(): js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex] = js.native
    def vertices(vertices: js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Vertex]): this.type = js.native
  }
  
  @js.native
  class LinkView () extends CellViewGeneric[Link] {
    var options: jointjsLib.Anon_DoubleLinkTools = js.native
    def addLabel(coordinates: Point): scala.Double = js.native
    def addLabel(coordinates: Point, opt: jointjsLib.jointjsMod.diaNs.LinkViewNs.LabelOptions): scala.Double = js.native
    def addLabel(x: scala.Double, y: scala.Double): scala.Double = js.native
    def addLabel(x: scala.Double, y: scala.Double, opt: jointjsLib.jointjsMod.diaNs.LinkViewNs.LabelOptions): scala.Double = js.native
    def addVertex(coordinates: Point): scala.Double = js.native
    def addVertex(coordinates: Point, opt: jointjsLib.jointjsMod.diaNs.LinkViewNs.VertexOptions): scala.Double = js.native
    def addVertex(x: scala.Double, y: scala.Double): scala.Double = js.native
    def addVertex(x: scala.Double, y: scala.Double, opt: jointjsLib.jointjsMod.diaNs.LinkViewNs.VertexOptions): scala.Double = js.native
    /* protected */ def drag(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragArrowhead(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragArrowheadEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragArrowheadStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragConnection(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragConnectionEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragConnectionStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragLabel(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragLabelEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragLabelStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragVertex(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragVertexEnd(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    /* protected */ def dragVertexStart(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    def getClosestPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def getClosestPointLength(point: Point): scala.Double = js.native
    def getClosestPointRatio(point: Point): scala.Double = js.native
    def getConnection(): jointjsLib.jointjsMod.gNs.Path = js.native
    def getConnectionLength(): scala.Double = js.native
    def getConnectionSubdivisions(): js.Array[js.Array[jointjsLib.jointjsMod.gNs.Curve]] = js.native
    def getLabelCoordinates(labelPosition: jointjsLib.jointjsMod.diaNs.LinkNs.LabelPosition): jointjsLib.jointjsMod.gNs.Point = js.native
    def getLabelPosition(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.diaNs.LinkNs.LabelPosition = js.native
    def getLabelPosition(x: scala.Double, y: scala.Double, opt: jointjsLib.jointjsMod.diaNs.LinkViewNs.LabelOptions): jointjsLib.jointjsMod.diaNs.LinkNs.LabelPosition = js.native
    def getPointAtLength(length: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def getPointAtRatio(ratio: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def getSerializedConnection(): java.lang.String = js.native
    def getTangentAtLength(length: scala.Double): jointjsLib.jointjsMod.gNs.Line = js.native
    def getTangentAtRatio(ratio: scala.Double): jointjsLib.jointjsMod.gNs.Line = js.native
    def getVertexIndex(point: Point): scala.Double = js.native
    def getVertexIndex(x: scala.Double, y: scala.Double): scala.Double = js.native
    /* protected */ def onLabelsChange(
      link: Link,
      labels: js.Array[jointjsLib.jointjsMod.diaNs.LinkNs.Label],
      opt: org.scalablytyped.runtime.StringDictionary[js.Any]
    ): scala.Unit = js.native
    /* protected */ def onSourceChange(element: Element, sourceEnd: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    /* protected */ def onTargetChange(element: Element, targetEnd: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    /* protected */ def onToolsChange(link: Link, toolsMarkup: java.lang.String, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    /* protected */ def onVerticesChange(link: Link, vertices: js.Array[Point], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    /* protected */ def onlabel(evt: jqueryLib.JQueryNs.Event, x: scala.Double, y: scala.Double): scala.Unit = js.native
    def sendToken(token: stdLib.SVGElement): scala.Unit = js.native
    def sendToken(token: stdLib.SVGElement, duration: scala.Double): scala.Unit = js.native
    def sendToken(token: stdLib.SVGElement, duration: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def sendToken(token: stdLib.SVGElement, opt: jointjsLib.Anon_Connection): scala.Unit = js.native
    def sendToken(token: stdLib.SVGElement, opt: jointjsLib.Anon_Connection, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def setInteractivity(value: jointjsLib.jointjsMod.diaNs.LinkViewNs.InteractivityOptions): scala.Unit = js.native
    def setInteractivity(value: scala.Boolean): scala.Unit = js.native
    def update(link: Link, attributes: js.Any): this.type = js.native
    def update(link: Link, attributes: js.Any, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): this.type = js.native
  }
  
  trait MarkupNodeJSON extends js.Object {
    var attributes: js.UndefOr[jointjsLib.jointjsMod.attributesNs.NativeSVGAttributes] = js.undefined
    var children: js.UndefOr[MarkupJSON] = js.undefined
    var className: js.UndefOr[java.lang.String] = js.undefined
    var groupSelector: js.UndefOr[java.lang.String] = js.undefined
    var namespaceUri: js.UndefOr[java.lang.String] = js.undefined
    var selector: js.UndefOr[java.lang.String] = js.undefined
    var style: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
    var tagName: java.lang.String
    var textContent: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait PaddingJSON extends js.Object {
    var bottom: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var right: js.UndefOr[scala.Double] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class Paper protected ()
    extends jointjsLib.jointjsMod.mvcNs.View[Graph] {
    def this(opt: jointjsLib.jointjsMod.diaNs.PaperNs.Options) = this()
    var defs: stdLib.SVGDefsElement = js.native
    var options: jointjsLib.jointjsMod.diaNs.PaperNs.Options = js.native
    var svg: stdLib.SVGElement = js.native
    var viewport: stdLib.SVGGElement = js.native
    /* protected */ def afterRenderViews(): scala.Unit = js.native
    /* protected */ def asyncRenderViews(cells: js.Array[Cell]): scala.Unit = js.native
    /* protected */ def asyncRenderViews(cells: js.Array[Cell], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    /* protected */ def beforeRenderViews(cells: js.Array[Cell]): js.Array[Cell] = js.native
    def cancelRenderViews(): scala.Unit = js.native
    def clearGrid(): this.type = js.native
    def clientMatrix(): stdLib.SVGMatrix = js.native
    def clientOffset(): jointjsLib.jointjsMod.gNs.Point = js.native
    def clientToLocalPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def clientToLocalPoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def clientToLocalRect(rect: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def clientToLocalRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    /* protected */ def cloneOptions(): jointjsLib.jointjsMod.diaNs.PaperNs.Options = js.native
    /* protected */ def contextmenu(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def createViewForModel(cell: Cell): CellView = js.native
    def defineFilter(filter: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
    def defineGradient(gradient: jointjsLib.jointjsMod.diaNs.PaperNs.GradientOptions): java.lang.String = js.native
    def defineMarker(marker: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String = js.native
    def drawBackground(): this.type = js.native
    def drawBackground(opt: jointjsLib.jointjsMod.diaNs.PaperNs.BackgroundOptions): this.type = js.native
    /* protected */ def drawBackgroundImage(img: stdLib.HTMLImageElement, opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def drawGrid(): this.type = js.native
    def drawGrid(opt: jointjsLib.jointjsMod.diaNs.PaperNs.GridOptions): this.type = js.native
    def drawGrid(opt: js.Array[jointjsLib.jointjsMod.diaNs.PaperNs.GridOptions]): this.type = js.native
    def findView[T /* <: ElementView | LinkView */](element: java.lang.String): T = js.native
    def findView[T /* <: ElementView | LinkView */](element: jqueryLib.JQuery[stdLib.HTMLElement]): T = js.native
    def findView[T /* <: ElementView | LinkView */](element: stdLib.SVGElement): T = js.native
    def findViewByModel[T /* <: ElementView | LinkView */](model: java.lang.String): T = js.native
    def findViewByModel[T /* <: ElementView | LinkView */](model: Cell): T = js.native
    def findViewByModel[T /* <: ElementView | LinkView */](model: scala.Double): T = js.native
    def findViewsFromPoint(point: java.lang.String): js.Array[ElementView] = js.native
    def findViewsFromPoint(point: Point): js.Array[ElementView] = js.native
    def findViewsInArea(rect: BBox): js.Array[ElementView] = js.native
    def findViewsInArea(rect: BBox, opt: jointjsLib.Anon_Strict): js.Array[ElementView] = js.native
    def fitToContent(): scala.Unit = js.native
    def fitToContent(gridWidth: scala.Double): scala.Unit = js.native
    def fitToContent(gridWidth: scala.Double, gridHeight: scala.Double): scala.Unit = js.native
    def fitToContent(gridWidth: scala.Double, gridHeight: scala.Double, padding: scala.Double): scala.Unit = js.native
    def fitToContent(gridWidth: scala.Double, gridHeight: scala.Double, padding: scala.Double, opt: js.Any): scala.Unit = js.native
    def fitToContent(opt: jointjsLib.jointjsMod.diaNs.PaperNs.FitToContentOptions): scala.Unit = js.native
    def getArea(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getComputedSize(): Size = js.native
    def getContentArea(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getContentBBox(): jointjsLib.jointjsMod.gNs.Rect = js.native
    def getDefaultLink(cellView: CellView, magnet: stdLib.SVGElement): Link = js.native
    def getModelById(id: java.lang.String): Cell = js.native
    def getModelById(id: Cell): Cell = js.native
    def getModelById(id: scala.Double): Cell = js.native
    def getRestrictedArea(): js.UndefOr[jointjsLib.jointjsMod.gNs.Rect] = js.native
    /* protected */ def guard(evt: jqueryLib.JQueryNs.Event, view: CellView): scala.Boolean = js.native
    def hideTools(): this.type = js.native
    def isDefined(defId: java.lang.String): scala.Boolean = js.native
    def localToClientPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToClientPoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToClientRect(rect: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def localToClientRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    def localToPagePoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToPagePoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToPageRect(rect: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def localToPageRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    def localToPaperPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToPaperPoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def localToPaperRect(rect: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def localToPaperRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    def matrix(): stdLib.SVGMatrix = js.native
    def matrix(ctm: jointjsLib.jointjsMod.VectorizerNs.Matrix): this.type = js.native
    def matrix(ctm: stdLib.SVGMatrix): this.type = js.native
    /* protected */ def mouseenter(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseleave(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseout(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mouseover(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def mousewheel(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def onCellAdded(cell: Cell, graph: Graph, opt: jointjsLib.Anon_Async): scala.Unit = js.native
    /* protected */ def onCellHighlight(cellView: CellView, magnetEl: stdLib.SVGElement): scala.Unit = js.native
    /* protected */ def onCellHighlight(cellView: CellView, magnetEl: stdLib.SVGElement, opt: jointjsLib.Anon_Highlighter): scala.Unit = js.native
    /* protected */ def onCellUnhighlight(cellView: CellView, magnetEl: stdLib.SVGElement): scala.Unit = js.native
    /* protected */ def onCellUnhighlight(cellView: CellView, magnetEl: stdLib.SVGElement, opt: jointjsLib.Anon_Highlighter): scala.Unit = js.native
    /* protected */ def onevent(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def onlabel(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def onmagnet(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    def pageOffset(): jointjsLib.jointjsMod.gNs.Point = js.native
    def pageToLocalPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def pageToLocalPoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def pageToLocalRect(rect: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def pageToLocalRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    def paperToLocalPoint(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def paperToLocalPoint(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    def paperToLocalRect(x: BBox): jointjsLib.jointjsMod.gNs.Rect = js.native
    def paperToLocalRect(x: scala.Double, y: scala.Double, width: scala.Double, height: scala.Double): jointjsLib.jointjsMod.gNs.Rect = js.native
    /* protected */ def pointerclick(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    // protected
    /* protected */ def pointerdblclick(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def pointerdown(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def pointermove(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    /* protected */ def pointerup(evt: jqueryLib.JQueryNs.Event): scala.Unit = js.native
    // tools
    def removeTools(): this.type = js.native
    /* protected */ def removeView(cell: Cell): CellView = js.native
    /* protected */ def removeViews(): scala.Unit = js.native
    /* protected */ def renderView(cell: Cell): CellView = js.native
    /* protected */ def resetViews(cellsCollection: js.Array[Cell], opt: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
    def scale(): jointjsLib.jointjsMod.VectorizerNs.Scale = js.native
    def scale(sx: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, ox: scala.Double): this.type = js.native
    def scale(sx: scala.Double, sy: scala.Double, ox: scala.Double, oy: scala.Double): this.type = js.native
    def scaleContentToFit(): scala.Unit = js.native
    def scaleContentToFit(opt: jointjsLib.jointjsMod.diaNs.PaperNs.ScaleContentOptions): scala.Unit = js.native
    def setDimensions(
      width: jointjsLib.jointjsMod.diaNs.PaperNs.Dimension,
      height: jointjsLib.jointjsMod.diaNs.PaperNs.Dimension
    ): scala.Unit = js.native
    def setGridSize(gridSize: scala.Double): this.type = js.native
    def setInteractivity(value: js.Any): scala.Unit = js.native
    def setOrigin(x: scala.Double, y: scala.Double): this.type = js.native
    def showTools(): this.type = js.native
    def snapToGrid(point: Point): jointjsLib.jointjsMod.gNs.Point = js.native
    def snapToGrid(x: scala.Double, y: scala.Double): jointjsLib.jointjsMod.gNs.Point = js.native
    /* protected */ def sortViews(): scala.Unit = js.native
    def translate(): jointjsLib.jointjsMod.VectorizerNs.Translation = js.native
    def translate(tx: scala.Double): this.type = js.native
    def translate(tx: scala.Double, ty: scala.Double): this.type = js.native
    def update(): this.type = js.native
    /* protected */ def updateBackgroundColor(color: java.lang.String): scala.Unit = js.native
    /* protected */ def updateBackgroundImage(opt: jointjsLib.Anon_Position): scala.Unit = js.native
  }
  
  trait SidesJSON extends js.Object {
    var bottom: js.UndefOr[scala.Double] = js.undefined
    var horizontal: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var right: js.UndefOr[scala.Double] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
    var vertical: js.UndefOr[scala.Double] = js.undefined
  }
  
  @js.native
  class ToolView ()
    extends jointjsLib.jointjsMod.mvcNs.View[js.UndefOr[scala.Nothing]] {
    def this(opt: jointjsLib.jointjsMod.diaNs.ToolViewNs.Options) = this()
    var name: java.lang.String | scala.Null = js.native
    var paper: Paper = js.native
    var parentView: ToolsView = js.native
    var relatedView: CellView = js.native
    def blur(): scala.Unit = js.native
    def configure(): this.type = js.native
    def configure(opt: jointjsLib.jointjsMod.diaNs.ToolViewNs.Options): this.type = js.native
    def focus(): scala.Unit = js.native
    def hide(): scala.Unit = js.native
    def isVisible(): scala.Boolean = js.native
    def show(): scala.Unit = js.native
    def update(): scala.Unit = js.native
  }
  
  @js.native
  class ToolsView ()
    extends jointjsLib.jointjsMod.mvcNs.View[js.UndefOr[scala.Nothing]] {
    def this(opt: jointjsLib.jointjsMod.diaNs.ToolsViewNs.Options) = this()
    var options: jointjsLib.jointjsMod.diaNs.ToolsViewNs.Options = js.native
    def blurTool(tool: ToolView): this.type = js.native
    def configure(): this.type = js.native
    def configure(opt: jointjsLib.jointjsMod.diaNs.ToolsViewNs.Options): this.type = js.native
    def focusTool(tool: ToolView): this.type = js.native
    def getName(): java.lang.String | scala.Null = js.native
    def hide(): this.type = js.native
    def mount(): this.type = js.native
    def show(): this.type = js.native
    /* protected */ def simulateRelatedView(el: stdLib.SVGElement): scala.Unit = js.native
  }
  
  /* static members */
  @js.native
  object Cell extends js.Object {
    def define(`type`: java.lang.String): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Cell] = js.native
    def define(`type`: java.lang.String, defaults: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Cell] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Cell] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Cell] = js.native
  }
  
  @JSName("Cell")
  @js.native
  object CellNs extends js.Object {
    trait Attributes extends GenericAttributes[Selectors]
    
    @js.native
    trait Constructor[T /* <: backboneLib.backboneMod.Model */]
      extends org.scalablytyped.runtime.Instantiable0[T]
         with org.scalablytyped.runtime.Instantiable1[/* opt */ jointjsLib.Anon_Id, T]
    
    trait DisconnectableOptions extends js.Object {
      var disconnectLinks: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait EmbeddableOptions extends Options {
      var deep: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait GenericAttributes[T]
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      var attrs: js.UndefOr[T] = js.undefined
      var z: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait Options
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
    
    trait Selectors
      extends /* selector */ org.scalablytyped.runtime.StringDictionary[js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes]]
    
    trait TransitionOptions extends Options {
      var delay: js.UndefOr[scala.Double] = js.undefined
      var duration: js.UndefOr[scala.Double] = js.undefined
      var timingFunction: js.UndefOr[jointjsLib.jointjsMod.utilNs.timingNs.TimingFunction] = js.undefined
      var valueFunction: js.UndefOr[jointjsLib.jointjsMod.utilNs.interpolateNs.InterpolateFunction[_]] = js.undefined
    }
    
  }
  
  /* static members */
  @js.native
  object CellViewGeneric extends js.Object {
    def dispatchToolsEvent(paper: jointjsLib.jointjsMod.diaNs.Paper, eventName: java.lang.String): scala.Unit = js.native
  }
  
  @JSName("CellView")
  @js.native
  object CellViewNs extends js.Object {
    trait InteractivityOptions
      extends jointjsLib.jointjsMod.diaNs.ElementViewNs.InteractivityOptions
         with jointjsLib.jointjsMod.diaNs.LinkViewNs.InteractivityOptions
    
    trait Options[T /* <: jointjsLib.jointjsMod.diaNs.Cell */]
      extends jointjsLib.jointjsMod.mvcNs.ViewOptions[T]
    
  }
  
  /* static members */
  @js.native
  object Element extends js.Object {
    def define(`type`: java.lang.String): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Element] = js.native
    def define(`type`: java.lang.String, defaults: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Element] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Element] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Element] = js.native
  }
  
  @JSName("Element")
  @js.native
  object ElementNs extends js.Object {
    trait Attributes
      extends GenericAttributes[jointjsLib.jointjsMod.diaNs.CellNs.Selectors]
    
    trait GenericAttributes[T]
      extends jointjsLib.jointjsMod.diaNs.CellNs.GenericAttributes[T] {
      var angle: js.UndefOr[scala.Double] = js.undefined
      var markup: js.UndefOr[java.lang.String | jointjsLib.jointjsMod.diaNs.MarkupJSON] = js.undefined
      var ports: js.UndefOr[jointjsLib.Anon_Groups] = js.undefined
      var position: js.UndefOr[jointjsLib.jointjsMod.diaNs.Point] = js.undefined
      var size: js.UndefOr[jointjsLib.jointjsMod.diaNs.Size] = js.undefined
    }
    
    trait Port extends js.Object {
      var args: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
      var attrs: js.UndefOr[jointjsLib.jointjsMod.diaNs.CellNs.Selectors] = js.undefined
      var group: js.UndefOr[java.lang.String] = js.undefined
      var id: js.UndefOr[java.lang.String] = js.undefined
      var label: js.UndefOr[jointjsLib.Anon_Markup] = js.undefined
      var markup: js.UndefOr[java.lang.String] = js.undefined
      var z: js.UndefOr[scala.Double | jointjsLib.jointjsLibStrings.auto] = js.undefined
    }
    
    trait PortGroup extends js.Object {
      var attrs: js.UndefOr[jointjsLib.jointjsMod.diaNs.CellNs.Selectors] = js.undefined
      var label: js.UndefOr[jointjsLib.Anon_Markup] = js.undefined
      var markup: js.UndefOr[java.lang.String] = js.undefined
      var position: js.UndefOr[PositionType] = js.undefined
    }
    
    trait PortPosition
      extends jointjsLib.jointjsMod.gNs.PlainPoint {
      var angle: scala.Double
    }
    
    trait TranslateOptions extends js.Object {
      var restrictedArea: js.UndefOr[jointjsLib.jointjsMod.diaNs.BBox] = js.undefined
      var transition: js.UndefOr[jointjsLib.jointjsMod.diaNs.CellNs.TransitionOptions] = js.undefined
    }
    
    type PositionType = java.lang.String | jointjsLib.Anon_Args
  }
  
  @JSName("ElementView")
  @js.native
  object ElementViewNs extends js.Object {
    trait InteractivityOptions extends js.Object {
      var addLinkFromMagnet: js.UndefOr[scala.Boolean] = js.undefined
      var elementMove: js.UndefOr[scala.Boolean] = js.undefined
    }
    
  }
  
  @JSName("Graph")
  @js.native
  object GraphNs extends js.Object {
    trait ConnectionOptions
      extends jointjsLib.jointjsMod.diaNs.CellNs.EmbeddableOptions {
      var inbound: js.UndefOr[scala.Boolean] = js.undefined
      var outbound: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait ExploreOptions extends ConnectionOptions {
      var breadthFirst: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait Options
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
    
  }
  
  /* static members */
  @js.native
  object Link extends js.Object {
    def define(`type`: java.lang.String): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Link] = js.native
    def define(`type`: java.lang.String, defaults: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Link] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Link] = js.native
    def define(`type`: java.lang.String, defaults: js.Any, protoProps: js.Any, staticProps: js.Any): jointjsLib.jointjsMod.diaNs.CellNs.Constructor[jointjsLib.jointjsMod.diaNs.Link] = js.native
  }
  
  @JSName("Link")
  @js.native
  object LinkNs extends js.Object {
    trait Attributes
      extends jointjsLib.jointjsMod.diaNs.CellNs.GenericAttributes[LinkSelectors]
    
    trait EndCellArgs extends js.Object {
      var anchor: js.UndefOr[jointjsLib.jointjsMod.anchorsNs.AnchorJSON] = js.undefined
      var connectionPoint: js.UndefOr[jointjsLib.jointjsMod.connectionPointsNs.ConnectionPointJSON] = js.undefined
      var magnet: js.UndefOr[java.lang.String] = js.undefined
      var port: js.UndefOr[java.lang.String] = js.undefined
      var selector: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait EndCellJSON extends EndCellArgs {
      var id: scala.Double | java.lang.String
    }
    
    trait EndPointJSON extends js.Object {
      var x: scala.Double
      var y: scala.Double
    }
    
    trait GenericAttributes[T]
      extends jointjsLib.jointjsMod.diaNs.CellNs.GenericAttributes[T] {
      var connector: js.UndefOr[
            jointjsLib.jointjsMod.connectorsNs.Connector | jointjsLib.jointjsMod.connectorsNs.ConnectorJSON
          ] = js.undefined
      var labels: js.UndefOr[js.Array[Label]] = js.undefined
      var manhattan: js.UndefOr[scala.Boolean] = js.undefined
      var router: js.UndefOr[
            jointjsLib.jointjsMod.routersNs.Router | jointjsLib.jointjsMod.routersNs.RouterJSON
          ] = js.undefined
      var smooth: js.UndefOr[scala.Boolean] = js.undefined
      var source: js.UndefOr[EndCellJSON | EndPointJSON] = js.undefined
      var target: js.UndefOr[EndCellJSON | EndPointJSON] = js.undefined
      var vertices: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.Point]] = js.undefined
    }
    
    trait Label extends js.Object {
       // optional for default labels
      var attrs: js.UndefOr[jointjsLib.jointjsMod.diaNs.CellNs.Selectors] = js.undefined
      var markup: js.UndefOr[java.lang.String] = js.undefined
       // default labels
      var position: js.UndefOr[LabelPosition | scala.Double] = js.undefined
      var size: js.UndefOr[jointjsLib.jointjsMod.diaNs.Size] = js.undefined
    }
    
    trait LabelPosition extends js.Object {
      var args: js.UndefOr[jointjsLib.jointjsMod.diaNs.LinkViewNs.LabelOptions] = js.undefined
      var distance: js.UndefOr[scala.Double] = js.undefined
       // optional for default labels
      var offset: js.UndefOr[scala.Double | jointjsLib.Anon_X] = js.undefined
    }
    
    trait LinkSelectors
      extends jointjsLib.jointjsMod.diaNs.CellNs.Selectors {
      var `.connection`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var `.connection-wrap`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var `.labels`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var `.link-tools`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var `.marker-arrowheads`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
      var `.marker-source`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var `.marker-target`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGPathAttributes] = js.undefined
      var `.marker-vertices`: js.UndefOr[jointjsLib.jointjsMod.attributesNs.SVGAttributes] = js.undefined
    }
    
    trait Vertex
      extends jointjsLib.jointjsMod.gNs.PlainPoint
         with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]
    
  }
  
  @JSName("LinkView")
  @js.native
  object LinkViewNs extends js.Object {
    trait InteractivityOptions extends js.Object {
      var arrowheadMove: js.UndefOr[scala.Boolean] = js.undefined
      var labelMove: js.UndefOr[scala.Boolean] = js.undefined
      var useLinkTools: js.UndefOr[scala.Boolean] = js.undefined
      var vertexAdd: js.UndefOr[scala.Boolean] = js.undefined
      var vertexMove: js.UndefOr[scala.Boolean] = js.undefined
      var vertexRemove: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    trait LabelOptions
      extends jointjsLib.jointjsMod.diaNs.CellNs.Options {
      var absoluteDistance: js.UndefOr[scala.Boolean] = js.undefined
      var absoluteOffset: js.UndefOr[scala.Boolean] = js.undefined
      var reverseDistance: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    type GetConnectionPoint = js.Function5[
        /* linkView */ jointjsLib.jointjsMod.diaNs.LinkView, 
        /* view */ jointjsLib.jointjsMod.diaNs.ElementView, 
        /* magnet */ stdLib.SVGElement, 
        /* reference */ jointjsLib.jointjsMod.diaNs.Point, 
        /* end */ jointjsLib.jointjsMod.diaNs.LinkEnd, 
        jointjsLib.jointjsMod.diaNs.Point
      ]
    type VertexOptions = jointjsLib.jointjsMod.diaNs.CellNs.Options
  }
  
  @JSName("Paper")
  @js.native
  object PaperNs extends js.Object {
    trait BackgroundOptions extends js.Object {
      var color: js.UndefOr[java.lang.String] = js.undefined
      var image: js.UndefOr[java.lang.String] = js.undefined
      var opacity: js.UndefOr[scala.Double] = js.undefined
      var position: js.UndefOr[jointjsLib.jointjsMod.diaNs.Point | java.lang.String] = js.undefined
      var quality: js.UndefOr[scala.Double] = js.undefined
      var repeat: js.UndefOr[java.lang.String] = js.undefined
      var size: js.UndefOr[jointjsLib.jointjsMod.diaNs.Size | java.lang.String] = js.undefined
      var waterMarkAngle: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait FitToContentOptions extends js.Object {
      var allowNewOrigin: js.UndefOr[
            jointjsLib.jointjsLibStrings.negative | jointjsLib.jointjsLibStrings.positive | jointjsLib.jointjsLibStrings.any
          ] = js.undefined
      var gridHeight: js.UndefOr[scala.Double] = js.undefined
      var gridWidth: js.UndefOr[scala.Double] = js.undefined
      var maxHeight: js.UndefOr[scala.Double] = js.undefined
      var maxWidth: js.UndefOr[scala.Double] = js.undefined
      var minHeight: js.UndefOr[scala.Double] = js.undefined
      var minWidth: js.UndefOr[scala.Double] = js.undefined
      var padding: js.UndefOr[jointjsLib.jointjsMod.diaNs.Padding] = js.undefined
    }
    
    trait GradientOptions extends js.Object {
      var id: js.UndefOr[java.lang.String] = js.undefined
      var stops: js.Array[jointjsLib.Anon_Color]
      var `type`: jointjsLib.jointjsLibStrings.linearGradient | jointjsLib.jointjsLibStrings.radialGradient
    }
    
    trait GridOptions extends js.Object {
      var args: js.UndefOr[
            js.Array[org.scalablytyped.runtime.StringDictionary[_]] | org.scalablytyped.runtime.StringDictionary[js.Any]
          ] = js.undefined
      var color: js.UndefOr[java.lang.String] = js.undefined
      var name: js.UndefOr[
            jointjsLib.jointjsLibStrings.dot | jointjsLib.jointjsLibStrings.fixedDot | jointjsLib.jointjsLibStrings.mesh | jointjsLib.jointjsLibStrings.doubleMesh
          ] = js.undefined
      var thickness: js.UndefOr[scala.Double] = js.undefined
    }
    
    trait Options
      extends jointjsLib.jointjsMod.mvcNs.ViewOptions[jointjsLib.jointjsMod.diaNs.Graph] {
      var allowLink: js.UndefOr[
            (js.Function2[
              /* linkView */ jointjsLib.jointjsMod.diaNs.LinkView, 
              /* paper */ jointjsLib.jointjsMod.diaNs.Paper, 
              scala.Boolean
            ]) | scala.Null
          ] = js.undefined
      var async: js.UndefOr[scala.Boolean | jointjsLib.Anon_BatchSize] = js.undefined
      var background: js.UndefOr[BackgroundOptions] = js.undefined
      // default views, models & attributes
      var cellViewNamespace: js.UndefOr[js.Any] = js.undefined
      var clickThreshold: js.UndefOr[scala.Double] = js.undefined
      // connecting
      var connectionStrategy: js.UndefOr[jointjsLib.jointjsMod.connectionStrategiesNs.ConnectionStrategy] = js.undefined
      var defaultAnchor: js.UndefOr[
            jointjsLib.jointjsMod.anchorsNs.AnchorJSON | jointjsLib.jointjsMod.anchorsNs.Anchor
          ] = js.undefined
      var defaultConnectionPoint: js.UndefOr[
            jointjsLib.jointjsMod.connectionPointsNs.ConnectionPointJSON | jointjsLib.jointjsMod.connectionPointsNs.ConnectionPoint
          ] = js.undefined
      var defaultConnector: js.UndefOr[
            jointjsLib.jointjsMod.connectorsNs.Connector | jointjsLib.jointjsMod.connectorsNs.ConnectorJSON
          ] = js.undefined
      var defaultLink: js.UndefOr[
            (js.Function2[
              /* cellView */ jointjsLib.jointjsMod.diaNs.CellView, 
              /* magnet */ stdLib.SVGElement, 
              jointjsLib.jointjsMod.diaNs.Link
            ]) | jointjsLib.jointjsMod.diaNs.Link
          ] = js.undefined
      var defaultRouter: js.UndefOr[
            jointjsLib.jointjsMod.routersNs.Router | jointjsLib.jointjsMod.routersNs.RouterJSON
          ] = js.undefined
      var drawGrid: js.UndefOr[scala.Boolean | GridOptions | js.Array[GridOptions]] = js.undefined
      // views
      var elementView: js.UndefOr[
            org.scalablytyped.runtime.Instantiable0[jointjsLib.jointjsMod.diaNs.ElementView] | (js.Function1[
              /* element */ jointjsLib.jointjsMod.diaNs.Element, 
              org.scalablytyped.runtime.Instantiable0[jointjsLib.jointjsMod.diaNs.ElementView]
            ])
          ] = js.undefined
      // embedding
      var embeddingMode: js.UndefOr[scala.Boolean] = js.undefined
      var findParentBy: js.UndefOr[
            jointjsLib.jointjsLibStrings.bbox | jointjsLib.jointjsLibStrings.center | jointjsLib.jointjsLibStrings.origin | jointjsLib.jointjsLibStrings.corner | jointjsLib.jointjsLibStrings.topRight | jointjsLib.jointjsLibStrings.bottomLeft
          ] = js.undefined
      // interactions
      var gridSize: js.UndefOr[scala.Double] = js.undefined
      // events
      var guard: js.UndefOr[
            js.Function2[
              /* evt */ jqueryLib.JQueryNs.Event, 
              /* view */ jointjsLib.jointjsMod.diaNs.CellView, 
              scala.Boolean
            ]
          ] = js.undefined
      var height: js.UndefOr[Dimension] = js.undefined
      var highlighterNamespace: js.UndefOr[js.Any] = js.undefined
      var highlighting: js.UndefOr[
            org.scalablytyped.runtime.StringDictionary[jointjsLib.jointjsMod.highlightersNs.HighlighterJSON]
          ] = js.undefined
      var interactive: js.UndefOr[
            (js.Function2[
              /* cellView */ jointjsLib.jointjsMod.diaNs.CellView, 
              /* event */ java.lang.String, 
              scala.Boolean
            ]) | scala.Boolean | jointjsLib.jointjsMod.diaNs.CellViewNs.InteractivityOptions
          ] = js.undefined
      var linkConnectionPoint: js.UndefOr[jointjsLib.jointjsMod.diaNs.LinkViewNs.GetConnectionPoint] = js.undefined
      var linkPinning: js.UndefOr[scala.Boolean] = js.undefined
      var linkView: js.UndefOr[
            org.scalablytyped.runtime.Instantiable0[jointjsLib.jointjsMod.diaNs.LinkView] | (js.Function1[
              /* link */ jointjsLib.jointjsMod.diaNs.Link, 
              org.scalablytyped.runtime.Instantiable0[jointjsLib.jointjsMod.diaNs.LinkView]
            ])
          ] = js.undefined
      var magnetThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
      var markAvailable: js.UndefOr[scala.Boolean] = js.undefined
      var moveThreshold: js.UndefOr[scala.Double] = js.undefined
      var multiLinks: js.UndefOr[scala.Boolean] = js.undefined
      var origin: js.UndefOr[jointjsLib.jointjsMod.diaNs.Point] = js.undefined
      var perpendicularLinks: js.UndefOr[scala.Boolean] = js.undefined
      var preventContextMenu: js.UndefOr[scala.Boolean] = js.undefined
      var preventDefaultBlankAction: js.UndefOr[scala.Boolean] = js.undefined
      var restrictTranslate: js.UndefOr[
            (js.Function1[
              /* elementView */ jointjsLib.jointjsMod.diaNs.ElementView, 
              jointjsLib.jointjsMod.diaNs.BBox
            ]) | scala.Boolean
          ] = js.undefined
      var snapLinks: js.UndefOr[scala.Boolean | jointjsLib.Anon_Radius] = js.undefined
      var validateConnection: js.UndefOr[
            js.Function6[
              /* cellViewS */ jointjsLib.jointjsMod.diaNs.CellView, 
              /* magnetS */ stdLib.SVGElement, 
              /* cellViewT */ jointjsLib.jointjsMod.diaNs.CellView, 
              /* magnetT */ stdLib.SVGElement, 
              /* end */ jointjsLib.jointjsMod.diaNs.LinkEnd, 
              /* linkView */ jointjsLib.jointjsMod.diaNs.LinkView, 
              scala.Boolean
            ]
          ] = js.undefined
      var validateEmbedding: js.UndefOr[
            js.Function2[
              /* childView */ jointjsLib.jointjsMod.diaNs.ElementView, 
              /* parentView */ jointjsLib.jointjsMod.diaNs.ElementView, 
              scala.Boolean
            ]
          ] = js.undefined
      // validations
      var validateMagnet: js.UndefOr[
            js.Function2[
              /* cellView */ jointjsLib.jointjsMod.diaNs.CellView, 
              /* magnet */ stdLib.SVGElement, 
              scala.Boolean
            ]
          ] = js.undefined
      // appearance
      var width: js.UndefOr[Dimension] = js.undefined
    }
    
    trait ScaleContentOptions extends js.Object {
      var fittingBBox: js.UndefOr[jointjsLib.jointjsMod.diaNs.BBox] = js.undefined
      var maxScale: js.UndefOr[scala.Double] = js.undefined
      var maxScaleX: js.UndefOr[scala.Double] = js.undefined
      var maxScaleY: js.UndefOr[scala.Double] = js.undefined
      var minScale: js.UndefOr[scala.Double] = js.undefined
      var minScaleX: js.UndefOr[scala.Double] = js.undefined
      var minScaleY: js.UndefOr[scala.Double] = js.undefined
      var padding: js.UndefOr[scala.Double] = js.undefined
      var preserveAspectRatio: js.UndefOr[scala.Boolean] = js.undefined
      var scaleGrid: js.UndefOr[scala.Double] = js.undefined
    }
    
    type Dimension = scala.Double | java.lang.String | scala.Null
  }
  
  @JSName("ToolView")
  @js.native
  object ToolViewNs extends js.Object {
    trait Options extends js.Object {
      var focusOpacity: js.UndefOr[scala.Double] = js.undefined
    }
    
  }
  
  @JSName("ToolsView")
  @js.native
  object ToolsViewNs extends js.Object {
    trait Options extends js.Object {
      var component: js.UndefOr[scala.Boolean] = js.undefined
      var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var relatedView: js.UndefOr[jointjsLib.jointjsMod.diaNs.CellView] = js.undefined
      var tools: js.UndefOr[js.Array[jointjsLib.jointjsMod.diaNs.ToolView]] = js.undefined
    }
    
  }
  
  type BBox = jointjsLib.jointjsMod.gNs.PlainRect
  type Direction = OrthogonalDirection | jointjsLib.jointjsLibStrings.`top-left` | jointjsLib.jointjsLibStrings.`top-right` | jointjsLib.jointjsLibStrings.`bottom-right` | jointjsLib.jointjsLibStrings.`bottom-left`
  type LinkEnd = jointjsLib.jointjsLibStrings.source | jointjsLib.jointjsLibStrings.target
  type MarkupJSON = js.Array[MarkupNodeJSON]
  type OrthogonalDirection = jointjsLib.jointjsLibStrings.left | jointjsLib.jointjsLibStrings.top | jointjsLib.jointjsLibStrings.right | jointjsLib.jointjsLibStrings.bottom
  type Padding = scala.Double | PaddingJSON
  type Point = jointjsLib.jointjsMod.gNs.PlainPoint
  type Sides = scala.Double | SidesJSON
  type Size = stdLib.Pick[BBox, jointjsLib.jointjsLibStrings.width | jointjsLib.jointjsLibStrings.height]
}

