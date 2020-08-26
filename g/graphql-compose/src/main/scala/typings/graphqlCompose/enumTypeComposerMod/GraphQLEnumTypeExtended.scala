package typings.graphqlCompose.enumTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.GraphQLEnumTypeConfigexte
import typings.graphql.anon.ReadonlyGraphQLEnumTypeCo
import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.maybeMod.Maybe
import typings.graphqlCompose.definitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLEnumType & {  _gqcExtensions :graphql-compose.graphql-compose/lib/utils/definitions.Extensions | undefined} */
@js.native
trait GraphQLEnumTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.native
  var astNode: Maybe[EnumTypeDefinitionNode] = js.native
  var description: Maybe[String] = js.native
  var extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]] = js.native
  var extensions: Maybe[js.Object] = js.native
  var name: String = js.native
  def getValue(name: String): Maybe[GraphQLEnumValue] = js.native
  def getValues(): js.Array[GraphQLEnumValue] = js.native
  def inspect(): String = js.native
  def parseLiteral(valueNode: ValueNode, _variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
  def parseValue(value: js.Any): Maybe[_] = js.native
  def serialize(value: js.Any): Maybe[String] = js.native
  def toConfig(): GraphQLEnumTypeConfigexte = js.native
  def toJSON(): String = js.native
}

object GraphQLEnumTypeExtended {
  @scala.inline
  def apply(
    getValue: String => Maybe[GraphQLEnumValue],
    getValues: () => js.Array[GraphQLEnumValue],
    inspect: () => String,
    name: String,
    parseLiteral: (ValueNode, Maybe[StringDictionary[_]]) => Maybe[_],
    parseValue: js.Any => Maybe[_],
    serialize: js.Any => Maybe[String],
    toConfig: () => GraphQLEnumTypeConfigexte,
    toJSON: () => String
  ): GraphQLEnumTypeExtended = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), getValues = js.Any.fromFunction0(getValues), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], parseLiteral = js.Any.fromFunction2(parseLiteral), parseValue = js.Any.fromFunction1(parseValue), serialize = js.Any.fromFunction1(serialize), toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[GraphQLEnumTypeExtended]
  }
  @scala.inline
  implicit class GraphQLEnumTypeExtendedOps[Self <: GraphQLEnumTypeExtended] (val x: Self) extends AnyVal {
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
    def setGetValue(value: String => Maybe[GraphQLEnumValue]): Self = this.set("getValue", js.Any.fromFunction1(value))
    @scala.inline
    def setGetValues(value: () => js.Array[GraphQLEnumValue]): Self = this.set("getValues", js.Any.fromFunction0(value))
    @scala.inline
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParseLiteral(value: (ValueNode, Maybe[StringDictionary[_]]) => Maybe[_]): Self = this.set("parseLiteral", js.Any.fromFunction2(value))
    @scala.inline
    def setParseValue(value: js.Any => Maybe[_]): Self = this.set("parseValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSerialize(value: js.Any => Maybe[String]): Self = this.set("serialize", js.Any.fromFunction1(value))
    @scala.inline
    def setToConfig(value: () => GraphQLEnumTypeConfigexte): Self = this.set("toConfig", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => String): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def set_gqcExtensions(value: Extensions): Self = this.set("_gqcExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_gqcExtensions: Self = this.set("_gqcExtensions", js.undefined)
    @scala.inline
    def setAstNode(value: Maybe[EnumTypeDefinitionNode]): Self = this.set("astNode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAstNode: Self = this.set("astNode", js.undefined)
    @scala.inline
    def setAstNodeNull: Self = this.set("astNode", null)
    @scala.inline
    def setDescription(value: Maybe[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    @scala.inline
    def setExtensionASTNodesVarargs(value: EnumTypeExtensionNode*): Self = this.set("extensionASTNodes", js.Array(value :_*))
    @scala.inline
    def setExtensionASTNodes(value: Maybe[js.Array[EnumTypeExtensionNode]]): Self = this.set("extensionASTNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensionASTNodes: Self = this.set("extensionASTNodes", js.undefined)
    @scala.inline
    def setExtensionASTNodesNull: Self = this.set("extensionASTNodes", null)
    @scala.inline
    def setExtensions(value: Maybe[js.Object]): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setExtensionsNull: Self = this.set("extensions", null)
  }
  
}

