package typings.jsonSchemaTraverse.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraverseOptions extends js.Object {
  /** Without option allKeys: true callback will be called only with root schema. */
  var allKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Callback function `cb` is called for each schema object (not including draft-06 boolean schemas),
    * including the root schema, in pre-order traversal. Schema references (`$ref`) are not resolved,
    * they are passed as is. Alternatively, you can pass a `{pre, post}` object as `cb`, and then `pre`
    * will be called before traversing child elements, and `post` will be called
    * after all child elementshave been traversed.
    */
  var cb: js.UndefOr[TraverseCallback] = js.undefined
}

object TraverseOptions {
  @scala.inline
  def apply(allKeys: js.UndefOr[Boolean] = js.undefined, cb: TraverseCallback = null): TraverseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allKeys)) __obj.updateDynamic("allKeys")(allKeys.asInstanceOf[js.Any])
    if (cb != null) __obj.updateDynamic("cb")(cb.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraverseOptions]
  }
}

