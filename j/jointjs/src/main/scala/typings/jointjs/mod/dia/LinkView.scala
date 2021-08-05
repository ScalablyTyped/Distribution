package typings.jointjs.mod.dia

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.anon.Connection
import typings.jointjs.mod.dia.CellView.Options
import typings.jointjs.mod.dia.Link.Label
import typings.jointjs.mod.dia.Link.LabelPosition
import typings.jointjs.mod.dia.LinkView.InteractivityOptions
import typings.jointjs.mod.dia.LinkView.LabelOptions
import typings.jointjs.mod.dia.LinkView.VertexOptions
import typings.jointjs.mod.g.Curve
import typings.jointjs.mod.g.Line
import typings.jointjs.mod.mvc.ViewOptions
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jointjs", "dia.LinkView")
@js.native
class LinkView () extends CellViewGeneric[Link] {
  def this(opt: Options[Link]) = this()
  
  def addLabel(coordinates: Point): Double = js.native
  def addLabel(coordinates: Point, angle: Double): Double = js.native
  def addLabel(coordinates: Point, angle: Double, opt: LabelOptions): Double = js.native
  def addLabel(coordinates: Point, opt: LabelOptions): Double = js.native
  def addLabel(x: Double, y: Double): Double = js.native
  def addLabel(x: Double, y: Double, angle: Double): Double = js.native
  def addLabel(x: Double, y: Double, angle: Double, opt: LabelOptions): Double = js.native
  def addLabel(x: Double, y: Double, opt: LabelOptions): Double = js.native
  
  def addVertex(coordinates: Point): Double = js.native
  def addVertex(coordinates: Point, opt: VertexOptions): Double = js.native
  def addVertex(x: Double, y: Double): Double = js.native
  def addVertex(x: Double, y: Double, opt: VertexOptions): Double = js.native
  
  /* protected */ def drag(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowhead(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowheadEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragArrowheadStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnection(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnectionEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragConnectionStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabel(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabelEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragLabelStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertex(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertexEnd(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def dragVertexStart(evt: Event, x: Double, y: Double): Unit = js.native
  
  def getClosestPoint(point: Point): typings.jointjs.mod.g.Point = js.native
  
  def getClosestPointLength(point: Point): Double = js.native
  
  def getClosestPointRatio(point: Point): Double = js.native
  
  def getConnection(): typings.jointjs.mod.g.Path = js.native
  
  def getConnectionLength(): Double = js.native
  
  def getConnectionSubdivisions(): js.Array[js.Array[Curve]] = js.native
  
  def getEndAnchor(endType: LinkEnd): typings.jointjs.mod.g.Point = js.native
  
  def getEndConnectionPoint(endType: LinkEnd): typings.jointjs.mod.g.Point = js.native
  
  def getEndMagnet(endType: LinkEnd): SVGElement | Null = js.native
  
  def getEndView(endType: LinkEnd): CellView | Null = js.native
  
  def getLabelCoordinates(labelPosition: LabelPosition): typings.jointjs.mod.g.Point = js.native
  
  def getLabelPosition(x: Double, y: Double): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, angle: Double): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, angle: Double, opt: LabelOptions): LabelPosition = js.native
  def getLabelPosition(x: Double, y: Double, opt: LabelOptions): LabelPosition = js.native
  
  def getPointAtLength(length: Double): typings.jointjs.mod.g.Point = js.native
  
  def getPointAtRatio(ratio: Double): typings.jointjs.mod.g.Point = js.native
  
  def getSerializedConnection(): String = js.native
  
  def getTangentAtLength(length: Double): Line = js.native
  
  def getTangentAtRatio(ratio: Double): Line = js.native
  
  def getVertexIndex(point: Point): Double = js.native
  def getVertexIndex(x: Double, y: Double): Double = js.native
  
  /* protected */ def notifyPointerdown(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def notifyPointermove(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def notifyPointerup(evt: Event, x: Double, y: Double): Unit = js.native
  
  /* protected */ def onLabelsChange(link: Link, labels: js.Array[Label], opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onSourceChange(element: Element, sourceEnd: js.Any, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onTargetChange(element: Element, targetEnd: js.Any, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onToolsChange(link: Link, toolsMarkup: String, opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onVerticesChange(link: Link, vertices: js.Array[Point], opt: StringDictionary[js.Any]): Unit = js.native
  
  /* protected */ def onlabel(evt: Event, x: Double, y: Double): Unit = js.native
  
  @JSName("options")
  var options_LinkView: typings.jointjs.mod.dia.LinkView.Options = js.native
  
  def requestConnectionUpdate(): Unit = js.native
  def requestConnectionUpdate(opt: StringDictionary[js.Any]): Unit = js.native
  
  def sendToken(token: SVGElement): Unit = js.native
  def sendToken(token: SVGElement, duration: Double): Unit = js.native
  def sendToken(token: SVGElement, duration: Double, callback: js.Function0[Unit]): Unit = js.native
  def sendToken(token: SVGElement, duration: Unit, callback: js.Function0[Unit]): Unit = js.native
  def sendToken(token: SVGElement, opt: Connection): Unit = js.native
  def sendToken(token: SVGElement, opt: Connection, callback: js.Function0[Unit]): Unit = js.native
  
  def setInteractivity(value: Boolean): Unit = js.native
  def setInteractivity(value: InteractivityOptions): Unit = js.native
  
  def update(link: Link, attributes: js.Any): this.type = js.native
  def update(link: Link, attributes: js.Any, opt: StringDictionary[js.Any]): this.type = js.native
}
object LinkView {
  
  type GetConnectionPoint = js.Function5[
    /* linkView */ LinkView, 
    /* view */ ElementView, 
    /* magnet */ SVGElement, 
    /* reference */ Point, 
    /* end */ LinkEnd, 
    Point
  ]
  
  trait InteractivityOptions extends StObject {
    
    var arrowheadMove: js.UndefOr[Boolean] = js.undefined
    
    var labelMove: js.UndefOr[Boolean] = js.undefined
    
    var linkMove: js.UndefOr[Boolean] = js.undefined
    
    var useLinkTools: js.UndefOr[Boolean] = js.undefined
    
    var vertexAdd: js.UndefOr[Boolean] = js.undefined
    
    var vertexMove: js.UndefOr[Boolean] = js.undefined
    
    var vertexRemove: js.UndefOr[Boolean] = js.undefined
  }
  object InteractivityOptions {
    
    inline def apply(): InteractivityOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InteractivityOptions]
    }
    
    extension [Self <: InteractivityOptions](x: Self) {
      
      inline def setArrowheadMove(value: Boolean): Self = StObject.set(x, "arrowheadMove", value.asInstanceOf[js.Any])
      
      inline def setArrowheadMoveUndefined: Self = StObject.set(x, "arrowheadMove", js.undefined)
      
      inline def setLabelMove(value: Boolean): Self = StObject.set(x, "labelMove", value.asInstanceOf[js.Any])
      
      inline def setLabelMoveUndefined: Self = StObject.set(x, "labelMove", js.undefined)
      
      inline def setLinkMove(value: Boolean): Self = StObject.set(x, "linkMove", value.asInstanceOf[js.Any])
      
      inline def setLinkMoveUndefined: Self = StObject.set(x, "linkMove", js.undefined)
      
      inline def setUseLinkTools(value: Boolean): Self = StObject.set(x, "useLinkTools", value.asInstanceOf[js.Any])
      
      inline def setUseLinkToolsUndefined: Self = StObject.set(x, "useLinkTools", js.undefined)
      
      inline def setVertexAdd(value: Boolean): Self = StObject.set(x, "vertexAdd", value.asInstanceOf[js.Any])
      
      inline def setVertexAddUndefined: Self = StObject.set(x, "vertexAdd", js.undefined)
      
      inline def setVertexMove(value: Boolean): Self = StObject.set(x, "vertexMove", value.asInstanceOf[js.Any])
      
      inline def setVertexMoveUndefined: Self = StObject.set(x, "vertexMove", js.undefined)
      
      inline def setVertexRemove(value: Boolean): Self = StObject.set(x, "vertexRemove", value.asInstanceOf[js.Any])
      
      inline def setVertexRemoveUndefined: Self = StObject.set(x, "vertexRemove", js.undefined)
    }
  }
  
  trait LabelOptions
    extends StObject
       with typings.jointjs.mod.dia.Cell.Options {
    
    var absoluteDistance: js.UndefOr[Boolean] = js.undefined
    
    var absoluteOffset: js.UndefOr[Boolean] = js.undefined
    
    var ensureLegibility: js.UndefOr[Boolean] = js.undefined
    
    var keepGradient: js.UndefOr[Boolean] = js.undefined
    
    var reverseDistance: js.UndefOr[Boolean] = js.undefined
  }
  object LabelOptions {
    
    inline def apply(): LabelOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LabelOptions]
    }
    
    extension [Self <: LabelOptions](x: Self) {
      
      inline def setAbsoluteDistance(value: Boolean): Self = StObject.set(x, "absoluteDistance", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteDistanceUndefined: Self = StObject.set(x, "absoluteDistance", js.undefined)
      
      inline def setAbsoluteOffset(value: Boolean): Self = StObject.set(x, "absoluteOffset", value.asInstanceOf[js.Any])
      
      inline def setAbsoluteOffsetUndefined: Self = StObject.set(x, "absoluteOffset", js.undefined)
      
      inline def setEnsureLegibility(value: Boolean): Self = StObject.set(x, "ensureLegibility", value.asInstanceOf[js.Any])
      
      inline def setEnsureLegibilityUndefined: Self = StObject.set(x, "ensureLegibility", js.undefined)
      
      inline def setKeepGradient(value: Boolean): Self = StObject.set(x, "keepGradient", value.asInstanceOf[js.Any])
      
      inline def setKeepGradientUndefined: Self = StObject.set(x, "keepGradient", js.undefined)
      
      inline def setReverseDistance(value: Boolean): Self = StObject.set(x, "reverseDistance", value.asInstanceOf[js.Any])
      
      inline def setReverseDistanceUndefined: Self = StObject.set(x, "reverseDistance", js.undefined)
    }
  }
  
  trait Options
    extends StObject
       with ViewOptions[Link] {
    
    var doubleLinkTools: js.UndefOr[Boolean] = js.undefined
    
    var doubleLinkToolsOffset: js.UndefOr[Double] = js.undefined
    
    var linkToolsOffset: js.UndefOr[Double] = js.undefined
    
    var longLinkLength: js.UndefOr[Double] = js.undefined
    
    var sampleInterval: js.UndefOr[Double] = js.undefined
    
    var shortLinkLength: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): typings.jointjs.mod.dia.LinkView.Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.jointjs.mod.dia.LinkView.Options]
    }
    
    extension [Self <: typings.jointjs.mod.dia.LinkView.Options](x: Self) {
      
      inline def setDoubleLinkTools(value: Boolean): Self = StObject.set(x, "doubleLinkTools", value.asInstanceOf[js.Any])
      
      inline def setDoubleLinkToolsOffset(value: Double): Self = StObject.set(x, "doubleLinkToolsOffset", value.asInstanceOf[js.Any])
      
      inline def setDoubleLinkToolsOffsetUndefined: Self = StObject.set(x, "doubleLinkToolsOffset", js.undefined)
      
      inline def setDoubleLinkToolsUndefined: Self = StObject.set(x, "doubleLinkTools", js.undefined)
      
      inline def setLinkToolsOffset(value: Double): Self = StObject.set(x, "linkToolsOffset", value.asInstanceOf[js.Any])
      
      inline def setLinkToolsOffsetUndefined: Self = StObject.set(x, "linkToolsOffset", js.undefined)
      
      inline def setLongLinkLength(value: Double): Self = StObject.set(x, "longLinkLength", value.asInstanceOf[js.Any])
      
      inline def setLongLinkLengthUndefined: Self = StObject.set(x, "longLinkLength", js.undefined)
      
      inline def setSampleInterval(value: Double): Self = StObject.set(x, "sampleInterval", value.asInstanceOf[js.Any])
      
      inline def setSampleIntervalUndefined: Self = StObject.set(x, "sampleInterval", js.undefined)
      
      inline def setShortLinkLength(value: Double): Self = StObject.set(x, "shortLinkLength", value.asInstanceOf[js.Any])
      
      inline def setShortLinkLengthUndefined: Self = StObject.set(x, "shortLinkLength", js.undefined)
    }
  }
  
  type VertexOptions = typings.jointjs.mod.dia.Cell.Options
}
