package typings.graphql.languageAstMod

import typings.graphql.graphqlStrings.mutation_
import typings.graphql.graphqlStrings.query_
import typings.graphql.graphqlStrings.subscription_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.graphql.graphqlStrings.query_
  - typings.graphql.graphqlStrings.mutation_
  - typings.graphql.graphqlStrings.subscription_
*/
trait OperationTypeNode extends js.Object

object OperationTypeNode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def mutation: mutation_ = this.cast("mutation")
  @scala.inline
  def query: query_ = this.cast("query")
  @scala.inline
  def subscription: subscription_ = this.cast("subscription")
}

