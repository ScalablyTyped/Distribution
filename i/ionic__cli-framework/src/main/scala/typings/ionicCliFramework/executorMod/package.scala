package typings.ionicCliFramework

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object executorMod {
  type HelpRPC[S /* <: typings.ionicCliFramework.helpMod.CommandHelpSchema | typings.ionicCliFramework.helpMod.NamespaceHelpSchema */] = typings.ionicCliFramework.ipcMod.RPC[
    typings.ionicCliFramework.ionicCliFrameworkStrings.help, 
    js.Array[js.Array[java.lang.String]], 
    S
  ]
}
