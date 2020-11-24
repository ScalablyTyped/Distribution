package typings.ldapjs.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends js.Object {
  
  var modification: StringDictionary[js.Any] = js.native
  
  var operation: String = js.native
}
@JSImport("ldapjs", "Change")
@js.native
object Change extends Instantiable1[/* change */ Change, Change]
