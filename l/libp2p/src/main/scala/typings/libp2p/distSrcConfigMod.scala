package typings.libp2p

import typings.libp2p.mod.Libp2pInit
import typings.libp2pInterfaceLibp2p.mod.ServiceMap
import typings.libp2pInterfaces.mod.RecursivePartial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConfigMod {
  
  @JSImport("libp2p/dist/src/config", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateConfig[T /* <: ServiceMap */](opts: RecursivePartial[Libp2pInit[T]]): Libp2pInit[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("validateConfig")(opts.asInstanceOf[js.Any]).asInstanceOf[Libp2pInit[T]]
}
