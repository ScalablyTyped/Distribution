package typings.justifiedLayout

import typings.justifiedLayout.anon.Bottom
import typings.justifiedLayout.anon.Height
import typings.justifiedLayout.anon.Horizontal
import typings.justifiedLayout.justifiedLayoutStrings.center
import typings.justifiedLayout.justifiedLayoutStrings.justify
import typings.justifiedLayout.justifiedLayoutStrings.left
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(items: js.Array[JustifiedLayoutItem]): JustifiedLayoutResult = ^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any]).asInstanceOf[JustifiedLayoutResult]
  inline def apply(items: js.Array[JustifiedLayoutItem], options: JustifiedLayoutOptions): JustifiedLayoutResult = (^.asInstanceOf[js.Dynamic].apply(items.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[JustifiedLayoutResult]
  
  @JSImport("justified-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type JustifiedLayoutItem = Double | Height
  
  /**
    * Options for configuring the justified layout.
    */
  trait JustifiedLayoutOptions extends StObject {
    
    /**
      * Provide a single integer to apply spacing both horizontally and vertically or provide an
      * object to apply individual values to each axis.
      * @default 10
      */
    var boxSpacing: js.UndefOr[Double | Horizontal] = js.undefined
    
    /**
      * Provide a single integer to apply padding to all sides or provide an object to apply
      * individual values to each side.
      * @default 10
      */
    var containerPadding: js.UndefOr[Double | Bottom] = js.undefined
    
    /**
      * The width that boxes will be contained within irrelevant of padding.
      * @default 1060
      */
    var containerWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Provide an aspect ratio here to return everything in that aspect ratio. Makes the values
      * in your input array irrelevant. The length of the array remains relevant.
      * @default false
      */
    var forceAspectRatio: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * If you'd like to insert a full width box every n rows you can specify it with this
      * parameter. The box on that row will ignore the targetRowHeight, make itself as wide as
      * `containerWidth - containerPadding` and be as tall as its aspect ratio defines. It'll
      * only happen if that item has an aspect ratio >= 1. Best to have a look at the examples to
      * see what this does.
      * @default false
      */
    var fullWidthBreakoutRowCadence: js.UndefOr[Boolean | Double] = js.undefined
    
    /**
      * Will stop adding rows at this number regardless of how many items still need to be laid
      * out.
      * @default Number.POSITIVE_INFINITY
      */
    var maxNumRows: js.UndefOr[Double] = js.undefined
    
    /**
      * By default we'll return items at the end of a justified layout even if they don't make a
      * full row. If false they'll be omitted from the output.
      * @default true
      */
    var showWidows: js.UndefOr[Boolean] = js.undefined
    
    /**
      * It's called a target because row height is the lever we use in order to fit everything in
      * nicely. The algorithm will get as close to the target row height as it can.
      * @default 320
      */
    var targetRowHeight: js.UndefOr[Double] = js.undefined
    
    /**
      * How far row heights can stray from targetRowHeight. `0` would force rows to be the
      * `targetRowHeight` exactly and would likely make it impossible to justify. The value must
      * be between `0` and `1`.
      * @default 0.25
      */
    var targetRowHeightTolerance: js.UndefOr[Double] = js.undefined
    
    /**
      * If widows are visible, how should they be laid out?
      * @default "left"
      */
    var widowLayoutStyle: js.UndefOr[left | justify | center] = js.undefined
  }
  object JustifiedLayoutOptions {
    
    inline def apply(): JustifiedLayoutOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JustifiedLayoutOptions]
    }
    
    extension [Self <: JustifiedLayoutOptions](x: Self) {
      
      inline def setBoxSpacing(value: Double | Horizontal): Self = StObject.set(x, "boxSpacing", value.asInstanceOf[js.Any])
      
      inline def setBoxSpacingUndefined: Self = StObject.set(x, "boxSpacing", js.undefined)
      
      inline def setContainerPadding(value: Double | Bottom): Self = StObject.set(x, "containerPadding", value.asInstanceOf[js.Any])
      
      inline def setContainerPaddingUndefined: Self = StObject.set(x, "containerPadding", js.undefined)
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContainerWidthUndefined: Self = StObject.set(x, "containerWidth", js.undefined)
      
      inline def setForceAspectRatio(value: Boolean | Double): Self = StObject.set(x, "forceAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setForceAspectRatioUndefined: Self = StObject.set(x, "forceAspectRatio", js.undefined)
      
      inline def setFullWidthBreakoutRowCadence(value: Boolean | Double): Self = StObject.set(x, "fullWidthBreakoutRowCadence", value.asInstanceOf[js.Any])
      
      inline def setFullWidthBreakoutRowCadenceUndefined: Self = StObject.set(x, "fullWidthBreakoutRowCadence", js.undefined)
      
      inline def setMaxNumRows(value: Double): Self = StObject.set(x, "maxNumRows", value.asInstanceOf[js.Any])
      
      inline def setMaxNumRowsUndefined: Self = StObject.set(x, "maxNumRows", js.undefined)
      
      inline def setShowWidows(value: Boolean): Self = StObject.set(x, "showWidows", value.asInstanceOf[js.Any])
      
      inline def setShowWidowsUndefined: Self = StObject.set(x, "showWidows", js.undefined)
      
      inline def setTargetRowHeight(value: Double): Self = StObject.set(x, "targetRowHeight", value.asInstanceOf[js.Any])
      
      inline def setTargetRowHeightTolerance(value: Double): Self = StObject.set(x, "targetRowHeightTolerance", value.asInstanceOf[js.Any])
      
      inline def setTargetRowHeightToleranceUndefined: Self = StObject.set(x, "targetRowHeightTolerance", js.undefined)
      
      inline def setTargetRowHeightUndefined: Self = StObject.set(x, "targetRowHeight", js.undefined)
      
      inline def setWidowLayoutStyle(value: left | justify | center): Self = StObject.set(x, "widowLayoutStyle", value.asInstanceOf[js.Any])
      
      inline def setWidowLayoutStyleUndefined: Self = StObject.set(x, "widowLayoutStyle", js.undefined)
    }
  }
  
  /**
    * Results from calculating the justified layout.
    */
  trait JustifiedLayoutResult extends StObject {
    
    /**
      * Computed positional and sizing properties of a box in the justified layout.
      */
    var boxes: js.Array[LayoutBox]
    
    /**
      * Height of the container containing the justified layout.
      */
    var containerHeight: Double
    
    /**
      * Number of items that are in rows that aren't fully-packed.
      */
    var widowCount: Double
  }
  object JustifiedLayoutResult {
    
    inline def apply(boxes: js.Array[LayoutBox], containerHeight: Double, widowCount: Double): JustifiedLayoutResult = {
      val __obj = js.Dynamic.literal(boxes = boxes.asInstanceOf[js.Any], containerHeight = containerHeight.asInstanceOf[js.Any], widowCount = widowCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[JustifiedLayoutResult]
    }
    
    extension [Self <: JustifiedLayoutResult](x: Self) {
      
      inline def setBoxes(value: js.Array[LayoutBox]): Self = StObject.set(x, "boxes", value.asInstanceOf[js.Any])
      
      inline def setBoxesVarargs(value: LayoutBox*): Self = StObject.set(x, "boxes", js.Array(value*))
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setWidowCount(value: Double): Self = StObject.set(x, "widowCount", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Computed positional and sizing properties of a box in the layout.
    */
  trait LayoutBox extends StObject {
    
    /**
      * Aspect ratio of the box.
      */
    var aspectRatio: Double
    
    /**
      * Whether or not the aspect ratio was forced.
      */
    var forcedAspectRatio: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Height of the box in a justified layout.
      */
    var height: Double
    
    /**
      * Distance between the left side of the box and the left boundary of the justified layout.
      */
    var left: Double
    
    /**
      * Distance between the top side of the box and the top boundary of the justified layout.
      */
    var top: Double
    
    /**
      * Width of the box in a justified layout.
      */
    var width: Double
  }
  object LayoutBox {
    
    inline def apply(aspectRatio: Double, height: Double, left: Double, top: Double, width: Double): LayoutBox = {
      val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[LayoutBox]
    }
    
    extension [Self <: LayoutBox](x: Self) {
      
      inline def setAspectRatio(value: Double): Self = StObject.set(x, "aspectRatio", value.asInstanceOf[js.Any])
      
      inline def setForcedAspectRatio(value: Boolean): Self = StObject.set(x, "forcedAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setForcedAspectRatioUndefined: Self = StObject.set(x, "forcedAspectRatio", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
