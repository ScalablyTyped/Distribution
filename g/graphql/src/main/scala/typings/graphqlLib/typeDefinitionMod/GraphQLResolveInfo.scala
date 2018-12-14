package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait GraphQLResolveInfo extends js.Object {
  val fieldName: java.lang.String
  val fieldNodes: js.Array[graphqlLib.languageAstMod.FieldNode]
  val fragments: org.scalablytyped.runtime.StringDictionary[graphqlLib.languageAstMod.FragmentDefinitionNode]
  val operation: graphqlLib.languageAstMod.OperationDefinitionNode
  val parentType: GraphQLObjectType
  val path: ResponsePath
  val returnType: GraphQLOutputType
  val rootValue: js.Any
  val schema: graphqlLib.typeSchemaMod.GraphQLSchema
  val variableValues: org.scalablytyped.runtime.StringDictionary[js.Any]
}

