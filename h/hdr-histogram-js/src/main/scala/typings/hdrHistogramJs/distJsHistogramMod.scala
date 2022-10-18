package typings.hdrHistogramJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distJsHistogramMod {
  
  /* note: abstract class */ @JSImport("hdr-histogram-js/dist/JsHistogram", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with JsHistogram {
    def this(
      lowestDiscernibleValue: Double,
      highestTrackableValue: Double,
      numberOfSignificantValueDigits: Double
    ) = this()
    
    /* CompleteClass */
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any = js.native
  }
  /* static members */
  object default {
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "default.decode")
    @js.native
    def decode: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any = js.native
    inline def decode_=(
      x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof doDecode */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("decode")(x.asInstanceOf[js.Any])
    
    @JSImport("hdr-histogram-js/dist/JsHistogram", "default.identityBuilder")
    @js.native
    def identityBuilder: Double = js.native
    inline def identityBuilder_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("identityBuilder")(x.asInstanceOf[js.Any])
  }
  
  trait JsHistogram extends StObject {
    
    var encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any
  }
  object JsHistogram {
    
    inline def apply(
      encodeIntoCompressedBase64: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any
    ): JsHistogram = {
      val __obj = js.Dynamic.literal(encodeIntoCompressedBase64 = encodeIntoCompressedBase64.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsHistogram]
    }
    
    extension [Self <: JsHistogram](x: Self) {
      
      inline def setEncodeIntoCompressedBase64(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof doEncodeIntoCompressedBase64 */ Any
      ): Self = StObject.set(x, "encodeIntoCompressedBase64", value.asInstanceOf[js.Any])
    }
  }
}
