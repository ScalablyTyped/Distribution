package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Connect extends StObject {
  
  def addrs(): js.Promise[js.Array[AddrsId]] = js.native
  def addrs(options: js.Any): js.Promise[js.Array[AddrsId]] = js.native
  
  def connect(): js.Any = js.native
  def connect(addr: js.Any): js.Any = js.native
  def connect(addr: js.Any, options: js.Any): js.Any = js.native
  def connect(addr: Unit, options: js.Any): js.Any = js.native
  
  def disconnect(): js.Any = js.native
  def disconnect(addr: js.Any): js.Any = js.native
  def disconnect(addr: js.Any, options: js.Any): js.Any = js.native
  def disconnect(addr: Unit, options: js.Any): js.Any = js.native
  
  def localAddrs(): js.Promise[js.Any] = js.native
  
  def peers(): js.Promise[js.Array[Addr]] = js.native
  def peers(options: js.Any): js.Promise[js.Array[Addr]] = js.native
}
