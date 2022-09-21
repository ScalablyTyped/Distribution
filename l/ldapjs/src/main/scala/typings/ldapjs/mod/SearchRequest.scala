package typings.ldapjs.mod

import typings.ldapjs.ldapjsStrings.base
import typings.ldapjs.ldapjsStrings.one
import typings.ldapjs.ldapjsStrings.sub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ldapjs", "SearchRequest")
@js.native
open class SearchRequest () extends StObject {
  
  var attributes: js.UndefOr[Any] = js.native
  
  var baseObject: String = js.native
  
  var derefAliases: Double = js.native
  
  var filter: Any = js.native
  
  var scope: base | one | sub = js.native
  
  var sizeLimit: Double = js.native
  
  var timeLimit: Double = js.native
  
  var typesOnly: Boolean = js.native
}
