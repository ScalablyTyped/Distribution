package typings.got

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  /**
    * @param response Response object.
    * @param retryWithMergedOptions Retries request with the updated options.
    */
  type AfterResponseHook[Options, Body /* <: typings.node.Buffer | java.lang.String | js.Object */] = js.Function2[
    /* response */ typings.got.mod.Response[Body], 
    /* retryWithMergedOptions */ js.Function1[/* updateOptions */ Options, typings.got.mod.GotPromise[Body]], 
    typings.got.mod.Response[Body] | js.Promise[typings.got.mod.Response[Body]]
  ]
  
  type BeforeErrorHook = js.Function1[
    /* error */ typings.got.mod.GotError, 
    typings.std.Error | js.Promise[typings.std.Error]
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
  type BeforeRetryHook[Options] = js.Function3[
    /* options */ Options, 
    /* error */ typings.got.mod.GotError, 
    /* retryCount */ scala.Double, 
    js.Any
  ]
  
  type GotInstance[T] = T with (typings.std.Record[
    typings.got.gotStrings.get_ | typings.got.gotStrings.post_ | typings.got.gotStrings.put_ | typings.got.gotStrings.patch | typings.got.gotStrings.head_ | typings.got.gotStrings.delete_, 
    T
  ]) with typings.got.anon.CancelError
  
  type GotStreamFn = js.Function2[
    /* url */ typings.got.mod.GotUrl, 
    /* options */ js.UndefOr[typings.got.mod.GotOptions[java.lang.String | scala.Null]], 
    typings.got.mod.GotEmitter with typings.node.streamMod.Duplex
  ]
  
  type GotUrl = java.lang.String | typings.node.httpsMod.RequestOptions | typings.node.urlMod.Url | typings.node.urlMod.URL_
  
  /**
    * @param options Unnormalized request options.
    */
  type InitHook[Options] = js.Function1[/* options */ Options, scala.Unit]
  
  type RetryFunction = js.Function2[/* retry */ scala.Double, /* error */ js.Any, scala.Double]
}
