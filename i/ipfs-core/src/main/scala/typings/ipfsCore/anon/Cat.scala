package typings.ipfsCore.anon

import typings.cids.mod.^
import typings.ipfsCore.catMod.CatOptions
import typings.ipfsCore.componentsLsMod.LSOptions
import typings.ipfsCore.componentsVersionMod.Version
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dnsMod.DNSSettings
import typings.ipfsCore.filesMod.MFS
import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.srcUtilsMod.AbortOptions
import typings.ipfsCore.srcUtilsMod.Directory
import typings.ipfsCore.srcUtilsMod.File
import typings.std.AsyncGenerator
import typings.std.AsyncIterable
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cat extends js.Object {
  
  var add: js.Any = js.native
  
  var addAll: js.Any = js.native
  
  var bitswap: Stat = js.native
  
  var block: js.Any = js.native
  
  var bootstrap: Add = js.native
  
  def cat(ipfsPath: String): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: String, options: CatOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: ^): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: ^, options: CatOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  
  var config: typings.ipfsCore.configMod.Config = js.native
  
  var dag: js.Any = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  
  var files: MFS = js.native
  
  def get(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: String, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: ^, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  def id(): js.Promise[typings.ipfsCore.idMod.PeerId] = js.native
  def id(_options: AbortOptions): js.Promise[typings.ipfsCore.idMod.PeerId] = js.native
  
  def init(): js.Promise[scala.Nothing] = js.native
  
  def isOnline(): Boolean = js.native
  
  var key: Export = js.native
  
  def ls(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: String, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: ^, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  
  var `object`: js.Any = js.native
  
  var pin: js.Any = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  @JSName("refs")
  var refs_Original: (js.Function2[
    /* ipfsPath */ js.UndefOr[js.Any], 
    /* options */ js.UndefOr[js.Any], 
    AsyncGenerator[Ref, Unit, _]
  ]) with Local = js.native
  
  var repo: Gc = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(path: String, opts: ResolveSettings with AbortOptions): js.Promise[String] = js.native
  
  def start(): js.Promise[Bootstrap] = js.native
  
  var stats: BitswapBw = js.native
  
  def stop(): Unit = js.native
  
  var swarm: Disconnect = js.native
  
  def version(): js.Promise[Version] = js.native
  def version(options: AbortOptions): js.Promise[Version] = js.native
}
