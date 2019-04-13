package typings
package graphqlDashPlaygroundDashMiddlewareDashExpressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object graphqlDashPlaygroundDashMiddlewareDashExpressMod {
  type ExpressPlaygroundMiddleware = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ expressLib.expressMod.Response, 
    /* next */ js.Function0[scala.Unit], 
    scala.Unit
  ]
  type Register = js.Function1[
    /* options */ graphqlDashPlaygroundDashHtmlLib.distRenderDashPlaygroundDashPageMod.MiddlewareOptions, 
    ExpressPlaygroundMiddleware
  ]
}
