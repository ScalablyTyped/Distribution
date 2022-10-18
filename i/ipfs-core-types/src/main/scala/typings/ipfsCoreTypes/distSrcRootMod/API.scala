package typings.ipfsCoreTypes.distSrcRootMod

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.ipfsCoreTypes.distSrcUtilsMod.IPFSPath
import typings.ipfsCoreTypes.distSrcUtilsMod.ImportCandidate
import typings.ipfsCoreTypes.distSrcUtilsMod.ImportCandidateStream
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait API[OptionExtension] extends StObject {
  
  /**
    * Import a file or data into IPFS
    */
  def add(entry: ImportCandidate): js.Promise[AddResult] = js.native
  def add(entry: ImportCandidate, options: AddOptions & OptionExtension): js.Promise[AddResult] = js.native
  
  /**
    * Import multiple files and data into IPFS
    */
  def addAll(source: ImportCandidateStream): AsyncIterable[AddResult] = js.native
  def addAll(source: ImportCandidateStream, options: AddAllOptions & AbortOptions & OptionExtension): AsyncIterable[AddResult] = js.native
  
  /**
    * Returns content of the file addressed by a valid IPFS Path or CID
    */
  def cat(ipfsPath: IPFSPath): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def cat(ipfsPath: IPFSPath, options: CatOptions & OptionExtension): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  /**
    * Returns a list of available commands
    */
  def commands(): js.Promise[js.Array[String]] = js.native
  def commands(options: AbortOptions & OptionExtension): js.Promise[js.Array[String]] = js.native
  
  /**
    * Resolve DNS links
    */
  def dns(domain: String): js.Promise[String] = js.native
  def dns(domain: String, options: DNSOptions & OptionExtension): js.Promise[String] = js.native
  
  /**
    * Fetch a file or an entire directory tree from IPFS that is addressed by a
    * valid IPFS Path
    */
  def get(ipfsPath: IPFSPath): AsyncIterable[js.typedarray.Uint8Array] = js.native
  def get(ipfsPath: IPFSPath, options: GetOptions & OptionExtension): AsyncIterable[js.typedarray.Uint8Array] = js.native
  
  /**
    * Returns the identity of the Peer
    *
    * @example
    * ```js
    * const identity = await ipfs.id()
    * console.log(identity)
    * ```
    */
  def id(): js.Promise[IDResult] = js.native
  def id(options: IDOptions & OptionExtension): js.Promise[IDResult] = js.native
  
  /**
    * Returns true if this IPFS node is online - that is, it's listening on network addresses
    * for incoming connections
    */
  def isOnline(): Boolean = js.native
  
  /**
    * Lists a directory from IPFS that is addressed by a valid IPFS Path
    */
  def ls(ipfsPath: IPFSPath): AsyncIterable[IPFSEntry] = js.native
  def ls(ipfsPath: IPFSPath, options: ListOptions & OptionExtension): AsyncIterable[IPFSEntry] = js.native
  
  def mount(): js.Promise[MountResult] = js.native
  def mount(options: MountOptions & OptionExtension): js.Promise[MountResult] = js.native
  
  /**
    * Send echo request packets to IPFS hosts.
    *
    * @example
    * ```js
    * for await (const res of ipfs.ping('Qmhash')) {
    *   if (res.time) {
    *     console.log(`Pong received: time=${res.time} ms`)
    *   } else {
    *     console.log(res.text)
    *   }
    * }
    * ```
    */
  def ping(peerId: PeerId): AsyncIterable[PingResult] = js.native
  def ping(peerId: PeerId, options: PingOptions & OptionExtension): AsyncIterable[PingResult] = js.native
  
  /**
    * Resolve the value of names to IPFS
    *
    * There are a number of mutable name protocols that can link among themselves
    * and into IPNS. For example IPNS references can (currently) point at an IPFS
    * object, and DNS links can point at other DNS links, IPNS entries, or IPFS
    * objects. This command accepts any of these identifiers and resolves them
    * to the referenced item.
    *
    * @example
    * ```js
    * // Resolve the value of your identity:
    * const name = '/ipns/QmatmE9msSfkKxoffpHwNLNKgwZG8eT9Bud6YoPab52vpy'
    *
    * const res = await ipfs.resolve(name)
    * console.log(res)
    * // Logs: /ipfs/Qmcqtw8FfrVSBaRmbWwHxt3AuySBhJLcvmFYi3Lbc4xnwj
    *
    * // Resolve the value of another name recursively:
    * const name = '/ipns/QmbCMUZw6JFeZ7Wp9jkzbye3Fzp2GGcPgC3nmeUjfVF87n'
    *
    * // Where:
    * // /ipns/QmbCMUZw6JFeZ7Wp9jkzbye3Fzp2GGcPgC3nmeUjfVF87n
    * // ...resolves to:
    * // /ipns/QmatmE9msSfkKxoffpHwNLNKgwZG8eT9Bud6YoPab52vpy
    * // ...which in turn resolves to:
    * // /ipfs/Qmcqtw8FfrVSBaRmbWwHxt3AuySBhJLcvmFYi3Lbc4xnwj
    *
    * const res = await ipfs.resolve(name, { recursive: true })
    * console.log(res)
    * // Logs: /ipfs/Qmcqtw8FfrVSBaRmbWwHxt3AuySBhJLcvmFYi3Lbc4xnwj
    *
    * // Resolve the value of an IPFS path:
    * const name = '/ipfs/QmeZy1fGbwgVSrqbfh9fKQrAWgeyRnj7h8fsHS1oy3k99x/beep/boop'
    * const res = await ipfs.resolve(name)
    * console.log(res)
    * // Logs: /ipfs/QmYRMjyvAiHKN9UTi8Bzt1HUspmSRD8T8DwxfSMzLgBon1
    * ```
    */
  def resolve(name: String): js.Promise[String] = js.native
  def resolve(name: String, options: ResolveOptions & OptionExtension): js.Promise[String] = js.native
  
  /**
    * Start the node
    */
  def start(): js.Promise[Unit] = js.native
  
  /**
    * Stop the node
    */
  def stop(): js.Promise[Unit] = js.native
  def stop(options: AbortOptions & OptionExtension): js.Promise[Unit] = js.native
  
  /**
    * Returns the implementation version
    *
    * @example
    * ```js
    * const version = await ipfs.version()
    * console.log(version)
    * ```
    */
  def version(): js.Promise[VersionResult] = js.native
  def version(options: AbortOptions & OptionExtension): js.Promise[VersionResult] = js.native
}
