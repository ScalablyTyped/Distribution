package typings
package listDashGitDashRemotesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listDashGitDashRemotesMod {
  type Callback = js.Function3[
    /* err */ nodeLib.childUnderscoreProcessMod.ExecException | scala.Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type Remotes = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
