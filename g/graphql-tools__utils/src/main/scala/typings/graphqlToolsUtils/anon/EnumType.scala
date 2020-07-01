package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLEnumType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnumType extends js.Object {
  var enumType: GraphQLEnumType
}

object EnumType {
  @scala.inline
  def apply(enumType: GraphQLEnumType): EnumType = {
    val __obj = js.Dynamic.literal(enumType = enumType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumType]
  }
}

