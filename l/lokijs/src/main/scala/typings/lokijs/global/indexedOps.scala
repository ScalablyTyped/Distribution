package typings.lokijs.global

import typings.lokijs.lokijsBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** if an op is registered in this object, our 'calculateRange' can use it with our binary indices.
  * if the op is registered to a function, we will run that function/op as a 2nd pass filter on results.
  * those 2nd pass filter functions should be similar to LokiOps functions, accepting 2 vals to compare.
  */
@JSGlobal("indexedOps")
@js.native
object indexedOps extends js.Object {
  
  @JSName("$aeq")
  var $aeq: `true` = js.native
  
  @JSName("$between")
  var $between: `true` = js.native
  
  @JSName("$dteq")
  var $dteq: `true` = js.native
  
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): Boolean = js.native
  @JSName("$eq")
  var $eq_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean] = js.native
  
  @JSName("$gt")
  var $gt: `true` = js.native
  
  @JSName("$gte")
  var $gte: `true` = js.native
  
  @JSName("$in")
  var $in: `true` = js.native
  
  @JSName("$lt")
  var $lt: `true` = js.native
  
  @JSName("$lte")
  var $lte: `true` = js.native
}
