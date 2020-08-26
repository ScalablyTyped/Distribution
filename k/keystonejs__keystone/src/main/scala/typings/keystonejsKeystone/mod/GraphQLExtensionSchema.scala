package typings.keystonejsKeystone.mod

import typings.keystonejsKeystone.anon.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLExtensionSchema extends js.Object {
  var mutations: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.native
  var queries: js.UndefOr[js.Array[GraphQLExtension[_, _]]] = js.native
  var types: js.UndefOr[js.Array[Type]] = js.native
}

object GraphQLExtensionSchema {
  @scala.inline
  def apply(): GraphQLExtensionSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphQLExtensionSchema]
  }
  @scala.inline
  implicit class GraphQLExtensionSchemaOps[Self <: GraphQLExtensionSchema] (val x: Self) extends AnyVal {
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
    def setMutationsVarargs(value: (GraphQLExtension[js.Any, js.Any])*): Self = this.set("mutations", js.Array(value :_*))
    @scala.inline
    def setMutations(value: js.Array[GraphQLExtension[_, _]]): Self = this.set("mutations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMutations: Self = this.set("mutations", js.undefined)
    @scala.inline
    def setQueriesVarargs(value: (GraphQLExtension[js.Any, js.Any])*): Self = this.set("queries", js.Array(value :_*))
    @scala.inline
    def setQueries(value: js.Array[GraphQLExtension[_, _]]): Self = this.set("queries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueries: Self = this.set("queries", js.undefined)
    @scala.inline
    def setTypesVarargs(value: Type*): Self = this.set("types", js.Array(value :_*))
    @scala.inline
    def setTypes(value: js.Array[Type]): Self = this.set("types", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
  
}

