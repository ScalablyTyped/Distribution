package typings.libp2pTopology

import typings.libp2pInterfaceRegistrar.mod.Topology
import typings.libp2pInterfaceRegistrar.mod.TopologyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@libp2p/topology", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createTopology(init: TopologyInit): Topology = ^.asInstanceOf[js.Dynamic].applyDynamic("createTopology")(init.asInstanceOf[js.Any]).asInstanceOf[Topology]
}
