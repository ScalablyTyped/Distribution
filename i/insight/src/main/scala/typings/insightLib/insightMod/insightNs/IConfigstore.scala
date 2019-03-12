package typings
package insightLib.insightMod.insightNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IConfigstore extends js.Object {
  var all: js.Any
  var path: java.lang.String
  def del(key: java.lang.String): scala.Unit
  def get(key: java.lang.String): js.Any
  def set(key: java.lang.String, `val`: js.Any): scala.Unit
}

object IConfigstore {
  @scala.inline
  def apply(
    all: js.Any,
    del: java.lang.String => scala.Unit,
    get: java.lang.String => js.Any,
    path: java.lang.String,
    set: (java.lang.String, js.Any) => scala.Unit
  ): IConfigstore = {
    val __obj = js.Dynamic.literal(all = all, del = js.Any.fromFunction1(del), get = js.Any.fromFunction1(get), path = path, set = js.Any.fromFunction2(set))
  
    __obj.asInstanceOf[IConfigstore]
  }
}

