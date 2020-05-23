package typings.graphqlRelay.anon

import typings.graphql.mod.GraphQLScalarType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: GraphQLScalarType
}

object Type {
  @scala.inline
  def apply(`type`: GraphQLScalarType): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

