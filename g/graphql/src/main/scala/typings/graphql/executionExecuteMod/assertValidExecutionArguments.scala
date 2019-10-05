package typings.graphql.executionExecuteMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.languageAstMod.DocumentNode
import typings.graphql.tsutilsMaybeMod.Maybe
import typings.graphql.typeSchemaMod.GraphQLSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/execution/execute", "assertValidExecutionArguments")
@js.native
object assertValidExecutionArguments extends js.Object {
  def apply(schema: GraphQLSchema, document: DocumentNode, rawVariableValues: Maybe[StringDictionary[_]]): Unit = js.native
}

