package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Level extends StObject {
  
  def level(subsystem: js.Any, level: js.Any): js.Promise[js.Any] = js.native
  def level(subsystem: js.Any, level: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def ls(): js.Promise[js.Any] = js.native
  def ls(options: js.Object): js.Promise[js.Any] = js.native
  
  def tail(): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def tail(options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
}
