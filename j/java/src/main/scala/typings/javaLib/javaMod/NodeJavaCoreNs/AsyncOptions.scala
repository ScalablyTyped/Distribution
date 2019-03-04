package typings
package javaLib.javaMod.NodeJavaCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends js.Object {
  var asyncSuffix: js.UndefOr[java.lang.String] = js.undefined
  var promiseSuffix: js.UndefOr[java.lang.String] = js.undefined
  var promisify: js.UndefOr[Promisify] = js.undefined
  var syncSuffix: java.lang.String
}

object AsyncOptions {
  @scala.inline
  def apply(
    syncSuffix: java.lang.String,
    asyncSuffix: java.lang.String = null,
    promiseSuffix: java.lang.String = null,
    promisify: Promisify = null
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal(syncSuffix = syncSuffix)
    if (asyncSuffix != null) __obj.updateDynamic("asyncSuffix")(asyncSuffix)
    if (promiseSuffix != null) __obj.updateDynamic("promiseSuffix")(promiseSuffix)
    if (promisify != null) __obj.updateDynamic("promisify")(promisify)
    __obj.asInstanceOf[AsyncOptions]
  }
}

