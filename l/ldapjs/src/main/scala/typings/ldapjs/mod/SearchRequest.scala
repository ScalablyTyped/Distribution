package typings.ldapjs.mod

import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ldapjs", "SearchRequest")
@js.native
class SearchRequest () extends js.Object {
  var attributes: js.UndefOr[js.Any] = js.native
  var baseObject: String = js.native
  var derefAliases: Double = js.native
  var filter: js.Any = js.native
  var scope: base | one | sub = js.native
  var sizeLimit: Double = js.native
  var timeLimit: Double = js.native
  var typesOnly: Boolean = js.native
}

