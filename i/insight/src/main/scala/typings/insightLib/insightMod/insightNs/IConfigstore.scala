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
    del: js.Function1[java.lang.String, scala.Unit],
    get: js.Function1[java.lang.String, js.Any],
    path: java.lang.String,
    set: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): IConfigstore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("del")(del)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[IConfigstore]
  }
}

