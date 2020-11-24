package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ls extends js.Object {
  
  def ls(args: js.Any*): js.Any = js.native
  
  def peers(args: js.Any*): js.Any = js.native
  
  def publish(): js.Promise[Unit] = js.native
  def publish(topic: js.UndefOr[scala.Nothing], data: js.UndefOr[scala.Nothing], _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.UndefOr[scala.Nothing], data: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.UndefOr[scala.Nothing], data: js.Any, _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.UndefOr[scala.Nothing], _options: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.Any): js.Promise[Unit] = js.native
  def publish(topic: js.Any, data: js.Any, _options: js.Any): js.Promise[Unit] = js.native
  
  def subscribe(args: js.Any*): js.Any = js.native
  
  def unsubscribe(args: js.Any*): js.Any = js.native
}
