package typings
package jsDashGitLib.JSGitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Remote extends js.Object {
  var hostname: java.lang.String = js.native
  var pathname: java.lang.String = js.native
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  def discover(callback: js.Function2[/* err */ js.Any, /* refs */ StringMap, scala.Unit]): scala.Unit = js.native
  def fetch(repo: Repo, opts: js.Object, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
}

