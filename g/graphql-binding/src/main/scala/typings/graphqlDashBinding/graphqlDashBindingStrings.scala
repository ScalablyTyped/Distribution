package typings.graphqlDashBinding

import typings.graphqlDashBinding.distCodegenTypesMod.GeneratorType
import typings.graphqlDashBinding.distTypesMod.Operation
import typings.graphqlDashBinding.distTypesMod.QueryOrMutation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graphqlDashBindingStrings {
  @js.native
  sealed trait javascript extends GeneratorType
  
  @js.native
  sealed trait mutation
    extends Operation
       with QueryOrMutation
  
  @js.native
  sealed trait query
    extends Operation
       with QueryOrMutation
  
  @js.native
  sealed trait subscription extends Operation
  
  @js.native
  sealed trait typescript extends GeneratorType
  
  @scala.inline
  def javascript: javascript = "javascript".asInstanceOf[javascript]
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  @scala.inline
  def typescript: typescript = "typescript".asInstanceOf[typescript]
}

