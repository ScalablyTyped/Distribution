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
  sealed trait mutation_ extends Operation
  
  @js.native
  sealed trait query_ extends Operation
  
  @js.native
  sealed trait subscription_ extends Operation
  
  @scala.inline
  def Mutation: Mutation = "Mutation".asInstanceOf[Mutation]
  @scala.inline
  def Query: Query = "Query".asInstanceOf[Query]
  @scala.inline
  def Subscription: Subscription = "Subscription".asInstanceOf[Subscription]
  @scala.inline
  def mutation_ : mutation_ = "mutation".asInstanceOf[mutation_]
  @scala.inline
  def query_ : query_ = "query".asInstanceOf[query_]
  @scala.inline
  def subscription_ : subscription_ = "subscription".asInstanceOf[subscription_]
}

