package typings
package graphqlDashComposeLib.esmSchemaComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/SchemaComposer", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[js.Any, js.Any] {
  var Mutation: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var Query: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var Subscription: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var _directives: js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  var _schemaMustHaveTypes: js.Array[MustHaveTypes[TContext]] = js.native
  var typeMapper: graphqlDashComposeLib.esmTypeMapperMod.TypeMapper[TContext] = js.native
  def addAsComposer(typeOrSDL: js.Any): java.lang.String = js.native
  def addDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def addResolveMethods(typesFieldsResolve: GraphQLToolsResolveMethods[TContext]): scala.Unit = js.native
  def addSchemaMustHaveType(`type`: MustHaveTypes[TContext]): this.type = js.native
  def addTypeDefs(typeDefs: java.lang.String): graphqlDashComposeLib.esmTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  def buildSchema(): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchema(extraConfig: ExtraSchemaConfig): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def createEnumTC(typeDef: graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def createInputTC(typeDef: graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def createInterfaceTC[TSource](
    typeDef: graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def createObjectTC[TSource](
    typeDef: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def createResolver[TSource, TArgs](opts: graphqlDashComposeLib.esmResolverMod.ResolverOpts[TSource, TContext, TArgs, _]): graphqlDashComposeLib.esmResolverMod.Resolver[TSource, TContext, TArgs, _] = js.native
  def createScalarTC(typeDef: graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def createUnionTC[TSource](
    typeDef: graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getAnyTC(typeName: js.Any): (graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getDirectives(): js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  def getETC(typeName: js.Any): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getIFTC[TSource](typeName: js.Any): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getITC(typeName: js.Any): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOTC[TSource](typeName: js.Any): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateETC(typeName: java.lang.String): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getOrCreateETC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* etc */ graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def getOrCreateIFTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateIFTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* iftc */ graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateITC(typeName: java.lang.String): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOrCreateITC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* itc */ graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def getOrCreateOTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateOTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* tc */ graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateSTC(typeName: java.lang.String): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getOrCreateSTC(
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* stc */ graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getOrCreateUTC[TSource](typeName: java.lang.String): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getOrCreateUTC[TSource](
    typeName: java.lang.String,
    onCreate: js.Function1[
      /* utc */ graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext], 
      _
    ]
  ): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getSTC(typeName: js.Any): graphqlDashComposeLib.esmScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getUTC[TSource](typeName: js.Any): graphqlDashComposeLib.esmUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def hasDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): scala.Boolean = js.native
  def hasDirective(directive: java.lang.String): scala.Boolean = js.native
  def removeDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  def removeEmptyTypes(
    tc: graphqlDashComposeLib.esmObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    passedTypes: stdLib.Set[java.lang.String]
  ): scala.Unit = js.native
}

