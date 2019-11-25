package typings.graphqlDashCompose

import typings.graphqlDashCompose.esmUtilsDefinitionsMod.Extensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Extensions extends js.Object {
  var extensions: js.UndefOr[Extensions] = js.undefined
}

object Anon_Extensions {
  @scala.inline
  def apply(extensions: Extensions = null): Anon_Extensions = {
    val __obj = js.Dynamic.literal()
    if (extensions != null) __obj.updateDynamic("extensions")(extensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Extensions]
  }
}

