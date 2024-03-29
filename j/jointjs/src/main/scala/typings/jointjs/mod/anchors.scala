package typings.jointjs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.jointjs.jointjsStrings.bottom
import typings.jointjs.jointjsStrings.bottomLeft
import typings.jointjs.jointjsStrings.bottomRight
import typings.jointjs.jointjsStrings.center
import typings.jointjs.jointjsStrings.left
import typings.jointjs.jointjsStrings.midSide
import typings.jointjs.jointjsStrings.perpendicular
import typings.jointjs.jointjsStrings.right
import typings.jointjs.jointjsStrings.top
import typings.jointjs.jointjsStrings.topLeft
import typings.jointjs.jointjsStrings.topRight
import typings.jointjs.mod.dia.CellView
import typings.jointjs.mod.g.Point
import typings.jointjs.mod.linkAnchors.ConnectionClosestAnchorArguments
import typings.jointjs.mod.linkAnchors.ConnectionLengthAnchorArguments
import typings.jointjs.mod.linkAnchors.ConnectionPerpendicularAnchorArguments
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anchors {
  
  @JSImport("jointjs", "anchors")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jointjs", "anchors.bottom")
  @js.native
  def bottom: GenericAnchor[typings.jointjs.jointjsStrings.bottom] = js.native
  
  @JSImport("jointjs", "anchors.bottomLeft")
  @js.native
  def bottomLeft: GenericAnchor[typings.jointjs.jointjsStrings.bottomLeft] = js.native
  inline def bottomLeft_=(x: GenericAnchor[bottomLeft]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomLeft")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.bottomRight")
  @js.native
  def bottomRight: GenericAnchor[typings.jointjs.jointjsStrings.bottomRight] = js.native
  inline def bottomRight_=(x: GenericAnchor[bottomRight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottomRight")(x.asInstanceOf[js.Any])
  
  inline def bottom_=(x: GenericAnchor[bottom]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bottom")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.center")
  @js.native
  def center: GenericAnchor[typings.jointjs.jointjsStrings.center] = js.native
  inline def center_=(x: GenericAnchor[center]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("center")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.left")
  @js.native
  def left: GenericAnchor[typings.jointjs.jointjsStrings.left] = js.native
  inline def left_=(x: GenericAnchor[left]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.midSide")
  @js.native
  def midSide: GenericAnchor[typings.jointjs.jointjsStrings.midSide] = js.native
  inline def midSide_=(x: GenericAnchor[midSide]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("midSide")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.perpendicular")
  @js.native
  def perpendicular: GenericAnchor[typings.jointjs.jointjsStrings.perpendicular] = js.native
  inline def perpendicular_=(x: GenericAnchor[perpendicular]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("perpendicular")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.right")
  @js.native
  def right: GenericAnchor[typings.jointjs.jointjsStrings.right] = js.native
  inline def right_=(x: GenericAnchor[right]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.top")
  @js.native
  def top: GenericAnchor[typings.jointjs.jointjsStrings.top] = js.native
  
  @JSImport("jointjs", "anchors.topLeft")
  @js.native
  def topLeft: GenericAnchor[typings.jointjs.jointjsStrings.topLeft] = js.native
  inline def topLeft_=(x: GenericAnchor[topLeft]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topLeft")(x.asInstanceOf[js.Any])
  
  @JSImport("jointjs", "anchors.topRight")
  @js.native
  def topRight: GenericAnchor[typings.jointjs.jointjsStrings.topRight] = js.native
  inline def topRight_=(x: GenericAnchor[topRight]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("topRight")(x.asInstanceOf[js.Any])
  
  inline def top_=(x: GenericAnchor[top]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  
  type Anchor = GenericAnchor[AnchorType]
  
  /* Inlined jointjs.jointjs.anchors.GenericAnchorArguments<jointjs.jointjs.anchors.AnchorType> */
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.length
    - typings.jointjs.jointjsStrings.dx
    - typings.jointjs.jointjsStrings.padding
    - typings.jointjs.jointjsStrings.fallbackAt
    - typings.jointjs.jointjsStrings.fixedAt
    - typings.jointjs.jointjsStrings.dy
  */
  trait AnchorArguments extends StObject
  object AnchorArguments {
    
    inline def dx: typings.jointjs.jointjsStrings.dx = "dx".asInstanceOf[typings.jointjs.jointjsStrings.dx]
    
    inline def dy: typings.jointjs.jointjsStrings.dy = "dy".asInstanceOf[typings.jointjs.jointjsStrings.dy]
    
    inline def fallbackAt: typings.jointjs.jointjsStrings.fallbackAt = "fallbackAt".asInstanceOf[typings.jointjs.jointjsStrings.fallbackAt]
    
    inline def fixedAt: typings.jointjs.jointjsStrings.fixedAt = "fixedAt".asInstanceOf[typings.jointjs.jointjsStrings.fixedAt]
    
    inline def length: typings.jointjs.jointjsStrings.length = "length".asInstanceOf[typings.jointjs.jointjsStrings.length]
    
    inline def padding: typings.jointjs.jointjsStrings.padding = "padding".asInstanceOf[typings.jointjs.jointjsStrings.padding]
  }
  
  trait AnchorArgumentsMap
    extends StObject
       with /* key */ StringDictionary[StringDictionary[js.Any]] {
    
    var bottom: BBoxAnchorArguments
    
    var bottomLeft: BBoxAnchorArguments
    
    var bottomRight: BBoxAnchorArguments
    
    var center: BBoxAnchorArguments
    
    var connectionClosest: ConnectionClosestAnchorArguments
    
    var connectionLength: ConnectionLengthAnchorArguments
    
    var connectionPerpendicular: ConnectionPerpendicularAnchorArguments
    
    var connectionRatio: ConnectionLengthAnchorArguments
    
    var left: BBoxAnchorArguments
    
    var midSide: MidSideAnchorArguments
    
    var modelCenter: ModelCenterAnchorArguments
    
    var perpendicular: PaddingAnchorArguments
    
    var right: BBoxAnchorArguments
    
    var top: BBoxAnchorArguments
    
    var topLeft: BBoxAnchorArguments
    
    var topRight: BBoxAnchorArguments
  }
  object AnchorArgumentsMap {
    
    inline def apply(
      bottom: BBoxAnchorArguments,
      bottomLeft: BBoxAnchorArguments,
      bottomRight: BBoxAnchorArguments,
      center: BBoxAnchorArguments,
      connectionClosest: ConnectionClosestAnchorArguments,
      connectionLength: ConnectionLengthAnchorArguments,
      connectionPerpendicular: ConnectionPerpendicularAnchorArguments,
      connectionRatio: ConnectionLengthAnchorArguments,
      left: BBoxAnchorArguments,
      midSide: MidSideAnchorArguments,
      modelCenter: ModelCenterAnchorArguments,
      perpendicular: PaddingAnchorArguments,
      right: BBoxAnchorArguments,
      top: BBoxAnchorArguments,
      topLeft: BBoxAnchorArguments,
      topRight: BBoxAnchorArguments
    ): AnchorArgumentsMap = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], connectionClosest = connectionClosest.asInstanceOf[js.Any], connectionLength = connectionLength.asInstanceOf[js.Any], connectionPerpendicular = connectionPerpendicular.asInstanceOf[js.Any], connectionRatio = connectionRatio.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], midSide = midSide.asInstanceOf[js.Any], modelCenter = modelCenter.asInstanceOf[js.Any], perpendicular = perpendicular.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnchorArgumentsMap]
    }
    
    extension [Self <: AnchorArgumentsMap](x: Self) {
      
      inline def setBottom(value: BBoxAnchorArguments): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: BBoxAnchorArguments): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: BBoxAnchorArguments): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setConnectionClosest(value: ConnectionClosestAnchorArguments): Self = StObject.set(x, "connectionClosest", value.asInstanceOf[js.Any])
      
      inline def setConnectionLength(value: ConnectionLengthAnchorArguments): Self = StObject.set(x, "connectionLength", value.asInstanceOf[js.Any])
      
      inline def setConnectionPerpendicular(value: ConnectionPerpendicularAnchorArguments): Self = StObject.set(x, "connectionPerpendicular", value.asInstanceOf[js.Any])
      
      inline def setConnectionRatio(value: ConnectionLengthAnchorArguments): Self = StObject.set(x, "connectionRatio", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setMidSide(value: MidSideAnchorArguments): Self = StObject.set(x, "midSide", value.asInstanceOf[js.Any])
      
      inline def setModelCenter(value: ModelCenterAnchorArguments): Self = StObject.set(x, "modelCenter", value.asInstanceOf[js.Any])
      
      inline def setPerpendicular(value: PaddingAnchorArguments): Self = StObject.set(x, "perpendicular", value.asInstanceOf[js.Any])
      
      inline def setRight(value: BBoxAnchorArguments): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: BBoxAnchorArguments): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: BBoxAnchorArguments): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: BBoxAnchorArguments): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  type AnchorJSON = GenericAnchorJSON[AnchorType]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jointjs.jointjsStrings.center
    - typings.jointjs.jointjsStrings.top
    - typings.jointjs.jointjsStrings.bottom
    - typings.jointjs.jointjsStrings.left
    - typings.jointjs.jointjsStrings.right
    - typings.jointjs.jointjsStrings.topLeft
    - typings.jointjs.jointjsStrings.topRight
    - typings.jointjs.jointjsStrings.bottomLeft
    - typings.jointjs.jointjsStrings.bottomRight
    - typings.jointjs.jointjsStrings.perpendicular
    - typings.jointjs.jointjsStrings.midSide
    - typings.jointjs.jointjsStrings.modelCenter
    - typings.jointjs.jointjsStrings.connectionRatio
    - typings.jointjs.jointjsStrings.connectionLength
    - typings.jointjs.jointjsStrings.connectionPerpendicular
    - typings.jointjs.jointjsStrings.connectionClosest
  */
  trait AnchorType extends StObject
  
  trait BBoxAnchorArguments
    extends StObject
       with RotateAnchorArguments {
    
    var dx: js.UndefOr[Double | String] = js.undefined
    
    var dy: js.UndefOr[Double | String] = js.undefined
  }
  object BBoxAnchorArguments {
    
    inline def apply(): BBoxAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BBoxAnchorArguments]
    }
    
    extension [Self <: BBoxAnchorArguments](x: Self) {
      
      inline def setDx(value: Double | String): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double | String): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  type GenericAnchor[K /* <: AnchorType */] = js.Function4[
    /* endView */ CellView, 
    /* endMagnet */ SVGElement, 
    /* anchorReference */ Point | SVGElement, 
    /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ /* opt */ js.Any, 
    Point
  ]
  
  type GenericAnchorArguments[K /* <: AnchorType */] = /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
  
  trait GenericAnchorJSON[K /* <: AnchorType */] extends StObject {
    
    var args: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ] = js.undefined
    
    var name: K
  }
  object GenericAnchorJSON {
    
    inline def apply[K /* <: AnchorType */](name: K): GenericAnchorJSON[K] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericAnchorJSON[K]]
    }
    
    extension [Self <: GenericAnchorJSON[?], K /* <: AnchorType */](x: Self & GenericAnchorJSON[K]) {
      
      inline def setArgs(
        value: /* import warning: importer.ImportType#apply Failed type conversion: jointjs.jointjs.anchors.AnchorArgumentsMap[K] */ js.Any
      ): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setName(value: K): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait MidSideAnchorArguments
    extends StObject
       with RotateAnchorArguments
       with PaddingAnchorArguments
  object MidSideAnchorArguments {
    
    inline def apply(): MidSideAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MidSideAnchorArguments]
    }
  }
  
  trait ModelCenterAnchorArguments extends StObject {
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
  }
  object ModelCenterAnchorArguments {
    
    inline def apply(): ModelCenterAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModelCenterAnchorArguments]
    }
    
    extension [Self <: ModelCenterAnchorArguments](x: Self) {
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
    }
  }
  
  trait PaddingAnchorArguments extends StObject {
    
    var padding: js.UndefOr[Double] = js.undefined
  }
  object PaddingAnchorArguments {
    
    inline def apply(): PaddingAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaddingAnchorArguments]
    }
    
    extension [Self <: PaddingAnchorArguments](x: Self) {
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  trait RotateAnchorArguments extends StObject {
    
    var rotate: js.UndefOr[Boolean] = js.undefined
  }
  object RotateAnchorArguments {
    
    inline def apply(): RotateAnchorArguments = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RotateAnchorArguments]
    }
    
    extension [Self <: RotateAnchorArguments](x: Self) {
      
      inline def setRotate(value: Boolean): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
    }
  }
}
