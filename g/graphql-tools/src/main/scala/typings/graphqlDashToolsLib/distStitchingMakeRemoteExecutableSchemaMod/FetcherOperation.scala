package typings
package graphqlDashToolsLib.distStitchingMakeRemoteExecutableSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetcherOperation extends js.Object {
  var context: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var operationName: js.UndefOr[java.lang.String] = js.undefined
  var query: graphqlLib.languageAstMod.DocumentNode
  var variables: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
}

object FetcherOperation {
  @scala.inline
  def apply(
    query: graphqlLib.languageAstMod.DocumentNode,
    context: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    operationName: java.lang.String = null,
    variables: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): FetcherOperation = {
    val __obj = js.Dynamic.literal(query = query)
    if (context != null) __obj.updateDynamic("context")(context)
    if (operationName != null) __obj.updateDynamic("operationName")(operationName)
    if (variables != null) __obj.updateDynamic("variables")(variables)
    __obj.asInstanceOf[FetcherOperation]
  }
}

