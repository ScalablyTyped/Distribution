package typings.matrixJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Callback extends StObject {
  
  // <optional> Deprecated. Optional. The callback to invoke on success/failure. See the promise return values for more information.
  var callback: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  // <optional> if false will not send the filename, e.g for encrypted file uploads where filename leaks are undesirable. Defaults to true.
  var includeFilename: js.UndefOr[Boolean] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  // <optional> Just return the content URI, rather than the whole body. Defaults to false (except on browsers, where it defaults to true for backwards compatibility).
  var onlyContentUri: js.UndefOr[Boolean] = js.undefined
  
  // <optional> Optional. Called when a chunk of data has been uploaded, with an object containing the fields `loaded` (number of bytes transferred)
  var progressHandler: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.undefined
  
  // <optional> Return the raw body, rather than parsing the JSON. Defaults to false (except on node.js, where it defaults to true for backwards compatibility).
  var rawResponse: js.UndefOr[Boolean] = js.undefined
  
  // <optional> Content-type for the upload. Defaults to file.type, or applicaton/octet-stream.
  var `type`: js.UndefOr[String] = js.undefined
}
object Callback {
  
  inline def apply(): Callback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Callback] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: /* repeated */ Any => Any): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setIncludeFilename(value: Boolean): Self = StObject.set(x, "includeFilename", value.asInstanceOf[js.Any])
    
    inline def setIncludeFilenameUndefined: Self = StObject.set(x, "includeFilename", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnlyContentUri(value: Boolean): Self = StObject.set(x, "onlyContentUri", value.asInstanceOf[js.Any])
    
    inline def setOnlyContentUriUndefined: Self = StObject.set(x, "onlyContentUri", js.undefined)
    
    inline def setProgressHandler(value: /* repeated */ Any => Any): Self = StObject.set(x, "progressHandler", js.Any.fromFunction1(value))
    
    inline def setProgressHandlerUndefined: Self = StObject.set(x, "progressHandler", js.undefined)
    
    inline def setRawResponse(value: Boolean): Self = StObject.set(x, "rawResponse", value.asInstanceOf[js.Any])
    
    inline def setRawResponseUndefined: Self = StObject.set(x, "rawResponse", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
