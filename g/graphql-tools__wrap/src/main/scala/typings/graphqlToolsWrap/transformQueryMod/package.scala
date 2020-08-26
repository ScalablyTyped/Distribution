package typings.graphqlToolsWrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transformQueryMod {
  type ErrorPathTransformer = js.Function1[
    /* path */ js.Array[java.lang.String | scala.Double], 
    js.Array[java.lang.String | scala.Double]
  ]
  type QueryTransformer = js.Function2[
    /* selectionSet */ typings.graphql.astMod.SelectionSetNode, 
    /* fragments */ typings.std.Record[java.lang.String, typings.graphql.astMod.FragmentDefinitionNode], 
    typings.graphql.astMod.SelectionSetNode
  ]
  type ResultTransformer = js.Function1[/* result */ js.Any, js.Any]
}
