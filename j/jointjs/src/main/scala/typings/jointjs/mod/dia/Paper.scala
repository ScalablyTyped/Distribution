package typings.jointjs.mod.dia

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.Collection
import typings.jointjs.anon.BatchSize
import typings.jointjs.anon.Batches
import typings.jointjs.anon.Before
import typings.jointjs.anon.Color
import typings.jointjs.anon.Highlighter
import typings.jointjs.anon.MountBatchSize
import typings.jointjs.anon.Mounted
import typings.jointjs.anon.Position
import typings.jointjs.anon.Progress
import typings.jointjs.anon.Radius
import typings.jointjs.anon.Strict
import typings.jointjs.anon.UnmountBatchSize
import typings.jointjs.anon.UseModelGeometryBoolean
import typings.jointjs.anon.Viewport
import typings.jointjs.anon.`0`
import typings.jointjs.jointjsStrings.any
import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.corner
import typings.jointjs.jointjsStrings.dot
import typings.jointjs.jointjsStrings.doubleMesh
import typings.jointjs.jointjsStrings.fixedDot
import typings.jointjs.jointjsStrings.linearGradient
import typings.jointjs.jointjsStrings.mesh
import typings.jointjs.jointjsStrings.negative
import typings.jointjs.jointjsStrings.origin
import typings.jointjs.jointjsStrings.positive
import typings.jointjs.jointjsStrings.radialGradient
import typings.jointjs.jointjsStrings.topRight
import typings.jointjs.mod.Vectorizer.Matrix
import typings.jointjs.mod.Vectorizer.Scale
import typings.jointjs.mod.Vectorizer.Translation
import typings.jointjs.mod.anchors.Anchor
import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.connectionPoints.ConnectionPoint
import typings.jointjs.mod.connectionPoints.ConnectionPointJSON
import typings.jointjs.mod.connectionStrategies.ConnectionStrategy
import typings.jointjs.mod.connectors.Connector
import typings.jointjs.mod.connectors.ConnectorJSON
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.connectors.GenericConnectorArguments
import typings.jointjs.mod.dia.CellView.InteractivityOptions
import typings.jointjs.mod.dia.LinkView.GetConnectionPoint
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
import typings.jointjs.mod.g.Line
import typings.jointjs.mod.g.Rect
import typings.jointjs.mod.highlighters.HighlighterJSON
import typings.jointjs.mod.mvc.View
import typings.jointjs.mod.mvc.ViewOptions
import typings.jointjs.mod.routers.GenericRouterArguments
import typings.jointjs.mod.routers.Router
import typings.jointjs.mod.routers.RouterJSON
import typings.jointjs.mod.routers.RouterType
import typings.jquery.JQuery
import typings.std.Comment
import typings.std.HTMLElement
import typings.std.HTMLImageElement
import typings.std.SVGDefsElement
import typings.std.SVGElement
import typings.std.SVGGElement
import typings.std.SVGMatrix
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.Paper")
@js.native
class Paper protected () extends View[Graph] {
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
  
  /* protected */ def dumpView(view: View[js.Any]): Double = js.native
  /* protected */ def dumpView(view: View[js.Any], opt: StringDictionary[js.Any]): Double = js.native
  
  /* protected */ def dumpViewUpdate(view: View[js.Any]): Double = js.native
  
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
  def fitToContent(gridWidth: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Double, padding: Unit, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Unit, padding: Double): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Unit, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Double, gridHeight: Unit, padding: Unit, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Double): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Double, padding: Double): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Double, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Double, padding: Unit, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Unit, padding: Double): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Unit, padding: Double, opt: js.Any): Rect = js.native
  def fitToContent(gridWidth: Unit, gridHeight: Unit, padding: Unit, opt: js.Any): Rect = js.native
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
  var options_Paper: Options = js.native
  
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
  
  /* protected */ def registerMountedView(view: View[js.Any]): Double = js.native
  
  /* protected */ def registerUnmountedView(view: View[js.Any]): Double = js.native
  
  // tools
  def removeTools(): this.type = js.native
  
  /* protected */ def removeView(cell: Cell): CellView = js.native
  
  /* protected */ def removeViews(): Unit = js.native
  
  /* protected */ def removeZPivots(): Unit = js.native
  
  /* protected */ def renderView(cell: Cell): CellView = js.native
  
  def requestViewUpdate(view: View[js.Any], flag: Double, priority: Double): Unit = js.native
  def requestViewUpdate(view: View[js.Any], flag: Double, priority: Double, opt: StringDictionary[js.Any]): Unit = js.native
  
  def requireView[T /* <: ElementView | LinkView */](model: String): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: String, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Double): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Double, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Cell): T = js.native
  def requireView[T /* <: ElementView | LinkView */](model: Cell, opt: typings.jointjs.mod.dia.Cell.Options): T = js.native
  
  /* protected */ def resetViews(): Unit = js.native
  /* protected */ def resetViews(cells: js.Array[Cell]): Unit = js.native
  /* protected */ def resetViews(cells: js.Array[Cell], opt: StringDictionary[js.Any]): Unit = js.native
  /* protected */ def resetViews(cells: Unit, opt: StringDictionary[js.Any]): Unit = js.native
  
  def scale(): Scale = js.native
  def scale(sx: Double): this.type = js.native
  def scale(sx: Double, sy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: Double, oy: Double): this.type = js.native
  def scale(sx: Double, sy: Double, ox: Unit, oy: Double): this.type = js.native
  def scale(sx: Double, sy: Unit, ox: Double): this.type = js.native
  def scale(sx: Double, sy: Unit, ox: Double, oy: Double): this.type = js.native
  def scale(sx: Double, sy: Unit, ox: Unit, oy: Double): this.type = js.native
  
  def scaleContentToFit(): Unit = js.native
  def scaleContentToFit(opt: ScaleContentOptions): Unit = js.native
  
  // protected
  /* protected */ def scheduleViewUpdate(view: View[js.Any], flag: Double, priority: Double): Unit = js.native
  /* protected */ def scheduleViewUpdate(view: View[js.Any], flag: Double, priority: Double, opt: StringDictionary[js.Any]): Unit = js.native
  
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
  
  /* protected */ def updateView(view: View[js.Any], flag: Double): Double = js.native
  /* protected */ def updateView(view: View[js.Any], flag: Double, opt: StringDictionary[js.Any]): Double = js.native
  
  def updateViews(): Batches = js.native
  def updateViews(opt: Progress): Batches = js.native
  
  /* protected */ def updateViewsAsync(): Unit = js.native
  /* protected */ def updateViewsAsync(opt: Before): Unit = js.native
  
  /* protected */ def updateViewsBatch(): UpdateStats = js.native
  /* protected */ def updateViewsBatch(opt: Viewport): UpdateStats = js.native
  
  var viewport: SVGGElement = js.native
}
object Paper {
  
  @js.native
  sealed trait sorting extends StObject
  @JSImport("jointjs", "dia.Paper.sorting")
  @js.native
  object sorting extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[sorting & String] = js.native
    
    @js.native
    sealed trait APPROX
      extends StObject
         with sorting
    /* "sorting-approximate" */ val APPROX: typings.jointjs.mod.dia.Paper.sorting.APPROX & String = js.native
    
    @js.native
    sealed trait EXACT
      extends StObject
         with sorting
    /* "sorting-exact" */ val EXACT: typings.jointjs.mod.dia.Paper.sorting.EXACT & String = js.native
    
    @js.native
    sealed trait NONE
      extends StObject
         with sorting
    /* "sorting-none" */ val NONE: typings.jointjs.mod.dia.Paper.sorting.NONE & String = js.native
  }
  
  type AfterRenderCallback = js.Function3[/* stats */ UpdateStats, /* opt */ StringDictionary[js.Any], /* paper */ Paper, Unit]
  
  trait BackgroundOptions extends StObject {
    
    var color: js.UndefOr[String] = js.undefined
    
    var image: js.UndefOr[String] = js.undefined
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[Point | String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var repeat: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Size | String] = js.undefined
    
    var waterMarkAngle: js.UndefOr[Double] = js.undefined
  }
  object BackgroundOptions {
    
    @scala.inline
    def apply(): BackgroundOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackgroundOptions]
    }
    
    @scala.inline
    implicit class BackgroundOptionsMutableBuilder[Self <: BackgroundOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setPosition(value: Point | String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRepeat(value: String): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setSize(value: Size | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setWaterMarkAngle(value: Double): Self = StObject.set(x, "waterMarkAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaterMarkAngleUndefined: Self = StObject.set(x, "waterMarkAngle", js.undefined)
    }
  }
  
  type BeforeRenderCallback = js.Function2[/* opt */ StringDictionary[js.Any], /* paper */ Paper, Unit]
  
  type Dimension = Double | String | Null
  
  trait FitToContentOptions extends StObject {
    
    var allowNewOrigin: js.UndefOr[negative | positive | any] = js.undefined
    
    var contentArea: js.UndefOr[BBox] = js.undefined
    
    var gridHeight: js.UndefOr[Double] = js.undefined
    
    var gridWidth: js.UndefOr[Double] = js.undefined
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var minHeight: js.UndefOr[Double] = js.undefined
    
    var minWidth: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var useModelGeometry: js.UndefOr[Boolean] = js.undefined
  }
  object FitToContentOptions {
    
    @scala.inline
    def apply(): FitToContentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FitToContentOptions]
    }
    
    @scala.inline
    implicit class FitToContentOptionsMutableBuilder[Self <: FitToContentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNewOrigin(value: negative | positive | any): Self = StObject.set(x, "allowNewOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowNewOriginUndefined: Self = StObject.set(x, "allowNewOrigin", js.undefined)
      
      @scala.inline
      def setContentArea(value: BBox): Self = StObject.set(x, "contentArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAreaUndefined: Self = StObject.set(x, "contentArea", js.undefined)
      
      @scala.inline
      def setGridHeight(value: Double): Self = StObject.set(x, "gridHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridHeightUndefined: Self = StObject.set(x, "gridHeight", js.undefined)
      
      @scala.inline
      def setGridWidth(value: Double): Self = StObject.set(x, "gridWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridWidthUndefined: Self = StObject.set(x, "gridWidth", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
    }
  }
  
  trait FreezeOptions extends StObject {
    
    var key: js.UndefOr[String] = js.undefined
  }
  object FreezeOptions {
    
    @scala.inline
    def apply(): FreezeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FreezeOptions]
    }
    
    @scala.inline
    implicit class FreezeOptionsMutableBuilder[Self <: FreezeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
  trait GradientOptions extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var stops: js.Array[Color]
    
    var `type`: linearGradient | radialGradient
  }
  object GradientOptions {
    
    @scala.inline
    def apply(stops: js.Array[Color], `type`: linearGradient | radialGradient): GradientOptions = {
      val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GradientOptions]
    }
    
    @scala.inline
    implicit class GradientOptionsMutableBuilder[Self <: GradientOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setStops(value: js.Array[Color]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStopsVarargs(value: Color*): Self = StObject.set(x, "stops", js.Array(value :_*))
      
      @scala.inline
      def setType(value: linearGradient | radialGradient): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait GridOptions extends StObject {
    
    var args: js.UndefOr[js.Array[StringDictionary[js.Any]] | StringDictionary[js.Any]] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[dot | fixedDot | mesh | doubleMesh] = js.undefined
    
    var thickness: js.UndefOr[Double] = js.undefined
  }
  object GridOptions {
    
    @scala.inline
    def apply(): GridOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridOptions]
    }
    
    @scala.inline
    implicit class GridOptionsMutableBuilder[Self <: GridOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[StringDictionary[js.Any]] | StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      @scala.inline
      def setArgsVarargs(value: StringDictionary[js.Any]*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setName(value: dot | fixedDot | mesh | doubleMesh): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with ViewOptions[Graph] {
    
    var afterRender: js.UndefOr[AfterRenderCallback] = js.undefined
    
    var allowLink: js.UndefOr[(js.Function2[/* linkView */ LinkView, /* paper */ Paper, Boolean]) | Null] = js.undefined
    
    var anchorNamespace: js.UndefOr[js.Any] = js.undefined
    
    // rendering
    var async: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[BackgroundOptions] = js.undefined
    
    var beforeRender: js.UndefOr[BeforeRenderCallback] = js.undefined
    
    // default views, models & attributes
    var cellViewNamespace: js.UndefOr[js.Any] = js.undefined
    
    var clickThreshold: js.UndefOr[Double] = js.undefined
    
    var connectionPointNamespace: js.UndefOr[js.Any] = js.undefined
    
    // connecting
    var connectionStrategy: js.UndefOr[ConnectionStrategy] = js.undefined
    
    var defaultAnchor: js.UndefOr[AnchorJSON | Anchor] = js.undefined
    
    var defaultConnectionPoint: js.UndefOr[
        ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
      ] = js.undefined
    
    var defaultConnector: js.UndefOr[Connector | ConnectorJSON] = js.undefined
    
    var defaultLink: js.UndefOr[(js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link] = js.undefined
    
    var defaultLinkAnchor: js.UndefOr[AnchorJSON | Anchor] = js.undefined
    
    var defaultRouter: js.UndefOr[Router | RouterJSON] = js.undefined
    
    var drawGrid: js.UndefOr[Boolean | GridOptions | js.Array[GridOptions]] = js.undefined
    
    // views
    var elementView: js.UndefOr[
        Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
      ] = js.undefined
    
    // embedding
    var embeddingMode: js.UndefOr[Boolean] = js.undefined
    
    var findParentBy: js.UndefOr[bbox | center | origin | corner | topRight | bottomLeft] = js.undefined
    
    var frozen: js.UndefOr[Boolean] = js.undefined
    
    // interactions
    var gridSize: js.UndefOr[Double] = js.undefined
    
    // events
    var guard: js.UndefOr[js.Function2[/* evt */ Event, /* view */ CellView, Boolean]] = js.undefined
    
    var height: js.UndefOr[Dimension] = js.undefined
    
    var highlighterNamespace: js.UndefOr[js.Any] = js.undefined
    
    var highlighting: js.UndefOr[StringDictionary[HighlighterJSON]] = js.undefined
    
    var interactive: js.UndefOr[
        (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
      ] = js.undefined
    
    var linkAnchorNamespace: js.UndefOr[js.Any] = js.undefined
    
    var linkConnectionPoint: js.UndefOr[GetConnectionPoint] = js.undefined
    
    var linkPinning: js.UndefOr[Boolean] = js.undefined
    
    var linkView: js.UndefOr[
        Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])
      ] = js.undefined
    
    var magnetThreshold: js.UndefOr[Double | String] = js.undefined
    
    var markAvailable: js.UndefOr[Boolean] = js.undefined
    
    var moveThreshold: js.UndefOr[Double] = js.undefined
    
    var multiLinks: js.UndefOr[Boolean] = js.undefined
    
    var onViewPostponed: js.UndefOr[
        js.Function3[/* view */ View[js.Any], /* flag */ Double, /* paper */ Paper, Boolean]
      ] = js.undefined
    
    var onViewUpdate: js.UndefOr[
        js.Function5[
          /* view */ View[js.Any], 
          /* flag */ Double, 
          /* priority */ Double, 
          /* opt */ StringDictionary[js.Any], 
          /* paper */ Paper, 
          Unit
        ]
      ] = js.undefined
    
    var origin: js.UndefOr[Point] = js.undefined
    
    var perpendicularLinks: js.UndefOr[Boolean] = js.undefined
    
    var preventContextMenu: js.UndefOr[Boolean] = js.undefined
    
    var preventDefaultBlankAction: js.UndefOr[Boolean] = js.undefined
    
    var restrictTranslate: js.UndefOr[(js.Function1[/* elementView */ ElementView, BBox]) | Boolean] = js.undefined
    
    var snapLinks: js.UndefOr[Boolean | Radius] = js.undefined
    
    var sorting: js.UndefOr[typings.jointjs.mod.dia.Paper.sorting] = js.undefined
    
    var validateConnection: js.UndefOr[
        js.Function6[
          /* cellViewS */ CellView, 
          /* magnetS */ SVGElement, 
          /* cellViewT */ CellView, 
          /* magnetT */ SVGElement, 
          /* end */ LinkEnd, 
          /* linkView */ LinkView, 
          Boolean
        ]
      ] = js.undefined
    
    var validateEmbedding: js.UndefOr[js.Function2[/* childView */ ElementView, /* parentView */ ElementView, Boolean]] = js.undefined
    
    // validations
    var validateMagnet: js.UndefOr[
        js.Function3[/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event, Boolean]
      ] = js.undefined
    
    var viewport: js.UndefOr[ViewportCallback | Null] = js.undefined
    
    // appearance
    var width: js.UndefOr[Dimension] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterRender(value: (/* stats */ UpdateStats, /* opt */ StringDictionary[js.Any], /* paper */ Paper) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
      
      @scala.inline
      def setAllowLink(value: (/* linkView */ LinkView, /* paper */ Paper) => Boolean): Self = StObject.set(x, "allowLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAllowLinkNull: Self = StObject.set(x, "allowLink", null)
      
      @scala.inline
      def setAllowLinkUndefined: Self = StObject.set(x, "allowLink", js.undefined)
      
      @scala.inline
      def setAnchorNamespace(value: js.Any): Self = StObject.set(x, "anchorNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorNamespaceUndefined: Self = StObject.set(x, "anchorNamespace", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setBackground(value: BackgroundOptions): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBeforeRender(value: (/* opt */ StringDictionary[js.Any], /* paper */ Paper) => Unit): Self = StObject.set(x, "beforeRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
      
      @scala.inline
      def setCellViewNamespace(value: js.Any): Self = StObject.set(x, "cellViewNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellViewNamespaceUndefined: Self = StObject.set(x, "cellViewNamespace", js.undefined)
      
      @scala.inline
      def setClickThreshold(value: Double): Self = StObject.set(x, "clickThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClickThresholdUndefined: Self = StObject.set(x, "clickThreshold", js.undefined)
      
      @scala.inline
      def setConnectionPointNamespace(value: js.Any): Self = StObject.set(x, "connectionPointNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionPointNamespaceUndefined: Self = StObject.set(x, "connectionPointNamespace", js.undefined)
      
      @scala.inline
      def setConnectionStrategy(
        value: (/* endDefinition */ Cell, /* endView */ CellView, /* endMagnet */ SVGElement, /* coords */ Point) => Element
      ): Self = StObject.set(x, "connectionStrategy", js.Any.fromFunction4(value))
      
      @scala.inline
      def setConnectionStrategyUndefined: Self = StObject.set(x, "connectionStrategy", js.undefined)
      
      @scala.inline
      def setDefaultAnchor(value: AnchorJSON | Anchor): Self = StObject.set(x, "defaultAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultAnchorFunction4(
        value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typings.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
      ): Self = StObject.set(x, "defaultAnchor", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultAnchorUndefined: Self = StObject.set(x, "defaultAnchor", js.undefined)
      
      @scala.inline
      def setDefaultConnectionPoint(
        value: ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
      ): Self = StObject.set(x, "defaultConnectionPoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultConnectionPointFunction1(value: /* repeated */ js.Any => ConnectionPoint): Self = StObject.set(x, "defaultConnectionPoint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultConnectionPointFunction4(
        value: (/* endPathSegmentLine */ Line, /* endView */ CellView, /* endMagnet */ SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
      ): Self = StObject.set(x, "defaultConnectionPoint", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultConnectionPointUndefined: Self = StObject.set(x, "defaultConnectionPoint", js.undefined)
      
      @scala.inline
      def setDefaultConnector(value: Connector | ConnectorJSON): Self = StObject.set(x, "defaultConnector", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultConnectorFunction4(
        value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | typings.jointjs.mod.g.Path
      ): Self = StObject.set(x, "defaultConnector", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultConnectorUndefined: Self = StObject.set(x, "defaultConnector", js.undefined)
      
      @scala.inline
      def setDefaultLink(value: (js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link): Self = StObject.set(x, "defaultLink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLinkAnchor(value: AnchorJSON | Anchor): Self = StObject.set(x, "defaultLinkAnchor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultLinkAnchorFunction4(
        value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typings.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
      ): Self = StObject.set(x, "defaultLinkAnchor", js.Any.fromFunction4(value))
      
      @scala.inline
      def setDefaultLinkAnchorUndefined: Self = StObject.set(x, "defaultLinkAnchor", js.undefined)
      
      @scala.inline
      def setDefaultLinkFunction2(value: (/* cellView */ CellView, /* magnet */ SVGElement) => Link): Self = StObject.set(x, "defaultLink", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefaultLinkUndefined: Self = StObject.set(x, "defaultLink", js.undefined)
      
      @scala.inline
      def setDefaultRouter(value: Router | RouterJSON): Self = StObject.set(x, "defaultRouter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRouterFunction3(
        value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
      ): Self = StObject.set(x, "defaultRouter", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDefaultRouterUndefined: Self = StObject.set(x, "defaultRouter", js.undefined)
      
      @scala.inline
      def setDrawGrid(value: Boolean | GridOptions | js.Array[GridOptions]): Self = StObject.set(x, "drawGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawGridUndefined: Self = StObject.set(x, "drawGrid", js.undefined)
      
      @scala.inline
      def setDrawGridVarargs(value: GridOptions*): Self = StObject.set(x, "drawGrid", js.Array(value :_*))
      
      @scala.inline
      def setElementView(
        value: Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
      ): Self = StObject.set(x, "elementView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementViewFunction1(value: /* element */ Element => Instantiable0[ElementView]): Self = StObject.set(x, "elementView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setElementViewUndefined: Self = StObject.set(x, "elementView", js.undefined)
      
      @scala.inline
      def setEmbeddingMode(value: Boolean): Self = StObject.set(x, "embeddingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmbeddingModeUndefined: Self = StObject.set(x, "embeddingMode", js.undefined)
      
      @scala.inline
      def setFindParentBy(value: bbox | center | origin | corner | topRight | bottomLeft): Self = StObject.set(x, "findParentBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFindParentByUndefined: Self = StObject.set(x, "findParentBy", js.undefined)
      
      @scala.inline
      def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
      
      @scala.inline
      def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      @scala.inline
      def setGuard(value: (/* evt */ Event, /* view */ CellView) => Boolean): Self = StObject.set(x, "guard", js.Any.fromFunction2(value))
      
      @scala.inline
      def setGuardUndefined: Self = StObject.set(x, "guard", js.undefined)
      
      @scala.inline
      def setHeight(value: Dimension): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightNull: Self = StObject.set(x, "height", null)
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHighlighterNamespace(value: js.Any): Self = StObject.set(x, "highlighterNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlighterNamespaceUndefined: Self = StObject.set(x, "highlighterNamespace", js.undefined)
      
      @scala.inline
      def setHighlighting(value: StringDictionary[HighlighterJSON]): Self = StObject.set(x, "highlighting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightingUndefined: Self = StObject.set(x, "highlighting", js.undefined)
      
      @scala.inline
      def setInteractive(
        value: (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
      ): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractiveFunction2(value: (/* cellView */ CellView, /* event */ String) => Boolean | InteractivityOptions): Self = StObject.set(x, "interactive", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      @scala.inline
      def setLinkAnchorNamespace(value: js.Any): Self = StObject.set(x, "linkAnchorNamespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkAnchorNamespaceUndefined: Self = StObject.set(x, "linkAnchorNamespace", js.undefined)
      
      @scala.inline
      def setLinkConnectionPoint(
        value: (/* linkView */ LinkView, /* view */ ElementView, /* magnet */ SVGElement, /* reference */ Point, /* end */ LinkEnd) => Point
      ): Self = StObject.set(x, "linkConnectionPoint", js.Any.fromFunction5(value))
      
      @scala.inline
      def setLinkConnectionPointUndefined: Self = StObject.set(x, "linkConnectionPoint", js.undefined)
      
      @scala.inline
      def setLinkPinning(value: Boolean): Self = StObject.set(x, "linkPinning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkPinningUndefined: Self = StObject.set(x, "linkPinning", js.undefined)
      
      @scala.inline
      def setLinkView(value: Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])): Self = StObject.set(x, "linkView", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkViewFunction1(value: /* link */ Link => Instantiable0[LinkView]): Self = StObject.set(x, "linkView", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinkViewUndefined: Self = StObject.set(x, "linkView", js.undefined)
      
      @scala.inline
      def setMagnetThreshold(value: Double | String): Self = StObject.set(x, "magnetThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnetThresholdUndefined: Self = StObject.set(x, "magnetThreshold", js.undefined)
      
      @scala.inline
      def setMarkAvailable(value: Boolean): Self = StObject.set(x, "markAvailable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkAvailableUndefined: Self = StObject.set(x, "markAvailable", js.undefined)
      
      @scala.inline
      def setMoveThreshold(value: Double): Self = StObject.set(x, "moveThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveThresholdUndefined: Self = StObject.set(x, "moveThreshold", js.undefined)
      
      @scala.inline
      def setMultiLinks(value: Boolean): Self = StObject.set(x, "multiLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiLinksUndefined: Self = StObject.set(x, "multiLinks", js.undefined)
      
      @scala.inline
      def setOnViewPostponed(value: (/* view */ View[js.Any], /* flag */ Double, /* paper */ Paper) => Boolean): Self = StObject.set(x, "onViewPostponed", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnViewPostponedUndefined: Self = StObject.set(x, "onViewPostponed", js.undefined)
      
      @scala.inline
      def setOnViewUpdate(
        value: (/* view */ View[js.Any], /* flag */ Double, /* priority */ Double, /* opt */ StringDictionary[js.Any], /* paper */ Paper) => Unit
      ): Self = StObject.set(x, "onViewUpdate", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnViewUpdateUndefined: Self = StObject.set(x, "onViewUpdate", js.undefined)
      
      @scala.inline
      def setOrigin(value: Point): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPerpendicularLinks(value: Boolean): Self = StObject.set(x, "perpendicularLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPerpendicularLinksUndefined: Self = StObject.set(x, "perpendicularLinks", js.undefined)
      
      @scala.inline
      def setPreventContextMenu(value: Boolean): Self = StObject.set(x, "preventContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventContextMenuUndefined: Self = StObject.set(x, "preventContextMenu", js.undefined)
      
      @scala.inline
      def setPreventDefaultBlankAction(value: Boolean): Self = StObject.set(x, "preventDefaultBlankAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventDefaultBlankActionUndefined: Self = StObject.set(x, "preventDefaultBlankAction", js.undefined)
      
      @scala.inline
      def setRestrictTranslate(value: (js.Function1[/* elementView */ ElementView, BBox]) | Boolean): Self = StObject.set(x, "restrictTranslate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestrictTranslateFunction1(value: /* elementView */ ElementView => BBox): Self = StObject.set(x, "restrictTranslate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRestrictTranslateUndefined: Self = StObject.set(x, "restrictTranslate", js.undefined)
      
      @scala.inline
      def setSnapLinks(value: Boolean | Radius): Self = StObject.set(x, "snapLinks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapLinksUndefined: Self = StObject.set(x, "snapLinks", js.undefined)
      
      @scala.inline
      def setSorting(value: sorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
      
      @scala.inline
      def setValidateConnection(
        value: (/* cellViewS */ CellView, /* magnetS */ SVGElement, /* cellViewT */ CellView, /* magnetT */ SVGElement, /* end */ LinkEnd, /* linkView */ LinkView) => Boolean
      ): Self = StObject.set(x, "validateConnection", js.Any.fromFunction6(value))
      
      @scala.inline
      def setValidateConnectionUndefined: Self = StObject.set(x, "validateConnection", js.undefined)
      
      @scala.inline
      def setValidateEmbedding(value: (/* childView */ ElementView, /* parentView */ ElementView) => Boolean): Self = StObject.set(x, "validateEmbedding", js.Any.fromFunction2(value))
      
      @scala.inline
      def setValidateEmbeddingUndefined: Self = StObject.set(x, "validateEmbedding", js.undefined)
      
      @scala.inline
      def setValidateMagnet(value: (/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event) => Boolean): Self = StObject.set(x, "validateMagnet", js.Any.fromFunction3(value))
      
      @scala.inline
      def setValidateMagnetUndefined: Self = StObject.set(x, "validateMagnet", js.undefined)
      
      @scala.inline
      def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
      
      @scala.inline
      def setViewportNull: Self = StObject.set(x, "viewport", null)
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
      
      @scala.inline
      def setWidth(value: Dimension): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthNull: Self = StObject.set(x, "width", null)
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ProgressCallback = js.Function5[
    /* done */ Boolean, 
    /* processed */ Double, 
    /* total */ Double, 
    /* stats */ UpdateStats, 
    /* paper */ Paper, 
    Unit
  ]
  
  trait ScaleContentOptions extends StObject {
    
    var contentArea: js.UndefOr[BBox] = js.undefined
    
    var fittingBBox: js.UndefOr[BBox] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var maxScaleX: js.UndefOr[Double] = js.undefined
    
    var maxScaleY: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var minScaleX: js.UndefOr[Double] = js.undefined
    
    var minScaleY: js.UndefOr[Double] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    var scaleGrid: js.UndefOr[Double] = js.undefined
    
    var useModelGeometry: js.UndefOr[Boolean] = js.undefined
  }
  object ScaleContentOptions {
    
    @scala.inline
    def apply(): ScaleContentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleContentOptions]
    }
    
    @scala.inline
    implicit class ScaleContentOptionsMutableBuilder[Self <: ScaleContentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentArea(value: BBox): Self = StObject.set(x, "contentArea", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentAreaUndefined: Self = StObject.set(x, "contentArea", js.undefined)
      
      @scala.inline
      def setFittingBBox(value: BBox): Self = StObject.set(x, "fittingBBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFittingBBoxUndefined: Self = StObject.set(x, "fittingBBox", js.undefined)
      
      @scala.inline
      def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      @scala.inline
      def setMaxScaleX(value: Double): Self = StObject.set(x, "maxScaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleXUndefined: Self = StObject.set(x, "maxScaleX", js.undefined)
      
      @scala.inline
      def setMaxScaleY(value: Double): Self = StObject.set(x, "maxScaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxScaleYUndefined: Self = StObject.set(x, "maxScaleY", js.undefined)
      
      @scala.inline
      def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      @scala.inline
      def setMinScaleX(value: Double): Self = StObject.set(x, "minScaleX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleXUndefined: Self = StObject.set(x, "minScaleX", js.undefined)
      
      @scala.inline
      def setMinScaleY(value: Double): Self = StObject.set(x, "minScaleY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinScaleYUndefined: Self = StObject.set(x, "minScaleY", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setPreserveAspectRatio(value: Boolean): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      @scala.inline
      def setScaleGrid(value: Double): Self = StObject.set(x, "scaleGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleGridUndefined: Self = StObject.set(x, "scaleGrid", js.undefined)
      
      @scala.inline
      def setUseModelGeometry(value: Boolean): Self = StObject.set(x, "useModelGeometry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseModelGeometryUndefined: Self = StObject.set(x, "useModelGeometry", js.undefined)
    }
  }
  
  trait UnfreezeOptions extends StObject {
    
    var afterRender: js.UndefOr[AfterRenderCallback] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var beforeRender: js.UndefOr[BeforeRenderCallback] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var mountBatchSize: js.UndefOr[Double] = js.undefined
    
    var progress: js.UndefOr[ProgressCallback] = js.undefined
    
    var unmountBatchSize: js.UndefOr[Double] = js.undefined
    
    var viewport: js.UndefOr[ViewportCallback] = js.undefined
  }
  object UnfreezeOptions {
    
    @scala.inline
    def apply(): UnfreezeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnfreezeOptions]
    }
    
    @scala.inline
    implicit class UnfreezeOptionsMutableBuilder[Self <: UnfreezeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterRender(value: (/* stats */ UpdateStats, /* opt */ StringDictionary[js.Any], /* paper */ Paper) => Unit): Self = StObject.set(x, "afterRender", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAfterRenderUndefined: Self = StObject.set(x, "afterRender", js.undefined)
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setBeforeRender(value: (/* opt */ StringDictionary[js.Any], /* paper */ Paper) => Unit): Self = StObject.set(x, "beforeRender", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeRenderUndefined: Self = StObject.set(x, "beforeRender", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setMountBatchSize(value: Double): Self = StObject.set(x, "mountBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountBatchSizeUndefined: Self = StObject.set(x, "mountBatchSize", js.undefined)
      
      @scala.inline
      def setProgress(
        value: (/* done */ Boolean, /* processed */ Double, /* total */ Double, /* stats */ UpdateStats, /* paper */ Paper) => Unit
      ): Self = StObject.set(x, "progress", js.Any.fromFunction5(value))
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setUnmountBatchSize(value: Double): Self = StObject.set(x, "unmountBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountBatchSizeUndefined: Self = StObject.set(x, "unmountBatchSize", js.undefined)
      
      @scala.inline
      def setViewport(value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper) => Boolean): Self = StObject.set(x, "viewport", js.Any.fromFunction3(value))
      
      @scala.inline
      def setViewportUndefined: Self = StObject.set(x, "viewport", js.undefined)
    }
  }
  
  trait UpdateStats extends StObject {
    
    var batches: js.UndefOr[Double] = js.undefined
    
    var empty: js.UndefOr[Boolean] = js.undefined
    
    var mounted: js.UndefOr[Double] = js.undefined
    
    var postponed: js.UndefOr[Double] = js.undefined
    
    var priority: Double
    
    var unmounted: js.UndefOr[Double] = js.undefined
    
    var updated: Double
  }
  object UpdateStats {
    
    @scala.inline
    def apply(priority: Double, updated: Double): UpdateStats = {
      val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], updated = updated.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdateStats]
    }
    
    @scala.inline
    implicit class UpdateStatsMutableBuilder[Self <: UpdateStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBatches(value: Double): Self = StObject.set(x, "batches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchesUndefined: Self = StObject.set(x, "batches", js.undefined)
      
      @scala.inline
      def setEmpty(value: Boolean): Self = StObject.set(x, "empty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyUndefined: Self = StObject.set(x, "empty", js.undefined)
      
      @scala.inline
      def setMounted(value: Double): Self = StObject.set(x, "mounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMountedUndefined: Self = StObject.set(x, "mounted", js.undefined)
      
      @scala.inline
      def setPostponed(value: Double): Self = StObject.set(x, "postponed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostponedUndefined: Self = StObject.set(x, "postponed", js.undefined)
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmounted(value: Double): Self = StObject.set(x, "unmounted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnmountedUndefined: Self = StObject.set(x, "unmounted", js.undefined)
      
      @scala.inline
      def setUpdated(value: Double): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    }
  }
  
  type ViewportCallback = js.Function3[/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ Paper, Boolean]
}
