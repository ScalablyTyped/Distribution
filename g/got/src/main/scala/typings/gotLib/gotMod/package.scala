package typings
package gotLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object gotMod {
  /**
    * @param response Response object.
    * @param retryWithMergedOptions Retries request with the updated options.
    */
  type AfterResponseHook[Options, Body /* <: nodeLib.Buffer | java.lang.String | js.Object */] = js.Function2[
    /* response */ Response[Body], 
    /* retryWithMergedOptions */ js.Function1[/* updateOptions */ Options, GotPromise[Body]], 
    Response[Body] | js.Promise[Response[Body]]
  ]
  /**
    * @param options Normalized request options.
    */
  type BeforeRedirectHook[Options] = js.Function1[/* options */ Options, js.Any]
  /**
    * @param options Normalized request options.
    */
  type BeforeRequestHook[Options] = js.Function1[/* options */ Options, js.Any]
  /**
    * @param options Normalized request options.
    * @param error Request error.
    * @param retryCount Number of retry.
    */
  type BeforeRetryHook[Options] = js.Function3[/* options */ Options, /* error */ GotError, /* retryCount */ scala.Double, js.Any]
  type GotPromise[B /* <: nodeLib.Buffer | java.lang.String | js.Object */] = js.Promise[Response[B]] with gotLib.Anon_Cancel
  type GotStreamFn = js.Function2[
    /* url */ GotUrl, 
    /* options */ js.UndefOr[GotOptions[java.lang.String | scala.Null]], 
    GotEmitter with nodeLib.streamMod.Duplex
  ]
  type GotUrl = java.lang.String | nodeLib.httpsMod.RequestOptions | nodeLib.urlMod.Url | nodeLib.urlMod.URL
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
}
