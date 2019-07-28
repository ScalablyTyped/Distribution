package typings.graphqlDashCompose.esmSchemaComposerMod

import typings.graphql.graphqlMod.GraphQLDirective
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposeDefinition
import typings.graphqlDashCompose.esmEnumTypeComposerMod.EnumTypeComposer
import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposeDefinition
import typings.graphqlDashCompose.esmInputTypeComposerMod.InputTypeComposer
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposeDefinition
import typings.graphqlDashCompose.esmInterfaceTypeComposerMod.InterfaceTypeComposer
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposeDefinition
import typings.graphqlDashCompose.esmObjectTypeComposerMod.ObjectTypeComposer
import typings.graphqlDashCompose.esmResolverMod.Resolver
import typings.graphqlDashCompose.esmResolverMod.ResolverOpts
import typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposeDefinition
import typings.graphqlDashCompose.esmScalarTypeComposerMod.ScalarTypeComposer
import typings.graphqlDashCompose.esmTypeMapperMod.TypeMapper
import typings.graphqlDashCompose.esmTypeStorageMod.TypeStorage
import typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposeDefinition
import typings.graphqlDashCompose.esmUnionTypeComposerMod.UnionTypeComposer
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose/esm/SchemaComposer", "SchemaComposer")
@js.native
class SchemaComposer[TContext] ()
  extends TypeStorage[js.Any, js.Any] {
  def this(schema: GraphQLSchema) = this()
  /**
    * Returns `ObjectTypeComposer` of `Mutation` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Mutation.addFields({ field1: 'String' });
    */
  val Mutation: ObjectTypeComposer[_, TContext] = js.native
  /**
    * Returns `ObjectTypeComposer` of `Query` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Query.addFields({ field1: 'String' });
    */
  val Query: ObjectTypeComposer[_, TContext] = js.native
  /**
    * Returns `ObjectTypeComposer` of `Subscription` root type.
    *
    * @example
    *     import { schemaComposer } from 'graphql-compose';
    *     schemaComposer.Subscription.addFields({ field1: 'String' });
    */
  val Subscription: ObjectTypeComposer[_, TContext] = js.native
  var _directives: js.Array[GraphQLDirective] = js.native
  var _schemaMustHaveTypes: js.Array[AnyType[TContext]] = js.native
  var typeMapper: TypeMapper[TContext] = js.native
  def addAsComposer(typeOrSDL: js.Any): String = js.native
  /**
    * -----------------------------------------------
    * Directive methods
    * -----------------------------------------------
    */
  def addDirective(directive: GraphQLDirective): this.type = js.native
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
  def addResolveMethods(typesFieldsResolve: GraphQLToolsResolveMethods[TContext]): Unit = js.native
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
  def addTypeDefs(typeDefs: String): TypeStorage[String, GraphQLNamedType] = js.native
  /**
    * Create `GraphQLSchema` instance from defined types.
    * This instance can be provided to `express-graphql`, `apollo-server`, `graphql-yoga` etc.
    */
  def buildSchema(): GraphQLSchema = js.native
  def buildSchema(extraConfig: ExtraSchemaConfig): GraphQLSchema = js.native
  def createEnumTC(typeDef: EnumTypeComposeDefinition): EnumTypeComposer[TContext] = js.native
  def createInputTC(typeDef: InputTypeComposeDefinition): InputTypeComposer[TContext] = js.native
  def createInterfaceTC[TSource](typeDef: InterfaceTypeComposeDefinition[TSource, TContext]): InterfaceTypeComposer[TSource, TContext] = js.native
  /**
    * -----------------------------------------------
    * Type methods
    * -----------------------------------------------
    */
  def createObjectTC[TSource](typeDef: ObjectTypeComposeDefinition[TSource, TContext]): ObjectTypeComposer[TSource, TContext] = js.native
  def createResolver[TSource, TArgs](opts: ResolverOpts[TSource, TContext, TArgs, _]): Resolver[TSource, TContext, TArgs, _] = js.native
  def createScalarTC(typeDef: ScalarTypeComposeDefinition): ScalarTypeComposer[TContext] = js.native
  /**
    * Creates or return existed TypeComposer from SDL or object.
    * If you call this method again with same params should be returned the same TypeComposer instance.
    */
  def createTC(typeOrSDL: js.Any): (ObjectTypeComposer[_, TContext]) | InputTypeComposer[TContext] | EnumTypeComposer[TContext] | (InterfaceTypeComposer[_, TContext]) | (UnionTypeComposer[_, TContext]) | ScalarTypeComposer[TContext] = js.native
  /**
    * Creates TypeComposer from SDL or object without adding it to the type storage.
    */
  def createTempTC(typeOrSDL: js.Any): (ObjectTypeComposer[_, TContext]) | InputTypeComposer[TContext] | EnumTypeComposer[TContext] | (InterfaceTypeComposer[_, TContext]) | (UnionTypeComposer[_, TContext]) | ScalarTypeComposer[TContext] = js.native
  def createUnionTC[TSource](typeDef: UnionTypeComposeDefinition[TSource, TContext]): UnionTypeComposer[TSource, TContext] = js.native
  def getAnyTC(typeName: AnyType[_] | GraphQLType): (ObjectTypeComposer[_, TContext]) | InputTypeComposer[TContext] | EnumTypeComposer[TContext] | (InterfaceTypeComposer[_, TContext]) | (UnionTypeComposer[_, TContext]) | ScalarTypeComposer[TContext] = js.native
  def getAnyTC(typeName: String): (ObjectTypeComposer[_, TContext]) | InputTypeComposer[TContext] | EnumTypeComposer[TContext] | (InterfaceTypeComposer[_, TContext]) | (UnionTypeComposer[_, TContext]) | ScalarTypeComposer[TContext] = js.native
  def getDirective(name: String): GraphQLDirective = js.native
  def getDirectives(): js.Array[GraphQLDirective] = js.native
  def getETC(typeName: js.Any): EnumTypeComposer[TContext] = js.native
  def getIFTC[TSource](typeName: js.Any): InterfaceTypeComposer[TSource, TContext] = js.native
  def getITC(typeName: js.Any): InputTypeComposer[TContext] = js.native
  def getOTC[TSource](typeName: js.Any): ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateETC(typeName: String): EnumTypeComposer[TContext] = js.native
  def getOrCreateETC(typeName: String, onCreate: js.Function1[/* etc */ EnumTypeComposer[TContext], _]): EnumTypeComposer[TContext] = js.native
  def getOrCreateIFTC[TSource](typeName: String): InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateIFTC[TSource](typeName: String, onCreate: js.Function1[/* iftc */ InterfaceTypeComposer[TSource, TContext], _]): InterfaceTypeComposer[TSource, TContext] = js.native
  def getOrCreateITC(typeName: String): InputTypeComposer[TContext] = js.native
  def getOrCreateITC(typeName: String, onCreate: js.Function1[/* itc */ InputTypeComposer[TContext], _]): InputTypeComposer[TContext] = js.native
  def getOrCreateOTC[TSource](typeName: String): ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateOTC[TSource](typeName: String, onCreate: js.Function1[/* tc */ ObjectTypeComposer[TSource, TContext], _]): ObjectTypeComposer[TSource, TContext] = js.native
  def getOrCreateSTC(typeName: String): ScalarTypeComposer[TContext] = js.native
  def getOrCreateSTC(typeName: String, onCreate: js.Function1[/* stc */ ScalarTypeComposer[TContext], _]): ScalarTypeComposer[TContext] = js.native
  def getOrCreateUTC[TSource](typeName: String): UnionTypeComposer[TSource, TContext] = js.native
  def getOrCreateUTC[TSource](typeName: String, onCreate: js.Function1[/* utc */ UnionTypeComposer[TSource, TContext], _]): UnionTypeComposer[TSource, TContext] = js.native
  def getOrSet(key: js.Any, typeOrThunk: AnyType[TContext]): AnyType[TContext] = js.native
  def getSTC(typeName: js.Any): ScalarTypeComposer[TContext] = js.native
  def getUTC[TSource](typeName: js.Any): UnionTypeComposer[TSource, TContext] = js.native
  def hasDirective(directive: String): Boolean = js.native
  def hasDirective(directive: GraphQLDirective): Boolean = js.native
  def inspect(): String = js.native
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
  def merge(schema: GraphQLSchema): this.type = js.native
  def merge(schema: SchemaComposer[_]): this.type = js.native
  def removeDirective(directive: GraphQLDirective): this.type = js.native
  /**
    * Deeply traverse fields in Query, Mutation, Subscription & sub-objects
    * where will be removed all fields with empty object types (without sub-fields).
    */
  def removeEmptyTypes(tc: ObjectTypeComposer[_, TContext], passedTypes: Set[String]): Unit = js.native
  def set(key: js.Any, value: AnyType[TContext]): this.type = js.native
  def toJSON(): String = js.native
}

