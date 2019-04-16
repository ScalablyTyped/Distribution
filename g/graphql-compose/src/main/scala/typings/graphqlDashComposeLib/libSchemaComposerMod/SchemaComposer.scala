package typings
package graphqlDashComposeLib.libSchemaComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/SchemaComposer", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends graphqlDashComposeLib.libTypeStorageMod.TypeStorage[js.Any, js.Any] {
  var Mutation: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var Query: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var Subscription: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var _directives: js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  var _schemaMustHaveTypes: js.Array[MustHaveTypes[TContext]] = js.native
  var typeMapper: graphqlDashComposeLib.libTypeMapperMod.TypeMapper[TContext] = js.native
  def addAsComposer(typeOrSDL: js.Any): java.lang.String = js.native
  def addDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def addResolveMethods(typesFieldsResolve: GraphQLToolsResolveMethods[TContext]): scala.Unit = js.native
  def addSchemaMustHaveType(`type`: MustHaveTypes[TContext]): this.type = js.native
  def addTypeDefs(typeDefs: java.lang.String): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def buildSchema(): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchema(extraConfig: ExtraSchemaConfig): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def createEnumTC(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def createInputTC(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def createInterfaceTC[TSource](
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def createObjectTC[TSource](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def createResolver[TSource, TArgs](opts: graphqlDashComposeLib.libResolverMod.ResolverOpts[TSource, TContext, TArgs, _]): graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs, _] = js.native
  def createScalarTC(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def createUnionTC[TSource](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getAnyTC(typeName: js.Any): (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getDirectives(): js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getETC(typeName: js.Any): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getIFTC[TSource](typeName: js.Any): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getITC(typeName: js.Any): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOTC[TSource](typeName: js.Any): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateETC(typeName: java.lang.String): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getOrCreateETC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* etc */ graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getOrCreateIFTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateIFTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* iftc */ graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateITC(typeName: java.lang.String): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOrCreateITC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* itc */ graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOrCreateOTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateOTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* tc */ graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateSTC(typeName: java.lang.String): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getOrCreateSTC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* stc */ graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getOrCreateUTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getOrCreateUTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* utc */ graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getSTC(typeName: js.Any): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getUTC[TSource](typeName: js.Any): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def hasDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): scala.Boolean = js.native
  def hasDirective(directive: java.lang.String): scala.Boolean = js.native
  def removeDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def removeEmptyTypes(
    tc: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    passedTypes: stdLib.Set[java.lang.String]
  ): scala.Unit = js.native
}

