package typings
package imperiumLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object imperiumMod {
  type Actions = js.Array[java.lang.String] | java.lang.String
  type Context = js.Array[
    imperiumLib.imperiumLibStrings.params | imperiumLib.imperiumLibStrings.query | imperiumLib.imperiumLibStrings.headers | imperiumLib.imperiumLibStrings.body
  ]
  type GetAcl = js.Function1[/* req */ expressLib.expressMod.Request, js.Promise[scala.Boolean | js.Object]]
  type RoleParams = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type Roles = org.scalablytyped.runtime.StringDictionary[RoleActions]
}
