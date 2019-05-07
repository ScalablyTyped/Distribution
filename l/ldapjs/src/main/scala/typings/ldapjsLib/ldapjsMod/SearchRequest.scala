package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "SearchRequest")
@js.native
class SearchRequest () extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var baseObject: java.lang.String = js.native
  var derefAliases: scala.Double = js.native
  var filter: js.Any = js.native
  var scope: ldapjsLib.ldapjsLibStrings.base | ldapjsLib.ldapjsLibStrings.one | ldapjsLib.ldapjsLibStrings.sub = js.native
  var sizeLimit: scala.Double = js.native
  var timeLimit: scala.Double = js.native
  var typesOnly: scala.Boolean = js.native
}

