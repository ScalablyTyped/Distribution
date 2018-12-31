package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var derefAliases: js.UndefOr[scala.Double] = js.undefined
  var filter: js.UndefOr[java.lang.String | Filter] = js.undefined
  var paged: js.UndefOr[scala.Boolean | ldapjsLib.Anon_PageSize] = js.undefined
  var scope: js.UndefOr[java.lang.String] = js.undefined
  var sizeLimit: js.UndefOr[scala.Double] = js.undefined
  var timeLimit: js.UndefOr[scala.Double] = js.undefined
  var typesOnly: js.UndefOr[scala.Boolean] = js.undefined
}

