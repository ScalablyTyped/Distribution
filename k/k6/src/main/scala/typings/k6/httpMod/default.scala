package typings.k6.httpMod

import typings.k6.mod.bytes
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The http module contains functionality for performing HTTP transactions.
  * https://k6.io/docs/javascript-api/k6-http/
  */
object default {
  
  @JSImport("k6/http", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Batch multiple HTTP requests together,
    * to issue them in parallel over multiple TCP connections.
    * https://k6.io/docs/javascript-api/k6-http/batch-requests/
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
    * https://k6.io/docs/javascript-api/k6-http/cookiejar/
    * @returns Active cookie jar.
    * @example
    * let jar = http.cookieJar();
    */
  inline def cookieJar(): CookieJar_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cookieJar")().asInstanceOf[CookieJar_]
  
  /**
    * Make DELETE  request.
    * https://k6.io/docs/javascript-api/k6-http/del-url-body-params/
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
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def del[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Returns a callback to be used with setResponseCallback to mark responses
    * as expected based only on their status codes.
    * https://staging.k6.io/docs/javascript-api/k6-http/expectedstatuses-statuses/
    */
  inline def expectedStatuses(param: (Double | ExpectedStatusesObject)*): ExpectedStatusesCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("expectedStatuses")(param.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ExpectedStatusesCallback]
  
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
  inline def file(data: js.typedarray.ArrayBuffer): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
  inline def file(data: js.typedarray.ArrayBuffer, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: js.typedarray.ArrayBuffer, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: js.typedarray.ArrayBuffer, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes): FileData = ^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any]).asInstanceOf[FileData]
  inline def file(data: bytes, filename: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes, filename: String, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  inline def file(data: bytes, filename: Unit, contentType: String): FileData = (^.asInstanceOf[js.Dynamic].applyDynamic("file")(data.asInstanceOf[js.Any], filename.asInstanceOf[js.Any], contentType.asInstanceOf[js.Any])).asInstanceOf[FileData]
  
  /**
    * Make GET request.
    * https://k6.io/docs/javascript-api/k6-http/get-url-params/
    * @param url - Request URL.
    * @param params - Request parameters.
    * @returns Resulting response.
    * @example
    * http.get('https://k6.io')
    */
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def get[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make HEAD request.
    * https://k6.io/docs/javascript-api/k6-http/head-url-params/
    * @param url - Request URL.
    * @param params - Request parameters.
    * @returns Resulting response.
    * @example
    * http.head('https://test.k6.io')
    */
  inline def head[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def head[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def head[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make OPTIONS request.
    * https://k6.io/docs/javascript-api/k6-http/options-url-body-params/
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
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def options[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make PATCH request.
    * https://k6.io/docs/javascript-api/k6-http/patch-url-body-params/
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
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def patch[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make POST request.
    * https://k6.io/docs/javascript-api/k6-http/post-url-body-params/
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
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def post[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make PUT request.
    * https://k6.io/docs/javascript-api/k6-http/put-url-body-params/
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
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL): RefinedResponse[RT] = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def put[RT /* <: js.UndefOr[ResponseType] */](url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Make request.
    * https://k6.io/docs/javascript-api/k6-http/request-method-url-body-params/
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
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: Unit, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  inline def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: HttpURL, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(method.asInstanceOf[js.Any], url.asInstanceOf[js.Any], body.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[RefinedResponse[RT]]
  
  /**
    * Set the response callback to be called to determine if a response was expected/successful or not.
    * https://k6.io/docs/javascript-api/k6-http/setresponsecallback-callback/
    */
  inline def setResponseCallback(responseCallback: ExpectedStatusesCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setResponseCallback")(responseCallback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Creates a URL with set name tag.
    * https://k6.io/docs/using-k6/http-requests/#url-grouping
    * @param strings - Passed string values.
    * @param args - Tagged template expressions.
    * @returns HTTP URL object.
    * @example
    * http.get(http.url`http://example.com/posts/${id}`) // tags.name="http://example.com/posts/${}",
    */
  inline def url(strings: TemplateStringsArray, args: (String | Double | Boolean)*): HttpURL = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(List(strings.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[HttpURL]
}
