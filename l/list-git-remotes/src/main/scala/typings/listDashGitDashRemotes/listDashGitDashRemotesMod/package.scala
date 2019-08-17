package typings.listDashGitDashRemotes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listDashGitDashRemotesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.node.childUnderscoreProcessMod.ExecException

  type Callback = js.Function3[
    /* err */ ExecException | Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  type Remotes = StringDictionary[String]
}
