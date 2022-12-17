package typings.iconvCorefoundation

import typings.iconvCorefoundation.libNativeMod.StringEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined iconv-corefoundation.iconv-corefoundation/lib/native.DecodeOptions & iconv-corefoundation.iconv-corefoundation/lib/native.SelectAndEncodeOptions & {  isEncodingOk :never | undefined} */
  trait DecodeOptionsSelectAndEnc extends StObject {
    
    /**
      * Decides whether to encode with the given {@link StringEncoding}.
      *
      * @remarks
      * This method is called by `encodeSmallest` and `transcodeSmallest` to let the application decide whether to proceed with Core Foundation's chosen smallest encoding, before actually performing the work of encoding the text.
      *
      * @param encoding - The selected {@link StringEncoding}.
      * @returns `true` if the text should be encoded; `false` to abort encoding. If this method returns `false`, then the calling function (`encodeSmallest` or `transcodeSmallest`) will return `null` instead of the encoded text.
      */
    var isEncodingOk: js.UndefOr[js.Function1[/* encoding */ StringEncoding, Boolean]] = js.undefined
    
    /**
      * Substitute for unrepresentable characters.
      *
      * @remarks
      * If the input text contains a character that is not representable in the output encoding, then this byte will be inserted as a placeholder in the output text.
      *
      * This property, if present, must be an integer between 1 and 255, inclusive.
      */
    var lossByte: js.UndefOr[Double] = js.undefined
  }
  object DecodeOptionsSelectAndEnc {
    
    inline def apply(): DecodeOptionsSelectAndEnc = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DecodeOptionsSelectAndEnc]
    }
    
    extension [Self <: DecodeOptionsSelectAndEnc](x: Self) {
      
      inline def setIsEncodingOk(value: /* encoding */ StringEncoding => Boolean): Self = StObject.set(x, "isEncodingOk", js.Any.fromFunction1(value))
      
      inline def setIsEncodingOkUndefined: Self = StObject.set(x, "isEncodingOk", js.undefined)
      
      inline def setLossByte(value: Double): Self = StObject.set(x, "lossByte", value.asInstanceOf[js.Any])
      
      inline def setLossByteUndefined: Self = StObject.set(x, "lossByte", js.undefined)
    }
  }
  
  /* Inlined iconv-corefoundation.iconv-corefoundation/lib/native.SelectAndEncodeOptions & {  isEncodingOk :never | undefined} */
  trait SelectAndEncodeOptionsisE extends StObject {
    
    /**
      * Decides whether to encode with the given {@link StringEncoding}.
      *
      * @remarks
      * This method is called by `encodeSmallest` and `transcodeSmallest` to let the application decide whether to proceed with Core Foundation's chosen smallest encoding, before actually performing the work of encoding the text.
      *
      * @param encoding - The selected {@link StringEncoding}.
      * @returns `true` if the text should be encoded; `false` to abort encoding. If this method returns `false`, then the calling function (`encodeSmallest` or `transcodeSmallest`) will return `null` instead of the encoded text.
      */
    var isEncodingOk: js.UndefOr[js.Function1[/* encoding */ StringEncoding, Boolean]] = js.undefined
    
    /**
      * Substitute for unrepresentable characters.
      *
      * @remarks
      * If the input text contains a character that is not representable in the output encoding, then this byte will be inserted as a placeholder in the output text.
      *
      * This property, if present, must be an integer between 1 and 255, inclusive.
      */
    var lossByte: js.UndefOr[Double] = js.undefined
  }
  object SelectAndEncodeOptionsisE {
    
    inline def apply(): SelectAndEncodeOptionsisE = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectAndEncodeOptionsisE]
    }
    
    extension [Self <: SelectAndEncodeOptionsisE](x: Self) {
      
      inline def setIsEncodingOk(value: /* encoding */ StringEncoding => Boolean): Self = StObject.set(x, "isEncodingOk", js.Any.fromFunction1(value))
      
      inline def setIsEncodingOkUndefined: Self = StObject.set(x, "isEncodingOk", js.undefined)
      
      inline def setLossByte(value: Double): Self = StObject.set(x, "lossByte", value.asInstanceOf[js.Any])
      
      inline def setLossByteUndefined: Self = StObject.set(x, "lossByte", js.undefined)
    }
  }
}
