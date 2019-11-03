package typings.imperium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imperiumMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.express.expressMod.Request
  import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
  import typings.imperium.imperiumStrings.body
  import typings.imperium.imperiumStrings.headers
  import typings.imperium.imperiumStrings.params
  import typings.imperium.imperiumStrings.query

  type Actions = js.Array[String] | String
  type Context = js.Array[params | query | headers | body]
  type GetAcl = js.Function1[/* req */ Request[ParamsDictionary], js.Promise[Boolean | js.Object]]
  type RoleParams = StringDictionary[String]
  type Roles = StringDictionary[RoleActions]
}
