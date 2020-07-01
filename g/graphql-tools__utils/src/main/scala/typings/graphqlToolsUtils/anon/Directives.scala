package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLDirective
import typings.graphqlToolsUtils.interfacesMod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Directives extends js.Object {
  var directives: js.Array[GraphQLDirective]
  var typeMap: TypeMap
}

object Directives {
  @scala.inline
  def apply(directives: js.Array[GraphQLDirective], typeMap: TypeMap): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
}

