package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLType
import typings.graphqlDashTools.distTransformsVisitSchemaMod.SchemaVisitor
import typings.graphqlDashTools.distTransformsVisitSchemaMod.TypeVisitor
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ABSTRACT_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.COMPOSITE_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ENUM_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.INPUT_OBJECT_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.INTERFACE_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.MUTATION
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.OBJECT_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.QUERY
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.ROOT_OBJECT
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.SCALAR_TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.SUBSCRIPTION
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.TYPE
import typings.graphqlDashTools.distTransformsVisitSchemaMod.VisitSchemaKind.UNION_TYPE
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
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[VisitSchemaKind with String] = js.native
    /* "VisitSchemaKind.ABSTRACT_TYPE" */ @js.native
    object ABSTRACT_TYPE extends TopLevel[ABSTRACT_TYPE with String]
    
    /* "VisitSchemaKind.COMPOSITE_TYPE" */ @js.native
    object COMPOSITE_TYPE extends TopLevel[COMPOSITE_TYPE with String]
    
    /* "VisitSchemaKind.ENUM_TYPE" */ @js.native
    object ENUM_TYPE extends TopLevel[ENUM_TYPE with String]
    
    /* "VisitSchemaKind.INPUT_OBJECT_TYPE" */ @js.native
    object INPUT_OBJECT_TYPE extends TopLevel[INPUT_OBJECT_TYPE with String]
    
    /* "VisitSchemaKind.INTERFACE_TYPE" */ @js.native
    object INTERFACE_TYPE extends TopLevel[INTERFACE_TYPE with String]
    
    /* "VisitSchemaKind.MUTATION" */ @js.native
    object MUTATION extends TopLevel[MUTATION with String]
    
    /* "VisitSchemaKind.OBJECT_TYPE" */ @js.native
    object OBJECT_TYPE extends TopLevel[OBJECT_TYPE with String]
    
    /* "VisitSchemaKind.QUERY" */ @js.native
    object QUERY extends TopLevel[QUERY with String]
    
    /* "VisitSchemaKind.ROOT_OBJECT" */ @js.native
    object ROOT_OBJECT extends TopLevel[ROOT_OBJECT with String]
    
    /* "VisitSchemaKind.SCALAR_TYPE" */ @js.native
    object SCALAR_TYPE extends TopLevel[SCALAR_TYPE with String]
    
    /* "VisitSchemaKind.SUBSCRIPTION" */ @js.native
    object SUBSCRIPTION extends TopLevel[SUBSCRIPTION with String]
    
    /* "VisitSchemaKind.TYPE" */ @js.native
    object TYPE extends TopLevel[TYPE with String]
    
    /* "VisitSchemaKind.UNION_TYPE" */ @js.native
    object UNION_TYPE extends TopLevel[UNION_TYPE with String]
    
  }
  
  type SchemaVisitor = StringDictionary[TypeVisitor]
  type TypeVisitor = js.Function2[/* type */ GraphQLType, /* schema */ GraphQLSchema, GraphQLNamedType]
}

