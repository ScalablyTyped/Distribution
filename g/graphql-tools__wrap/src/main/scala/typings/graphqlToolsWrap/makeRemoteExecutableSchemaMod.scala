package typings.graphqlToolsWrap

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLFieldResolver
import typings.graphql.mod.GraphQLSchema
import typings.graphqlToolsDelegate.typesMod.Executor
import typings.graphqlToolsDelegate.typesMod.Subscriber
import typings.graphqlToolsWrap.typesMod.IMakeRemoteExecutableSchemaOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@graphql-tools/wrap/makeRemoteExecutableSchema", JSImport.Namespace)
@js.native
object makeRemoteExecutableSchemaMod extends js.Object {
  def defaultCreateRemoteResolver(executor: Executor, subscriber: Subscriber): GraphQLFieldResolver[_, _, StringDictionary[_]] = js.native
  def makeRemoteExecutableSchema(hasSchemaExecutorSubscriberCreateResolverBuildSchemaOptions: IMakeRemoteExecutableSchemaOptions): GraphQLSchema = js.native
}

