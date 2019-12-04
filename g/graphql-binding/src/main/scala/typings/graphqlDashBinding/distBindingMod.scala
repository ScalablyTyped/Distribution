package typings.graphqlDashBinding

import typings.graphqlDashBinding.distDelegateMod.Delegate
import typings.graphqlDashBinding.distTypesMod.BindingOptions
import typings.graphqlDashBinding.distTypesMod.MutationMap
import typings.graphqlDashBinding.distTypesMod.QueryMap
import typings.graphqlDashBinding.distTypesMod.QueryOrMutation
import typings.graphqlDashBinding.distTypesMod.SubscriptionMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-binding/dist/Binding", JSImport.Namespace)
@js.native
object distBindingMod extends js.Object {
  @js.native
  class Binding protected () extends Delegate {
    def this(hasSchemaFragmentReplacementsBeforeDisableCache: BindingOptions) = this()
    var mutation: MutationMap = js.native
    var query: QueryMap = js.native
    var subscription: SubscriptionMap = js.native
    def buildMethods(): js.Any = js.native
    def buildQueryMethods(operation: QueryOrMutation): QueryMap = js.native
    def buildSubscriptionMethods(): SubscriptionMap = js.native
  }
  
}

