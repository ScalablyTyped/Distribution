package typings.jointjs.mod.dia.Paper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.Radius
import typings.jointjs.jointjsStrings.bbox
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.corner
import typings.jointjs.jointjsStrings.origin
import typings.jointjs.jointjsStrings.topRight
import typings.jointjs.mod.anchors.Anchor
import typings.jointjs.mod.anchors.AnchorJSON
import typings.jointjs.mod.connectionPoints.ConnectionPoint
import typings.jointjs.mod.connectionPoints.ConnectionPointJSON
import typings.jointjs.mod.connectionStrategies.ConnectionStrategy
import typings.jointjs.mod.connectors.Connector
import typings.jointjs.mod.connectors.ConnectorJSON
import typings.jointjs.mod.connectors.ConnectorType
import typings.jointjs.mod.connectors.GenericConnectorArguments
import typings.jointjs.mod.dia.BBox
import typings.jointjs.mod.dia.Cell
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.dia.CellView.InteractivityOptions
import typings.jointjs.mod.dia.Element
import typings.jointjs.mod.dia.ElementView
import typings.jointjs.mod.dia.Event
import typings.jointjs.mod.dia.Graph
import typings.jointjs.mod.dia.Link
import typings.jointjs.mod.dia.LinkEnd
import typings.jointjs.mod.dia.LinkView
import typings.jointjs.mod.dia.LinkView.GetConnectionPoint
import typings.jointjs.mod.dia.Point
import typings.jointjs.mod.g.Line
import typings.jointjs.mod.g.Path
import typings.jointjs.mod.highlighters.HighlighterJSON
import typings.jointjs.mod.mvc.View
import typings.jointjs.mod.mvc.ViewOptions
import typings.jointjs.mod.routers.GenericRouterArguments
import typings.jointjs.mod.routers.Router
import typings.jointjs.mod.routers.RouterJSON
import typings.jointjs.mod.routers.RouterType
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends ViewOptions[Graph] {
  
  var afterRender: js.UndefOr[AfterRenderCallback] = js.native
  
  var allowLink: js.UndefOr[
    (js.Function2[/* linkView */ LinkView, /* paper */ typings.jointjs.mod.dia.Paper, Boolean]) | Null
  ] = js.native
  
  var anchorNamespace: js.UndefOr[js.Any] = js.native
  
  // rendering
  var async: js.UndefOr[Boolean] = js.native
  
  var background: js.UndefOr[BackgroundOptions] = js.native
  
  var beforeRender: js.UndefOr[BeforeRenderCallback] = js.native
  
  // default views, models & attributes
  var cellViewNamespace: js.UndefOr[js.Any] = js.native
  
  var clickThreshold: js.UndefOr[Double] = js.native
  
  var connectionPointNamespace: js.UndefOr[js.Any] = js.native
  
  // connecting
  var connectionStrategy: js.UndefOr[ConnectionStrategy] = js.native
  
  var defaultAnchor: js.UndefOr[AnchorJSON | Anchor] = js.native
  
  var defaultConnectionPoint: js.UndefOr[
    ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
  ] = js.native
  
  var defaultConnector: js.UndefOr[Connector | ConnectorJSON] = js.native
  
  var defaultLink: js.UndefOr[(js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link] = js.native
  
  var defaultLinkAnchor: js.UndefOr[AnchorJSON | Anchor] = js.native
  
  var defaultRouter: js.UndefOr[Router | RouterJSON] = js.native
  
  var drawGrid: js.UndefOr[Boolean | GridOptions | js.Array[GridOptions]] = js.native
  
  // views
  var elementView: js.UndefOr[
    Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
  ] = js.native
  
  // embedding
  var embeddingMode: js.UndefOr[Boolean] = js.native
  
  var findParentBy: js.UndefOr[bbox | center | origin | corner | topRight | bottomLeft] = js.native
  
  var frozen: js.UndefOr[Boolean] = js.native
  
  // interactions
  var gridSize: js.UndefOr[Double] = js.native
  
  // events
  var guard: js.UndefOr[js.Function2[/* evt */ Event, /* view */ CellView, Boolean]] = js.native
  
  var height: js.UndefOr[Dimension] = js.native
  
  var highlighterNamespace: js.UndefOr[js.Any] = js.native
  
  var highlighting: js.UndefOr[StringDictionary[HighlighterJSON]] = js.native
  
  var interactive: js.UndefOr[
    (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
  ] = js.native
  
  var linkAnchorNamespace: js.UndefOr[js.Any] = js.native
  
  var linkConnectionPoint: js.UndefOr[GetConnectionPoint] = js.native
  
  var linkPinning: js.UndefOr[Boolean] = js.native
  
  var linkView: js.UndefOr[
    Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])
  ] = js.native
  
  var magnetThreshold: js.UndefOr[Double | String] = js.native
  
  var markAvailable: js.UndefOr[Boolean] = js.native
  
  var moveThreshold: js.UndefOr[Double] = js.native
  
  var multiLinks: js.UndefOr[Boolean] = js.native
  
  var onViewPostponed: js.UndefOr[
    js.Function3[
      /* view */ View[_], 
      /* flag */ Double, 
      /* paper */ typings.jointjs.mod.dia.Paper, 
      Boolean
    ]
  ] = js.native
  
  var onViewUpdate: js.UndefOr[
    js.Function5[
      /* view */ View[_], 
      /* flag */ Double, 
      /* priority */ Double, 
      /* opt */ StringDictionary[js.Any], 
      /* paper */ typings.jointjs.mod.dia.Paper, 
      Unit
    ]
  ] = js.native
  
  var origin: js.UndefOr[Point] = js.native
  
  var perpendicularLinks: js.UndefOr[Boolean] = js.native
  
  var preventContextMenu: js.UndefOr[Boolean] = js.native
  
  var preventDefaultBlankAction: js.UndefOr[Boolean] = js.native
  
  var restrictTranslate: js.UndefOr[(js.Function1[/* elementView */ ElementView, BBox]) | Boolean] = js.native
  
  var snapLinks: js.UndefOr[Boolean | Radius] = js.native
  
  var sorting: js.UndefOr[typings.jointjs.mod.dia.Paper.sorting] = js.native
  
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
  ] = js.native
  
  var validateEmbedding: js.UndefOr[js.Function2[/* childView */ ElementView, /* parentView */ ElementView, Boolean]] = js.native
  
  // validations
  var validateMagnet: js.UndefOr[
    js.Function3[/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event, Boolean]
  ] = js.native
  
  var viewport: js.UndefOr[ViewportCallback | Null] = js.native
  
  // appearance
  var width: js.UndefOr[Dimension] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAfterRender(
      value: (/* stats */ UpdateStats, /* opt */ StringDictionary[js.Any], /* paper */ typings.jointjs.mod.dia.Paper) => Unit
    ): Self = this.set("afterRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfterRender: Self = this.set("afterRender", js.undefined)
    
    @scala.inline
    def setAllowLink(value: (/* linkView */ LinkView, /* paper */ typings.jointjs.mod.dia.Paper) => Boolean): Self = this.set("allowLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteAllowLink: Self = this.set("allowLink", js.undefined)
    
    @scala.inline
    def setAllowLinkNull: Self = this.set("allowLink", null)
    
    @scala.inline
    def setAnchorNamespace(value: js.Any): Self = this.set("anchorNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorNamespace: Self = this.set("anchorNamespace", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    
    @scala.inline
    def setBackground(value: BackgroundOptions): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    
    @scala.inline
    def setBeforeRender(value: (/* opt */ StringDictionary[js.Any], /* paper */ typings.jointjs.mod.dia.Paper) => Unit): Self = this.set("beforeRender", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeRender: Self = this.set("beforeRender", js.undefined)
    
    @scala.inline
    def setCellViewNamespace(value: js.Any): Self = this.set("cellViewNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellViewNamespace: Self = this.set("cellViewNamespace", js.undefined)
    
    @scala.inline
    def setClickThreshold(value: Double): Self = this.set("clickThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThreshold: Self = this.set("clickThreshold", js.undefined)
    
    @scala.inline
    def setConnectionPointNamespace(value: js.Any): Self = this.set("connectionPointNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionPointNamespace: Self = this.set("connectionPointNamespace", js.undefined)
    
    @scala.inline
    def setConnectionStrategy(
      value: (/* endDefinition */ Cell, /* endView */ CellView, /* endMagnet */ SVGElement, /* coords */ Point) => Element
    ): Self = this.set("connectionStrategy", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteConnectionStrategy: Self = this.set("connectionStrategy", js.undefined)
    
    @scala.inline
    def setDefaultAnchorFunction4(
      value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typings.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
    ): Self = this.set("defaultAnchor", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDefaultAnchor(value: AnchorJSON | Anchor): Self = this.set("defaultAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultAnchor: Self = this.set("defaultAnchor", js.undefined)
    
    @scala.inline
    def setDefaultConnectionPointFunction1(value: /* repeated */ js.Any => ConnectionPoint): Self = this.set("defaultConnectionPoint", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDefaultConnectionPointFunction4(
      value: (/* endPathSegmentLine */ Line, /* endView */ CellView, /* endMagnet */ SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.connectionPoints.ConnectionPointArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
    ): Self = this.set("defaultConnectionPoint", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDefaultConnectionPoint(
      value: ConnectionPointJSON | ConnectionPoint | (js.Function1[/* repeated */ js.Any, ConnectionPoint])
    ): Self = this.set("defaultConnectionPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConnectionPoint: Self = this.set("defaultConnectionPoint", js.undefined)
    
    @scala.inline
    def setDefaultConnectorFunction4(
      value: (/* sourcePoint */ Point, /* targetPoint */ Point, /* routePoints */ js.Array[Point], /* args */ js.UndefOr[GenericConnectorArguments[ConnectorType]]) => String | Path
    ): Self = this.set("defaultConnector", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDefaultConnector(value: Connector | ConnectorJSON): Self = this.set("defaultConnector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultConnector: Self = this.set("defaultConnector", js.undefined)
    
    @scala.inline
    def setDefaultLinkFunction2(value: (/* cellView */ CellView, /* magnet */ SVGElement) => Link): Self = this.set("defaultLink", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDefaultLink(value: (js.Function2[/* cellView */ CellView, /* magnet */ SVGElement, Link]) | Link): Self = this.set("defaultLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLink: Self = this.set("defaultLink", js.undefined)
    
    @scala.inline
    def setDefaultLinkAnchorFunction4(
      value: (/* endView */ CellView, /* endMagnet */ SVGElement, /* anchorReference */ typings.jointjs.mod.g.Point | SVGElement, /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any) => typings.jointjs.mod.g.Point
    ): Self = this.set("defaultLinkAnchor", js.Any.fromFunction4(value))
    
    @scala.inline
    def setDefaultLinkAnchor(value: AnchorJSON | Anchor): Self = this.set("defaultLinkAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLinkAnchor: Self = this.set("defaultLinkAnchor", js.undefined)
    
    @scala.inline
    def setDefaultRouterFunction3(
      value: (/* vertices */ js.Array[Point], /* args */ js.UndefOr[GenericRouterArguments[RouterType]], /* linkView */ js.UndefOr[LinkView]) => js.Array[Point]
    ): Self = this.set("defaultRouter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDefaultRouter(value: Router | RouterJSON): Self = this.set("defaultRouter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRouter: Self = this.set("defaultRouter", js.undefined)
    
    @scala.inline
    def setDrawGridVarargs(value: GridOptions*): Self = this.set("drawGrid", js.Array(value :_*))
    
    @scala.inline
    def setDrawGrid(value: Boolean | GridOptions | js.Array[GridOptions]): Self = this.set("drawGrid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDrawGrid: Self = this.set("drawGrid", js.undefined)
    
    @scala.inline
    def setElementViewFunction1(value: /* element */ Element => Instantiable0[ElementView]): Self = this.set("elementView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setElementView(
      value: Instantiable0[ElementView] | (js.Function1[/* element */ Element, Instantiable0[ElementView]])
    ): Self = this.set("elementView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElementView: Self = this.set("elementView", js.undefined)
    
    @scala.inline
    def setEmbeddingMode(value: Boolean): Self = this.set("embeddingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmbeddingMode: Self = this.set("embeddingMode", js.undefined)
    
    @scala.inline
    def setFindParentBy(value: bbox | center | origin | corner | topRight | bottomLeft): Self = this.set("findParentBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindParentBy: Self = this.set("findParentBy", js.undefined)
    
    @scala.inline
    def setFrozen(value: Boolean): Self = this.set("frozen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrozen: Self = this.set("frozen", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setGuard(value: (/* evt */ Event, /* view */ CellView) => Boolean): Self = this.set("guard", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGuard: Self = this.set("guard", js.undefined)
    
    @scala.inline
    def setHeight(value: Dimension): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHeightNull: Self = this.set("height", null)
    
    @scala.inline
    def setHighlighterNamespace(value: js.Any): Self = this.set("highlighterNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlighterNamespace: Self = this.set("highlighterNamespace", js.undefined)
    
    @scala.inline
    def setHighlighting(value: StringDictionary[HighlighterJSON]): Self = this.set("highlighting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlighting: Self = this.set("highlighting", js.undefined)
    
    @scala.inline
    def setInteractiveFunction2(value: (/* cellView */ CellView, /* event */ String) => Boolean | InteractivityOptions): Self = this.set("interactive", js.Any.fromFunction2(value))
    
    @scala.inline
    def setInteractive(
      value: (js.Function2[/* cellView */ CellView, /* event */ String, Boolean | InteractivityOptions]) | Boolean | InteractivityOptions
    ): Self = this.set("interactive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    
    @scala.inline
    def setLinkAnchorNamespace(value: js.Any): Self = this.set("linkAnchorNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkAnchorNamespace: Self = this.set("linkAnchorNamespace", js.undefined)
    
    @scala.inline
    def setLinkConnectionPoint(
      value: (/* linkView */ LinkView, /* view */ ElementView, /* magnet */ SVGElement, /* reference */ Point, /* end */ LinkEnd) => Point
    ): Self = this.set("linkConnectionPoint", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteLinkConnectionPoint: Self = this.set("linkConnectionPoint", js.undefined)
    
    @scala.inline
    def setLinkPinning(value: Boolean): Self = this.set("linkPinning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkPinning: Self = this.set("linkPinning", js.undefined)
    
    @scala.inline
    def setLinkViewFunction1(value: /* link */ Link => Instantiable0[LinkView]): Self = this.set("linkView", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLinkView(value: Instantiable0[LinkView] | (js.Function1[/* link */ Link, Instantiable0[LinkView]])): Self = this.set("linkView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinkView: Self = this.set("linkView", js.undefined)
    
    @scala.inline
    def setMagnetThreshold(value: Double | String): Self = this.set("magnetThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMagnetThreshold: Self = this.set("magnetThreshold", js.undefined)
    
    @scala.inline
    def setMarkAvailable(value: Boolean): Self = this.set("markAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMarkAvailable: Self = this.set("markAvailable", js.undefined)
    
    @scala.inline
    def setMoveThreshold(value: Double): Self = this.set("moveThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveThreshold: Self = this.set("moveThreshold", js.undefined)
    
    @scala.inline
    def setMultiLinks(value: Boolean): Self = this.set("multiLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiLinks: Self = this.set("multiLinks", js.undefined)
    
    @scala.inline
    def setOnViewPostponed(
      value: (/* view */ View[_], /* flag */ Double, /* paper */ typings.jointjs.mod.dia.Paper) => Boolean
    ): Self = this.set("onViewPostponed", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteOnViewPostponed: Self = this.set("onViewPostponed", js.undefined)
    
    @scala.inline
    def setOnViewUpdate(
      value: (/* view */ View[_], /* flag */ Double, /* priority */ Double, /* opt */ StringDictionary[js.Any], /* paper */ typings.jointjs.mod.dia.Paper) => Unit
    ): Self = this.set("onViewUpdate", js.Any.fromFunction5(value))
    
    @scala.inline
    def deleteOnViewUpdate: Self = this.set("onViewUpdate", js.undefined)
    
    @scala.inline
    def setOrigin(value: Point): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setPerpendicularLinks(value: Boolean): Self = this.set("perpendicularLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerpendicularLinks: Self = this.set("perpendicularLinks", js.undefined)
    
    @scala.inline
    def setPreventContextMenu(value: Boolean): Self = this.set("preventContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventContextMenu: Self = this.set("preventContextMenu", js.undefined)
    
    @scala.inline
    def setPreventDefaultBlankAction(value: Boolean): Self = this.set("preventDefaultBlankAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefaultBlankAction: Self = this.set("preventDefaultBlankAction", js.undefined)
    
    @scala.inline
    def setRestrictTranslateFunction1(value: /* elementView */ ElementView => BBox): Self = this.set("restrictTranslate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRestrictTranslate(value: (js.Function1[/* elementView */ ElementView, BBox]) | Boolean): Self = this.set("restrictTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictTranslate: Self = this.set("restrictTranslate", js.undefined)
    
    @scala.inline
    def setSnapLinks(value: Boolean | Radius): Self = this.set("snapLinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapLinks: Self = this.set("snapLinks", js.undefined)
    
    @scala.inline
    def setSorting(value: sorting): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setValidateConnection(
      value: (/* cellViewS */ CellView, /* magnetS */ SVGElement, /* cellViewT */ CellView, /* magnetT */ SVGElement, /* end */ LinkEnd, /* linkView */ LinkView) => Boolean
    ): Self = this.set("validateConnection", js.Any.fromFunction6(value))
    
    @scala.inline
    def deleteValidateConnection: Self = this.set("validateConnection", js.undefined)
    
    @scala.inline
    def setValidateEmbedding(value: (/* childView */ ElementView, /* parentView */ ElementView) => Boolean): Self = this.set("validateEmbedding", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteValidateEmbedding: Self = this.set("validateEmbedding", js.undefined)
    
    @scala.inline
    def setValidateMagnet(value: (/* cellView */ CellView, /* magnet */ SVGElement, /* evt */ Event) => Boolean): Self = this.set("validateMagnet", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteValidateMagnet: Self = this.set("validateMagnet", js.undefined)
    
    @scala.inline
    def setViewport(
      value: (/* view */ View[js.Any], /* isMounted */ Boolean, /* paper */ typings.jointjs.mod.dia.Paper) => Boolean
    ): Self = this.set("viewport", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteViewport: Self = this.set("viewport", js.undefined)
    
    @scala.inline
    def setViewportNull: Self = this.set("viewport", null)
    
    @scala.inline
    def setWidth(value: Dimension): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWidthNull: Self = this.set("width", null)
  }
}
