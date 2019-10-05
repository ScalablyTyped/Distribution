package typings.graphqlDashTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.graphqlMod.GraphQLSchema
import typings.graphql.typeDefinitionMod.GraphQLField
import typings.graphql.typeDefinitionMod.GraphQLNamedType
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashTools.distInterfacesMod.Transform
import typings.graphqlDashTools.distTransformsAddArgumentsAsVariablesMod.default
import typings.graphqlDashTools.distTransformsFilterRootFieldsMod.RootFilter
import typings.graphqlDashTools.distTransformsRenameTypesMod.RenameOptions
import typings.graphqlDashTools.distTransformsTransformRootFieldsMod.RootTransformer
import typings.graphqlDashTools.distTransformsWrapQueryMod.QueryWrapper
import typings.graphqlDashTools.graphqlDashToolsStrings.Mutation
import typings.graphqlDashTools.graphqlDashToolsStrings.Query
import typings.graphqlDashTools.graphqlDashToolsStrings.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object distTransformsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected () extends default {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typings.graphqlDashTools.distTransformsAddTypenameToAbstractMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typings.graphqlDashTools.distTransformsCheckResultAndHandleErrorsMod.default {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typings.graphqlDashTools.distTransformsExpandAbstractTypesMod.default {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typings.graphqlDashTools.distTransformsExtractFieldMod.default {
    def this(hasFromTo: Anon_From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typings.graphqlDashTools.distTransformsFilterRootFieldsMod.default {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typings.graphqlDashTools.distTransformsFilterToSchemaMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typings.graphqlDashTools.distTransformsFilterTypesMod.default {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typings.graphqlDashTools.distTransformsRenameRootFieldsMod.default {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typings.graphqlDashTools.distTransformsRenameTypesMod.default {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typings.graphqlDashTools.distTransformsReplaceFieldWithFragmentMod.default {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Anon_Field]) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typings.graphqlDashTools.distTransformsTransformRootFieldsMod.default {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typings.graphqlDashTools.distTransformsWrapQueryMod.default {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchema with Anon_Transforms = js.native
}

