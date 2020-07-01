package typings.graphqlToolsUtils

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphqlToolsUtils.anon.ArgNames
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/utils/build-operation-for-field", JSImport.Namespace)
@js.native
object buildOperationForFieldMod extends js.Object {
  def buildOperationNodeForField(hasSchemaKindFieldModelsIgnoreDepthLimitCircularReferenceDepthArgNamesSelectedFields: ArgNames): OperationDefinitionNode = js.native
  type Force = js.Array[String]
  type Ignore = js.Array[String]
  type SelectedFields = (StringDictionary[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @graphql-tools/utils.@graphql-tools/utils/build-operation-for-field.SelectedFields */ js.Object
  ]) | Boolean
  type Skip = js.Array[String]
}

