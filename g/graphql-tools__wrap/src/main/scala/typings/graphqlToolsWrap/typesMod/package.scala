package typings.graphqlToolsWrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DataTransformer = js.Function2[
    /* value */ js.Any, 
    /* transformationContext */ js.UndefOr[typings.std.Record[java.lang.String, js.Any]], 
    js.Any
  ]
  type EnumValueTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* externalValue */ java.lang.String, 
    /* enumValueConfig */ typings.graphql.definitionMod.GraphQLEnumValueConfig, 
    js.UndefOr[
      typings.graphql.definitionMod.GraphQLEnumValueConfig | (js.Tuple2[java.lang.String, typings.graphql.definitionMod.GraphQLEnumValueConfig]) | scala.Null
    ]
  ]
  type ErrorsTransformer = js.Function2[
    /* errors */ js.Array[typings.graphql.mod.GraphQLError], 
    /* transformationContext */ typings.std.Record[java.lang.String, js.Any], 
    js.Array[typings.graphql.mod.GraphQLError]
  ]
  type FieldNodeTransformer = js.Function5[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* fieldNode */ typings.graphql.astMod.FieldNode, 
    /* fragments */ typings.std.Record[java.lang.String, typings.graphql.astMod.FragmentDefinitionNode], 
    /* transformationContext */ typings.std.Record[java.lang.String, js.Any], 
    typings.graphql.astMod.SelectionNode | js.Array[typings.graphql.astMod.SelectionNode]
  ]
  type FieldTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* fieldConfig */ typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Tuple2[
        java.lang.String, 
        typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
      ]) | scala.Null
    ]
  ]
  type InputFieldNodeTransformer = js.Function5[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* inputFieldNode */ typings.graphql.astMod.ObjectFieldNode, 
    /* request */ typings.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typings.graphqlToolsDelegate.typesMod.DelegationContext], 
    typings.graphql.astMod.ObjectFieldNode | js.Array[typings.graphql.astMod.ObjectFieldNode]
  ]
  type InputFieldTransformer = js.Function3[
    /* typeName */ java.lang.String, 
    /* fieldName */ java.lang.String, 
    /* inputFieldConfig */ typings.graphql.definitionMod.GraphQLInputFieldConfig, 
    js.UndefOr[
      typings.graphql.definitionMod.GraphQLInputFieldConfig | (js.Tuple2[java.lang.String, typings.graphql.definitionMod.GraphQLInputFieldConfig]) | scala.Null
    ]
  ]
  type InputObjectNodeTransformer = js.Function4[
    /* typeName */ java.lang.String, 
    /* inputObjectNode */ typings.graphql.astMod.ObjectValueNode, 
    /* request */ typings.graphqlToolsUtils.interfacesMod.Request, 
    /* delegationContext */ js.UndefOr[typings.graphqlToolsDelegate.typesMod.DelegationContext], 
    typings.graphql.astMod.ObjectValueNode
  ]
  type LeafValueTransformer = js.Function2[/* typeName */ java.lang.String, /* value */ js.Any, js.Any]
  type ObjectValueTransformerMap = typings.std.Record[java.lang.String, typings.graphqlToolsWrap.typesMod.DataTransformer]
  type RootFieldTransformer = js.Function3[
    /* operation */ typings.graphqlToolsWrap.graphqlToolsWrapStrings.Query | typings.graphqlToolsWrap.graphqlToolsWrapStrings.Mutation | typings.graphqlToolsWrap.graphqlToolsWrapStrings.Subscription, 
    /* fieldName */ java.lang.String, 
    /* fieldConfig */ typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]], 
    js.UndefOr[
      (typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]) | (js.Tuple2[
        java.lang.String, 
        typings.graphql.definitionMod.GraphQLFieldConfig[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
      ]) | scala.Null
    ]
  ]
}
