package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.OperationTypeNode
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsUtils.buildOperationForFieldMod.Ignore
import typings.graphqlToolsUtils.buildOperationForFieldMod.SelectedFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArgNames extends js.Object {
  var argNames: js.UndefOr[js.Array[String]] = js.native
  var circularReferenceDepth: js.UndefOr[Double] = js.native
  var depthLimit: js.UndefOr[Double] = js.native
  var field: String = js.native
  var ignore: js.UndefOr[Ignore] = js.native
  var kind: OperationTypeNode = js.native
  var models: js.UndefOr[js.Array[String]] = js.native
  var schema: GraphQLSchema = js.native
  var selectedFields: js.UndefOr[SelectedFields] = js.native
}

object ArgNames {
  @scala.inline
  def apply(field: String, kind: OperationTypeNode, schema: GraphQLSchema): ArgNames = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgNames]
  }
  @scala.inline
  implicit class ArgNamesOps[Self <: ArgNames] (val x: Self) extends AnyVal {
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
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: OperationTypeNode): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setArgNamesVarargs(value: String*): Self = this.set("argNames", js.Array(value :_*))
    @scala.inline
    def setArgNames(value: js.Array[String]): Self = this.set("argNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArgNames: Self = this.set("argNames", js.undefined)
    @scala.inline
    def setCircularReferenceDepth(value: Double): Self = this.set("circularReferenceDepth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCircularReferenceDepth: Self = this.set("circularReferenceDepth", js.undefined)
    @scala.inline
    def setDepthLimit(value: Double): Self = this.set("depthLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDepthLimit: Self = this.set("depthLimit", js.undefined)
    @scala.inline
    def setIgnoreVarargs(value: String*): Self = this.set("ignore", js.Array(value :_*))
    @scala.inline
    def setIgnore(value: Ignore): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setModelsVarargs(value: String*): Self = this.set("models", js.Array(value :_*))
    @scala.inline
    def setModels(value: js.Array[String]): Self = this.set("models", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModels: Self = this.set("models", js.undefined)
    @scala.inline
    def setSelectedFields(value: SelectedFields): Self = this.set("selectedFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedFields: Self = this.set("selectedFields", js.undefined)
  }
  
}

