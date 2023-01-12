package typings.kakaoJsSdk.anon

import org.scalablytyped.runtime.StringDictionary
import typings.kakaoJsSdk.Kakao.API.ApiError
import typings.kakaoJsSdk.Kakao.API.ApiResponse
import typings.kakaoJsSdk.Kakao.API.RequestAlwaysCallback
import typings.kakaoJsSdk.Kakao.API.RequestFailCallback
import typings.kakaoJsSdk.Kakao.API.RequestSuccessCallback
import typings.std.Blob
import typings.std.FileList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Always extends StObject {
  
  var always: js.UndefOr[RequestAlwaysCallback] = js.undefined
  
  // Kakao REST API urls
  var data: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  var fail: js.UndefOr[RequestFailCallback] = js.undefined
  
  var files: js.UndefOr[FileList | (js.Array[Blob | typings.std.File])] = js.undefined
  
  var success: js.UndefOr[RequestSuccessCallback] = js.undefined
  
  var url: String
}
object Always {
  
  inline def apply(url: String): Always = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Always]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Always] (val x: Self) extends AnyVal {
    
    inline def setAlways(value: /* param */ ApiResponse | ApiError => Unit): Self = StObject.set(x, "always", js.Any.fromFunction1(value))
    
    inline def setAlwaysUndefined: Self = StObject.set(x, "always", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFail(value: /* error */ ApiError => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setFiles(value: FileList | (js.Array[Blob | typings.std.File])): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setFilesVarargs(value: (Blob | typings.std.File)*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setSuccess(value: /* response */ ApiResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
