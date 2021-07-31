package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ls extends StObject {
  
  def ls(): js.Promise[js.Any] = js.native
  def ls(options: js.Object): js.Promise[js.Any] = js.native
  
  def peers(topic: js.Any): js.Promise[js.Any] = js.native
  def peers(topic: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def publish(topic: js.Any, data: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.Any, options: js.Object): js.Promise[Unit] = js.native
  
  def subscribe(topic: js.Any, handler: js.Any): js.Promise[js.Any] = js.native
  def subscribe(topic: js.Any, handler: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def unsubscribe(topic: js.Any, handler: js.Any): js.Promise[js.Any] = js.native
}
