package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends StObject {
  
  def addrs(): js.Promise[js.Array[AddrsId]] = js.native
  def addrs(options: js.Object): js.Promise[js.Array[AddrsId]] = js.native
  
  def connect(addrs: js.Any): js.Promise[js.Any] = js.native
  def connect(addrs: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def disconnect(addrs: js.Any): js.Promise[js.Any] = js.native
  def disconnect(addrs: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def localAddrs(): js.Promise[js.Any] = js.native
  def localAddrs(options: js.Object): js.Promise[js.Any] = js.native
  
  def peers(): js.Promise[js.Any] = js.native
  def peers(options: js.Object): js.Promise[js.Any] = js.native
}
