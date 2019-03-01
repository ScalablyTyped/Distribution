package typings
package httpDashLinkDashDataloaderLib.distSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLRequestContext extends js.Object {
  var query: java.lang.String
  var variables: js.UndefOr[Variables] = js.undefined
}

object GraphQLRequestContext {
  @scala.inline
  def apply(query: java.lang.String, variables: Variables = null): GraphQLRequestContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[GraphQLRequestContext]
  }
}

