package typings
package graphqlDashComposeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExtensionsOptional extends js.Object {
  var extensions: js.UndefOr[graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions] = js.undefined
}

object Anon_ExtensionsOptional {
  @scala.inline
  def apply(extensions: graphqlDashComposeLib.libUtilsDefinitionsMod.Extensions = null): Anon_ExtensionsOptional = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions)
    __obj.asInstanceOf[Anon_ExtensionsOptional]
  }
}

