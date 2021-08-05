package typings.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.anon.X
import typings.jimpCore.jimpCoreStrings.`before-change`
import typings.jimpCore.jimpCoreStrings.changed
import typings.jimpCore.jimpCoreStrings.clone
import typings.jimpCore.jimpCoreStrings.constructor
import typings.node.Buffer
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object etcMod {
  
  trait Bitmap extends StObject {
    
    var data: Buffer
    
    var height: Double
    
    var width: Double
  }
  object Bitmap {
    
    inline def apply(data: Buffer, height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    extension [Self <: Bitmap](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlendMode extends StObject {
    
    var mode: String
    
    var opacityDest: Double
    
    var opacitySource: Double
  }
  object BlendMode {
    
    inline def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlendMode]
    }
    
    extension [Self <: BlendMode](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOpacityDest(value: Double): Self = StObject.set(x, "opacityDest", value.asInstanceOf[js.Any])
      
      inline def setOpacitySource(value: Double): Self = StObject.set(x, "opacitySource", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimpCore.jimpCoreStrings.background
    - typings.jimpCore.jimpCoreStrings.scan
    - typings.jimpCore.jimpCoreStrings.crop
  */
  trait ChangeName extends StObject
  object ChangeName {
    
    inline def background: typings.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typings.jimpCore.jimpCoreStrings.background]
    
    inline def crop: typings.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typings.jimpCore.jimpCoreStrings.crop]
    
    inline def scan: typings.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typings.jimpCore.jimpCoreStrings.scan]
  }
  
  type DecoderFn = js.Function1[/* data */ Buffer, Bitmap]
  
  type EncoderFn[ImageType /* <: Image */] = js.Function1[/* image */ ImageType, Buffer]
  
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ Error | Null, /* value */ T, U]
  
  trait Image extends StObject {
    
    var bitmap: Bitmap
  }
  object Image {
    
    inline def apply(bitmap: Bitmap): Image = {
      val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setBitmap(value: Bitmap): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageCallback[jimp] = js.ThisFunction3[/* this */ jimp, /* err */ Error | Null, /* value */ jimp, /* coords */ X, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimpCore.jimpCoreStrings.any
    - typings.jimpCore.jimpCoreStrings.initialized
    - typings.jimpCore.jimpCoreStrings.`before-change`
    - typings.jimpCore.jimpCoreStrings.changed
    - typings.jimpCore.jimpCoreStrings.`before-clone`
    - typings.jimpCore.jimpCoreStrings.cloned
    - typings.jimpCore.jimpCoreStrings.background
    - typings.jimpCore.jimpCoreStrings.scan
    - typings.jimpCore.jimpCoreStrings.crop
  */
  trait ListenableName extends StObject
  object ListenableName {
    
    inline def any: typings.jimpCore.jimpCoreStrings.any = "any".asInstanceOf[typings.jimpCore.jimpCoreStrings.any]
    
    inline def background: typings.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typings.jimpCore.jimpCoreStrings.background]
    
    inline def `before-change`: typings.jimpCore.jimpCoreStrings.`before-change` = "before-change".asInstanceOf[typings.jimpCore.jimpCoreStrings.`before-change`]
    
    inline def `before-clone`: typings.jimpCore.jimpCoreStrings.`before-clone` = "before-clone".asInstanceOf[typings.jimpCore.jimpCoreStrings.`before-clone`]
    
    inline def changed: typings.jimpCore.jimpCoreStrings.changed = "changed".asInstanceOf[typings.jimpCore.jimpCoreStrings.changed]
    
    inline def cloned: typings.jimpCore.jimpCoreStrings.cloned = "cloned".asInstanceOf[typings.jimpCore.jimpCoreStrings.cloned]
    
    inline def crop: typings.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typings.jimpCore.jimpCoreStrings.crop]
    
    inline def initialized: typings.jimpCore.jimpCoreStrings.initialized = "initialized".asInstanceOf[typings.jimpCore.jimpCoreStrings.initialized]
    
    inline def scan: typings.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typings.jimpCore.jimpCoreStrings.scan]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.jimpCore.anon.EventName[T]
    - typings.jimpCore.anon.Dictkey[T]
  */
  trait ListenerData[T /* <: ListenableName */] extends StObject
  object ListenerData {
    
    inline def Dictkey[T /* <: ListenableName */](eventName: `before-change` | changed, methodName: T): typings.jimpCore.anon.Dictkey[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jimpCore.anon.Dictkey[T]]
    }
    
    inline def EventName[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): typings.jimpCore.anon.EventName[T] = {
      val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.jimpCore.anon.EventName[T]]
    }
  }
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    extension [Self <: RGB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBA extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    extension [Self <: RGBA](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var headers: StringDictionary[js.Any]
    
    var url: String
  }
  object URLOptions {
    
    inline def apply(headers: StringDictionary[js.Any], url: String): URLOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLOptions]
    }
    
    extension [Self <: URLOptions](x: Self) {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
