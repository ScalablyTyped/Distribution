package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait State extends StObject {
  
  def cancel(name: js.Any): js.Promise[js.Any] = js.native
  def cancel(name: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def state(): js.Promise[js.Any] = js.native
  def state(options: js.Object): js.Promise[js.Any] = js.native
  
  def subs(): js.Promise[js.Any] = js.native
  def subs(options: js.Object): js.Promise[js.Any] = js.native
}
