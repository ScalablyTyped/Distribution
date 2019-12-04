package typings.graphqlDashTools

import typings.graphql.errorFormatErrorMod.GraphQLFormattedError
import typings.graphqlDashTools.graphqlDashToolsStrings.CHILDREN
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHILDREN extends js.Object {
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.undefined
  var kind: CHILDREN
}

object Anon_CHILDREN {
  @scala.inline
  def apply(kind: CHILDREN, errors: js.Array[GraphQLFormattedError[Record[String, _]]] = null): Anon_CHILDREN = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CHILDREN]
  }
}

