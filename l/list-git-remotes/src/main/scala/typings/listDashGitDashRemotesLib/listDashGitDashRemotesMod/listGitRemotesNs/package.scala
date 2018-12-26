package typings
package listDashGitDashRemotesLib.listDashGitDashRemotesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listGitRemotesNs {
  type Callback = js.Function3[
    /* err */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
}
