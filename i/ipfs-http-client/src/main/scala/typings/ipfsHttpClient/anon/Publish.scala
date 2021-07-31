package typings.ipfsHttpClient.anon

import typings.std.AsyncGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Publish extends StObject {
  
  def publish(path: js.Any): js.Promise[js.Any] = js.native
  def publish(path: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  var pubsub: Cancel = js.native
  
  def resolve(path: js.Any): AsyncGenerator[js.Any, Unit, js.Any] = js.native
  def resolve(path: js.Any, options: js.Object): AsyncGenerator[js.Any, Unit, js.Any] = js.native
}
