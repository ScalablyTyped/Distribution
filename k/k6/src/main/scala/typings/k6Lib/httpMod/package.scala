package typings
package k6Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object httpMod {
  type ArrayBatchRequest = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[RequestBody | scala.Null], 
    js.UndefOr[Params | scala.Null]
  ]
  type ArrayRefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = js.Tuple4[
    java.lang.String, 
    java.lang.String, 
    js.UndefOr[RequestBody | scala.Null], 
    js.UndefOr[RefinedParams[RT] | scala.Null]
  ]
  type BatchRequest = java.lang.String | ArrayBatchRequest | ObjectBatchRequest
  type BatchRequests = js.Array[BatchRequest] | org.scalablytyped.runtime.StringDictionary[BatchRequest]
  type BatchResponses[Q] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof Q ]: Q[K] extends k6.k6/http.RefinedBatchRequest<infer RT>? k6.k6/http.RefinedResponse<any> : never}
    */ k6Lib.k6LibStrings.BatchResponses with Q
  type CookieJarCookies = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type ParamsCookieValue = java.lang.String | k6Lib.Anon_Replace
  type RefinedBatchRequest[RT /* <: js.UndefOr[ResponseType] */] = java.lang.String | ArrayRefinedBatchRequest[RT] | ObjectRefinedBatchRequest[RT]
  type RefinedResponseBody[RT /* <: js.UndefOr[ResponseType] */] = java.lang.String | scala.Null | k6Lib.k6Mod.bytes
  type RequestBody = java.lang.String | StructuredRequestBody
  type ResponseBody = java.lang.String | k6Lib.k6Mod.bytes | scala.Null
  type StructuredRequestBody = org.scalablytyped.runtime.StringDictionary[java.lang.String | FileData]
}
