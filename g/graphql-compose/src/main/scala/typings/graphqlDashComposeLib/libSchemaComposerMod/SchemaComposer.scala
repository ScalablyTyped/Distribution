package typings
package graphqlDashComposeLib.libSchemaComposerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/lib/SchemaComposer", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends graphqlDashComposeLib.libTypeStorageMod.TypeStorage[js.Any, js.Any] {
  def this(schema: graphqlLib.graphqlMod.GraphQLSchema) = this()
  /**
    * Returns `ObjectTypeComposer` of `Mutation` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Mutation.addFields({ field1: 'String' });
    */
  val Mutation: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  /**
    * Returns `ObjectTypeComposer` of `Query` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Query.addFields({ field1: 'String' });
    */
  val Query: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  /**
    * Returns `ObjectTypeComposer` of `Subscription` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Subscription.addFields({ field1: 'String' });
    */
  val Subscription: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext] = js.native
  var _directives: js.Array[graphqlLib.graphqlMod.GraphQLDirective] = js.native
  var _schemaMustHaveTypes: js.Array[AnyType[TContext]] = js.native
  var typeMapper: graphqlDashComposeLib.libTypeMapperMod.TypeMapper[TContext] = js.native
  def addAsComposer(typeOrSDL: js.Any): java.lang.String = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def addDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  /**
    * Define `resolve` methods for Types in `graphql-tools` manner.
    *
    * @example
    *     declare function addResolveMethods(typesFieldsResolve: {
    *       [typeName: string]: {
    *         [fieldName: string]: (
    *           source: any,
    *           args: Object,
    *           context: TContext,
    *           info: GraphQLResolveInfo
    *         ) => any,
    *       },
    *     }): void
    *
    * @description
    * More details can be found in [issue #142](https://github.com/graphql-compose/graphql-compose/issues/142).
    */
  def addResolveMethods(typesFieldsResolve: GraphQLToolsResolveMethods[TContext]): scala.Unit = js.native
  /**
    * When using Interfaces you may have such Types which are hidden under Interface.resolveType method. In such cases you should add these types explicitly. Cause `buildSchema()` will take only real used types and types which added via `addSchemaMustHaveType()` method.
    */
  def addSchemaMustHaveType(`type`: AnyType[TContext]): this.type = js.native
  /**
    * -----------------------------------------------
    * Like graphql-tools methods
    * -----------------------------------------------
    */
  /**
    * Add types to Schema via SDL string. Returns a Map of parsed types.
    *
    * @example
    *     const schemaComposer = new SchemaComposer();
    *     schemaComposer.addTypeDefs(`
    *       type Post {
    *         id: Int!
    *         title: String
    *         votes: Int
    *       }
    *       enum Sort {
    *         ASC
    *         DESC
    *       }
    *     `);
    *
    * @description
    * After that your added types will be avaliable for referencing via string, eg.
    *
    * @example
    *     ObjectTypeComposer.create({
    *       name: 'Author',
    *       fields: {
    *         posts: {
    *           type: '[Post!]',
    *           args: {
    *             sort: 'Sort',
    *           },
    *           resolve: () => {},
    *         }
    *       }
    *     });
    */
  def addTypeDefs(typeDefs: java.lang.String): graphqlDashComposeLib.libTypeStorageMod.TypeStorage[java.lang.String, graphqlLib.typeDefinitionMod.GraphQLNamedType] = js.native
  /**
    * Create `GraphQLSchema` instance from defined types.
    * This instance can be provided to `express-graphql`, `apollo-server`, `graphql-yoga` etc.
    */
  def buildSchema(): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def buildSchema(extraConfig: ExtraSchemaConfig): graphqlLib.graphqlMod.GraphQLSchema = js.native
  def createEnumTC(typeDef: graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposeDefinition): graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] = js.native
  def createInputTC(typeDef: graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposeDefinition): graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] = js.native
  def createInterfaceTC[TSource](
    typeDef: graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[TSource, TContext] = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def createObjectTC[TSource](
    typeDef: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[TSource, TContext] = js.native
  def createResolver[TSource, TArgs](opts: graphqlDashComposeLib.libResolverMod.ResolverOpts[TSource, TContext, TArgs, _]): graphqlDashComposeLib.libResolverMod.Resolver[TSource, TContext, TArgs, _] = js.native
  def createScalarTC(typeDef: graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposeDefinition): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  /**
    * Creates or return existed TypeComposer from SDL or object.
    * If you call this method again with same params should be returned the same TypeComposer instance.
    */
  def createTC(typeOrSDL: js.Any): (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  /**
    * Creates TypeComposer from SDL or object without adding it to the type storage.
    */
  def createTempTC(typeOrSDL: js.Any): (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def createUnionTC[TSource](
    typeDef: graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposeDefinition[TSource, TContext]
  ): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def getAnyTC(typeName: AnyType[_] | graphqlLib.typeDefinitionMod.GraphQLType): (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getAnyTC(typeName: java.lang.String): (graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext]) | graphqlDashComposeLib.libInputTypeComposerMod.InputTypeComposer[TContext] | graphqlDashComposeLib.libEnumTypeComposerMod.EnumTypeComposer[TContext] | (graphqlDashComposeLib.libInterfaceTypeComposerMod.InterfaceTypeComposer[_, TContext]) | (graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[_, TContext]) | graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getDirective(name: java.lang.String): graphqlLib.graphqlMod.GraphQLDirective = js.native
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
  def getOrSet(key: js.Any, typeOrThunk: AnyType[TContext]): AnyType[TContext] = js.native
  def getSTC(typeName: js.Any): graphqlDashComposeLib.libScalarTypeComposerMod.ScalarTypeComposer[TContext] = js.native
  def getUTC[TSource](typeName: js.Any): graphqlDashComposeLib.libUnionTypeComposerMod.UnionTypeComposer[TSource, TContext] = js.native
  def hasDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): scala.Boolean = js.native
  def hasDirective(directive: java.lang.String): scala.Boolean = js.native
  def inspect(): java.lang.String = js.native
  def merge(schema: SchemaComposer[_]): this.type = js.native
  /**
    * Load all types from GraphQLSchema and merge with current SchemaComposer's types.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.merge(someSchema1);
    *     schemaComposer.merge(someSchema2);
    *     schemaComposer.merge(someSchema3);
    *     const schemaComposer.getOTC('User').removeField('password');
    *     const newSchema = schemaComposer.buildSchema();
    */
  def merge(schema: graphqlLib.graphqlMod.GraphQLSchema): this.type = js.native
  def removeDirective(directive: graphqlLib.graphqlMod.GraphQLDirective): this.type = js.native
  /**
    * Deeply traverse fields in Query, Mutation, Subscription & sub-objects
    * where will be removed all fields with empty object types (without sub-fields).
    */
  def removeEmptyTypes(
    tc: graphqlDashComposeLib.libObjectTypeComposerMod.ObjectTypeComposer[_, TContext],
    passedTypes: stdLib.Set[java.lang.String]
  ): scala.Unit = js.native
  def set(key: js.Any, value: AnyType[TContext]): this.type = js.native
  def toJSON(): java.lang.String = js.native
}

