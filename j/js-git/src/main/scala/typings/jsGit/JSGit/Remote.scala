package typings.jsGit.JSGit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Remote extends js.Object {
  
  def close(): Unit = js.native
  def close(callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def discover(callback: js.Function2[/* err */ js.Any, /* refs */ StringMap, Unit]): Unit = js.native
  
  def fetch(repo: Repo, opts: js.Object, callback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  var hostname: String = js.native
  
  var pathname: String = js.native
}
