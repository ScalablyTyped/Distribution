package typings.k6.httpMod

import typings.k6.mod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The http module contains functionality for performing HTTP transactions.
  * https://k6.io/docs/javascript-api/k6-http
  */
@JSImport("k6/http", JSImport.Default)
@js.native
object default extends js.Object {
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
  def batch[Q /* <: BatchRequests */](requests: Q): BatchResponses[Q] = js.native
  /**
    * Get active cookie jar.
    * https://k6.io/docs/javascript-api/k6-http/cookiejar
    * @returns Active cookie jar.
    * @example
    * let jar = http.cookieJar();
    */
  def cookieJar(): CookieJar_ = js.native
  /**
    * Make DELETE  request.
    * https://k6.io/docs/javascript-api/k6-http/del-url-body-params
    * @param url - Request URL.
    * @param body - Discouraged. Request body. Object form encoded.
    * @param params - Request parameters.
    * @returns Resulting response.
    */
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def del[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
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
  def file(data: String): FileData = js.native
  def file(data: String, filename: String): FileData = js.native
  def file(data: String, filename: String, contentType: String): FileData = js.native
  def file(data: bytes): FileData = js.native
  def file(data: bytes, filename: String): FileData = js.native
  def file(data: bytes, filename: String, contentType: String): FileData = js.native
  /**
    * Make GET request.
    * https://k6.io/docs/javascript-api/k6-http/get-url-params
    * @param url - Request URL.
    * @param params - Request parameters.
    * @returns Resulting response.
    * @example
    * http.get('https://k6.io')
    */
  def get[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def get[RT /* <: js.UndefOr[ResponseType] */](url: String, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  /**
    * Make OPTIONS request.
    * https://k6.io/docs/javascript-api/k6-http/options-url-body-params
    * @param url - Request URL.
    * @param body - Request body. Object form encoded.
    * @param params - Request parameters.
    * @returns Resulting response.
    */
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def options[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  /**
    * Make PATCH request.
    * https://k6.io/docs/javascript-api/k6-http/patch-url-body-params
    * @param url - Request URL.
    * @param body - Request body. Object form encoded.
    * @param params - Request parameters.
    * @returns Resulting response.
    */
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def patch[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
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
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def post[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  /**
    * Make PUT request.
    * https://k6.io/docs/javascript-api/k6-http/put-url-body-params
    * @param url - Request URL.
    * @param body - Request body. Object form encoded.
    * @param params - Request parameters.
    * @returns Resulting response.
    */
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def put[RT /* <: js.UndefOr[ResponseType] */](url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
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
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: Null, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody): RefinedResponse[RT] = js.native
  def request[RT /* <: js.UndefOr[ResponseType] */](method: String, url: String, body: RequestBody, params: RefinedParams[RT]): RefinedResponse[RT] = js.native
}

