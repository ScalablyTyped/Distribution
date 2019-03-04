package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StarterList extends js.Object {
  var integrations: js.Array[ionicLib.Anon_IdNameIntegrationName]
  var starters: js.Array[ionicLib.Anon_IdName]
}

object StarterList {
  @scala.inline
  def apply(
    integrations: js.Array[ionicLib.Anon_IdNameIntegrationName],
    starters: js.Array[ionicLib.Anon_IdName]
  ): StarterList = {
    val __obj = js.Dynamic.literal(integrations = integrations, starters = starters)
  
    __obj.asInstanceOf[StarterList]
  }
}

