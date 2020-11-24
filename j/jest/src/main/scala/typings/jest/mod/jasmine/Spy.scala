package typings.jest.mod.jasmine

import typings.jest.anon.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spy extends js.Object {
  
  def apply(params: js.Any*): js.Any = js.native
  
  var and: SpyAnd = js.native
  
  var argsForCall: js.Array[_] = js.native
  
  var calls: Calls = js.native
  
  var identity: String = js.native
  
  var mostRecentCall: Args = js.native
  
  var wasCalled: Boolean = js.native
}
