package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ls extends StObject {
  
  def ls(args: js.Any*): js.Any = js.native
  
  def peers(args: js.Any*): js.Any = js.native
  
  def publish(): js.Promise[Unit] = js.native
  def publish(topic: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.Any, _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: Unit, _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: Unit, data: js.Any): js.Promise[Unit] = js.native
  def publish(topic: Unit, data: js.Any, _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: Unit, data: Unit, _options: js.Any): js.Promise[Unit] = js.native
  
  def subscribe(args: js.Any*): js.Any = js.native
  
  def unsubscribe(args: js.Any*): js.Any = js.native
}
