package typings
package markoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object expressMod {
  type MarkoRouterMatcher = js.Function2[
    /* path */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */ RequestHandler, 
    Application
  ]
  type RequestHandler = js.Function3[
    /* req */ expressLib.expressMod.Request, 
    /* res */ Response, 
    /* next */ js.UndefOr[
      expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
    ], 
    js.Any
  ]
}
