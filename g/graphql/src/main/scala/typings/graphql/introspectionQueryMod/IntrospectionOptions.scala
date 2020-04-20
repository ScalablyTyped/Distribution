package typings.graphql.introspectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionOptions extends js.Object {
  // Whether to include descriptions in the introspection result.
  // Default: true
  var descriptions: Boolean
}

object IntrospectionOptions {
  @scala.inline
  def apply(descriptions: Boolean): IntrospectionOptions = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionOptions]
  }
}

