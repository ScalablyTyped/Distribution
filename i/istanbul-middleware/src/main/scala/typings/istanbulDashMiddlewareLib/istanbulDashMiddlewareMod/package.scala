package typings
package istanbulDashMiddlewareLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object istanbulDashMiddlewareMod {
  type ClientMatcher = js.Function1[/* req */ expressLib.expressMod.eNs.Request, scala.Boolean]
  type Matcher = js.Function1[/* file */ java.lang.String, scala.Boolean]
  type PathTransformer = js.Function1[/* req */ expressLib.expressMod.eNs.Request, java.lang.String]
  type PostLoadHook = js.Function3[
    /* matcherfn */ Matcher, 
    /* transformer */ js.Any, 
    /* verbose */ scala.Boolean, 
    PostLoadHookFn
  ]
  type PostLoadHookFn = js.Function1[/* file */ js.Any, js.Object]
}
