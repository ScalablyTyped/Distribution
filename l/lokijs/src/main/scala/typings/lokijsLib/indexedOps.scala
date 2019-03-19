package typings
package lokijsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** if an op is registered in this object, our 'calculateRange' can use it with our binary indices.
  * if the op is registered to a function, we will run that function/op as a 2nd pass filter on results.
  * those 2nd pass filter functions should be similar to LokiOps functions, accepting 2 vals to compare.
  */
@JSGlobal("indexedOps")
@js.native
object indexedOps extends js.Object {
  @JSName("$aeq")
  var $aeq: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$between")
  var $between: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$dteq")
  var $dteq: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$eq")
  var $eq_Original: js.Function2[/* a */ js.Any, /* b */ js.Any, scala.Boolean] = js.native
  @JSName("$gt")
  var $gt: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$gte")
  var $gte: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$in")
  var $in: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$lt")
  var $lt: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$lte")
  var $lte: lokijsLib.lokijsLibNumbers.`true` = js.native
  @JSName("$eq")
  def $eq(a: js.Any, b: js.Any): scala.Boolean = js.native
}

