package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Version extends StObject {
  
  def gc(): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def gc(options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  
  def stat(): js.Promise[RepoPath] = js.native
  def stat(options: js.Object): js.Promise[RepoPath] = js.native
  
  def version(): js.Promise[js.Any] = js.native
  def version(options: js.Object): js.Promise[js.Any] = js.native
}
