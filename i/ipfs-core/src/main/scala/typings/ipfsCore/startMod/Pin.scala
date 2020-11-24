package typings.ipfsCore.startMod

import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.pinAddAllMod.AddSettings
import typings.ipfsCore.pinLsMod.LsEntry
import typings.ipfsCore.pinLsMod.LsSettings
import typings.ipfsCore.pinRmMod.RmSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pin extends js.Object {
  
  def add(path: String): js.Promise[typings.cids.mod.^] = js.native
  def add(path: String, options: AddOptions with AbortOptions): js.Promise[typings.cids.mod.^] = js.native
  def add(path: typings.cids.mod.^): js.Promise[typings.cids.mod.^] = js.native
  def add(path: typings.cids.mod.^, options: AddOptions with AbortOptions): js.Promise[typings.cids.mod.^] = js.native
  
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any
  ): AsyncIterable[typings.cids.mod.^] = js.native
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any,
    options: AddSettings with AbortOptions
  ): AsyncIterable[typings.cids.mod.^] = js.native
  
  def ls(): AsyncIterable[LsEntry] = js.native
  def ls(options: LsSettings with AbortOptions): AsyncIterable[LsEntry] = js.native
  
  def rm(path: String): js.Promise[typings.cids.mod.^] = js.native
  def rm(path: String, options: RmSettings with AbortOptions): js.Promise[typings.cids.mod.^] = js.native
  def rm(path: typings.cids.mod.^): js.Promise[typings.cids.mod.^] = js.native
  def rm(path: typings.cids.mod.^, options: RmSettings with AbortOptions): js.Promise[typings.cids.mod.^] = js.native
}
