package typings.konva

import typings.konva.anon.HeightRotation
import typings.konva.anon.RotationWidth
import typings.konva.containerMod.ContainerConfig
import typings.konva.groupMod.Group
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.rectMod.Rect
import typings.konva.typesMod.GetSet
import typings.konva.typesMod.IRect
import typings.konva.typesMod.Vector2d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transformerMod {
  
  @JSImport("konva/types/shapes/Transformer", "Transformer")
  @js.native
  class Transformer () extends Group {
    def this(config: TransformerConfig) = this()
    
    def __getNodeRect(): RotationWidth = js.native
    
    def __getNodeShape(node: Node[NodeConfig]): HeightRotation = js.native
    def __getNodeShape(node: Node[NodeConfig], rot: js.UndefOr[scala.Nothing], relative: Node[NodeConfig]): HeightRotation = js.native
    def __getNodeShape(node: Node[NodeConfig], rot: Double): HeightRotation = js.native
    def __getNodeShape(node: Node[NodeConfig], rot: Double, relative: Node[NodeConfig]): HeightRotation = js.native
    
    var _anchorDragOffset: Vector2d = js.native
    
    def _batchChangeChild(selector: String, attrs: js.Any): Unit = js.native
    
    def _createAnchor(name: js.Any): Unit = js.native
    
    def _createBack(): Unit = js.native
    
    def _createElements(): Unit = js.native
    
    var _cursorChange: Boolean = js.native
    
    def _fitNodesInto(newAttrs: js.Any, evt: js.Any): Unit = js.native
    
    def _getNodeRect(): js.Any = js.native
    
    def _handleMouseDown(e: js.Any): Unit = js.native
    
    def _handleMouseMove(e: js.Any): Unit = js.native
    
    def _handleMouseUp(e: js.Any): Unit = js.native
    
    var _movingAnchorName: String = js.native
    
    var _nodes: js.Array[Node[NodeConfig]] = js.native
    
    def _proxyDrag(node: Node[NodeConfig]): Unit = js.native
    
    def _removeEvents(): Unit = js.native
    def _removeEvents(e: js.Any): Unit = js.native
    
    def _resetTransformCache(): Unit = js.native
    
    var _transforming: Boolean = js.native
    
    def anchorCornerRadius(): Double = js.native
    def anchorCornerRadius(v: Double): this.type = js.native
    @JSName("anchorCornerRadius")
    var anchorCornerRadius_Original: GetSet[Double, this.type] = js.native
    
    def anchorFill(): String = js.native
    def anchorFill(v: String): this.type = js.native
    @JSName("anchorFill")
    var anchorFill_Original: GetSet[String, this.type] = js.native
    
    def anchorSize(): Double = js.native
    def anchorSize(v: Double): this.type = js.native
    @JSName("anchorSize")
    var anchorSize_Original: GetSet[Double, this.type] = js.native
    
    def anchorStroke(): String = js.native
    def anchorStroke(v: String): this.type = js.native
    
    def anchorStrokeWidth(): Double = js.native
    def anchorStrokeWidth(v: Double): this.type = js.native
    @JSName("anchorStrokeWidth")
    var anchorStrokeWidth_Original: GetSet[Double, this.type] = js.native
    
    @JSName("anchorStroke")
    var anchorStroke_Original: GetSet[String, this.type] = js.native
    
    def attachTo(node: js.Any): this.type = js.native
    
    def borderDash(): js.Array[Double] = js.native
    def borderDash(v: js.Array[Double]): this.type = js.native
    @JSName("borderDash")
    var borderDash_Original: GetSet[js.Array[Double], this.type] = js.native
    
    def borderEnabled(): Boolean = js.native
    def borderEnabled(v: Boolean): this.type = js.native
    @JSName("borderEnabled")
    var borderEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def borderStroke(): String = js.native
    def borderStroke(v: String): this.type = js.native
    
    def borderStrokeWidth(): Double = js.native
    def borderStrokeWidth(v: Double): this.type = js.native
    @JSName("borderStrokeWidth")
    var borderStrokeWidth_Original: GetSet[Double, this.type] = js.native
    
    @JSName("borderStroke")
    var borderStroke_Original: GetSet[String, this.type] = js.native
    
    def boundBoxFunc(): js.Function2[/* oldBox */ Box, /* newBox */ Box, Box] = js.native
    def boundBoxFunc(v: js.Function2[/* oldBox */ Box, /* newBox */ Box, Box]): this.type = js.native
    @JSName("boundBoxFunc")
    var boundBoxFunc_Original: GetSet[js.Function2[/* oldBox */ Box, /* newBox */ Box, Box], this.type] = js.native
    
    def centeredScaling(): Boolean = js.native
    def centeredScaling(v: Boolean): this.type = js.native
    @JSName("centeredScaling")
    var centeredScaling_Original: GetSet[Boolean, this.type] = js.native
    
    var cos: Double = js.native
    
    def detach(): Unit = js.native
    
    def enabledAnchors(): js.Array[String] = js.native
    def enabledAnchors(v: js.Array[String]): this.type = js.native
    @JSName("enabledAnchors")
    var enabledAnchors_Original: GetSet[js.Array[String], this.type] = js.native
    
    def forceUpdate(): Unit = js.native
    
    def getActiveAnchor(): String = js.native
    
    def getHeight(): js.Any = js.native
    
    def getNode(): Node[NodeConfig] = js.native
    
    def getNodes(): js.Array[Node[NodeConfig]] = js.native
    
    def getWidth(): js.Any = js.native
    
    def getX(): js.Any = js.native
    
    def getY(): js.Any = js.native
    
    def ignoreStroke(): Boolean = js.native
    def ignoreStroke(v: Boolean): this.type = js.native
    @JSName("ignoreStroke")
    var ignoreStroke_Original: GetSet[Boolean, this.type] = js.native
    
    def isTransforming(): Boolean = js.native
    
    def keepRatio(): Boolean = js.native
    def keepRatio(v: Boolean): this.type = js.native
    @JSName("keepRatio")
    var keepRatio_Original: GetSet[Boolean, this.type] = js.native
    
    def nodes(): js.Array[Node[NodeConfig]] = js.native
    def nodes(v: js.Array[Node[NodeConfig]]): this.type = js.native
    @JSName("nodes")
    var nodes_Original: GetSet[js.Array[Node[NodeConfig]], this.type] = js.native
    
    def padding(): Double = js.native
    def padding(v: Double): this.type = js.native
    @JSName("padding")
    var padding_Original: GetSet[Double, this.type] = js.native
    
    def resizeEnabled(): Boolean = js.native
    def resizeEnabled(v: Boolean): this.type = js.native
    @JSName("resizeEnabled")
    var resizeEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def rotateAnchorOffset(): Double = js.native
    def rotateAnchorOffset(v: Double): this.type = js.native
    @JSName("rotateAnchorOffset")
    var rotateAnchorOffset_Original: GetSet[Double, this.type] = js.native
    
    def rotateEnabled(): Boolean = js.native
    def rotateEnabled(v: Boolean): this.type = js.native
    @JSName("rotateEnabled")
    var rotateEnabled_Original: GetSet[Boolean, this.type] = js.native
    
    def rotationSnapTolerance(): Double = js.native
    def rotationSnapTolerance(v: Double): this.type = js.native
    @JSName("rotationSnapTolerance")
    var rotationSnapTolerance_Original: GetSet[Double, this.type] = js.native
    
    def rotationSnaps(): js.Array[Double] = js.native
    def rotationSnaps(v: js.Array[Double]): this.type = js.native
    @JSName("rotationSnaps")
    var rotationSnaps_Original: GetSet[js.Array[Double], this.type] = js.native
    
    def setNode(node: js.Any): this.type = js.native
    
    def setNodes(): this.type = js.native
    def setNodes(nodes: js.Array[Node[NodeConfig]]): this.type = js.native
    
    def shouldOverdrawWholeArea(): Boolean = js.native
    def shouldOverdrawWholeArea(v: Boolean): this.type = js.native
    @JSName("shouldOverdrawWholeArea")
    var shouldOverdrawWholeArea_Original: GetSet[Boolean, this.type] = js.native
    
    var sin: Double = js.native
    
    def stopTransform(): Unit = js.native
    
    def update(): Unit = js.native
  }
  
  @js.native
  trait Box extends IRect {
    
    var rotation: Double = js.native
  }
  object Box {
    
    @scala.inline
    def apply(height: Double, rotation: Double, width: Double, x: Double, y: Double): Box = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Box]
    }
    
    @scala.inline
    implicit class BoxMutableBuilder[Self <: Box] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransformerConfig extends ContainerConfig {
    
    var anchorFill: js.UndefOr[String] = js.native
    
    var anchorSize: js.UndefOr[Double] = js.native
    
    var anchorStroke: js.UndefOr[String] = js.native
    
    var anchorStrokeWidth: js.UndefOr[Double] = js.native
    
    var borderDash: js.UndefOr[js.Array[Double]] = js.native
    
    var borderEnabled: js.UndefOr[Boolean] = js.native
    
    var borderStroke: js.UndefOr[String] = js.native
    
    var borderStrokeWidth: js.UndefOr[Double] = js.native
    
    var boundBoxFunc: js.UndefOr[js.Function2[/* oldBox */ Box, /* newBox */ Box, Box]] = js.native
    
    var centeredScaling: js.UndefOr[Boolean] = js.native
    
    var enabledAnchors: js.UndefOr[js.Array[String]] = js.native
    
    var ignoreStroke: js.UndefOr[Boolean] = js.native
    
    var keepRatio: js.UndefOr[Boolean] = js.native
    
    var node: js.UndefOr[Rect] = js.native
    
    var resizeEnabled: js.UndefOr[Boolean] = js.native
    
    var rotateAnchorOffset: js.UndefOr[Double] = js.native
    
    var rotateEnabled: js.UndefOr[Boolean] = js.native
    
    var rotationSnapTolerance: js.UndefOr[Double] = js.native
    
    var rotationSnaps: js.UndefOr[js.Array[Double]] = js.native
  }
  object TransformerConfig {
    
    @scala.inline
    def apply(): TransformerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransformerConfig]
    }
    
    @scala.inline
    implicit class TransformerConfigMutableBuilder[Self <: TransformerConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorFill(value: String): Self = StObject.set(x, "anchorFill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorFillUndefined: Self = StObject.set(x, "anchorFill", js.undefined)
      
      @scala.inline
      def setAnchorSize(value: Double): Self = StObject.set(x, "anchorSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorSizeUndefined: Self = StObject.set(x, "anchorSize", js.undefined)
      
      @scala.inline
      def setAnchorStroke(value: String): Self = StObject.set(x, "anchorStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorStrokeUndefined: Self = StObject.set(x, "anchorStroke", js.undefined)
      
      @scala.inline
      def setAnchorStrokeWidth(value: Double): Self = StObject.set(x, "anchorStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorStrokeWidthUndefined: Self = StObject.set(x, "anchorStrokeWidth", js.undefined)
      
      @scala.inline
      def setBorderDash(value: js.Array[Double]): Self = StObject.set(x, "borderDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderDashUndefined: Self = StObject.set(x, "borderDash", js.undefined)
      
      @scala.inline
      def setBorderDashVarargs(value: Double*): Self = StObject.set(x, "borderDash", js.Array(value :_*))
      
      @scala.inline
      def setBorderEnabled(value: Boolean): Self = StObject.set(x, "borderEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderEnabledUndefined: Self = StObject.set(x, "borderEnabled", js.undefined)
      
      @scala.inline
      def setBorderStroke(value: String): Self = StObject.set(x, "borderStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStrokeUndefined: Self = StObject.set(x, "borderStroke", js.undefined)
      
      @scala.inline
      def setBorderStrokeWidth(value: Double): Self = StObject.set(x, "borderStrokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderStrokeWidthUndefined: Self = StObject.set(x, "borderStrokeWidth", js.undefined)
      
      @scala.inline
      def setBoundBoxFunc(value: (/* oldBox */ Box, /* newBox */ Box) => Box): Self = StObject.set(x, "boundBoxFunc", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBoundBoxFuncUndefined: Self = StObject.set(x, "boundBoxFunc", js.undefined)
      
      @scala.inline
      def setCenteredScaling(value: Boolean): Self = StObject.set(x, "centeredScaling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenteredScalingUndefined: Self = StObject.set(x, "centeredScaling", js.undefined)
      
      @scala.inline
      def setEnabledAnchors(value: js.Array[String]): Self = StObject.set(x, "enabledAnchors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledAnchorsUndefined: Self = StObject.set(x, "enabledAnchors", js.undefined)
      
      @scala.inline
      def setEnabledAnchorsVarargs(value: String*): Self = StObject.set(x, "enabledAnchors", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreStroke(value: Boolean): Self = StObject.set(x, "ignoreStroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreStrokeUndefined: Self = StObject.set(x, "ignoreStroke", js.undefined)
      
      @scala.inline
      def setKeepRatio(value: Boolean): Self = StObject.set(x, "keepRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepRatioUndefined: Self = StObject.set(x, "keepRatio", js.undefined)
      
      @scala.inline
      def setNode(value: Rect): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setResizeEnabled(value: Boolean): Self = StObject.set(x, "resizeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeEnabledUndefined: Self = StObject.set(x, "resizeEnabled", js.undefined)
      
      @scala.inline
      def setRotateAnchorOffset(value: Double): Self = StObject.set(x, "rotateAnchorOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateAnchorOffsetUndefined: Self = StObject.set(x, "rotateAnchorOffset", js.undefined)
      
      @scala.inline
      def setRotateEnabled(value: Boolean): Self = StObject.set(x, "rotateEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateEnabledUndefined: Self = StObject.set(x, "rotateEnabled", js.undefined)
      
      @scala.inline
      def setRotationSnapTolerance(value: Double): Self = StObject.set(x, "rotationSnapTolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationSnapToleranceUndefined: Self = StObject.set(x, "rotationSnapTolerance", js.undefined)
      
      @scala.inline
      def setRotationSnaps(value: js.Array[Double]): Self = StObject.set(x, "rotationSnaps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationSnapsUndefined: Self = StObject.set(x, "rotationSnaps", js.undefined)
      
      @scala.inline
      def setRotationSnapsVarargs(value: Double*): Self = StObject.set(x, "rotationSnaps", js.Array(value :_*))
    }
  }
}
