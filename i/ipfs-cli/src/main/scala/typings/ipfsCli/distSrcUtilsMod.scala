package typings.ipfsCli

import typings.ipfsCli.anon.Cleanup
import typings.ipfsCli.anon.Migrate
import typings.ipfsCli.anon.Nsecs
import typings.ipfsCli.distSrcTypesMod.Print
import typings.libp2pInterfacePeerId.mod.PeerId
import typings.multiformats.cidMod.CID
import typings.multiformats.distTypesSrcLinkInterfaceMod.Version
import typings.multiformatsMultiaddr.mod.Multiaddr_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUtilsMod {
  
  @JSImport("ipfs-cli/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asBoolean(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asBoolean")().asInstanceOf[Boolean]
  inline def asBoolean(value: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("asBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def asMtimeFromSeconds(): js.UndefOr[Nsecs] = ^.asInstanceOf[js.Dynamic].applyDynamic("asMtimeFromSeconds")().asInstanceOf[js.UndefOr[Nsecs]]
  inline def asMtimeFromSeconds(secs: Double): js.UndefOr[Nsecs] = ^.asInstanceOf[js.Dynamic].applyDynamic("asMtimeFromSeconds")(secs.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Nsecs]]
  inline def asMtimeFromSeconds(secs: Double, nsecs: Double): js.UndefOr[Nsecs] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMtimeFromSeconds")(secs.asInstanceOf[js.Any], nsecs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Nsecs]]
  inline def asMtimeFromSeconds(secs: Unit, nsecs: Double): js.UndefOr[Nsecs] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMtimeFromSeconds")(secs.asInstanceOf[js.Any], nsecs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Nsecs]]
  
  inline def asOctal(value: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asOctal")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def coerceCID(value: Any): js.UndefOr[CID[Any, Double, Double, Version]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceCID")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[CID[Any, Double, Double, Version]]]
  
  inline def coerceCIDs(values: js.Array[String]): js.Array[js.UndefOr[CID[Any, Double, Double, Version]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceCIDs")(values.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.UndefOr[CID[Any, Double, Double, Version]]]]
  
  inline def coerceMtime(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMtime")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def coerceMtimeNsecs(value: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMtimeNsecs")(value.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def coerceMultiaddr(value: String): js.UndefOr[Multiaddr_] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMultiaddr")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Multiaddr_]]
  
  inline def coerceMultiaddrs(values: js.Array[String]): js.UndefOr[js.Array[js.UndefOr[Multiaddr_]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMultiaddrs")(values.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Array[js.UndefOr[Multiaddr_]]]]
  
  inline def coercePeerId(): js.UndefOr[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("coercePeerId")().asInstanceOf[js.UndefOr[PeerId]]
  inline def coercePeerId(value: String): js.UndefOr[PeerId] = ^.asInstanceOf[js.Dynamic].applyDynamic("coercePeerId")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[PeerId]]
  
  inline def coerceUint8Array(value: String): js.UndefOr[js.typedarray.Uint8Array] = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceUint8Array")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.typedarray.Uint8Array]]
  
  inline def createProgressBar(totalBytes: Double): typings.progress.mod.^ = ^.asInstanceOf[js.Dynamic].applyDynamic("createProgressBar")(totalBytes.asInstanceOf[js.Any]).asInstanceOf[typings.progress.mod.^]
  inline def createProgressBar(totalBytes: Double, output: Any): typings.progress.mod.^ = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgressBar")(totalBytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[typings.progress.mod.^]
  
  inline def disablePrinting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePrinting")().asInstanceOf[Unit]
  
  inline def escapeControlCharacters(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("escapeControlCharacters")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getIpfs(argv: Migrate): js.Promise[Cleanup] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpfs")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cleanup]]
  
  inline def getRepoPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepoPath")().asInstanceOf[String]
  
  @JSImport("ipfs-cli/dist/src/utils", "ipfsPathHelp")
  @js.native
  val ipfsPathHelp: /* ipfs uses a repository in the local file system. By default, the repo is located at ~/.jsipfs. To change the repo location, set the $IPFS_PATH environment variable: `export IPFS_PATH=/path/to/ipfsrepo` */ String = js.native
  
  inline def isDaemonOn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDaemonOn")().asInstanceOf[Boolean]
  
  inline def makeEntriesPrintable(
    obj: Any,
    cidBase: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_interface.MultibaseCodec<any> */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEntriesPrintable")(obj.asInstanceOf[js.Any], cidBase.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @JSImport("ipfs-cli/dist/src/utils", "print")
  @js.native
  val print: Print = js.native
  
  inline def rightpad(`val`: Any, n: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightpad")(`val`.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def stripControlCharacters(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripControlCharacters")().asInstanceOf[String]
  inline def stripControlCharacters(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripControlCharacters")(str.asInstanceOf[js.Any]).asInstanceOf[String]
}
