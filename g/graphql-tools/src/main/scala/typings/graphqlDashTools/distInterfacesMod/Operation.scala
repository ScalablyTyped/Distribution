package typings.graphqlDashTools.distInterfacesMod

import typings.graphqlDashTools.graphqlDashToolsStrings.mutation_
import typings.graphqlDashTools.graphqlDashToolsStrings.query_
import typings.graphqlDashTools.graphqlDashToolsStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlDashTools.graphqlDashToolsStrings.query_
  - typings.graphqlDashTools.graphqlDashToolsStrings.mutation_
  - typings.graphqlDashTools.graphqlDashToolsStrings.subscription_
*/
trait Operation extends js.Object

object Operation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: mutation_ = this.cast("mutation")
  @scala.inline
  def query: query_ = this.cast("query")
  @scala.inline
  def subscription: subscription_ = this.cast("subscription")
}

