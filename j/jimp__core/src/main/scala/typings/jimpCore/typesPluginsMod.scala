package typings.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.anon.Class
import typings.jimpCore.jimpCoreStrings.`class`
import typings.jimpCore.jimpCoreStrings.constants
import typings.jimpCore.typesEtcMod.DecoderFn
import typings.jimpCore.typesEtcMod.EncoderFn
import typings.jimpCore.typesEtcMod.Image
import typings.jimpCore.typesUtilsMod.Omit
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPluginsMod {
  
  type ClassOrConstantPlugin[T /* <: Image */] = ((Required[Pick[WellFormedPlugin[T], `class`]]) & WellFormedPlugin[T]) | ((Required[Pick[WellFormedPlugin[T], constants]]) & WellFormedPlugin[T])
  
  type IllformedPlugin = (Omit[Any, `class` | constants]) & Class
  
  type JimpPlugin[T /* <: Image */] = ClassOrConstantPlugin[T] | IllformedPlugin
  
  /* Inlined @jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T> & std.Required<std.Pick<@jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T>, 'mime'>> */
  trait JimpType[T /* <: Image */] extends StObject {
    
    // Extend the Jimp class with the following constants, etc
    var `class`: js.UndefOr[Any] = js.undefined
    
    var constants: js.UndefOr[// Contants to assign to the Jimp instance
    StringDictionary[Any]] = js.undefined
    
    var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.undefined
    
    var encoders: js.UndefOr[// Jimp Image
    StringDictionary[EncoderFn[T]]] = js.undefined
    
    var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object JimpType {
    
    inline def apply[T /* <: Image */](): JimpType[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JimpType[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JimpType[?], T /* <: Image */] (val x: Self & JimpType[T]) extends AnyVal {
      
      inline def setClass(value: Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setConstants(value: // Contants to assign to the Jimp instance
      StringDictionary[Any]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      inline def setDecoders(value: StringDictionary[DecoderFn]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setDecodersUndefined: Self = StObject.set(x, "decoders", js.undefined)
      
      inline def setEncoders(value: // Jimp Image
      StringDictionary[EncoderFn[T]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      inline def setEncodersUndefined: Self = StObject.set(x, "encoders", js.undefined)
      
      inline def setHasAlpha(value: StringDictionary[Boolean]): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      inline def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
      
      inline def setMime(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    }
  }
  
  trait WellFormedPlugin[ImageType /* <: Image */] extends StObject {
    
    // Extend the Jimp class with the following constants, etc
    var `class`: js.UndefOr[Any] = js.undefined
    
    var constants: js.UndefOr[// Contants to assign to the Jimp instance
    StringDictionary[Any]] = js.undefined
    
    var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.undefined
    
    var encoders: js.UndefOr[// Jimp Image
    StringDictionary[EncoderFn[ImageType]]] = js.undefined
    
    var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object WellFormedPlugin {
    
    inline def apply[ImageType /* <: Image */](): WellFormedPlugin[ImageType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WellFormedPlugin[ImageType]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WellFormedPlugin[?], ImageType /* <: Image */] (val x: Self & WellFormedPlugin[ImageType]) extends AnyVal {
      
      inline def setClass(value: Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setConstants(value: // Contants to assign to the Jimp instance
      StringDictionary[Any]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      inline def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      inline def setDecoders(value: StringDictionary[DecoderFn]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      inline def setDecodersUndefined: Self = StObject.set(x, "decoders", js.undefined)
      
      inline def setEncoders(value: // Jimp Image
      StringDictionary[EncoderFn[ImageType]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      inline def setEncodersUndefined: Self = StObject.set(x, "encoders", js.undefined)
      
      inline def setHasAlpha(value: StringDictionary[Boolean]): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      inline def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
      
      inline def setMime(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    }
  }
}
