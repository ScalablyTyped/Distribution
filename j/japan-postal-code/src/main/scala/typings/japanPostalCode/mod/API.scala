package typings.japanPostalCode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API extends js.Object {
  
  def get(stringifiedPostalCode: String, callback: Callback): Unit = js.native
  @JSName("get")
  var get_Original: FetchPostalCodeMethod = js.native
}
