package typings.graphql.astMod

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
  def mutation: mutation_ = "mutation".asInstanceOf[mutation_]
  @scala.inline
  def query: query_ = "query".asInstanceOf[query_]
  @scala.inline
  def subscription: subscription_ = "subscription".asInstanceOf[subscription_]
}

