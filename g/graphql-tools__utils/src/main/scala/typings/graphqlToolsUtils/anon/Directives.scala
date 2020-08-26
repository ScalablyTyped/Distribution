package typings.graphqlToolsUtils.anon

import typings.graphql.mod.GraphQLDirective
import typings.graphqlToolsUtils.interfacesMod.TypeMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Directives extends js.Object {
  var directives: js.Array[GraphQLDirective] = js.native
  var typeMap: TypeMap = js.native
}

object Directives {
  @scala.inline
  def apply(directives: js.Array[GraphQLDirective], typeMap: TypeMap): Directives = {
    val __obj = js.Dynamic.literal(directives = directives.asInstanceOf[js.Any], typeMap = typeMap.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  @scala.inline
  implicit class DirectivesOps[Self <: Directives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDirectivesVarargs(value: GraphQLDirective*): Self = this.set("directives", js.Array(value :_*))
    @scala.inline
    def setDirectives(value: js.Array[GraphQLDirective]): Self = this.set("directives", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeMap(value: TypeMap): Self = this.set("typeMap", value.asInstanceOf[js.Any])
  }
  
}

