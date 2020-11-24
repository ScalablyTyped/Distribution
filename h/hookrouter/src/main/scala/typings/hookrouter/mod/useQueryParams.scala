package typings.hookrouter.mod

import typings.hookrouter.mod.HookRouter.QueryParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("hookrouter", "useQueryParams")
@js.native
object useQueryParams extends js.Object {
  
  def apply(): js.Tuple2[
    QueryParams, 
    js.Function2[/* inObj */ QueryParams, /* replace */ js.UndefOr[Boolean], Unit]
  ] = js.native
}
