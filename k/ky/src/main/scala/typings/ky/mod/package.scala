package typings.ky

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AfterResponseHook = js.Function3[
    /* request */ typings.std.Request, 
    /* options */ typings.ky.mod.NormalizedOptions, 
    /* response */ typings.std.Response, 
    typings.std.Response | scala.Unit | (js.Promise[typings.std.Response | scala.Unit])
  ]
  
  type BeforeRequestHook = js.Function2[
    /* request */ typings.std.Request, 
    /* options */ typings.ky.mod.NormalizedOptions, 
    typings.std.Request | typings.std.Response | scala.Unit | (js.Promise[typings.std.Request | typings.std.Response | scala.Unit])
  ]
  
  type BeforeRetryHook = js.Function4[
    /* request */ typings.std.Request, 
    /* options */ typings.ky.mod.NormalizedOptions, 
    /* error */ typings.std.Error, 
    /* retryCount */ scala.Double, 
    scala.Unit | js.Promise[scala.Unit]
  ]
  
  type Input = typings.std.Request | typings.std.URL | java.lang.String
  
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: typings.ky.mod.Primitive */] = LiteralType | (BaseType with typings.ky.anon._empty)
  
  type Primitive = js.UndefOr[
    scala.Null | java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.BigInt
  ]
}
