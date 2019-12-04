package typings.graphqlDashBinding.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlDashBinding.graphqlDashBindingStrings.query
  - typings.graphqlDashBinding.graphqlDashBindingStrings.mutation
  - typings.graphqlDashBinding.graphqlDashBindingStrings.subscription
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: typings.graphqlDashBinding.graphqlDashBindingStrings.mutation = this.cast("mutation")
  @scala.inline
  def query: typings.graphqlDashBinding.graphqlDashBindingStrings.query = this.cast("query")
  @scala.inline
  def subscription: typings.graphqlDashBinding.graphqlDashBindingStrings.subscription = this.cast("subscription")
}

