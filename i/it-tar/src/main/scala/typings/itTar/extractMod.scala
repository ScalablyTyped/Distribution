package typings.itTar

import typings.itStreamTypes.mod.Source
import typings.itStreamTypes.mod.Transform
import typings.itTar.mod.TarEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object extractMod {
  
  @JSImport("it-tar/dist/src/extract", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def extract(): Transform[js.typedarray.Uint8Array, TarEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")().asInstanceOf[Transform[js.typedarray.Uint8Array, TarEntry]]
  inline def extract(options: ExtractOptions): Transform[js.typedarray.Uint8Array, TarEntry] = ^.asInstanceOf[js.Dynamic].applyDynamic("extract")(options.asInstanceOf[js.Any]).asInstanceOf[Transform[js.typedarray.Uint8Array, TarEntry]]
  
  trait Derp extends StObject {
    
    var body: Source[js.typedarray.Uint8Array]
    
    var header: Any
  }
  object Derp {
    
    inline def apply(body: Source[js.typedarray.Uint8Array], header: Any): Derp = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Derp]
    }
    
    extension [Self <: Derp](x: Self) {
      
      inline def setBody(value: Source[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Any): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExtractOptions extends StObject {
    
    var filenameEncoding: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
      ] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
  }
  object ExtractOptions {
    
    inline def apply(): ExtractOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExtractOptions]
    }
    
    extension [Self <: ExtractOptions](x: Self) {
      
      inline def setFilenameEncoding(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SupportedEncodings */ Any
      ): Self = StObject.set(x, "filenameEncoding", value.asInstanceOf[js.Any])
      
      inline def setFilenameEncodingUndefined: Self = StObject.set(x, "filenameEncoding", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
    }
  }
}
