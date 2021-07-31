package typings.ipfsCli.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Get extends StObject {
  
  def data(): js.Promise[js.Any] = js.native
  def data(multihash: js.Any): js.Promise[js.Any] = js.native
  def data(multihash: js.Any, options: js.Any): js.Promise[js.Any] = js.native
  def data(multihash: Unit, options: js.Any): js.Promise[js.Any] = js.native
  
  def get(): js.Promise[js.Any] = js.native
  def get(multihash: js.Any): js.Promise[js.Any] = js.native
  def get(multihash: js.Any, options: js.Any): js.Promise[js.Any] = js.native
  def get(multihash: Unit, options: js.Any): js.Promise[js.Any] = js.native
  
  def links(): js.Promise[js.Any] = js.native
  def links(multihash: js.Any): js.Promise[js.Any] = js.native
  def links(multihash: js.Any, options: js.Any): js.Promise[js.Any] = js.native
  def links(multihash: Unit, options: js.Any): js.Promise[js.Any] = js.native
  
  def `new`(): js.Promise[js.Any] = js.native
  def `new`(options: js.Any): js.Promise[js.Any] = js.native
  
  var patch: AddLink = js.native
  
  def put(): js.Promise[js.Any] = js.native
  def put(obj: js.Any): js.Promise[js.Any] = js.native
  def put(obj: js.Any, options: js.Any): js.Promise[js.Any] = js.native
  def put(obj: Unit, options: js.Any): js.Promise[js.Any] = js.native
  
  def stat(): js.Promise[BlockSize] = js.native
  def stat(multihash: js.Any): js.Promise[BlockSize] = js.native
  def stat(multihash: js.Any, options: js.Any): js.Promise[BlockSize] = js.native
  def stat(multihash: Unit, options: js.Any): js.Promise[BlockSize] = js.native
}
