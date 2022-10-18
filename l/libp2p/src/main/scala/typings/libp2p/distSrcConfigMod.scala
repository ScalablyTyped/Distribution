package typings.libp2p

import typings.libp2p.anon.RecursivePartialLibp2pIni
import typings.libp2p.mod.Libp2pInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  @JSImport("libp2p/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateConfig(opts: RecursivePartialLibp2pIni): Libp2pInit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(opts.asInstanceOf[js.Any]).asInstanceOf[Libp2pInit]
}
