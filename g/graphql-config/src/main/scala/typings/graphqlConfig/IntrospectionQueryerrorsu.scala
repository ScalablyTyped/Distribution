package typings.graphqlConfig

import typings.graphql.introspectionQueryMod.IntrospectionSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.IntrospectionQuery & {  errors  :undefined,   data  :undefined} */
trait IntrospectionQueryerrorsu extends js.Object {
  val __schema: IntrospectionSchema
  var data: js.UndefOr[scala.Nothing] = js.undefined
  var errors: js.UndefOr[scala.Nothing] = js.undefined
}

object IntrospectionQueryerrorsu {
  @scala.inline
  def apply(
    __schema: IntrospectionSchema,
    data: js.UndefOr[scala.Nothing] = js.undefined,
    errors: js.UndefOr[scala.Nothing] = js.undefined
  ): IntrospectionQueryerrorsu = {
    val __obj = js.Dynamic.literal(__schema = __schema.asInstanceOf[js.Any])
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(errors)) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionQueryerrorsu]
  }
}

