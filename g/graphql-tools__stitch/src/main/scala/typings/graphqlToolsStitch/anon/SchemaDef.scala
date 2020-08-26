package typings.graphqlToolsStitch.anon

import typings.graphql.astMod.SchemaDefinitionNode
import typings.graphql.astMod.SchemaExtensionNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDef extends js.Object {
  var schemaDef: SchemaDefinitionNode = js.native
  var schemaExtensions: js.Array[SchemaExtensionNode] = js.native
}

object SchemaDef {
  @scala.inline
  def apply(schemaDef: SchemaDefinitionNode, schemaExtensions: js.Array[SchemaExtensionNode]): SchemaDef = {
    val __obj = js.Dynamic.literal(schemaDef = schemaDef.asInstanceOf[js.Any], schemaExtensions = schemaExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDef]
  }
  @scala.inline
  implicit class SchemaDefOps[Self <: SchemaDef] (val x: Self) extends AnyVal {
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
    def setSchemaDef(value: SchemaDefinitionNode): Self = this.set("schemaDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchemaExtensionsVarargs(value: SchemaExtensionNode*): Self = this.set("schemaExtensions", js.Array(value :_*))
    @scala.inline
    def setSchemaExtensions(value: js.Array[SchemaExtensionNode]): Self = this.set("schemaExtensions", value.asInstanceOf[js.Any])
  }
  
}

