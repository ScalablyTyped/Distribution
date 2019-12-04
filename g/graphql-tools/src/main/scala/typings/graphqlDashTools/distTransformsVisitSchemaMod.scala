package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashTools.distTransformsVisitSchemaMod.SchemaVisitor
import typings.graphqlDashTools.distTransformsVisitSchemaMod.TypeVisitor
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms/visitSchema", JSImport.Namespace)
@js.native
object distTransformsVisitSchemaMod extends js.Object {
  @js.native
  sealed trait VisitSchemaKind extends js.Object
  
  def visitSchema(schema: GraphQLSchema, visitor: SchemaVisitor): GraphQLSchema = js.native
  def visitSchema(schema: GraphQLSchema, visitor: SchemaVisitor, stripResolvers: Boolean): GraphQLSchema = js.native
  @js.native
  object VisitSchemaKind extends js.Object {
    @js.native
    sealed trait ABSTRACT_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait COMPOSITE_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait ENUM_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait INPUT_OBJECT_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait INTERFACE_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait MUTATION extends VisitSchemaKind
    
    @js.native
    sealed trait OBJECT_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait QUERY extends VisitSchemaKind
    
    @js.native
    sealed trait ROOT_OBJECT extends VisitSchemaKind
    
    @js.native
    sealed trait SCALAR_TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait SUBSCRIPTION extends VisitSchemaKind
    
    @js.native
    sealed trait TYPE extends VisitSchemaKind
    
    @js.native
    sealed trait UNION_TYPE extends VisitSchemaKind
    
    /* "VisitSchemaKind.ABSTRACT_TYPE" */ val ABSTRACT_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ABSTRACT_TYPE with String = js.native
    /* "VisitSchemaKind.COMPOSITE_TYPE" */ val COMPOSITE_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.COMPOSITE_TYPE with String = js.native
    /* "VisitSchemaKind.ENUM_TYPE" */ val ENUM_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ENUM_TYPE with String = js.native
    /* "VisitSchemaKind.INPUT_OBJECT_TYPE" */ val INPUT_OBJECT_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.INPUT_OBJECT_TYPE with String = js.native
    /* "VisitSchemaKind.INTERFACE_TYPE" */ val INTERFACE_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.INTERFACE_TYPE with String = js.native
    /* "VisitSchemaKind.MUTATION" */ val MUTATION: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.MUTATION with String = js.native
    /* "VisitSchemaKind.OBJECT_TYPE" */ val OBJECT_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.OBJECT_TYPE with String = js.native
    /* "VisitSchemaKind.QUERY" */ val QUERY: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.QUERY with String = js.native
    /* "VisitSchemaKind.ROOT_OBJECT" */ val ROOT_OBJECT: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ROOT_OBJECT with String = js.native
    /* "VisitSchemaKind.SCALAR_TYPE" */ val SCALAR_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.SCALAR_TYPE with String = js.native
    /* "VisitSchemaKind.SUBSCRIPTION" */ val SUBSCRIPTION: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.SUBSCRIPTION with String = js.native
    /* "VisitSchemaKind.TYPE" */ val TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.TYPE with String = js.native
    /* "VisitSchemaKind.UNION_TYPE" */ val UNION_TYPE: typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.UNION_TYPE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VisitSchemaKind with String] = js.native
  }
  
  type SchemaVisitor = StringDictionary[TypeVisitor]
  type TypeVisitor = js.Function2[/* type */ GraphQLType, /* schema */ GraphQLSchema, GraphQLNamedType]
}

