package typings.graphqlCompose.enumTypeComposerMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.GraphQLEnumTypeConfigexte
import typings.graphql.astMod.EnumTypeDefinitionNode
import typings.graphql.astMod.EnumTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLEnumTypeConfig
import typings.graphql.definitionMod.GraphQLEnumValue
import typings.graphql.maybeMod.Maybe
import typings.graphqlCompose.definitionsMod.Extensions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLEnumType & {  _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
trait GraphQLEnumTypeExtended extends js.Object {
  var _gqcExtensions: js.UndefOr[Extensions] = js.undefined
  var astNode: Maybe[EnumTypeDefinitionNode]
  var description: Maybe[String]
  var extensionASTNodes: Maybe[js.Array[EnumTypeExtensionNode]]
  var extensions: Maybe[Record[String, _]]
  var name: String
  def getValue(name: String): Maybe[GraphQLEnumValue]
  def getValues(): js.Array[GraphQLEnumValue]
  def inspect(): String
  def parseLiteral(valueNode: ValueNode, _variables: Maybe[StringDictionary[_]]): Maybe[_]
  def parseValue(value: js.Any): Maybe[_]
  def serialize(value: js.Any): Maybe[String]
  def toConfig(): GraphQLEnumTypeConfigexte
  def toJSON(): String
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
    toJSON: () => String,
    _gqcExtensions: Extensions = null,
    astNode: js.UndefOr[Null | Maybe[EnumTypeDefinitionNode]] = js.undefined,
    description: js.UndefOr[Null | Maybe[String]] = js.undefined,
    extensionASTNodes: js.UndefOr[Null | Maybe[js.Array[EnumTypeExtensionNode]]] = js.undefined,
    extensions: js.UndefOr[Null | (Maybe[Record[String, _]])] = js.undefined
  ): GraphQLEnumTypeExtended = {
    val __obj = js.Dynamic.literal(getValue = js.Any.fromFunction1(getValue), getValues = js.Any.fromFunction0(getValues), inspect = js.Any.fromFunction0(inspect), name = name.asInstanceOf[js.Any], parseLiteral = js.Any.fromFunction2(parseLiteral), parseValue = js.Any.fromFunction1(parseValue), serialize = js.Any.fromFunction1(serialize), toConfig = js.Any.fromFunction0(toConfig), toJSON = js.Any.fromFunction0(toJSON))
    if (_gqcExtensions != null) __obj.updateDynamic("_gqcExtensions")(_gqcExtensions.asInstanceOf[js.Any])
    if (!js.isUndefined(astNode)) __obj.updateDynamic("astNode")(astNode.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extensionASTNodes)) __obj.updateDynamic("extensionASTNodes")(extensionASTNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(extensions)) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLEnumTypeExtended]
  }
}

