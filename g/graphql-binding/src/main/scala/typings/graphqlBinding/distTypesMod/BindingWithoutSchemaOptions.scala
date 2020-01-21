package typings.graphqlBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BindingWithoutSchemaOptions extends js.Object {
  var before: js.UndefOr[js.Function0[Unit]] = js.undefined
  var fragmentReplacements: js.UndefOr[js.Array[FragmentReplacement]] = js.undefined
}

object BindingWithoutSchemaOptions {
  @scala.inline
  def apply(before: () => Unit = null, fragmentReplacements: js.Array[FragmentReplacement] = null): BindingWithoutSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction0(before))
    if (fragmentReplacements != null) __obj.updateDynamic("fragmentReplacements")(fragmentReplacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindingWithoutSchemaOptions]
  }
}

