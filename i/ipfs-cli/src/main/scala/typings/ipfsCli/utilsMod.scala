package typings.ipfsCli

import typings.ipfsCli.anon.Cleanup
import typings.ipfsCli.anon.CleanupIpfs
import typings.ipfsCli.anon.Secs
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("ipfs-cli/dist/src/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def asBoolean(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("asBoolean")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def asMtimeFromSeconds(secs: js.Any, nsecs: js.Any): js.UndefOr[Secs] = (^.asInstanceOf[js.Dynamic].applyDynamic("asMtimeFromSeconds")(secs.asInstanceOf[js.Any], nsecs.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Secs]]
  
  inline def asOctal(value: js.Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("asOctal")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def coerceMtime(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMtime")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def coerceMtimeNsecs(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("coerceMtimeNsecs")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def createProgressBar(totalBytes: js.Any, output: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createProgressBar")(totalBytes.asInstanceOf[js.Any], output.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def disablePrinting(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disablePrinting")().asInstanceOf[Unit]
  
  inline def getIpfs(argv: js.Any): js.Promise[Cleanup | CleanupIpfs] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpfs")(argv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Cleanup | CleanupIpfs]]
  
  inline def getRepoPath(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRepoPath")().asInstanceOf[String]
  
  @JSImport("ipfs-cli/dist/src/utils", "ipfsPathHelp")
  @js.native
  val ipfsPathHelp: String = js.native
  
  inline def isDaemonOn(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDaemonOn")().asInstanceOf[Boolean]
  
  object print {
    
    inline def apply(msg: String): Unit = ^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def apply(msg: String, includeNewline: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], includeNewline.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(msg: String, includeNewline: Boolean, isError: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], includeNewline.asInstanceOf[js.Any], isError.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def apply(msg: String, includeNewline: Unit, isError: Boolean): Unit = (^.asInstanceOf[js.Dynamic].apply(msg.asInstanceOf[js.Any], includeNewline.asInstanceOf[js.Any], isError.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ipfs-cli/dist/src/utils", "print")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clearLine(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("clearLine")().asInstanceOf[Boolean]
    
    @JSImport("ipfs-cli/dist/src/utils", "print.columns")
    @js.native
    val columns: Double = js.native
    
    inline def cursorTo(pos: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cursorTo")(pos.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def error(msg: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def error(msg: String, newline: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("error")(msg.asInstanceOf[js.Any], newline.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("ipfs-cli/dist/src/utils", "print.isTTY")
    @js.native
    val isTTY: Boolean = js.native
    
    inline def write(data: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def write(data: Uint8Array): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("write")(data.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def rightpad(`val`: js.Any, n: js.Any): String = (^.asInstanceOf[js.Dynamic].applyDynamic("rightpad")(`val`.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[String]
}
