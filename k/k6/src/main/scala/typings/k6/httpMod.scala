package typings.k6

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.k6.anon.Blocked
import typings.k6.anon.Body
import typings.k6.anon.Fields
import typings.k6.anon.Nextupdate
import typings.k6.anon.Replace
import typings.k6.htmlMod.Selection
import typings.k6.mod.JSONValue
import typings.k6.mod.bytes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object httpMod {
  
  @JSImport("k6/http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The http module contains functionality for performing HTTP transactions.
    * https://k6.io/docs/javascript-api/k6-http
    */
  object default {
    
    @JSImport("k6/http", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Batch multiple HTTP requests together,
      * to issue them in parallel over multiple TCP connections.
      * https://k6.io/docs/javascript-api/k6-http/batch-requests
      * @param requests - Request specifications.
      * @returns Resulting responses.
      * @example
      * let req1 = {
      *    method: 'GET',
      *    url: 'https://httpbin.org/get',
      * };
      * let req2 = {
      *   method: 'POST',
      *   url: 'https://httpbin.org/post',
      *   body: {
      *     hello: 'world!',
      *   },
      *   params: {
      *     headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
      *   },
      * };
      * let responses = http.batch([req1, req2]);
      */
    inline def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(requests.asInstanceOf[js.Any]).asInstanceOf[BatchResponses[Q]]
    
    /**
      * Get active cookie jar.
      * https://k6.io/docs/javascript-api/k6-http/cookiejar
      * @returns Active cookie jar.
      * @example
      * let jar = http.cookieJar();
      */
    inline def cookieJar(): CookieJar_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cookieJar")().asInstanceOf[CookieJar_]
    
    /**
      * Make DELETE  request.
      * https://k6.io/docs/javascript-api/k6-http/del-url-body-params
      * @param url - Request URL.
      * @param body - Discouraged. Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Create a file object used for building multipart requests (file uploads).
      * https://k6.io/docs/javascript-api/k6-http/file-data-filename-contenttype
      * @param data - File data.
      * @param filename - Filename. Included in MIME message.
      * @param contentType - Content type. Included in MIME message.
      * @returns File data object.
      * @example
      * let binFile = open('/path/to/file.bin', 'b');
      *
      * export default function() {
      *   let f = http.file(binFile, 'test.bin');
      *   console.log(md5(f.data, 'hex'));
      *   console.log(f.filename);
      *   console.log(f.content_type);
      * }
      */
    inline def file(data: String): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
    inline def file(data: String, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
    inline def file(data: String, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
    inline def file(data: String, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
    inline def file(data: bytes): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
    inline def file(data: bytes, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
    inline def file(data: bytes, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
    inline def file(data: bytes, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
    
    /**
      * Make GET request.
      * https://k6.io/docs/javascript-api/k6-http/get-url-params
      * @param url - Request URL.
      * @param params - Request parameters.
      * @returns Resulting response.
      * @example
      * http.get('https://k6.io')
      */
    inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Make OPTIONS request.
      * https://k6.io/docs/javascript-api/k6-http/options-url-body-params
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Make PATCH request.
      * https://k6.io/docs/javascript-api/k6-http/patch-url-body-params
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Make POST request.
      * https://k6.io/docs/javascript-api/k6-http/post-url-body-params
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      * @example
      * let formData = {name: 'k6'};
      * let headers = { 'Content-Type': 'application/x-www-form-urlencoded' };
      * http.post(url, formData, { headers: headers });
      */
    inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Make PUT request.
      * https://k6.io/docs/javascript-api/k6-http/put-url-body-params
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      */
    inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
    inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    
    /**
      * Make request.
      * https://k6.io/docs/javascript-api/k6-http/request-method-url-body-params
      * @param method - HTTP method.
      * @param url - Request URL.
      * @param body - Request body. Object form encoded.
      * @param params - Request parameters.
      * @returns Resulting response.
      * @example
      * let formData = {name: 'k6'};
      * let headers = { 'Content-Type': 'application/x-www-form-urlencoded' };
      * http.request('POST', url, formData, { headers: headers });
      */
    inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
    inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  }
  
  @JSImport("k6/http", "CookieJar")
  @js.native
  class CookieJar_ () extends StObject {
    
    /**
      * Get cookies set for a particular URL.
      * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-cookiesforurl-url
      * @param url - URL for which to get cookies.
      * @returns Cookies for URL.
      */
    def cookiesForURL(url: String): CookieJarCookies = js.native
    
    /**
      * Set cookie.
      * https://k6.io/docs/javascript-api/k6-http/cookiejar-k6-http/cookiejar-set-name-value-options
      * @param name - Cookie name.
      * @param value - Cookie value.
      * @param options - Optional settings.
      */
    def set(name: String, value: String): Unit = js.native
    def set(name: String, value: String, options: CookieOptions): Unit = js.native
  }
  
  @JSImport("k6/http", "FileData")
  @js.native
  abstract class FileData () extends StObject {
    
    /** Content type to include in MIME message. */
    var content_type: js.UndefOr[String] = js.native
    
    /** File data. */
    var data: String | bytes = js.native
    
    /** Filename to include in MIME message. */
    var filename: js.UndefOr[String] = js.native
  }
  
  @JSImport("k6/http", "OCSP_REASON_AA_COMPROMISE")
  @js.native
  val OCSP_REASON_AA_COMPROMISE: /* "aa_compromise" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_AFFILIATION_CHANGED")
  @js.native
  val OCSP_REASON_AFFILIATION_CHANGED: /* "affiliation_changed" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_CA_COMPROMISE")
  @js.native
  val OCSP_REASON_CA_COMPROMISE: /* "ca_compromise" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_CERTIFICATE_HOLD")
  @js.native
  val OCSP_REASON_CERTIFICATE_HOLD: /* "certificate_hold" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_CESSATION_OF_OPERATION")
  @js.native
  val OCSP_REASON_CESSATION_OF_OPERATION: /* "cessation_of_operation" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_KEY_COMPROMISE")
  @js.native
  val OCSP_REASON_KEY_COMPROMISE: /* "key_compromise" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_PRIVILEGE_WITHDRAWN")
  @js.native
  val OCSP_REASON_PRIVILEGE_WITHDRAWN: /* "privilege_withdrawn" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_REMOVE_FROM_CRL")
  @js.native
  val OCSP_REASON_REMOVE_FROM_CRL: /* "remove_from_crl" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_SUPERSEDED")
  @js.native
  val OCSP_REASON_SUPERSEDED: /* "superseded" */ String = js.native
  
  @JSImport("k6/http", "OCSP_REASON_UNSPECIFIED")
  @js.native
  val OCSP_REASON_UNSPECIFIED: /* "unspecified" */ String = js.native
  
  @JSImport("k6/http", "OCSP_STATUS_GOOD")
  @js.native
  val OCSP_STATUS_GOOD: /* "good" */ String = js.native
  
  @JSImport("k6/http", "OCSP_STATUS_REVOKED")
  @js.native
  val OCSP_STATUS_REVOKED: /* "revoked" */ String = js.native
  
  @JSImport("k6/http", "OCSP_STATUS_SERVER_FAILED")
  @js.native
  val OCSP_STATUS_SERVER_FAILED: /* "server_failed" */ String = js.native
  
  @JSImport("k6/http", "OCSP_STATUS_UNKNOWN")
  @js.native
  val OCSP_STATUS_UNKNOWN: /* "unknown" */ String = js.native
  
  @JSImport("k6/http", "SSL_3_0")
  @js.native
  val SSL_3_0: /* "ssl3.0" */ String = js.native
  
  @JSImport("k6/http", "TLS_1_0")
  @js.native
  val TLS_1_0: /* "tls1.0" */ String = js.native
  
  @JSImport("k6/http", "TLS_1_1")
  @js.native
  val TLS_1_1: /* "tls1.1" */ String = js.native
  
  @JSImport("k6/http", "TLS_1_2")
  @js.native
  val TLS_1_2: /* "tls1.2" */ String = js.native
  
  @JSImport("k6/http", "TLS_1_3")
  @js.native
  val TLS_1_3: /* "tls1.3" */ String = js.native
  
  inline def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")(requests.asInstanceOf[js.Any]).asInstanceOf[BatchResponses[Q]]
  
  inline def cookieJar(): CookieJar_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cookieJar")().asInstanceOf[CookieJar_]
  
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def file(data: String): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
  inline def file(data: String, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: String, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: String, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
  inline def file(data: bytes, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  type ArrayBatchRequest = js.Tuple4[String, String, js.UndefOr[RequestBody | Null], js.UndefOr[Params | Null]]
  
  type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = js.Tuple4[String, String, js.UndefOr[RequestBody | Null], js.UndefOr[RefinedParams[RT] | Null]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.basic
    - typings.k6.k6Strings.digest
    - typings.k6.k6Strings.ntlm
  */
  trait AuthMethod extends StObject
  object AuthMethod {
    
    inline def basic: typings.k6.k6Strings.basic = "basic".asInstanceOf[typings.k6.k6Strings.basic]
    
    inline def digest: typings.k6.k6Strings.digest = "digest".asInstanceOf[typings.k6.k6Strings.digest]
    
    inline def ntlm: typings.k6.k6Strings.ntlm = "ntlm".asInstanceOf[typings.k6.k6Strings.ntlm]
  }
  
  type BatchRequest = String | ArrayBatchRequest | ObjectBatchRequest
  
  type BatchRequests = js.Array[BatchRequest] | StringDictionary[BatchRequest]
  
  type BatchResponses[Q] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
    */ typings.k6.k6Strings.BatchResponses & TopLevel[Q]
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.TLS_RSA_WITH_RC4_128_SHA
    - typings.k6.k6Strings.TLS_RSA_WITH_3DES_EDE_CBC_SHA
    - typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA
    - typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA256
    - typings.k6.k6Strings.TLS_RSA_WITH_AES_256_CBC_SHA
    - typings.k6.k6Strings.TLS_RSA_WITH_AES_128_GCM_SHA256
    - typings.k6.k6Strings.TLS_RSA_WITH_AES_256_GCM_SHA384
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_RC4_128_SHA
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384
    - typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384
    - typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305
    - typings.k6.k6Strings.TLS_AES_128_GCM_SHA256
    - typings.k6.k6Strings.TLS_AES_256_GCM_SHA384
    - typings.k6.k6Strings.TLS_CHACHA20_POLY1305_SHA256
  */
  trait CipherSuite extends StObject
  object CipherSuite {
    
    inline def TLS_AES_128_GCM_SHA256: typings.k6.k6Strings.TLS_AES_128_GCM_SHA256 = "TLS_AES_128_GCM_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_AES_128_GCM_SHA256]
    
    inline def TLS_AES_256_GCM_SHA384: typings.k6.k6Strings.TLS_AES_256_GCM_SHA384 = "TLS_AES_256_GCM_SHA384".asInstanceOf[typings.k6.k6Strings.TLS_AES_256_GCM_SHA384]
    
    inline def TLS_CHACHA20_POLY1305_SHA256: typings.k6.k6Strings.TLS_CHACHA20_POLY1305_SHA256 = "TLS_CHACHA20_POLY1305_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_CHACHA20_POLY1305_SHA256]
    
    inline def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA]
    
    inline def TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256]
    
    inline def TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256]
    
    inline def TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA]
    
    inline def TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384]
    
    inline def TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305]
    
    inline def TLS_ECDHE_ECDSA_WITH_RC4_128_SHA: typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA = "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_ECDSA_WITH_RC4_128_SHA]
    
    inline def TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA]
    
    inline def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA]
    
    inline def TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256]
    
    inline def TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256 = "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256]
    
    inline def TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA = "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA]
    
    inline def TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384 = "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384]
    
    inline def TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305 = "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305]
    
    inline def TLS_ECDHE_RSA_WITH_RC4_128_SHA: typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_RC4_128_SHA = "TLS_ECDHE_RSA_WITH_RC4_128_SHA".asInstanceOf[typings.k6.k6Strings.TLS_ECDHE_RSA_WITH_RC4_128_SHA]
    
    inline def TLS_RSA_WITH_3DES_EDE_CBC_SHA: typings.k6.k6Strings.TLS_RSA_WITH_3DES_EDE_CBC_SHA = "TLS_RSA_WITH_3DES_EDE_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_3DES_EDE_CBC_SHA]
    
    inline def TLS_RSA_WITH_AES_128_CBC_SHA: typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA = "TLS_RSA_WITH_AES_128_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA]
    
    inline def TLS_RSA_WITH_AES_128_CBC_SHA256: typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA256 = "TLS_RSA_WITH_AES_128_CBC_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_AES_128_CBC_SHA256]
    
    inline def TLS_RSA_WITH_AES_128_GCM_SHA256: typings.k6.k6Strings.TLS_RSA_WITH_AES_128_GCM_SHA256 = "TLS_RSA_WITH_AES_128_GCM_SHA256".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_AES_128_GCM_SHA256]
    
    inline def TLS_RSA_WITH_AES_256_CBC_SHA: typings.k6.k6Strings.TLS_RSA_WITH_AES_256_CBC_SHA = "TLS_RSA_WITH_AES_256_CBC_SHA".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_AES_256_CBC_SHA]
    
    inline def TLS_RSA_WITH_AES_256_GCM_SHA384: typings.k6.k6Strings.TLS_RSA_WITH_AES_256_GCM_SHA384 = "TLS_RSA_WITH_AES_256_GCM_SHA384".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_AES_256_GCM_SHA384]
    
    inline def TLS_RSA_WITH_RC4_128_SHA: typings.k6.k6Strings.TLS_RSA_WITH_RC4_128_SHA = "TLS_RSA_WITH_RC4_128_SHA".asInstanceOf[typings.k6.k6Strings.TLS_RSA_WITH_RC4_128_SHA]
  }
  
  type CookieJarCookies = StringDictionary[js.Array[String]]
  
  trait CookieOptions extends StObject {
    
    /** Domain allowed to receive. */
    var domain: js.UndefOr[String] = js.undefined
    
    /** Expiry time in RFC1123 format. */
    var expires: js.UndefOr[String] = js.undefined
    
    /** HTTP only. */
    var http_only: js.UndefOr[Boolean] = js.undefined
    
    /** Seconds until expiration. */
    var max_age: js.UndefOr[Double] = js.undefined
    
    /** Scope path. */
    var path: js.UndefOr[String] = js.undefined
    
    /** Secure. */
    var secure: js.UndefOr[Boolean] = js.undefined
  }
  object CookieOptions {
    
    inline def apply(): CookieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CookieOptions]
    }
    
    extension [Self <: CookieOptions](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
      
      inline def setHttp_only(value: Boolean): Self = StObject.set(x, "http_only", value.asInstanceOf[js.Any])
      
      inline def setHttp_onlyUndefined: Self = StObject.set(x, "http_only", js.undefined)
      
      inline def setMax_age(value: Double): Self = StObject.set(x, "max_age", value.asInstanceOf[js.Any])
      
      inline def setMax_ageUndefined: Self = StObject.set(x, "max_age", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    }
  }
  
  trait ObjectBatchRequest extends StObject {
    
    /** Request body. */
    var body: js.UndefOr[RequestBody | Null] = js.undefined
    
    /** Request method. */
    var method: String
    
    /** Requset parameters. */
    var params: js.UndefOr[Params | Null] = js.undefined
    
    /** Request URL. */
    var url: String
  }
  object ObjectBatchRequest {
    
    inline def apply(method: String, url: String): ObjectBatchRequest = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectBatchRequest]
    }
    
    extension [Self <: ObjectBatchRequest](x: Self) {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait ObjectRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] extends StObject {
    
    var body: js.UndefOr[RequestBody | Null] = js.undefined
    
    var method: String
    
    var params: js.UndefOr[RefinedParams[RT] | Null] = js.undefined
    
    var url: String
  }
  object ObjectRefinedBatchRequest {
    
    inline def apply[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): ObjectRefinedBatchRequest[RT] = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ObjectRefinedBatchRequest[RT]]
    }
    
    extension [Self <: ObjectRefinedBatchRequest[?], RT /* <: js.UndefOr[ResponseType] */](x: Self & ObjectRefinedBatchRequest[RT]) {
      
      inline def setBody(value: RequestBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParams(value: RefinedParams[RT]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsNull: Self = StObject.set(x, "params", null)
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    /** Authentication method. */
    var auth: js.UndefOr[AuthMethod] = js.undefined
    
    /** Request body compression. */
    var compression: js.UndefOr[String] = js.undefined
    
    /** Request scoped cookies. */
    var cookies: js.UndefOr[StringDictionary[ParamsCookieValue]] = js.undefined
    
    /** Request headers. */
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Cookie jar to override default VU cookie jar with. */
    var jar: js.UndefOr[CookieJar_] = js.undefined
    
    /** Maximum redirects to follow. */
    var redirects: js.UndefOr[Double] = js.undefined
    
    /** Response type. */
    var responseType: js.UndefOr[ResponseType] = js.undefined
    
    /** Response time metric tags. */
    var tags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** Request timeout. */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object Params {
    
    inline def apply(): Params = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setAuth(value: AuthMethod): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      inline def setCompression(value: String): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setCookies(value: StringDictionary[ParamsCookieValue]): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setJar(value: CookieJar_): Self = StObject.set(x, "jar", value.asInstanceOf[js.Any])
      
      inline def setJarUndefined: Self = StObject.set(x, "jar", js.undefined)
      
      inline def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setResponseType(value: ResponseType): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type ParamsCookieValue = String | Replace
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.HTTPSlash1Dot0
    - typings.k6.k6Strings.HTTPSlash1Dot1
    - typings.k6.k6Strings.HTTPSlash2Dot0
  */
  trait Protocol extends StObject
  object Protocol {
    
    inline def HTTPSlash1Dot0: typings.k6.k6Strings.HTTPSlash1Dot0 = "HTTP/1.0".asInstanceOf[typings.k6.k6Strings.HTTPSlash1Dot0]
    
    inline def HTTPSlash1Dot1: typings.k6.k6Strings.HTTPSlash1Dot1 = "HTTP/1.1".asInstanceOf[typings.k6.k6Strings.HTTPSlash1Dot1]
    
    inline def HTTPSlash2Dot0: typings.k6.k6Strings.HTTPSlash2Dot0 = "HTTP/2.0".asInstanceOf[typings.k6.k6Strings.HTTPSlash2Dot0]
  }
  
  type RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = String | ArrayRefinedBatchRequest[RT] | ObjectRefinedBatchRequest[RT]
  
  trait RefinedParams[RT /* <: js.UndefOr[ResponseType] */]
    extends StObject
       with Params {
    
    @JSName("responseType")
    var responseType_RefinedParams: js.UndefOr[RT] = js.undefined
  }
  object RefinedParams {
    
    inline def apply[RT /* <: js.UndefOr[ResponseType] */](): RefinedParams[RT] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RefinedParams[RT]]
    }
    
    extension [Self <: RefinedParams[?], RT /* <: js.UndefOr[ResponseType] */](x: Self & RefinedParams[RT]) {
      
      inline def setResponseType(value: RT): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
      
      inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    }
  }
  
  @js.native
  trait RefinedResponse[RT /* <: js.UndefOr[ResponseType] */]
    extends StObject
       with Response {
    
    @JSName("body")
    var body_RefinedResponse: RefinedResponseBody[RT] = js.native
  }
  
  type RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] = String | Null | bytes
  
  type RequestBody = String | StructuredRequestBody
  
  trait RequestCookie extends StObject {
    
    /** Name. */
    var name: String
    
    /** Whether configured to override VU cookie jar. */
    var replace: Boolean
    
    /** Value. */
    var value: String
  }
  object RequestCookie {
    
    inline def apply(name: String, replace: Boolean, value: String): RequestCookie = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestCookie]
    }
    
    extension [Self <: RequestCookie](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Response extends StObject {
    
    /** Response body. */
    var body: ResponseBody = js.native
    
    /**
      * Click link on page.
      * https://k6.io/docs/javascript-api/k6-http/response-k6-http/response-clicklink-params
      * @param selector - Selector expression locating link to click.
      * @param params - Parameters for link click request.
      * @returns Link click response.
      */
    def clickLink[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
    def clickLink[RT /* <: js.UndefOr[ResponseType] */](args: typings.k6.anon.Params[RT]): RefinedResponse[RT] = js.native
    
    /** Response cookies. */
    var cookies: StringDictionary[js.Array[ResponseCookie]] = js.native
    
    /** Non-HTTP error message. */
    var error: String = js.native
    
    /** Error code. Present for 4xx 5xx responses and non-HTTP errors. */
    var error_code: Double = js.native
    
    /** Response headers. */
    var headers: StringDictionary[String] = js.native
    
    /**
      * Parse body as HTML. Optionally filter by selector.
      * https://docs.k6.io/docs/response-k6http
      * @param selector - Selector expression.
      * @returns Document node or selected elements.
      * @example
      * let res = http.get("https://stackoverflow.com");
      * let doc = res.html();
      */
    def html(): Selection = js.native
    def html(selector: String): Selection = js.native
    
    /**
      * Parse body as JSON. Optionally filter by selector.
      * https://docs.k6.io/docs/response-k6http
      * @param selector - GJSON expression.
      * @returns Parse result if successful, `undefined` if unsuccessful.
      * @example
      * let res = http.get(url);
      * res.json();
      */
    def json(): js.UndefOr[JSONValue] = js.native
    def json(selector: String): js.UndefOr[JSONValue] = js.native
    
    /** Online Certificate Status Protocol response. */
    var ocsp: Nextupdate = js.native
    
    /** Protocol used to perform the transfer. */
    var proto: Protocol = js.native
    
    /** Server IP address. */
    var remote_ip: String = js.native
    
    /** Remote port connected to. */
    var remote_port: Double = js.native
    
    /** Inciting request details. */
    var request: Body = js.native
    
    /** HTTP status code. */
    var status: Double = js.native
    
    /**
      * Submit form on page.
      * https://k6.io/docs/javascript-api/k6-http/response-k6-http/response-submitform-params
      * @param formSelector - Selector expression locating form to submit.
      * @param fields - Form field values.
      * @param submitSelector - Selector expression locating submit button.
      * @param params - Parameters for form submission request.
      * @returns Form submission response.
      */
    def submitForm[RT /* <: js.UndefOr[ResponseType] */](): RefinedResponse[RT] = js.native
    def submitForm[RT /* <: js.UndefOr[ResponseType] */](args: Fields[RT]): RefinedResponse[RT] = js.native
    
    /** Performance timing information. */
    var timings: Blocked = js.native
    
    /** TLS cipher suite used. */
    var tls_cipher_suite: CipherSuite = js.native
    
    /** TLS/SSL version used. One of `TLS_*` `SSL_*` constants. */
    var tls_version: String = js.native
    
    /** Fetched URL. May differ from request URL due to redirects. */
    var url: String = js.native
  }
  
  type ResponseBody = String | bytes | Null
  
  trait ResponseCookie extends StObject {
    
    /** Domain allowed to receive. */
    var domain: String
    
    /** Expiry time in millisecond Unix time. */
    var expires: Double
    
    /** HTTP only. */
    var httpOnly: Boolean
    
    /** Seconds until expiration. */
    var maxAge: Double
    
    /** Name. */
    var name: String
    
    /** Scope path. */
    var path: String
    
    /** Secure. */
    var secure: Boolean
    
    /** Value. */
    var value: String
  }
  object ResponseCookie {
    
    inline def apply(
      domain: String,
      expires: Double,
      httpOnly: Boolean,
      maxAge: Double,
      name: String,
      path: String,
      secure: Boolean,
      value: String
    ): ResponseCookie = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseCookie]
    }
    
    extension [Self <: ResponseCookie](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.k6.k6Strings.binary
    - typings.k6.k6Strings.none
    - typings.k6.k6Strings.text
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    inline def binary: typings.k6.k6Strings.binary = "binary".asInstanceOf[typings.k6.k6Strings.binary]
    
    inline def none: typings.k6.k6Strings.none = "none".asInstanceOf[typings.k6.k6Strings.none]
    
    inline def text: typings.k6.k6Strings.text = "text".asInstanceOf[typings.k6.k6Strings.text]
  }
  
  type StructuredRequestBody = StringDictionary[String | FileData]
  
  /**
    * The http module contains functionality for performing HTTP transactions.
    * https://k6.io/docs/javascript-api/k6-http
    */
  object http
}
