package typings.java.javaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncOptions extends js.Object {
  var asyncSuffix: js.UndefOr[String] = js.undefined
  var promiseSuffix: js.UndefOr[String] = js.undefined
  var promisify: js.UndefOr[Promisify] = js.undefined
  var syncSuffix: String
}

object AsyncOptions {
  @scala.inline
  def apply(
    syncSuffix: String,
    asyncSuffix: String = null,
    promiseSuffix: String = null,
    promisify: (/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any]) => js.Function = null
  ): AsyncOptions = {
    val __obj = js.Dynamic.literal(syncSuffix = syncSuffix)
    if (asyncSuffix != null) __obj.updateDynamic("asyncSuffix")(asyncSuffix)
    if (promiseSuffix != null) __obj.updateDynamic("promiseSuffix")(promiseSuffix)
    if (promisify != null) __obj.updateDynamic("promisify")(js.Any.fromFunction2(promisify))
    __obj.asInstanceOf[AsyncOptions]
  }
}

