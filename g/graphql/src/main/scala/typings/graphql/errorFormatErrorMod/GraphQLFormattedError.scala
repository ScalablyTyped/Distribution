package typings.graphql.errorFormatErrorMod

import typings.graphql.languageLocationMod.SourceLocation
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLFormattedError[TExtensions /* <: Record[String, _] */] extends js.Object {
  /**
    * Reserved for implementors to extend the protocol however they see fit,
    * and hence there are no additional restrictions on its contents.
    */
  val extensions: js.UndefOr[TExtensions] = js.undefined
  /**
    * If an error can be associated to a particular point in the requested
    * GraphQL document, it should contain a list of locations.
    */
  val locations: js.UndefOr[js.Array[SourceLocation]] = js.undefined
  /**
    * A short, human-readable summary of the problem that **SHOULD NOT** change
    * from occurrence to occurrence of the problem, except for purposes of
    * localization.
    */
  val message: String
  /**
    * If an error can be associated to a particular field in the GraphQL result,
    * it _must_ contain an entry with the key `path` that details the path of
    * the response field which experienced the error. This allows clients to
    * identify whether a null result is intentional or caused by a runtime error.
    */
  val path: js.UndefOr[js.Array[String | Double]] = js.undefined
}

object GraphQLFormattedError {
  @scala.inline
  def apply[TExtensions /* <: Record[String, _] */](
    message: String,
    extensions: TExtensions = null,
    locations: js.Array[SourceLocation] = null,
    path: js.Array[String | Double] = null
  ): GraphQLFormattedError[TExtensions] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    if (locations != null) __obj.updateDynamic("locations")(locations.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFormattedError[TExtensions]]
  }
}

