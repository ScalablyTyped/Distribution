package typings.ipfsCli.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Call extends StObject {
  
  def apply(args: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def apply(args: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  
  def local(): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def local(options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
}
