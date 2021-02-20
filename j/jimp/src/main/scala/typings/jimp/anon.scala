package typings.jimp

import org.scalablytyped.runtime.StringDictionary
import typings.jimp.jimpStrings.`before-change`
import typings.jimp.jimpStrings.changed
import typings.jimp.jimpStrings.clone
import typings.jimp.jimpStrings.constructor
import typings.jimp.mod.ChangeName
import typings.jimp.mod.DepreciatedJimp
import typings.jimp.mod.ListenableName
import typings.jimp.mod.ListenerData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AlignmentX extends StObject {
    
    var alignmentX: Double = js.native
    
    var alignmentY: Double = js.native
    
    var text: String = js.native
  }
  object AlignmentX {
    
    @scala.inline
    def apply(alignmentX: Double, alignmentY: Double, text: String): AlignmentX = {
      val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignmentX]
    }
    
    @scala.inline
    implicit class AlignmentXMutableBuilder[Self <: AlignmentX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignmentX(value: Double): Self = StObject.set(x, "alignmentX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignmentY(value: Double): Self = StObject.set(x, "alignmentY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AutoGreyscale extends StObject {
    
    var autoGreyscale: js.UndefOr[Boolean] = js.native
    
    var max: Double = js.native
    
    var replace: js.UndefOr[Double] = js.native
  }
  object AutoGreyscale {
    
    @scala.inline
    def apply(max: Double): AutoGreyscale = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoGreyscale]
    }
    
    @scala.inline
    implicit class AutoGreyscaleMutableBuilder[Self <: AutoGreyscale] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGreyscale(value: Boolean): Self = StObject.set(x, "autoGreyscale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoGreyscaleUndefined: Self = StObject.set(x, "autoGreyscale", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplace(value: Double): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  @js.native
  trait B extends StObject {
    
    var b: js.Array[Double] = js.native
    
    var g: js.Array[Double] = js.native
    
    var r: js.Array[Double] = js.native
  }
  object B {
    
    @scala.inline
    def apply(b: js.Array[Double], g: js.Array[Double], r: js.Array[Double]): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    @scala.inline
    implicit class BMutableBuilder[Self <: B] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setB(value: js.Array[Double]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      @scala.inline
      def setG(value: js.Array[Double]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGVarargs(value: Double*): Self = StObject.set(x, "g", js.Array(value :_*))
      
      @scala.inline
      def setR(value: js.Array[Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value :_*))
    }
  }
  
  @js.native
  trait CropOnlyFrames extends StObject {
    
    var cropOnlyFrames: js.UndefOr[Boolean] = js.native
    
    var cropSymmetric: js.UndefOr[Boolean] = js.native
    
    var leaveBorder: js.UndefOr[Double] = js.native
    
    var tolerance: js.UndefOr[Double] = js.native
  }
  object CropOnlyFrames {
    
    @scala.inline
    def apply(): CropOnlyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropOnlyFrames]
    }
    
    @scala.inline
    implicit class CropOnlyFramesMutableBuilder[Self <: CropOnlyFrames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCropOnlyFrames(value: Boolean): Self = StObject.set(x, "cropOnlyFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropOnlyFramesUndefined: Self = StObject.set(x, "cropOnlyFrames", js.undefined)
      
      @scala.inline
      def setCropSymmetric(value: Boolean): Self = StObject.set(x, "cropSymmetric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropSymmetricUndefined: Self = StObject.set(x, "cropSymmetric", js.undefined)
      
      @scala.inline
      def setLeaveBorder(value: Double): Self = StObject.set(x, "leaveBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeaveBorderUndefined: Self = StObject.set(x, "leaveBorder", js.undefined)
      
      @scala.inline
      def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey[T /* <: ListenableName */]
    extends /* key */ StringDictionary[js.Any]
       with ListenerData[T] {
    
    var eventName: `before-change` | changed = js.native
    
    var methodName: T = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey[T]]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey[_], T /* <: ListenableName */] (val x: Self with Dictkey[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: `before-change` | changed): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: T): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventName[T /* <: ListenableName */] extends ListenerData[T] {
    
    var eventName: T = js.native
    
    var methodName: clone | ChangeName | constructor = js.native
  }
  object EventName {
    
    @scala.inline
    def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName[T]]
    }
    
    @scala.inline
    implicit class EventNameMutableBuilder[Self <: EventName[_], T /* <: ListenableName */] (val x: Self with EventName[T]) extends AnyVal {
      
      @scala.inline
      def setEventName(value: T): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodName(value: clone | ChangeName | constructor): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Idx extends StObject {
    
    var idx: Double = js.native
    
    var image: DepreciatedJimp = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Idx {
    
    @scala.inline
    def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Idx = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    @scala.inline
    implicit class IdxMutableBuilder[Self <: Idx] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: DepreciatedJimp): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Image extends StObject {
    
    var image: DepreciatedJimp = js.native
    
    var percent: Double = js.native
  }
  object Image {
    
    @scala.inline
    def apply(image: DepreciatedJimp, percent: Double): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    @scala.inline
    implicit class ImageMutableBuilder[Self <: Image] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImage(value: DepreciatedJimp): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Opacity extends StObject {
    
    var opacity: js.UndefOr[Double] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
  }
  object Opacity {
    
    @scala.inline
    def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    @scala.inline
    implicit class OpacityMutableBuilder[Self <: Opacity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait R extends StObject {
    
    var r: Double = js.native
  }
  object R {
    
    @scala.inline
    def apply(r: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    @scala.inline
    implicit class RMutableBuilder[Self <: R] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Radius extends StObject {
    
    var radius: Double = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Radius {
    
    @scala.inline
    def apply(radius: Double, x: Double, y: Double): Radius = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Radius]
    }
    
    @scala.inline
    implicit class RadiusMutableBuilder[Self <: Radius] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
