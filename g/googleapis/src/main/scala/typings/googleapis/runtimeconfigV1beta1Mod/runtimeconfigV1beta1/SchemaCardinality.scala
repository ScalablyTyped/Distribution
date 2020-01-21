package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Cardinality condition for the Waiter resource. A cardinality condition is
  * met when the number of variables under a specified path prefix reaches a
  * predefined number. For example, if you set a Cardinality condition where
  * the `path` is set to `/foo` and the number of paths is set to `2`, the
  * following variables would meet the condition in a RuntimeConfig resource:
  * + `/foo/variable1 = &quot;value1&quot;` + `/foo/variable2 =
  * &quot;value2&quot;` + `/bar/variable3 = &quot;value3&quot;`  It would not
  * satisfy the same condition with the `number` set to `3`, however, because
  * there is only 2 paths that start with `/foo`. Cardinality conditions are
  * recursive; all subtrees under the specific path prefix are counted.
  */
@js.native
trait SchemaCardinality extends js.Object {
  /**
    * The number variables under the `path` that must exist to meet this
    * condition. Defaults to 1 if not specified.
    */
  var number: js.UndefOr[Double] = js.native
  /**
    * The root of the variable subtree to monitor. For example, `/foo`.
    */
  var path: js.UndefOr[String] = js.native
}

object SchemaCardinality {
  @scala.inline
  def apply(number: Int | Double = null, path: String = null): SchemaCardinality = {
    val __obj = js.Dynamic.literal()
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCardinality]
  }
}

