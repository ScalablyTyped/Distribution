package typings.graphqlTools.makeRemoteExecutableSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This type has been copied inline from its source on `@types/graphql`:
  *
  * https://git.io/Jv8NX
  *
  * Previously, it was imported from `graphql/utilities/schemaPrinter`, however
  * that module has been removed in `graphql@15`.  Furthermore, the sole property
  * on this type is due to be deprecated in `graphql@16`.
  */
trait PrintSchemaOptions extends js.Object {
  /**
    * Descriptions are defined as preceding string literals, however an older
    * experimental version of the SDL supported preceding comments as
    * descriptions. Set to true to enable this deprecated behavior.
    * This option is provided to ease adoption and will be removed in v16.
    *
    * Default: false
    */
  var commentDescriptions: js.UndefOr[Boolean] = js.undefined
}

object PrintSchemaOptions {
  @scala.inline
  def apply(commentDescriptions: js.UndefOr[Boolean] = js.undefined): PrintSchemaOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commentDescriptions)) __obj.updateDynamic("commentDescriptions")(commentDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintSchemaOptions]
  }
}

