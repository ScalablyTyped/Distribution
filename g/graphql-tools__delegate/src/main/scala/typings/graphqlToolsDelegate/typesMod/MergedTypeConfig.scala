package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergedTypeConfig extends js.Object {
  var args: js.UndefOr[js.Function1[/* source */ js.Any, Record[String, _]]] = js.native
  var fieldName: js.UndefOr[String] = js.native
  var key: js.UndefOr[js.Function1[/* originalResult */ js.Any, _]] = js.native
  var resolve: js.UndefOr[MergedTypeResolver] = js.native
  var selectionSet: js.UndefOr[String] = js.native
}

object MergedTypeConfig {
  @scala.inline
  def apply(): MergedTypeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergedTypeConfig]
  }
  @scala.inline
  implicit class MergedTypeConfigOps[Self <: MergedTypeConfig] (val x: Self) extends AnyVal {
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
    def setArgs(value: /* source */ js.Any => Record[String, _]): Self = this.set("args", js.Any.fromFunction1(value))
    @scala.inline
    def deleteArgs: Self = this.set("args", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setKey(value: /* originalResult */ js.Any => _): Self = this.set("key", js.Any.fromFunction1(value))
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setResolve(
      value: (/* originalResult */ js.Any, /* context */ Record[String, js.Any], /* info */ GraphQLResolveInfo, /* subschema */ GraphQLSchema | SubschemaConfig, /* selectionSet */ SelectionSetNode) => js.Any
    ): Self = this.set("resolve", js.Any.fromFunction5(value))
    @scala.inline
    def deleteResolve: Self = this.set("resolve", js.undefined)
    @scala.inline
    def setSelectionSet(value: String): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
  }
  
}

