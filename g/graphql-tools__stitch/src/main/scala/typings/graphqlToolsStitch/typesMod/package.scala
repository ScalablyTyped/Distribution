package typings.graphqlToolsStitch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type MergeTypeFilter = js.Function2[
    /* mergeTypeCandidates */ js.Array[typings.graphqlToolsStitch.typesMod.MergeTypeCandidate], 
    /* typeName */ java.lang.String, 
    scala.Boolean
  ]
  type OnTypeConflict = js.Function3[
    /* left */ typings.graphql.definitionMod.GraphQLNamedType, 
    /* right */ typings.graphql.definitionMod.GraphQLNamedType, 
    /* info */ js.UndefOr[typings.graphqlToolsStitch.anon.Left], 
    typings.graphql.definitionMod.GraphQLNamedType
  ]
  type SchemaLikeObject = typings.graphqlToolsDelegate.typesMod.SubschemaConfig | typings.graphql.mod.GraphQLSchema | java.lang.String | typings.graphql.astMod.DocumentNode | js.Array[typings.graphql.definitionMod.GraphQLNamedType]
}
