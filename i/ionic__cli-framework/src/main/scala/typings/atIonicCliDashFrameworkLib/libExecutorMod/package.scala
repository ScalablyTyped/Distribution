package typings
package atIonicCliDashFrameworkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libExecutorMod {
  type HelpRPC[S /* <: atIonicCliDashFrameworkLib.libHelpMod.CommandHelpSchema | atIonicCliDashFrameworkLib.libHelpMod.NamespaceHelpSchema */] = atIonicCliDashFrameworkLib.utilsIpcMod.RPC[
    atIonicCliDashFrameworkLib.atIonicCliDashFrameworkLibStrings.help, 
    js.Array[js.Array[java.lang.String]], 
    S
  ]
}
