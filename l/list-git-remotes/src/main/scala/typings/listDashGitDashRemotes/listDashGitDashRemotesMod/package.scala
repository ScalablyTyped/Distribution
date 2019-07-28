package typings.listDashGitDashRemotes

import org.scalablytyped.runtime.StringDictionary
import typings.node.childUnderscoreProcessMod.ExecException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object listDashGitDashRemotesMod {
  type Callback = js.Function3[
    /* err */ ExecException | Null, 
    /* remotes */ Remotes, 
    /* stderr */ js.UndefOr[String], 
    Unit
  ]
  type Remotes = StringDictionary[String]
}
