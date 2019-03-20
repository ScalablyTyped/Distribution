package typings
package graphqlDashComposeLib.libSchemaComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/SchemaComposer", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends graphqlDashComposeLib.libTypeStorageMod.TypeStorage[TContext] {
  var EnumTypeComposer: graphqlDashComposeLib.Anon_CreateCreateTempGqType = js.native
  var InputTypeComposer: graphqlDashComposeLib.Anon_CreateCreateTemp = js.native
  var InterfaceTypeComposer: graphqlDashComposeLib.Anon_CreateCreateTempGqTypeSchemaComposer = js.native
  var Mutation: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext] = js.native
  var Query: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext] = js.native
  var Resolver: graphqlDashComposeLib.Anon_Opts = js.native
  var ScalarTypeComposer: graphqlDashComposeLib.Anon_CreateCreateTempGqTypeSchemaComposerTypeDefAny = js.native
  var Subscription: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext] = js.native
  var TypeComposer: graphqlDashComposeLib.Anon_Create = js.native
  var TypeMapper: graphqlDashComposeLib.libTypeMapperMod.TypeMapper = js.native
  var UnionTypeComposer: graphqlDashComposeLib.Anon_CreateCreateTempGqTypeSchemaComposerTypeDef = js.native
  var _directives: js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  var _schemaMustHaveTypes: js.Array[MustHaveTypes[TContext]] = js.native
  def add(typeOrSDL: js.Any): java.lang.String | scala.Null = js.native
  def addAsComposer(typeOrSDL: js.Any): java.lang.String = js.native
  def addDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def addResolveMethods(typesFieldsResolve: AddResolveMethods[TContext]): scala.Unit = js.native
  def addSchemaMustHaveType(`type`: MustHaveTypes[TContext]): this.type = js.native
  def addTypeDefs(typeDefs: java.lang.String): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def buildSchema(): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchema(extraConfig: ExtraSchemaConfig): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def createEnumTC(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposerDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def createInputTC(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposerDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def createInterfaceTC(
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposerDefinition[TContext]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _] = js.native
  def createObjectTC(typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TContext]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TContext, _] = js.native
  def createScalarTC(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposerDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  // alias for createObjectTC
  def createTC(typeDef: graphqlDashComposeLib.libTypeComposerMod.TypeComposerDefinition[TContext]): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TContext, _] = js.native
  def createUnionTC(typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposerDefinition[TContext]): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _] = js.native
  def getAnyTC(typeName: js.Any): (graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TContext, _]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def getDirectives(): js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getOrCreateETC(typeName: java.lang.String): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def getOrCreateETC(
    typeName: java.lang.String,
    onCreate: js.Function1[/* etc */ graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer, _]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer = js.native
  def getOrCreateIFTC(typeName: java.lang.String): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _] = js.native
  def getOrCreateIFTC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* iftc */ graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _], 
      _
    ]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TContext, _] = js.native
  def getOrCreateITC(typeName: java.lang.String): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def getOrCreateITC(
    typeName: java.lang.String,
    onCreate: js.Function1[/* itc */ graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer, _]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer = js.native
  def getOrCreateSTC(typeName: java.lang.String): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def getOrCreateSTC(
    typeName: java.lang.String,
    onCreate: js.Function1[/* stc */ graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer, _]
  ): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer = js.native
  def getOrCreateTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] = js.native
  def getOrCreateTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* tc */ graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TSource, TContext] = js.native
  def getOrCreateUTC(typeName: java.lang.String): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _] = js.native
  def getOrCreateUTC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* utc */ graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _], 
      _
    ]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TContext, _] = js.native
  def hasDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): scala.Boolean = js.native
  def hasDirective(directive: java.lang.String): scala.Boolean = js.native
  def removeDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def removeEmptyTypes(
    typeComposer: graphqlDashComposeLib.libTypeComposerMod.TypeComposer[_, TContext],
    passedTypes: stdLib.Set[java.lang.String]
  ): scala.Unit = js.native
  def rootMutation[TRootMutation](): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TRootMutation, TContext] = js.native
  def rootQuery[TRootQuery](): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TRootQuery, TContext] = js.native
  def rootSubscription[TRootSubscription](): graphqlDashComposeLib.libTypeComposerMod.TypeComposer[TRootSubscription, TContext] = js.native
}

