package typings.istanbulDashMiddleware

import typings.express.expressMod.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object istanbulDashMiddlewareMod {
  type ClientMatcher = js.Function1[/* req */ Request, Boolean]
  type Matcher = js.Function1[/* file */ String, Boolean]
  type PathTransformer = js.Function1[/* req */ Request, String]
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ Boolean, 
    PostLoadHookFn
  ]
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}
