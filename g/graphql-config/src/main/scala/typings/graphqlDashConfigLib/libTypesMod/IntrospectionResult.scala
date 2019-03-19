package typings
package graphqlDashConfigLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionResult extends js.Object {
  var data: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery
  var errors: js.UndefOr[js.Any] = js.undefined
  var extensions: js.UndefOr[js.Object] = js.undefined
}

object IntrospectionResult {
  @scala.inline
  def apply(
    data: graphqlLib.utilitiesIntrospectionQueryMod.IntrospectionQuery,
    errors: js.Any = null,
    extensions: js.Object = null
  ): IntrospectionResult = {
    val __obj = js.Dynamic.literal(data = data)
    if (errors != null) __obj.updateDynamic("errors")(errors)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[IntrospectionResult]
  }
}

