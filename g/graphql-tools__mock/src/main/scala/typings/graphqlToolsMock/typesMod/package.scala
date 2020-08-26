package typings.graphqlToolsMock

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type IMockFn = typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  type IMockTypeFn = js.Function3[
    /* type */ typings.graphql.definitionMod.GraphQLType, 
    /* typeName */ js.UndefOr[java.lang.String], 
    /* fieldName */ js.UndefOr[java.lang.String], 
    typings.graphql.definitionMod.GraphQLFieldResolver[js.Any, js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]]
  ]
  type IMocks = org.scalablytyped.runtime.StringDictionary[typings.graphqlToolsMock.typesMod.IMockFn]
}
