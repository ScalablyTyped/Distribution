package typings.graphqlDashCompose.esmResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlDashCompose.graphqlDashComposeStrings.query
  - typings.graphqlDashCompose.graphqlDashComposeStrings.mutation
  - typings.graphqlDashCompose.graphqlDashComposeStrings.subscription
*/
trait ResolverKinds extends js.Object

object ResolverKinds {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typings.graphqlDashCompose.graphqlDashComposeStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typings.graphqlDashCompose.graphqlDashComposeStrings.query = this.cast("query")
  @scala.inline
  def subscription: typings.graphqlDashCompose.graphqlDashComposeStrings.subscription = this.cast("subscription")
}

