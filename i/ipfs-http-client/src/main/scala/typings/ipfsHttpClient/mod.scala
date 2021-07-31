package typings.ipfsHttpClient

import typings.ipfsHttpClient.anon.Block
import typings.ipfsHttpClient.coreMod.ClientOptions
import typings.std.AbortSignal
import typings.std.Headers
import typings.std.Record
import typings.std.ReturnType
import typings.std.URLSearchParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @param {import("./lib/core").ClientOptions} options
    */
  @scala.inline
  def apply(): Block = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Block]
  @scala.inline
  def apply(options: ClientOptions): Block = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Block]
  
  @JSImport("ipfs-http-client/dist/src", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type APIWithExtraOptions[API, Extra] = js.Function1[
    /* args */ (js.Tuple4[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any & Extra]]) | (js.Tuple3[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any & Extra]]) | (js.Tuple2[js.UndefOr[js.Any], js.UndefOr[js.Any & Extra]]) | (js.Array[js.UndefOr[(js.Any & Extra) | js.Any]]), 
    ReturnType[API]
  ]
  
  /**
    * }
    */
  trait AbortOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AbortOptions {
    
    @scala.inline
    def apply(): AbortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortOptions]
    }
    
    @scala.inline
    implicit class AbortOptionsMutableBuilder[Self <: AbortOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait HttpOptions extends StObject {
    
    /**
      * - An object or [Headers](https://developer.mozilla.org/en-US/docs/Web/API/Headers) instance that can be used to set custom HTTP headers. Note that this option can also be [configured globally](#custom-headers) via the constructor options.
      */
    var headers: js.UndefOr[Headers | (Record[String, String])] = js.undefined
    
    /**
      * - An object or [`URLSearchParams`](https://developer.mozilla.org/en-US/docs/Web/API/URLSearchParams) instance that can be used to add additional query parameters to the query string sent with each request.
      */
    var searchParams: js.UndefOr[(Record[String, String]) | URLSearchParams] = js.undefined
  }
  object HttpOptions {
    
    @scala.inline
    def apply(): HttpOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpOptions]
    }
    
    @scala.inline
    implicit class HttpOptionsMutableBuilder[Self <: HttpOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: Headers | (Record[String, String])): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setSearchParams(value: (Record[String, String]) | URLSearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
    }
  }
  
  /**
    * This is an utility type that can be used to derive type of the HTTP Client
    * API from the Core API. It takes type of the API factory (from ipfs-core),
    * derives API from it's return type and extends it last `options` parameter
    * with `HttpOptions`.
    *
    * This can be used to avoid (re)typing API interface when implementing it in
    * http client e.g you can annotate `ipfs.addAll` implementation with
    *
    * `@type {Implements<typeof import('ipfs-core/src/components/add-all')>}`
    *
    * **Caution**: This supports APIs with up to four parameters and last optional
    * `options` parameter, anything else will result to `never` type.
    */
  type Implements[APIFactory /* <: js.Function1[/* config */ js.Any, js.Any] */] = js.Function1[
    /* args */ (js.Tuple4[
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any], 
      js.UndefOr[js.Any & HttpOptions]
    ]) | (js.Tuple3[js.UndefOr[js.Any], js.UndefOr[js.Any], js.UndefOr[js.Any & HttpOptions]]) | (js.Tuple2[js.UndefOr[js.Any], js.UndefOr[js.Any & HttpOptions]]) | (js.Array[js.UndefOr[(js.Any & HttpOptions) | js.Any]]), 
    ReturnType[ReturnType[APIFactory]]
  ]
  
  type ImplementsMethod[Key, APIFactory /* <: js.Function1[/* config */ js.Any, js.Any] */] = typings.ipfsHttpClient.interfaceMod.APIWithExtraOptions[
    /* import warning: importer.ImportType#apply Failed type conversion: std.ReturnType<APIFactory>[Key] */ js.Any, 
    HttpOptions
  ]
}
