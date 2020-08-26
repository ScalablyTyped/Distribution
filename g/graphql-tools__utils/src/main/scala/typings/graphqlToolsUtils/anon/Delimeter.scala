package typings.graphqlToolsUtils.anon

import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delimeter extends js.Object {
  var delimeter: js.UndefOr[String] = js.native
  var fieldNames: js.UndefOr[js.Array[String]] = js.native
  var fieldNode: FieldNode = js.native
  var fragments: Record[String, FragmentDefinitionNode] = js.native
  var path: js.UndefOr[js.Array[String]] = js.native
}

object Delimeter {
  @scala.inline
  def apply(fieldNode: FieldNode, fragments: Record[String, FragmentDefinitionNode]): Delimeter = {
    val __obj = js.Dynamic.literal(fieldNode = fieldNode.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimeter]
  }
  @scala.inline
  implicit class DelimeterOps[Self <: Delimeter] (val x: Self) extends AnyVal {
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
    def setFieldNode(value: FieldNode): Self = this.set("fieldNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragments(value: Record[String, FragmentDefinitionNode]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimeter(value: String): Self = this.set("delimeter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelimeter: Self = this.set("delimeter", js.undefined)
    @scala.inline
    def setFieldNamesVarargs(value: String*): Self = this.set("fieldNames", js.Array(value :_*))
    @scala.inline
    def setFieldNames(value: js.Array[String]): Self = this.set("fieldNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldNames: Self = this.set("fieldNames", js.undefined)
    @scala.inline
    def setPathVarargs(value: String*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

