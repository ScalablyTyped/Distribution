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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AlignmentX extends StObject {
    
    var alignmentX: Double
    
    var alignmentY: Double
    
    var text: String
  }
  object AlignmentX {
    
    inline def apply(alignmentX: Double, alignmentY: Double, text: String): AlignmentX = {
      val __obj = js.Dynamic.literal(alignmentX = alignmentX.asInstanceOf[js.Any], alignmentY = alignmentY.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlignmentX]
    }
    
    extension [Self <: AlignmentX](x: Self) {
      
      inline def setAlignmentX(value: Double): Self = StObject.set(x, "alignmentX", value.asInstanceOf[js.Any])
      
      inline def setAlignmentY(value: Double): Self = StObject.set(x, "alignmentY", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait AutoGreyscale extends StObject {
    
    var autoGreyscale: js.UndefOr[Boolean] = js.undefined
    
    var max: Double
    
    var replace: js.UndefOr[Double] = js.undefined
  }
  object AutoGreyscale {
    
    inline def apply(max: Double): AutoGreyscale = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoGreyscale]
    }
    
    extension [Self <: AutoGreyscale](x: Self) {
      
      inline def setAutoGreyscale(value: Boolean): Self = StObject.set(x, "autoGreyscale", value.asInstanceOf[js.Any])
      
      inline def setAutoGreyscaleUndefined: Self = StObject.set(x, "autoGreyscale", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: Double): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
  
  trait B extends StObject {
    
    var b: js.Array[Double]
    
    var g: js.Array[Double]
    
    var r: js.Array[Double]
  }
  object B {
    
    inline def apply(b: js.Array[Double], g: js.Array[Double], r: js.Array[Double]): B = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[B]
    }
    
    extension [Self <: B](x: Self) {
      
      inline def setB(value: js.Array[Double]): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setBVarargs(value: Double*): Self = StObject.set(x, "b", js.Array(value :_*))
      
      inline def setG(value: js.Array[Double]): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setGVarargs(value: Double*): Self = StObject.set(x, "g", js.Array(value :_*))
      
      inline def setR(value: js.Array[Double]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setRVarargs(value: Double*): Self = StObject.set(x, "r", js.Array(value :_*))
    }
  }
  
  trait CropOnlyFrames extends StObject {
    
    var cropOnlyFrames: js.UndefOr[Boolean] = js.undefined
    
    var cropSymmetric: js.UndefOr[Boolean] = js.undefined
    
    var leaveBorder: js.UndefOr[Double] = js.undefined
    
    var tolerance: js.UndefOr[Double] = js.undefined
  }
  object CropOnlyFrames {
    
    inline def apply(): CropOnlyFrames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropOnlyFrames]
    }
    
    extension [Self <: CropOnlyFrames](x: Self) {
      
      inline def setCropOnlyFrames(value: Boolean): Self = StObject.set(x, "cropOnlyFrames", value.asInstanceOf[js.Any])
      
      inline def setCropOnlyFramesUndefined: Self = StObject.set(x, "cropOnlyFrames", js.undefined)
      
      inline def setCropSymmetric(value: Boolean): Self = StObject.set(x, "cropSymmetric", value.asInstanceOf[js.Any])
      
      inline def setCropSymmetricUndefined: Self = StObject.set(x, "cropSymmetric", js.undefined)
      
      inline def setLeaveBorder(value: Double): Self = StObject.set(x, "leaveBorder", value.asInstanceOf[js.Any])
      
      inline def setLeaveBorderUndefined: Self = StObject.set(x, "leaveBorder", js.undefined)
      
      inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
      
      inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
    }
  }
  
  trait Dictkey[T /* <: ListenableName */]
    extends StObject
       with /* key */ StringDictionary[js.Any]
       with ListenerData[T] {
    
    var eventName: `before-change` | changed
    
    var methodName: T
  }
  object Dictkey {
    
    inline def apply[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey[T]]
    }
    
    extension [Self <: Dictkey[?], T /* <: ListenableName */](x: Self & Dictkey[T]) {
      
      inline def setEventName(value: `before-change` | changed): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: T): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventName[T /* <: ListenableName */]
    extends StObject
       with ListenerData[T] {
    
    var eventName: T
    
    var methodName: clone | ChangeName | constructor
  }
  object EventName {
    
    inline def apply[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventName[T]]
    }
    
    extension [Self <: EventName[?], T /* <: ListenableName */](x: Self & EventName[T]) {
      
      inline def setEventName(value: T): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
      
      inline def setMethodName(value: clone | ChangeName | constructor): Self = StObject.set(x, "methodName", value.asInstanceOf[js.Any])
    }
  }
  
  trait Idx extends StObject {
    
    var idx: Double
    
    var image: DepreciatedJimp
    
    var x: Double
    
    var y: Double
  }
  object Idx {
    
    inline def apply(idx: Double, image: DepreciatedJimp, x: Double, y: Double): Idx = {
      val __obj = js.Dynamic.literal(idx = idx.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Idx]
    }
    
    extension [Self <: Idx](x: Self) {
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setImage(value: DepreciatedJimp): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Image extends StObject {
    
    var image: DepreciatedJimp
    
    var percent: Double
  }
  object Image {
    
    inline def apply(image: DepreciatedJimp, percent: Double): Image = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setImage(value: DepreciatedJimp): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Opacity extends StObject {
    
    var opacity: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
  }
  object Opacity {
    
    inline def apply(): Opacity = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Opacity]
    }
    
    extension [Self <: Opacity](x: Self) {
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  trait R extends StObject {
    
    var r: Double
  }
  object R {
    
    inline def apply(r: Double): R = {
      val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[R]
    }
    
    extension [Self <: R](x: Self) {
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait Radius extends StObject {
    
    var radius: Double
    
    var x: Double
    
    var y: Double
  }
  object Radius {
    
    inline def apply(radius: Double, x: Double, y: Double): Radius = {
      val __obj = js.Dynamic.literal(radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Radius]
    }
    
    extension [Self <: Radius](x: Self) {
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
