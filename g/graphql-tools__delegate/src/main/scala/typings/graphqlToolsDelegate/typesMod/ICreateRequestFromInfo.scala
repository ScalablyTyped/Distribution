package typings.graphqlToolsDelegate.typesMod

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.SelectionSetNode
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlToolsUtils.interfacesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICreateRequestFromInfo extends js.Object {
  var fieldName: String = js.native
  var fieldNodes: js.UndefOr[js.Array[FieldNode]] = js.native
  var info: GraphQLResolveInfo = js.native
  var operation: Operation = js.native
  var operationName: js.UndefOr[String] = js.native
  var selectionSet: js.UndefOr[SelectionSetNode] = js.native
}

object ICreateRequestFromInfo {
  @scala.inline
  def apply(fieldName: String, info: GraphQLResolveInfo, operation: Operation): ICreateRequestFromInfo = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICreateRequestFromInfo]
  }
  @scala.inline
  implicit class ICreateRequestFromInfoOps[Self <: ICreateRequestFromInfo] (val x: Self) extends AnyVal {
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
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInfo(value: GraphQLResolveInfo): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: Operation): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldNodesVarargs(value: FieldNode*): Self = this.set("fieldNodes", js.Array(value :_*))
    @scala.inline
    def setFieldNodes(value: js.Array[FieldNode]): Self = this.set("fieldNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNodes: Self = this.set("fieldNodes", js.undefined)
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOperationName: Self = this.set("operationName", js.undefined)
    @scala.inline
    def setSelectionSet(value: SelectionSetNode): Self = this.set("selectionSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSet: Self = this.set("selectionSet", js.undefined)
  }
  
}

