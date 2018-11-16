package typings
package markoLib.expressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mNs {
  type MarkoRouterMatcher = js.Function2[
    /* path */ expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.PathParams, 
    /* repeated */RequestHandler, 
    Application
  ]
  type RequestHandler = js.Function3[
    /* req */ expressLib.expressMod.eNs.Request, 
    /* res */ Response, 
    /* next */ js.UndefOr[
      expressDashServeDashStaticDashCoreLib.expressDashServeDashStaticDashCoreMod.NextFunction
    ], 
    js.Any
  ]
}
