package typings.kapPlugin

import org.scalablytyped.runtime.Instantiable0
import typings.got.anon.GotInstanceGotBodyFnnull
import typings.got.anon.GotInstanceGotBodyFnstrin
import typings.got.anon.GotInstanceGotFormFnnull
import typings.got.anon.GotInstanceGotFormFnstrin
import typings.got.anon.GotInstanceGotJSONFn
import typings.got.anon.Recordgetpostputpatchhead
import typings.got.mod.GotBodyOptions
import typings.got.mod.GotEmitter
import typings.got.mod.GotExtend
import typings.got.mod.GotFn
import typings.got.mod.GotFormOptions
import typings.got.mod.GotJSONOptions
import typings.got.mod.GotOptions
import typings.got.mod.GotPromise
import typings.got.mod.GotStreamFn
import typings.got.mod.GotUrl
import typings.kapPlugin.mod.Format
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FileType extends StObject {
    
    var fileType: Format
  }
  object FileType {
    
    inline def apply(fileType: Format): FileType = {
      val __obj = js.Dynamic.literal(fileType = fileType.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileType]
    }
    
    extension [Self <: FileType](x: Self) {
      
      inline def setFileType(value: Format): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Typeof extends StObject {
    
    def apply(url: GotUrl): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def apply(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    
    var CancelError: Instantiable0[typings.got.mod.CancelError] = js.native
    
    var HTTPError: Instantiable0[typings.got.mod.HTTPError] = js.native
    
    var MaxRedirectsError: Instantiable0[typings.got.mod.MaxRedirectsError] = js.native
    
    var ParseError: Instantiable0[typings.got.mod.ParseError] = js.native
    
    var ReadError: Instantiable0[typings.got.mod.ReadError] = js.native
    
    var RequestError: Instantiable0[typings.got.mod.RequestError] = js.native
    
    var TimeoutError: Instantiable0[typings.got.mod.TimeoutError] = js.native
    
    var UnsupportedProtocolError: Instantiable0[typings.got.mod.UnsupportedProtocolError] = js.native
    
    def delete(url: GotUrl): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def delete(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("delete")
    var delete_Original: GotFn = js.native
    
    def extend(options: GotBodyOptions[Null]): GotInstanceGotBodyFnnull = js.native
    def extend(options: GotFormOptions[String]): GotInstanceGotFormFnstrin = js.native
    def extend(options: GotJSONOptions): GotInstanceGotJSONFn = js.native
    @JSName("extend")
    def extend_GotInstanceGotBodyFnstrin(options: GotBodyOptions[String]): GotInstanceGotBodyFnstrin = js.native
    @JSName("extend")
    def extend_GotInstanceGotFormFnnull(options: GotFormOptions[Null]): GotInstanceGotFormFnnull = js.native
    @JSName("extend")
    var extend_Original: GotExtend = js.native
    
    def get(url: GotUrl): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def get(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("get")
    var get_Original: GotFn = js.native
    
    def head(url: GotUrl): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def head(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("head")
    var head_Original: GotFn = js.native
    
    def patch(url: GotUrl): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def patch(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("patch")
    var patch_Original: GotFn = js.native
    
    def post(url: GotUrl): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def post(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("post")
    var post_Original: GotFn = js.native
    
    def put(url: GotUrl): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotBodyOptions[Null | String]): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotFormOptions[Null | String]): GotPromise[String] = js.native
    def put(url: GotUrl, options: GotJSONOptions): GotPromise[js.Any] = js.native
    @JSName("put")
    var put_Original: GotFn = js.native
    
    def stream(url: GotUrl): GotEmitter & Duplex = js.native
    def stream(url: GotUrl, options: GotOptions[String | Null]): GotEmitter & Duplex = js.native
    @JSName("stream")
    var stream_Original: GotStreamFn & Recordgetpostputpatchhead = js.native
  }
  
  @js.native
  trait Typeofgot
    extends StObject
       with Typeof
}
