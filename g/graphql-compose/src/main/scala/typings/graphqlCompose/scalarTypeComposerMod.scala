package typings.graphqlCompose

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.anon.GraphQLScalarTypeConfigan
import typings.graphql.astMod.ScalarTypeDefinitionNode
import typings.graphql.astMod.ScalarTypeExtensionNode
import typings.graphql.astMod.ValueNode
import typings.graphql.definitionMod.GraphQLList
import typings.graphql.definitionMod.GraphQLNonNull
import typings.graphql.definitionMod.GraphQLScalarLiteralParser
import typings.graphql.definitionMod.GraphQLScalarSerializer
import typings.graphql.definitionMod.GraphQLScalarTypeConfig
import typings.graphql.definitionMod.GraphQLScalarValueParser
import typings.graphql.maybeMod.Maybe
import typings.graphqlCompose.definitionsMod.DirectiveArgs
import typings.graphqlCompose.definitionsMod.Extensions
import typings.graphqlCompose.definitionsMod.ExtensionsDirective
import typings.graphqlCompose.graphqlMod.GraphQLScalarType
import typings.graphqlCompose.objectTypeComposerMod._ComposeOutputType
import typings.graphqlCompose.schemaComposerMod.SchemaComposer
import typings.graphqlCompose.schemaComposerMod._AnyComposeType
import typings.graphqlCompose.schemaComposerMod._AnyType
import typings.graphqlCompose.typeMapperMod.TypeAsString
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/ScalarTypeComposer", JSImport.Namespace)
@js.native
object scalarTypeComposerMod extends js.Object {
  /* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLScalarTypeConfig<any, any> & {  extensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
  @js.native
  trait ComposeScalarTypeConfig extends _ScalarTypeComposeDefinition {
    var astNode: js.UndefOr[Maybe[ScalarTypeDefinitionNode]] = js.native
    var description: js.UndefOr[Maybe[String]] = js.native
    var extensionASTNodes: js.UndefOr[Maybe[js.Array[ScalarTypeExtensionNode]]] = js.native
    var extensions: js.UndefOr[(Maybe[Record[String, _]]) with Extensions] = js.native
    var name: String = js.native
    // Parses an externally provided literal value to use as an input.
    var parseLiteral: js.UndefOr[GraphQLScalarLiteralParser[_]] = js.native
    // Parses an externally provided value to use as an input.
    var parseValue: js.UndefOr[GraphQLScalarValueParser[_]] = js.native
    // Serializes an internal value to include in a response.
    @JSName("serialize")
    var serialize_Original: GraphQLScalarSerializer[_] = js.native
    // Serializes an internal value to include in a response.
    def serialize(value: js.Any): Maybe[_] = js.native
  }
  
  /* Inlined graphql-compose.graphql-compose/lib/graphql.GraphQLScalarType & {  _gqcExtensions ? :graphql-compose.graphql-compose/lib/utils/definitions.Extensions} */
  @js.native
  trait GraphQLScalarTypeExtended extends js.Object {
    var _gqcExtensions: js.UndefOr[Extensions] = js.native
    var astNode: Maybe[ScalarTypeDefinitionNode] = js.native
    var description: Maybe[String] = js.native
    var extensionASTNodes: Maybe[js.Array[ScalarTypeExtensionNode]] = js.native
    var extensions: Maybe[Record[String, _]] = js.native
    var name: String = js.native
    @JSName("parseLiteral")
    var parseLiteral_Original: GraphQLScalarLiteralParser[_] = js.native
    @JSName("parseValue")
    var parseValue_Original: GraphQLScalarValueParser[_] = js.native
    @JSName("serialize")
    var serialize_Original: GraphQLScalarSerializer[_] = js.native
    def inspect(): String = js.native
    def parseLiteral(valueNode: ValueNode, variables: Maybe[StringDictionary[_]]): Maybe[_] = js.native
    def parseValue(value: js.Any): Maybe[_] = js.native
    def serialize(value: js.Any): Maybe[_] = js.native
    def toConfig(): GraphQLScalarTypeConfigan = js.native
    def toJSON(): String = js.native
  }
  
  @js.native
  class ScalarTypeComposer[TContext] protected ()
    extends _AnyComposeType[TContext]
       with _AnyType[TContext]
       with _ComposeOutputType[js.Any, TContext] {
    def this(gqType: GraphQLScalarType, schemaComposer: SchemaComposer[TContext]) = this()
    var gqType: GraphQLScalarTypeExtended = js.native
    var schemaComposer: SchemaComposer[TContext] = js.native
    def clearExtensions(): this.type = js.native
    def clone(newTypeName: String): ScalarTypeComposer[TContext] = js.native
    def extendExtensions(extensions: Extensions): this.type = js.native
    def getDescription(): String = js.native
    def getDirectiveById(idx: Double): DirectiveArgs | Unit = js.native
    def getDirectiveByName(directiveName: String): DirectiveArgs | Unit = js.native
    def getDirectiveNames(): js.Array[String] = js.native
    /**
      * -----------------------------------------------
      * Directive methods
      * -----------------------------------------------
      */
    def getDirectives(): js.Array[ExtensionsDirective] = js.native
    def getExtension(extensionName: String): js.Any = js.native
    /**
      *  -----------------------------------------------
      * Extensions methods
      * -----------------------------------------------
      */
    def getExtensions(): Extensions = js.native
    def getParseLiteral(): GraphQLScalarLiteralParser[_] = js.native
    def getParseValue(): GraphQLScalarValueParser[_] = js.native
    def getSerialize(): GraphQLScalarSerializer[_] = js.native
    /**
      * -----------------------------------------------
      * Type methods
      * -----------------------------------------------
      */
    def getType(): GraphQLScalarType = js.native
    def getTypeName(): String = js.native
    def getTypeNonNull(): GraphQLNonNull[GraphQLScalarType] = js.native
    def getTypePlural(): GraphQLList[GraphQLScalarType] = js.native
    def hasExtension(extensionName: String): Boolean = js.native
    def merge(`type`: GraphQLScalarType): this.type = js.native
    def merge(`type`: ScalarTypeComposer[_]): this.type = js.native
    def removeExtension(extensionName: String): this.type = js.native
    def setDescription(description: String): this.type = js.native
    def setExtension(extensionName: String, value: js.Any): this.type = js.native
    def setExtensions(extensions: Extensions): this.type = js.native
    def setParseLiteral(fn: Unit): Unit = js.native
    def setParseLiteral(fn: GraphQLScalarLiteralParser[_]): Unit = js.native
    def setParseValue(fn: Unit): Unit = js.native
    def setParseValue(fn: GraphQLScalarValueParser[_]): Unit = js.native
    /**
      *  -----------------------------------------------
      * Serialize methods
      * -----------------------------------------------
      */
    def setSerialize(fn: GraphQLScalarSerializer[_]): Unit = js.native
    def setTypeName(name: String): this.type = js.native
  }
  
  trait _ScalarTypeComposeDefinition extends js.Object
  
  /* static members */
  @js.native
  object ScalarTypeComposer extends js.Object {
    /**
      * Create `ScalarTypeComposer` with adding it by name to the `SchemaComposer`. This type became avaliable in SDL by its name.
      */
    def create[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): ScalarTypeComposer[TCtx] = js.native
    /**
      * Create `ScalarTypeComposer` without adding it to the `SchemaComposer`. This method may be usefull in plugins, when you need to create type temporary.
      */
    def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition): ScalarTypeComposer[TCtx] = js.native
    def createTemp[TCtx](typeDef: ScalarTypeComposeDefinition, schemaComposer: SchemaComposer[TCtx]): ScalarTypeComposer[TCtx] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.graphqlCompose.typeMapperMod.TypeAsString
    - typings.graphqlCompose.scalarTypeComposerMod.ComposeScalarTypeConfig
    - typings.graphqlCompose.graphqlMod.GraphQLScalarType
  */
  type ScalarTypeComposeDefinition = _ScalarTypeComposeDefinition | TypeAsString
}

