package typings.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typings.jimpCore.anon.Class
import typings.jimpCore.etcMod.DecoderFn
import typings.jimpCore.etcMod.EncoderFn
import typings.jimpCore.etcMod.Image
import typings.jimpCore.jimpCoreStrings.`class`
import typings.jimpCore.jimpCoreStrings.constants
import typings.jimpCore.utilsMod.Omit
import typings.std.Pick
import typings.std.Required
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsMod {
  
  type ClassOrConstantPlugin[T /* <: Image */] = WellFormedPlugin[T] & (Required[Pick[WellFormedPlugin[T], `class` | constants]])
  
  type IllformedPlugin = (Omit[js.Any, `class` | constants]) & Class
  
  type JimpPlugin[T /* <: Image */] = ClassOrConstantPlugin[T] | IllformedPlugin
  
  /* Inlined @jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T> & std.Required<std.Pick<@jimp/core.@jimp/core/types/plugins.WellFormedPlugin<T>, 'mime'>> */
  trait JimpType[T /* <: Image */] extends StObject {
    
    // Extend the Jimp class with the following constants, etc
    var `class`: js.UndefOr[js.Any] = js.undefined
    
    var constants: js.UndefOr[// Contants to assign to the Jimp instance
    StringDictionary[js.Any]] = js.undefined
    
    var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.undefined
    
    var encoders: js.UndefOr[// Jimp Image
    StringDictionary[EncoderFn[T]]] = js.undefined
    
    var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var mime: js.UndefOr[StringDictionary[js.Array[String]]] & StringDictionary[js.Array[String]]
  }
  object JimpType {
    
    @scala.inline
    def apply[T /* <: Image */](mime: js.UndefOr[StringDictionary[js.Array[String]]] & StringDictionary[js.Array[String]]): JimpType[T] = {
      val __obj = js.Dynamic.literal(mime = mime.asInstanceOf[js.Any])
      __obj.asInstanceOf[JimpType[T]]
    }
    
    @scala.inline
    implicit class JimpTypeMutableBuilder[Self <: JimpType[?], T /* <: Image */] (val x: Self & JimpType[T]) extends AnyVal {
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setConstants(value: // Contants to assign to the Jimp instance
      StringDictionary[js.Any]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      @scala.inline
      def setDecoders(value: StringDictionary[DecoderFn]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodersUndefined: Self = StObject.set(x, "decoders", js.undefined)
      
      @scala.inline
      def setEncoders(value: // Jimp Image
      StringDictionary[EncoderFn[T]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodersUndefined: Self = StObject.set(x, "encoders", js.undefined)
      
      @scala.inline
      def setHasAlpha(value: StringDictionary[Boolean]): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
      
      @scala.inline
      def setMime(value: js.UndefOr[StringDictionary[js.Array[String]]] & StringDictionary[js.Array[String]]): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
    }
  }
  
  trait WellFormedPlugin[ImageType /* <: Image */] extends StObject {
    
    // Extend the Jimp class with the following constants, etc
    var `class`: js.UndefOr[js.Any] = js.undefined
    
    var constants: js.UndefOr[// Contants to assign to the Jimp instance
    StringDictionary[js.Any]] = js.undefined
    
    var decoders: js.UndefOr[StringDictionary[DecoderFn]] = js.undefined
    
    var encoders: js.UndefOr[// Jimp Image
    StringDictionary[EncoderFn[ImageType]]] = js.undefined
    
    var hasAlpha: js.UndefOr[StringDictionary[Boolean]] = js.undefined
    
    var mime: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  }
  object WellFormedPlugin {
    
    @scala.inline
    def apply[ImageType /* <: Image */](): WellFormedPlugin[ImageType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WellFormedPlugin[ImageType]]
    }
    
    @scala.inline
    implicit class WellFormedPluginMutableBuilder[Self <: WellFormedPlugin[?], ImageType /* <: Image */] (val x: Self & WellFormedPlugin[ImageType]) extends AnyVal {
      
      @scala.inline
      def setClass(value: js.Any): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setConstants(value: // Contants to assign to the Jimp instance
      StringDictionary[js.Any]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantsUndefined: Self = StObject.set(x, "constants", js.undefined)
      
      @scala.inline
      def setDecoders(value: StringDictionary[DecoderFn]): Self = StObject.set(x, "decoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodersUndefined: Self = StObject.set(x, "decoders", js.undefined)
      
      @scala.inline
      def setEncoders(value: // Jimp Image
      StringDictionary[EncoderFn[ImageType]]): Self = StObject.set(x, "encoders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodersUndefined: Self = StObject.set(x, "encoders", js.undefined)
      
      @scala.inline
      def setHasAlpha(value: StringDictionary[Boolean]): Self = StObject.set(x, "hasAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasAlphaUndefined: Self = StObject.set(x, "hasAlpha", js.undefined)
      
      @scala.inline
      def setMime(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeUndefined: Self = StObject.set(x, "mime", js.undefined)
    }
  }
}
