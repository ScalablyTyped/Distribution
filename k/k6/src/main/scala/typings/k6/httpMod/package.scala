package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.k6.Anon_Replace
  import typings.k6.k6Mod.bytes

  type ArrayBatchRequest = js.Tuple4[String, String, js.UndefOr[RequestBody | Null], js.UndefOr[Params | Null]]
  type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = js.Tuple4[String, String, js.UndefOr[RequestBody | Null], js.UndefOr[RefinedParams[RT] | Null]]
  type BatchRequest = String | ArrayBatchRequest | ObjectBatchRequest
  type BatchRequests = js.Array[BatchRequest] | StringDictionary[BatchRequest]
  type BatchResponses[Q] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
    */ typings.k6.k6Strings.BatchResponses with Q
  type CookieJarCookies = StringDictionary[js.Array[String]]
  type ParamsCookieValue = String | Anon_Replace
  type RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = String | ArrayRefinedBatchRequest[RT] | ObjectRefinedBatchRequest[RT]
  type RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] = String | Null | bytes
  type RequestBody = String | StructuredRequestBody
  type ResponseBody = String | bytes | Null
  type StructuredRequestBody = StringDictionary[String | FileData]
}
