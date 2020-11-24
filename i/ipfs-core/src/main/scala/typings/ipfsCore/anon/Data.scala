package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends js.Object {
  
  def data(): js.Promise[_] = js.native
  def data(multihash: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[_] = js.native
  def data(multihash: js.Any): js.Promise[_] = js.native
  def data(multihash: js.Any, options: js.Any): js.Promise[_] = js.native
  
  def get(): js.Promise[_] = js.native
  def get(multihash: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[_] = js.native
  def get(multihash: js.Any): js.Promise[_] = js.native
  def get(multihash: js.Any, options: js.Any): js.Promise[_] = js.native
  
  def links(): js.Promise[_] = js.native
  def links(multihash: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[_] = js.native
  def links(multihash: js.Any): js.Promise[_] = js.native
  def links(multihash: js.Any, options: js.Any): js.Promise[_] = js.native
  
  def `new`(): js.Promise[_] = js.native
  def `new`(options: js.Any): js.Promise[_] = js.native
  
  var patch: AddLink = js.native
  
  def put(): js.Promise[_] = js.native
  def put(obj: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[_] = js.native
  def put(obj: js.Any): js.Promise[_] = js.native
  def put(obj: js.Any, options: js.Any): js.Promise[_] = js.native
  
  def stat(): js.Promise[BlockSize] = js.native
  def stat(multihash: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[BlockSize] = js.native
  def stat(multihash: js.Any): js.Promise[BlockSize] = js.native
  def stat(multihash: js.Any, options: js.Any): js.Promise[BlockSize] = js.native
}
