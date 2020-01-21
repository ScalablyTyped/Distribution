package typings.graphqlBinding

import typings.graphqlBinding.distTypesMod.Operation
import typings.graphqlBinding.distTypesMod.QueryOrMutation
import typings.graphqlBinding.typesMod.GeneratorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graphqlBindingStrings {
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

