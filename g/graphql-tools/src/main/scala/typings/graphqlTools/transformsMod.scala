package typings.graphqlTools

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLField
import typings.graphql.definitionMod.GraphQLNamedType
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphql.mod.GraphQLSchema
import typings.graphqlTools.addArgumentsAsVariablesMod.default
import typings.graphqlTools.anon.Field
import typings.graphqlTools.anon.From
import typings.graphqlTools.anon.GraphQLSchematransformsAr
import typings.graphqlTools.filterRootFieldsMod.RootFilter
import typings.graphqlTools.graphqlToolsStrings.Mutation
import typings.graphqlTools.graphqlToolsStrings.Query
import typings.graphqlTools.graphqlToolsStrings.Subscription
import typings.graphqlTools.interfacesMod.Transform
import typings.graphqlTools.renameTypesMod.RenameOptions
import typings.graphqlTools.transformRootFieldsMod.RootTransformer
import typings.graphqlTools.wrapQueryMod.QueryWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-tools/dist/transforms", JSImport.Namespace)
@js.native
object transformsMod extends js.Object {
  @js.native
  class AddArgumentsAsVariables protected () extends default {
    def this(schema: GraphQLSchema, args: StringDictionary[js.Any]) = this()
  }
  
  @js.native
  class AddTypenameToAbstract protected ()
    extends typings.graphqlTools.addTypenameToAbstractMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class CheckResultAndHandleErrors protected ()
    extends typings.graphqlTools.checkResultAndHandleErrorsMod.default {
    def this(info: GraphQLResolveInfo) = this()
    def this(info: GraphQLResolveInfo, fieldName: String) = this()
  }
  
  @js.native
  class ExpandAbstractTypes protected ()
    extends typings.graphqlTools.expandAbstractTypesMod.default {
    def this(transformedSchema: GraphQLSchema, targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class ExtractField protected ()
    extends typings.graphqlTools.extractFieldMod.default {
    def this(hasFromTo: From) = this()
  }
  
  @js.native
  class FilterRootFields protected ()
    extends typings.graphqlTools.filterRootFieldsMod.default {
    def this(filter: RootFilter) = this()
  }
  
  @js.native
  class FilterToSchema protected ()
    extends typings.graphqlTools.filterToSchemaMod.default {
    def this(targetSchema: GraphQLSchema) = this()
  }
  
  @js.native
  class FilterTypes protected ()
    extends typings.graphqlTools.filterTypesMod.default {
    def this(filter: js.Function1[/* type */ GraphQLNamedType, Boolean]) = this()
  }
  
  @js.native
  class RenameRootFields protected ()
    extends typings.graphqlTools.renameRootFieldsMod.default {
    def this(renamer: js.Function3[
            /* operation */ Query | Mutation | Subscription, 
            /* name */ String, 
            /* field */ GraphQLField[_, _, StringDictionary[_]], 
            String
          ]) = this()
  }
  
  @js.native
  class RenameTypes protected ()
    extends typings.graphqlTools.renameTypesMod.default {
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]]) = this()
    def this(renamer: js.Function1[/* name */ String, js.UndefOr[String]], options: RenameOptions) = this()
  }
  
  @js.native
  class ReplaceFieldWithFragment protected ()
    extends typings.graphqlTools.replaceFieldWithFragmentMod.default {
    def this(targetSchema: GraphQLSchema, fragments: js.Array[Field]) = this()
  }
  
  @js.native
  class TransformRootFields protected ()
    extends typings.graphqlTools.transformRootFieldsMod.default {
    def this(transform: RootTransformer) = this()
  }
  
  @js.native
  class WrapQuery protected ()
    extends typings.graphqlTools.wrapQueryMod.default {
    def this(path: js.Array[String], wrapper: QueryWrapper, extractor: js.Function1[/* result */ js.Any, _]) = this()
  }
  
  def transformSchema(targetSchema: GraphQLSchema, transforms: js.Array[Transform]): GraphQLSchematransformsAr = js.native
}

