package typings.ionic.definitionsMod

import typings.ionic.Anon_IdName
import typings.ionic.Anon_IdNameIntegrationName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterList extends js.Object {
  var integrations: js.Array[Anon_IdNameIntegrationName]
  var starters: js.Array[Anon_IdName]
}

object StarterList {
  @scala.inline
  def apply(integrations: js.Array[Anon_IdNameIntegrationName], starters: js.Array[Anon_IdName]): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations.asInstanceOf[js.Any], starters = starters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StarterList]
  }
}

