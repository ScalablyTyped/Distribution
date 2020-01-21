package typings.graphqlCompose.resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlCompose.graphqlComposeStrings.query
  - typings.graphqlCompose.graphqlComposeStrings.mutation
  - typings.graphqlCompose.graphqlComposeStrings.subscription
*/
trait ResolverKinds extends js.Object

object ResolverKinds {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typings.graphqlCompose.graphqlComposeStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typings.graphqlCompose.graphqlComposeStrings.query = this.cast("query")
  @scala.inline
  def subscription: typings.graphqlCompose.graphqlComposeStrings.subscription = this.cast("subscription")
}

