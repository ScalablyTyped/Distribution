package typings.ipfsHttpClient.anon

import typings.cids.mod.^
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  def data(cid: js.Any): js.Promise[Uint8Array] = js.native
  def data(cid: js.Any, options: js.Object): js.Promise[Uint8Array] = js.native
  
  def get(cid: js.Any): js.Promise[js.Any] = js.native
  def get(cid: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def links(cid: js.Any): js.Promise[js.Any] = js.native
  def links(cid: js.Any, options: js.Object): js.Promise[js.Any] = js.native
  
  def `new`(): js.Promise[^] = js.native
  def `new`(options: js.Object): js.Promise[^] = js.native
  
  var patch: AddLink = js.native
  
  def put(obj: js.Any): js.Promise[^] = js.native
  def put(obj: js.Any, options: js.Object): js.Promise[^] = js.native
  
  def stat(cid: js.Any): js.Promise[js.Any] = js.native
  def stat(cid: js.Any, options: js.Object): js.Promise[js.Any] = js.native
}
