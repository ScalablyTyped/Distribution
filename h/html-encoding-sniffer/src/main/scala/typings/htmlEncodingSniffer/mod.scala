package typings.htmlEncodingSniffer

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param buffer The NodeJS buffer containing the (X)HTML source text.
    *
    * @return The canonical [encoding name](https://encoding.spec.whatwg.org/#names-and-labels)
    *         for use with the `whatwg-encoding` or similar package.
    */
  inline def apply(buffer: Buffer): String = ^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(buffer: Buffer, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(buffer.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("html-encoding-sniffer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
      * The ultimate fallback encoding used if no valid encoding is supplied
      * by the transport layer, and no encoding is sniffed from the bytes.
      *
      * @default
      * ```js
      * 'windows-1252'
      * ```
      *
      * Which is recommended by the algorithm's table of suggested
      * defaults for "All other locales" (including the `en` locale).
      */
    var defaultEncoding: js.UndefOr[String] = js.undefined
    
    /**
      * An encoding label that is obtained from the "transport layer"
      * (probably an HTTP `Content-Type` header), which overrides
      * everything but a BOM.
      */
    var transportLayerEncodingLabel: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDefaultEncoding(value: String): Self = StObject.set(x, "defaultEncoding", value.asInstanceOf[js.Any])
      
      inline def setDefaultEncodingUndefined: Self = StObject.set(x, "defaultEncoding", js.undefined)
      
      inline def setTransportLayerEncodingLabel(value: String): Self = StObject.set(x, "transportLayerEncodingLabel", value.asInstanceOf[js.Any])
      
      inline def setTransportLayerEncodingLabelUndefined: Self = StObject.set(x, "transportLayerEncodingLabel", js.undefined)
    }
  }
}
