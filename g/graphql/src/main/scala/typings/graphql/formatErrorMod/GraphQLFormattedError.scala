package typings.graphql.formatErrorMod

import typings.graphql.locationMod.SourceLocation
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GraphQLFormattedError[TExtensions /* <: Record[String, _] */] extends js.Object {
  /**
    * Reserved for implementors to extend the protocol however they see fit,
    * and hence there are no additional restrictions on its contents.
    */
  val extensions: js.UndefOr[TExtensions] = js.native
  /**
    * If an error can be associated to a particular point in the requested
    * GraphQL document, it should contain a list of locations.
    */
  val locations: js.UndefOr[js.Array[SourceLocation]] = js.native
  /**
    * A short, human-readable summary of the problem that **SHOULD NOT** change
    * from occurrence to occurrence of the problem, except for purposes of
    * localization.
    */
  val message: String = js.native
  /**
    * If an error can be associated to a particular field in the GraphQL result,
    * it _must_ contain an entry with the key `path` that details the path of
    * the response field which experienced the error. This allows clients to
    * identify whether a null result is intentional or caused by a runtime error.
    */
  val path: js.UndefOr[js.Array[String | Double]] = js.native
}

object GraphQLFormattedError {
  @scala.inline
  def apply[/* <: typings.std.Record[java.lang.String, _] */ TExtensions](message: String): GraphQLFormattedError[TExtensions] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[GraphQLFormattedError[TExtensions]]
  }
  @scala.inline
  implicit class GraphQLFormattedErrorOps[Self <: GraphQLFormattedError[_], /* <: typings.std.Record[java.lang.String, _] */ TExtensions] (val x: Self with GraphQLFormattedError[TExtensions]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtensions(value: TExtensions): Self = this.set("extensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtensions: Self = this.set("extensions", js.undefined)
    @scala.inline
    def setLocationsVarargs(value: SourceLocation*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[SourceLocation]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setPathVarargs(value: (String | Double)*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[String | Double]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
  }
  
}

