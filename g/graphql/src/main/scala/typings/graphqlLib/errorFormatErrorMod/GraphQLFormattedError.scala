package typings
package graphqlLib.errorFormatErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFormattedError extends js.Object {
  val extensions: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  val locations: js.UndefOr[js.Array[graphqlLib.languageLocationMod.SourceLocation]]
  val message: java.lang.String
  val path: js.UndefOr[js.Array[java.lang.String | scala.Double]]
}

object GraphQLFormattedError {
  @scala.inline
  def apply(
    message: java.lang.String,
    extensions: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    locations: js.Array[graphqlLib.languageLocationMod.SourceLocation] = null,
    path: js.Array[java.lang.String | scala.Double] = null
  ): GraphQLFormattedError = {
    val __obj = js.Dynamic.literal(message = message)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GraphQLFormattedError]
  }
}

