package typings.ipfsCore.anon

import typings.ipfsCore.gcMod.BlockID
import typings.ipfsCore.gcMod.Err
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Gc extends js.Object {
  
  def gc(): AsyncIterable[Err | BlockID] = js.native
  def gc(_options: AbortOptions): AsyncIterable[Err | BlockID] = js.native
  
  def stat(): js.Promise[NumObjects] = js.native
  def stat(options: js.Any): js.Promise[NumObjects] = js.native
  
  def version(): js.Promise[_] = js.native
  def version(options: js.Any): js.Promise[_] = js.native
}
