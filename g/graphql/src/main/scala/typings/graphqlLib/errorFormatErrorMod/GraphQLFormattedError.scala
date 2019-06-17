package typings
package graphqlLib.errorFormatErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFormattedError[TExtensions /* <: stdLib.Record[java.lang.String, _] */] extends js.Object {
  /**
  	 * Reserved for implementors to extend the protocol however they see fit,
  	 * and hence there are no additional restrictions on its contents.
  	 */
  val extensions: js.UndefOr[TExtensions] = js.undefined
  /**
  	 * If an error can be associated to a particular point in the requested
  	 * GraphQL document, it should contain a list of locations.
  	 */
  val locations: js.UndefOr[js.Array[graphqlLib.languageLocationMod.SourceLocation]] = js.undefined
  /**
  	 * A short, human-readable summary of the problem that **SHOULD NOT** change
  	 * from occurrence to occurrence of the problem, except for purposes of
  	 * localization.
  	 */
  val message: java.lang.String
  /**
  	 * If an error can be associated to a particular field in the GraphQL result,
  	 * it _must_ contain an entry with the key `path` that details the path of
  	 * the response field which experienced the error. This allows clients to
  	 * identify whether a null result is intentional or caused by a runtime error.
  	 */
  val path: js.UndefOr[js.Array[java.lang.String | scala.Double]] = js.undefined
}

object GraphQLFormattedError {
  @scala.inline
  def apply[TExtensions /* <: stdLib.Record[java.lang.String, _] */](
    message: java.lang.String,
    extensions: TExtensions = null,
    locations: js.Array[graphqlLib.languageLocationMod.SourceLocation] = null,
    path: js.Array[java.lang.String | scala.Double] = null
  ): GraphQLFormattedError[TExtensions] = {
    val __obj = js.Dynamic.literal(message = message)
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[GraphQLFormattedError[TExtensions]]
  }
}

