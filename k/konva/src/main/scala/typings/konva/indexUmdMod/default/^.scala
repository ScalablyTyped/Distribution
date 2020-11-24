package typings.konva.indexUmdMod.default

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.konva.anon.Assign
import typings.konva.anon.BackEaseIn
import typings.konva.anon.Blur
import typings.konva.anon.Browser
import typings.konva.anon.Drag
import typings.konva.anon.TypeofAnimation
import typings.konva.anon.TypeofCollection
import typings.konva.anon.TypeofImage
import typings.konva.anon.TypeofNode
import typings.konva.anon.TypeofPath
import typings.konva.anon.TypeofTween
import typings.konva.canvasMod.ICanvasConfig
import typings.konva.layerMod.LayerConfig
import typings.konva.lineMod.LineConfig
import typings.konva.nodeMod.Node
import typings.konva.nodeMod.NodeConfig
import typings.konva.shapeMod.ShapeConfig
import typings.konva.stageMod.StageConfig
import typings.konva.textMod.TextConfig
import typings.konva.textPathMod.TextPathConfig
import typings.konva.transformerMod.TransformerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("konva/types/index-umd", JSImport.Default)
@js.native
object ^ extends js.Object {
  
  var Animation: TypeofAnimation = js.native
  
  var Arc: Instantiable0[typings.konva.arcMod.Arc] = js.native
  
  var Arrow: Instantiable0[typings.konva.arrowMod.Arrow] = js.native
  
  var Canvas: Instantiable1[/* config */ ICanvasConfig, typings.konva.canvasMod.Canvas] = js.native
  
  var Circle: Instantiable0[typings.konva.circleMod.Circle] = js.native
  
  var Collection: TypeofCollection = js.native
  
  var Container: Instantiable0[typings.konva.containerMod.Container[Node[NodeConfig]]] = js.native
  
  var Context: Instantiable1[/* canvas */ typings.konva.canvasMod.Canvas, typings.konva.contextMod.Context] = js.native
  
  var DD: Drag = js.native
  
  var Easings: BackEaseIn = js.native
  
  var Ellipse: Instantiable0[typings.konva.ellipseMod.Ellipse] = js.native
  
  var FastLayer: Instantiable1[/* attrs */ js.Any, typings.konva.fastLayerMod.FastLayer] = js.native
  
  var Filters: Blur = js.native
  
  var Group: Instantiable0[typings.konva.groupMod.Group] = js.native
  
  var Image: TypeofImage = js.native
  
  var Label: Instantiable1[/* config */ js.Any, typings.konva.labelMod.Label] = js.native
  
  var Layer: Instantiable1[/* config */ js.UndefOr[LayerConfig], typings.konva.layerMod.Layer] = js.native
  
  var Line: Instantiable1[
    /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
    typings.konva.lineMod.Line[LineConfig]
  ] = js.native
  
  var Node: TypeofNode = js.native
  
  var Path: TypeofPath = js.native
  
  var Rect: Instantiable0[typings.konva.rectMod.Rect] = js.native
  
  var RegularPolygon: Instantiable0[typings.konva.regularPolygonMod.RegularPolygon] = js.native
  
  var Ring: Instantiable0[typings.konva.ringMod.Ring] = js.native
  
  var Shape: Instantiable1[
    /* config */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam Config */ js.Any], 
    typings.konva.shapeMod.Shape[ShapeConfig]
  ] = js.native
  
  var Sprite: Instantiable1[/* config */ js.Any, typings.konva.spriteMod.Sprite] = js.native
  
  var Stage: Instantiable1[/* config */ StageConfig, typings.konva.stageMod.Stage] = js.native
  
  var Star: Instantiable0[typings.konva.starMod.Star] = js.native
  
  var Tag: Instantiable0[typings.konva.labelMod.Tag] = js.native
  
  var Text: Instantiable1[/* config */ js.UndefOr[TextConfig], typings.konva.textMod.Text] = js.native
  
  var TextPath: Instantiable1[/* config */ js.UndefOr[TextPathConfig], typings.konva.textPathMod.TextPath] = js.native
  
  var Transform: Instantiable1[/* m */ js.UndefOr[js.Array[Double]], typings.konva.utilMod.Transform] = js.native
  
  var Transformer: Instantiable1[
    /* config */ js.UndefOr[TransformerConfig], 
    typings.konva.transformerMod.Transformer
  ] = js.native
  
  var Tween: TypeofTween = js.native
  
  var UA: Browser = js.native
  
  var Util: Assign = js.native
  
  var Wedge: Instantiable0[typings.konva.wedgeMod.Wedge] = js.native
  
  var _global: js.Any = js.native
  
  def _injectGlobal(Konva: js.Any): Unit = js.native
  
  def _parseUA(userAgent: js.Any): Browser = js.native
  
  var _pointerEventsEnabled: Boolean = js.native
  
  var angleDeg: Boolean = js.native
  
  var captureTouchEventsEnabled: Boolean = js.native
  
  var dblClickWindow: Double = js.native
  
  var document: js.Any = js.native
  
  var dragButtons: js.Array[Double] = js.native
  
  var dragDistance: Double = js.native
  
  var enableTrace: Boolean = js.native
  
  def getAngle(angle: js.Any): js.Any = js.native
  
  var hitOnDragEnabled: Boolean = js.native
  
  var ids: js.Any = js.native
  
  var inDblClickWindow: Boolean = js.native
  
  var isBrowser: Boolean = js.native
  
  def isDragReady(): Boolean = js.native
  
  def isDragging(): js.Any = js.native
  
  var isUnminified: Boolean = js.native
  
  var listenClickTap: Boolean = js.native
  
  var names: js.Any = js.native
  
  var pixelRatio: js.Any = js.native
  
  var shapes: StringDictionary[typings.konva.shapeMod.Shape[ShapeConfig]] = js.native
  
  var showWarnings: Boolean = js.native
  
  var stages: js.Array[typings.konva.stageMod.Stage] = js.native
  
  var version: String = js.native
}
