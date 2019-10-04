package typings.ky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object kyMod {
  import typings.std.BigInt
  import typings.std.Error
  import typings.std.Request
  import typings.std.Response
  import typings.std.URL

  type AfterResponseHook = js.Function3[
    /* input */ Input, 
    /* options */ NormalizedOptions, 
    /* response */ Response, 
    Response | Unit | (js.Promise[Response | Unit])
  ]
  type BeforeRequestHook = js.Function2[
    /* input */ Input, 
    /* options */ NormalizedOptions, 
    Response | Unit | (js.Promise[Response | Unit])
  ]
  type BeforeRetryHook = js.Function4[
    /* input */ Input, 
    /* options */ NormalizedOptions, 
    /* error */ Error, 
    /* retryCount */ Double, 
    Unit | js.Promise[Unit]
  ]
  type Input = Request | URL | String
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType with js.Object)
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | BigInt]
}
