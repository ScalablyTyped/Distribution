package typings.graphqlTools.interfacesMod

import typings.graphqlTools.graphqlToolsStrings.mutation_
import typings.graphqlTools.graphqlToolsStrings.query_
import typings.graphqlTools.graphqlToolsStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphqlTools.graphqlToolsStrings.query_
  - typings.graphqlTools.graphqlToolsStrings.mutation_
  - typings.graphqlTools.graphqlToolsStrings.subscription_
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

