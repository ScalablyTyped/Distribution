package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INamespace
  extends atIonicCliDashFrameworkLib.definitionsMod.INamespace[
      ICommand, 
      INamespace, 
      CommandMetadata, 
      atIonicCliDashFrameworkLib.definitionsMod.CommandMetadataInput, 
      CommandMetadataOption
    ] {
  var env: IonicEnvironment
  var project: js.UndefOr[IProject] = js.undefined
}

