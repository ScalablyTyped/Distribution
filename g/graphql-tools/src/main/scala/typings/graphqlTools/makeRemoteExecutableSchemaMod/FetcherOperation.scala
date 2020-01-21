package typings.graphqlTools.makeRemoteExecutableSchemaMod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetcherOperation extends js.Object {
  var context: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var operationName: js.UndefOr[String] = js.undefined
  var query: DocumentNode
  var variables: js.UndefOr[StringDictionary[js.Any]] = js.undefined
}

object FetcherOperation {
  @scala.inline
  def apply(
    query: DocumentNode,
    context: StringDictionary[js.Any] = null,
    operationName: String = null,
    variables: StringDictionary[js.Any] = null
  ): FetcherOperation = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (operationName != null) __obj.updateDynamic("operationName")(operationName.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetcherOperation]
  }
}

