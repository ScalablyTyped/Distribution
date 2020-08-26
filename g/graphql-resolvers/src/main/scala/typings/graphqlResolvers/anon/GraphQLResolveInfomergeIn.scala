package typings.graphqlResolvers.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.FieldNode
import typings.graphql.astMod.FragmentDefinitionNode
import typings.graphql.astMod.OperationDefinitionNode
import typings.graphql.definitionMod.GraphQLObjectType
import typings.graphql.definitionMod.GraphQLOutputType
import typings.graphql.pathMod.Path
import typings.graphql.schemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql.graphql.GraphQLResolveInfo & {  mergeInfo :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MergeInfo * / any | undefined} */
@js.native
trait GraphQLResolveInfomergeIn extends js.Object {
  val fieldName: String = js.native
  val fieldNodes: js.Array[FieldNode] = js.native
  val fragments: StringDictionary[FragmentDefinitionNode] = js.native
  var mergeInfo: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MergeInfo */ js.Any
  ] = js.native
  val operation: OperationDefinitionNode = js.native
  val parentType: GraphQLObjectType[_, _] = js.native
  val path: Path = js.native
  val returnType: GraphQLOutputType = js.native
  val rootValue: js.Any = js.native
  val schema: GraphQLSchema = js.native
  val variableValues: StringDictionary[js.Any] = js.native
}

object GraphQLResolveInfomergeIn {
  @scala.inline
  def apply(
    fieldName: String,
    fieldNodes: js.Array[FieldNode],
    fragments: StringDictionary[FragmentDefinitionNode],
    operation: OperationDefinitionNode,
    parentType: GraphQLObjectType[_, _],
    path: Path,
    returnType: GraphQLOutputType,
    rootValue: js.Any,
    schema: GraphQLSchema,
    variableValues: StringDictionary[js.Any]
  ): GraphQLResolveInfomergeIn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], fieldNodes = fieldNodes.asInstanceOf[js.Any], fragments = fragments.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], rootValue = rootValue.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], variableValues = variableValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLResolveInfomergeIn]
  }
  @scala.inline
  implicit class GraphQLResolveInfomergeInOps[Self <: GraphQLResolveInfomergeIn] (val x: Self) extends AnyVal {
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
    def setFieldNodesVarargs(value: FieldNode*): Self = this.set("fieldNodes", js.Array(value :_*))
    @scala.inline
    def setFieldNodes(value: js.Array[FieldNode]): Self = this.set("fieldNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragments(value: StringDictionary[FragmentDefinitionNode]): Self = this.set("fragments", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperation(value: OperationDefinitionNode): Self = this.set("operation", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentType(value: GraphQLObjectType[_, _]): Self = this.set("parentType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: Path): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GraphQLOutputType): Self = this.set("returnType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRootValue(value: js.Any): Self = this.set("rootValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setSchema(value: GraphQLSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariableValues(value: StringDictionary[js.Any]): Self = this.set("variableValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setMergeInfo(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MergeInfo */ js.Any
    ): Self = this.set("mergeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMergeInfo: Self = this.set("mergeInfo", js.undefined)
  }
  
}

