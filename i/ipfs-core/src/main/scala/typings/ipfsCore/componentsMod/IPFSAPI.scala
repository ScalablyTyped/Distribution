package typings.ipfsCore.componentsMod

import typings.ipfsCore.addAllMod.UnixFSEntry
import typings.ipfsCore.addMod.AddOptions
import typings.ipfsCore.anon.Dht
import typings.ipfsCore.anon.Files
import typings.ipfsCore.anon.Ref
import typings.ipfsCore.catMod.CatOptions
import typings.ipfsCore.componentsLsMod.LSOptions
import typings.ipfsCore.componentsVersionMod.Version
import typings.ipfsCore.dagGetMod.GetOptions
import typings.ipfsCore.dnsMod.DNSSettings
import typings.ipfsCore.nameResolveMod.ResolveSettings
import typings.ipfsCore.pingMod.PingFailure
import typings.ipfsCore.pingMod.PingSettings
import typings.ipfsCore.pingMod.Pong
import typings.ipfsCore.pingMod.StatusUpdate
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
trait IPFSAPI extends js.Object {
  
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any
  ): js.Promise[UnixFSEntry] = js.native
  def add(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.FileInput */ js.Any,
    options: AddOptions with AbortOptions
  ): js.Promise[UnixFSEntry] = js.native
  @JSName("add")
  var add_Original: Add_ = js.native
  
  var bitswap: BitSwap_ = js.native
  
  var block: Block_ = js.native
  
  var bootstrap: Bootstrap_ = js.native
  
  def cat(ipfsPath: String): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: String, options: CatOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: typings.cids.mod.^): AsyncIterable[Uint8Array] = js.native
  def cat(ipfsPath: typings.cids.mod.^, options: CatOptions with AbortOptions): AsyncIterable[Uint8Array] = js.native
  @JSName("cat")
  var cat_Original: Cat_ = js.native
  
  var config: Config_ = js.native
  
  var dag: DAG_ = js.native
  
  var dht: DHT_ = js.native
  
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSSettings with AbortOptions): js.Promise[String] = js.native
  @JSName("dns")
  var dns_Original: DNS_ = js.native
  
  var files: Files_ = js.native
  
  def get(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: String, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: typings.cids.mod.^): AsyncIterable[File | Directory] = js.native
  def get(ipfsPath: typings.cids.mod.^, options: GetOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  @JSName("get")
  var get_Original: Get_ = js.native
  
  def id(): js.Promise[typings.ipfsCore.idMod.PeerId] = js.native
  def id(_options: AbortOptions): js.Promise[typings.ipfsCore.idMod.PeerId] = js.native
  @JSName("id")
  var id_Original: ID_ = js.native
  
  def init(): js.Promise[Files] = js.native
  def init(options: js.Any): js.Promise[Files] = js.native
  @JSName("init")
  var init_Original: Init_ = js.native
  
  def isOnline(): Boolean = js.native
  @JSName("isOnline")
  var isOnline_Original: IsOnline_ = js.native
  
  var key: Key_ = js.native
  
  var libp2p: js.Any = js.native
  
  def ls(ipfsPath: String): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: String, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: typings.cids.mod.^): AsyncIterable[File | Directory] = js.native
  def ls(ipfsPath: typings.cids.mod.^, options: LSOptions with AbortOptions): AsyncIterable[File | Directory] = js.native
  @JSName("ls")
  var ls_Original: LS_ = js.native
  
  var name: Name_ = js.native
  
  var `object`: ObjectAPI = js.native
  
  var pin: Pin_ = js.native
  
  def ping(peerId: typings.peerId.mod.^): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  def ping(peerId: typings.peerId.mod.^, options: PingSettings with AbortOptions): AsyncIterable[Pong | PingFailure | StatusUpdate] = js.native
  @JSName("ping")
  var ping_Original: Ping_ = js.native
  
  var pubsub: PubSub_ = js.native
  
  def refs(): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.UndefOr[scala.Nothing], options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  def refs(ipfsPath: js.Any, options: js.Any): AsyncGenerator[Ref, Unit, _] = js.native
  @JSName("refs")
  var refs_Original: Refs_ = js.native
  
  var repo: Repo_ = js.native
  
  def resolve(path: String): js.Promise[String] = js.native
  def resolve(path: String, opts: ResolveSettings with AbortOptions): js.Promise[String] = js.native
  @JSName("resolve")
  var resolve_Original: Resolve_ = js.native
  
  def start(): js.Promise[Dht] = js.native
  @JSName("start")
  var start_Original: Start_ = js.native
  
  var stats: Stats_ = js.native
  
  def stop(_options: AbortOptions): js.Promise[Unit] = js.native
  @JSName("stop")
  var stop_Original: Stop_ = js.native
  
  var swarm: Swarm_ = js.native
  
  def version(): js.Promise[Version] = js.native
  def version(options: AbortOptions): js.Promise[Version] = js.native
  @JSName("version")
  var version_Original: Version_ = js.native
}
