package typings.graphqlDashTools

import typings.graphqlDashTools.distInterfacesMod.Operation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object graphqlDashToolsStrings {
  @js.native
  sealed trait Mutation extends js.Object
  
  @js.native
  sealed trait Query extends js.Object
  
  @js.native
  sealed trait Subscription extends js.Object
  
  @js.native
  sealed trait mutation extends Operation
  
  @js.native
  sealed trait query extends Operation
  
  @js.native
  sealed trait subscription extends Operation
  
  @scala.inline
  def Mutation: Mutation = "Mutation".asInstanceOf[Mutation]
  @scala.inline
  def Query: Query = "Query".asInstanceOf[Query]
  @scala.inline
  def Subscription: Subscription = "Subscription".asInstanceOf[Subscription]
  @scala.inline
  def mutation: mutation = "mutation".asInstanceOf[mutation]
  @scala.inline
  def query: query = "query".asInstanceOf[query]
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
}

