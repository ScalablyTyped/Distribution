package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends js.Object {
  
  def addrs(): js.Promise[js.Array[AddrsAny]] = js.native
  def addrs(options: js.Any): js.Promise[js.Array[AddrsAny]] = js.native
  
  def connect(): js.Any = js.native
  def connect(addr: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def connect(addr: js.Any): js.Any = js.native
  def connect(addr: js.Any, options: js.Any): js.Any = js.native
  
  def disconnect(): js.Any = js.native
  def disconnect(addr: js.UndefOr[scala.Nothing], options: js.Any): js.Any = js.native
  def disconnect(addr: js.Any): js.Any = js.native
  def disconnect(addr: js.Any, options: js.Any): js.Any = js.native
  
  def localAddrs(): js.Promise[_] = js.native
  
  def peers(): js.Promise[js.Array[Addr]] = js.native
  def peers(options: js.Any): js.Promise[js.Array[Addr]] = js.native
}
