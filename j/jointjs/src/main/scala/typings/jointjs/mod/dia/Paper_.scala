package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.jointjs.anon.BatchSize
import typings.jointjs.anon.Batches
import typings.jointjs.anon.Before
import typings.jointjs.anon.Highlighter
import typings.jointjs.anon.MountBatchSize
import typings.jointjs.anon.Mounted
import typings.jointjs.anon.Position
import typings.jointjs.anon.Progress
import typings.jointjs.anon.Strict
import typings.jointjs.anon.UnmountBatchSize
import typings.jointjs.anon.UseModelGeometryBoolean
import typings.jointjs.anon.Viewport
import typings.jointjs.anon.`0`
import typings.jointjs.mod.Vectorizer.Matrix
import typings.jointjs.mod.Vectorizer.Scale
import typings.jointjs.mod.Vectorizer.Translation
import typings.jointjs.mod.dia.Paper.BackgroundOptions
import typings.jointjs.mod.dia.Paper.Dimension
import typings.jointjs.mod.dia.Paper.FitToContentOptions
import typings.jointjs.mod.dia.Paper.FreezeOptions
import typings.jointjs.mod.dia.Paper.GradientOptions
import typings.jointjs.mod.dia.Paper.GridOptions
import typings.jointjs.mod.dia.Paper.Options
import typings.jointjs.mod.dia.Paper.ScaleContentOptions
import typings.jointjs.mod.dia.Paper.UnfreezeOptions
import typings.jointjs.mod.dia.Paper.UpdateStats
import typings.jointjs.mod.dia.Paper.ViewportCallback
import typings.jointjs.mod.g.Rect
import typings.jointjs.mod.mvc.View
import typings.jquery.JQuery
import typings.std.Comment
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.SVGDefsElement
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.std.SVGMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Paper")
@js.native
class Paper_ protected () extends View[Graph] {
  def this(opt: Options) = this()
  
  @JSName("$background")
  var $background: JQuery[HTMLElement] = js.native
  
  @JSName("$document")
  var $document: JQuery[HTMLElement] = js.native
  
  @JSName("$grid")
  var $grid: JQuery[HTMLElement] = js.native
  
  /* protected */ def addZPivot(z: Double): Comment = js.native
  
  var cells: SVGGElement = js.native
  
  /* protected */ def checkMountedViews(viewport: ViewportCallback): Double = js.native
  /* protected */ def checkMountedViews(viewport: ViewportCallback, opt: UnmountBatchSize): Double = js.native
  
  /* protected */ def checkUnmountedViews(viewport: ViewportCallback): Double = js.native
  /* protected */ def checkUnmountedViews(viewport: ViewportCallback, opt: `0`): Double = js.native
  
  def checkViewport(): Mounted = js.native
  def checkViewport(opt: MountBatchSize): Mounted = js.native
  
  def clearGrid(): this.type = js.native
  
  def clientMatrix(): SVGMatrix = js.native
  
  def clientOffset(): typings.jointjs.mod.g.Point = js.native
  
  def clientToLocalPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def clientToLocalPoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def clientToLocalRect(rect: BBox): Rect = js.native
  def clientToLocalRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  
  /* protected */ def cloneOptions(): Options = js.native
  
  /* protected */ def contextmenu(evt: Event): Unit = js.native
  
  /* protected */ def createViewForModel(cell: Cell): CellView = js.native
  
  def defineFilter(filter: StringDictionary[js.Any]): String = js.native
  
  def defineGradient(gradient: GradientOptions): String = js.native
  
  def defineMarker(marker: StringDictionary[js.Any]): String = js.native
  
  var defs: SVGDefsElement = js.native
  
  def dispatchToolsEvent(eventName: String, args: js.Any*): Unit = js.native
  
  def drawBackground(): this.type = js.native
  def drawBackground(opt: BackgroundOptions): this.type = js.native
  
  /* protected */ def drawBackgroundImage(img: HTMLImageElement, opt: StringDictionary[js.Any]): Unit = js.native
  
  def drawGrid(): this.type = js.native
  def drawGrid(opt: js.Array[GridOptions]): this.type = js.native
  def drawGrid(opt: GridOptions): this.type = js.native
  
  /* protected */ def dumpView(view: View[_]): Double = js.native
  /* protected */ def dumpView(view: View[_], opt: StringDictionary[js.Any]): Double = js.native
  
  /* protected */ def dumpViewUpdate(view: View[_]): Double = js.native
  
  def dumpViews(): Unit = js.native
  def dumpViews(opt: BatchSize): Unit = js.native
  
  def findView[T /* <: ElementView | LinkView */](element: String): T = js.native
  def findView[T /* <: ElementView | LinkView */](element: JQuery[HTMLElement]): T = js.native
  def findView[T /* <: ElementView | LinkView */](element: SVGElement): T = js.native
  
  def findViewByModel[T /* <: ElementView | LinkView */](model: String): T = js.native
  def findViewByModel[T /* <: ElementView | LinkView */](model: Double): T = js.native
  def findViewByModel[T /* <: ElementView | LinkView */](model: Cell): T = js.native
  
  def findViewsFromPoint(point: String): js.Array[ElementView] = js.native
  def findViewsFromPoint(point: Point): js.Array[ElementView] = js.native
  
  def findViewsInArea(rect: BBox): js.Array[ElementView] = js.native
  def findViewsInArea(rect: BBox, opt: Strict): js.Array[ElementView] = js.native
  
  def fitToContent(): Rect = js.native
  def fitToContent(
    gridWidth: js.UndefOr[scala.Nothing],
    gridHeight: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    opt: js.Any
  ): Rect = js.native
  def fitToContent(gridWidth: js.UndefOr[scala.Nothing], gridHeight: js.UndefOr[scala.Nothing], padding: Double): Rect = js.native
  def fitToContent(
    gridWidth: js.UndefOr[scala.Nothing],
    gridHeight: js.UndefOr[scala.Nothing],
    padding: Double,
    opt: js.Any
  ): Rect = js.native
  def fitToContent(gridWidth: js.UndefOr[scala.Nothing], gridHeight: Double): Rect = js.native
  def fitToContent(
    gridWidth: js.UndefOr[scala.Nothing],
    gridHeight: Double,
    padding: js.UndefOr[scala.Nothing],
    opt: js.Any
  ): Rect = js.native
  def fitToContent(gridWidth: js.UndefOr[scala.Nothing], gridHeight: Double, padding: Double): Rect = js.native
  def fitToContent(gridWidth: js.UndefOr[scala.Nothing], gridHeight: Double, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double): Rect = js.native
  def fitToContent(
    gridWidth: Double,
    gridHeight: js.UndefOr[scala.Nothing],
    padding: js.UndefOr[scala.Nothing],
    opt: js.Any
  ): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: js.UndefOr[scala.Nothing], padding: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: js.UndefOr[scala.Nothing], padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: js.UndefOr[scala.Nothing], opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(opt: FitToContentOptions): Rect = js.native
  
  // rendering
  def freeze(): Unit = js.native
  def freeze(opt: FreezeOptions): Unit = js.native
  
  def getArea(): Rect = js.native
  
  def getComputedSize(): Size = js.native
  
  def getContentArea(): Rect = js.native
  def getContentArea(opt: UseModelGeometryBoolean): Rect = js.native
  
  def getContentBBox(): Rect = js.native
  def getContentBBox(opt: UseModelGeometryBoolean): Rect = js.native
  
  def getDefaultLink(cellView: CellView, magnet: SVGElement): Link = js.native
  
  def getModelById(id: String): Cell = js.native
  def getModelById(id: Double): Cell = js.native
  def getModelById(id: Cell): Cell = js.native
  
  def getPointerArgs(evt: Event): js.Tuple3[Event, Double, Double] = js.native
  
  def getRestrictedArea(): js.UndefOr[Rect] = js.native
  
  /* protected */ def guard(evt: Event, view: CellView): Boolean = js.native
  
  def hasScheduledUpdates(): Boolean = js.native
  
  def hideTools(): this.type = js.native
  
  /* protected */ def insertView(view: CellView): Unit = js.native
  
  /* protected */ def isAsync(): Boolean = js.native
  
  def isDefined(defId: String): Boolean = js.native
  
  /* protected */ def isExactSorting(): Boolean = js.native
  
  def isFrozen(): Boolean = js.native
  
  var layers: SVGGElement = js.native
  
  def localToClientPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def localToClientPoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def localToClientRect(rect: BBox): Rect = js.native
  def localToClientRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  
  def localToPagePoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def localToPagePoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def localToPageRect(rect: BBox): Rect = js.native
  def localToPageRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  
  def localToPaperPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def localToPaperPoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def localToPaperRect(rect: BBox): Rect = js.native
  def localToPaperRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  
  def matrix(): SVGMatrix = js.native
  def matrix(ctm: Matrix): this.type = js.native
  def matrix(ctm: SVGMatrix): this.type = js.native
  
  /* protected */ def mouseenter(evt: Event): Unit = js.native
  
  /* protected */ def mouseleave(evt: Event): Unit = js.native
  
  /* protected */ def mouseout(evt: Event): Unit = js.native
  
  /* protected */ def mouseover(evt: Event): Unit = js.native
  
  /* protected */ def mousewheel(evt: Event): Unit = js.native
  
  /* protected */ def onCellAdded(cell: Cell, collection: Collection[Cell], opt: typings.jointjs.mod.dia.Graph.Options): Unit = js.native
  
  /* protected */ def onCellChanged(cell: Collection[Cell], opt: typings.jointjs.mod.dia.Graph.Options): Unit = js.native
  /* protected */ def onCellChanged(cell: Cell, opt: typings.jointjs.mod.dia.Cell.Options): Unit = js.native
  
  /* protected */ def onCellHighlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
  /* protected */ def onCellHighlight(cellView: CellView, magnetEl: SVGElement, opt: Highlighter): Unit = js.native
  
  /* protected */ def onCellRemoved(cell: Cell, collection: Collection[Cell], opt: typings.jointjs.mod.dia.Graph.Options): Unit = js.native
  
  /* protected */ def onCellUnhighlight(cellView: CellView, magnetEl: SVGElement): Unit = js.native
  /* protected */ def onCellUnhighlight(cellView: CellView, magnetEl: SVGElement, opt: Highlighter): Unit = js.native
  
  /* protected */ def onGraphBatchStop(): Unit = js.native
  
  /* protected */ def onGraphReset(cells: Collection[Cell], opt: typings.jointjs.mod.dia.Graph.Options): Unit = js.native
  
  /* protected */ def onGraphSort(): Unit = js.native
  
  /* protected */ def onevent(evt: Event): Unit = js.native
  
  /* protected */ def onlabel(evt: Event): Unit = js.native
  
  /* protected */ def onmagnet(evt: Event): Unit = js.native
  
  @JSName("options")
  var options_Paper_ : Options = js.native
  
  def pageOffset(): typings.jointjs.mod.g.Point = js.native
  
  def pageToLocalPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def pageToLocalPoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def pageToLocalRect(rect: BBox): Rect = js.native
  def pageToLocalRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  
  def paperToLocalPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  def paperToLocalPoint(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  def paperToLocalRect(x: Double, y: Double, width: Double, height: Double): Rect = js.native
  def paperToLocalRect(x: BBox): Rect = js.native
  
  /* protected */ def pointerclick(evt: Event): Unit = js.native
  
  /* protected */ def pointerdblclick(evt: Event): Unit = js.native
  
  /* protected */ def pointerdown(evt: Event): Unit = js.native
  
  /* protected */ def pointermove(evt: Event): Unit = js.native
  
  /* protected */ def pointerup(evt: Event): Unit = js.native
  
  /* protected */ def registerMountedView(view: View[_]): Double = js.native
  
  /* protected */ def registerUnmountedView(view: View[_]): Double = js.native
  
  // tools
  def removeTools(): this.type = js.native
  
  /* protected */ def removeView(cell: Cell): CellView = js.native
  
  /* protected */ def removeViews(): Unit = js.native
  
  /* protected */ def removeZPivots(): Unit = js.native
  
  /* protected */ def renderView(cell: Cell): CellView = js.native
  
  def requestViewUpdate(view: View[_], flag: Double, priority: Double): Unit = js.native
  def requestViewUpdate(view: View[_], flag: Double, priority: Double, opt: StringDictionary[js.Any]): Unit = js.native
  
  def requireView[T /* <: ElementView | LinkView */](model: String): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: String, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Double): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Double, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Cell): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Cell, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  
  /* protected */ def resetViews(): Unit = js.native
  /* protected */ def resetViews(cells: js.UndefOr[scala.Nothing], opt: StringDictionary[js.Any]): Unit = js.native
  /* protected */ def resetViews(cells: js.Array[Cell]): Unit = js.native
  /* protected */ def resetViews(cells: js.Array[Cell], opt: StringDictionary[js.Any]): Unit = js.native
  
  def scale(): Scale = js.native
  def scale(sx: Double): this.type = js.native
  def scale(sx: Double, sy: js.UndefOr[scala.Nothing], ox: js.UndefOr[scala.Nothing], oy: Double): this.type = js.native
  def scale(sx: Double, sy: js.UndefOr[scala.Nothing], ox: Double): this.type = js.native
  def scale(sx: Double, sy: js.UndefOr[scala.Nothing], ox: Double, oy: Double): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: js.UndefOr[scala.Nothing], oy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: Double, oy: Double): this.type = js.native
  
  def scaleContentToFit(): Unit = js.native
  def scaleContentToFit(opt: ScaleContentOptions): Unit = js.native
  
  // protected
  /* protected */ def scheduleViewUpdate(view: View[_], flag: Double, priority: Double): Unit = js.native
  /* protected */ def scheduleViewUpdate(view: View[_], flag: Double, priority: Double, opt: StringDictionary[js.Any]): Unit = js.native
  
  def setDimensions(width: Dimension, height: Dimension): Unit = js.native
  
  def setGridSize(gridSize: Double): this.type = js.native
  
  def setInteractivity(value: js.Any): Unit = js.native
  
  def setOrigin(x: Double, y: Double): this.type = js.native
  
  def showTools(): this.type = js.native
  
  def snapToGrid(point: Point): typings.jointjs.mod.g.Point = js.native
  def snapToGrid(x: Double, y: Double): typings.jointjs.mod.g.Point = js.native
  
  /* protected */ def sortViews(): Unit = js.native
  
  /* protected */ def sortViewsExact(): Unit = js.native
  
  var svg: SVGElement = js.native
  
  var tools: SVGGElement = js.native
  
  def translate(): Translation = js.native
  def translate(tx: Double): this.type = js.native
  def translate(tx: Double, ty: Double): this.type = js.native
  
  def unfreeze(): Unit = js.native
  def unfreeze(opt: UnfreezeOptions): Unit = js.native
  
  def update(): this.type = js.native
  
  /* protected */ def updateBackgroundColor(color: String): Unit = js.native
  
  /* protected */ def updateBackgroundImage(opt: Position): Unit = js.native
  
  /* protected */ def updateView(view: View[_], flag: Double): Double = js.native
  /* protected */ def updateView(view: View[_], flag: Double, opt: StringDictionary[js.Any]): Double = js.native
  
  def updateViews(): Batches = js.native
  def updateViews(opt: Progress): Batches = js.native
  
  /* protected */ def updateViewsAsync(): Unit = js.native
  /* protected */ def updateViewsAsync(opt: Before): Unit = js.native
  
  /* protected */ def updateViewsBatch(): UpdateStats = js.native
  /* protected */ def updateViewsBatch(opt: Viewport): UpdateStats = js.native
  
  var viewport: SVGGElement = js.native
}
