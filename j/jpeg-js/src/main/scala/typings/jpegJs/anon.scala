package typings.jpegJs

import typings.jpegJs.jpegJsBooleans.`false`
import typings.jpegJs.jpegJsBooleans.`true`
import typings.node.Buffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined jpeg-js.jpeg-js.BufferRet & {  comments :std.Array<string> | undefined} */
  trait BufferRetcommentsArraystr extends StObject {
    
    var comments: js.UndefOr[js.Array[String]] = js.undefined
    
    var data: Buffer
    
    var height: Double
    
    var width: Double
  }
  object BufferRetcommentsArraystr {
    
    @scala.inline
    def apply(data: Buffer, height: Double, width: Double): BufferRetcommentsArraystr = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[BufferRetcommentsArraystr]
    }
    
    @scala.inline
    implicit class BufferRetcommentsArraystrMutableBuilder[Self <: BufferRetcommentsArraystr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColorTransform extends StObject {
    
    var colorTransform: js.UndefOr[Boolean] = js.undefined
    
    var formatAsRGBA: js.UndefOr[Boolean] = js.undefined
    
    var maxMemoryUsageInMB: js.UndefOr[Double] = js.undefined
    
    var maxResolutionInMP: js.UndefOr[Double] = js.undefined
    
    var tolerantDecoding: js.UndefOr[Boolean] = js.undefined
    
    var useTArray: `true`
  }
  object ColorTransform {
    
    @scala.inline
    def apply(): ColorTransform = {
      val __obj = js.Dynamic.literal(useTArray = true)
      __obj.asInstanceOf[ColorTransform]
    }
    
    @scala.inline
    implicit class ColorTransformMutableBuilder[Self <: ColorTransform] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorTransform(value: Boolean): Self = StObject.set(x, "colorTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTransformUndefined: Self = StObject.set(x, "colorTransform", js.undefined)
      
      @scala.inline
      def setFormatAsRGBA(value: Boolean): Self = StObject.set(x, "formatAsRGBA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatAsRGBAUndefined: Self = StObject.set(x, "formatAsRGBA", js.undefined)
      
      @scala.inline
      def setMaxMemoryUsageInMB(value: Double): Self = StObject.set(x, "maxMemoryUsageInMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMemoryUsageInMBUndefined: Self = StObject.set(x, "maxMemoryUsageInMB", js.undefined)
      
      @scala.inline
      def setMaxResolutionInMP(value: Double): Self = StObject.set(x, "maxResolutionInMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionInMPUndefined: Self = StObject.set(x, "maxResolutionInMP", js.undefined)
      
      @scala.inline
      def setTolerantDecoding(value: Boolean): Self = StObject.set(x, "tolerantDecoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolerantDecodingUndefined: Self = StObject.set(x, "tolerantDecoding", js.undefined)
      
      @scala.inline
      def setUseTArray(value: `true`): Self = StObject.set(x, "useTArray", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormatAsRGBA extends StObject {
    
    var colorTransform: js.UndefOr[Boolean] = js.undefined
    
    var formatAsRGBA: js.UndefOr[Boolean] = js.undefined
    
    var maxMemoryUsageInMB: js.UndefOr[Double] = js.undefined
    
    var maxResolutionInMP: js.UndefOr[Double] = js.undefined
    
    var tolerantDecoding: js.UndefOr[Boolean] = js.undefined
    
    var useTArray: js.UndefOr[`false`] = js.undefined
  }
  object FormatAsRGBA {
    
    @scala.inline
    def apply(): FormatAsRGBA = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatAsRGBA]
    }
    
    @scala.inline
    implicit class FormatAsRGBAMutableBuilder[Self <: FormatAsRGBA] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColorTransform(value: Boolean): Self = StObject.set(x, "colorTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorTransformUndefined: Self = StObject.set(x, "colorTransform", js.undefined)
      
      @scala.inline
      def setFormatAsRGBA(value: Boolean): Self = StObject.set(x, "formatAsRGBA", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatAsRGBAUndefined: Self = StObject.set(x, "formatAsRGBA", js.undefined)
      
      @scala.inline
      def setMaxMemoryUsageInMB(value: Double): Self = StObject.set(x, "maxMemoryUsageInMB", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMemoryUsageInMBUndefined: Self = StObject.set(x, "maxMemoryUsageInMB", js.undefined)
      
      @scala.inline
      def setMaxResolutionInMP(value: Double): Self = StObject.set(x, "maxResolutionInMP", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolutionInMPUndefined: Self = StObject.set(x, "maxResolutionInMP", js.undefined)
      
      @scala.inline
      def setTolerantDecoding(value: Boolean): Self = StObject.set(x, "tolerantDecoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTolerantDecodingUndefined: Self = StObject.set(x, "tolerantDecoding", js.undefined)
      
      @scala.inline
      def setUseTArray(value: `false`): Self = StObject.set(x, "useTArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTArrayUndefined: Self = StObject.set(x, "useTArray", js.undefined)
    }
  }
  
  /* Inlined jpeg-js.jpeg-js.UintArrRet & {  comments :std.Array<string> | undefined} */
  trait UintArrRetcommentsArrayst extends StObject {
    
    var comments: js.UndefOr[js.Array[String]] = js.undefined
    
    var data: Uint8Array
    
    var height: Double
    
    var width: Double
  }
  object UintArrRetcommentsArrayst {
    
    @scala.inline
    def apply(data: Uint8Array, height: Double, width: Double): UintArrRetcommentsArrayst = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[UintArrRetcommentsArrayst]
    }
    
    @scala.inline
    implicit class UintArrRetcommentsArraystMutableBuilder[Self <: UintArrRetcommentsArrayst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
      
      @scala.inline
      def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value :_*))
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
