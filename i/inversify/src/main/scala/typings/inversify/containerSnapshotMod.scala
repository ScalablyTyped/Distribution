package typings.inversify

import typings.inversify.interfacesMod.interfaces.Binding
import typings.inversify.interfacesMod.interfaces.Lookup
import typings.inversify.interfacesMod.interfaces.Next
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerSnapshotMod {
  
  @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot")
  @js.native
  class ContainerSnapshot ()
    extends typings.inversify.interfacesMod.interfaces.ContainerSnapshot
  object ContainerSnapshot {
    
    /* static member */
    @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot.of")
    @js.native
    def of(bindings: Lookup[Binding[_]]): ContainerSnapshot = js.native
    @JSImport("inversify/dts/container/container_snapshot", "ContainerSnapshot.of")
    @js.native
    def of(bindings: Lookup[Binding[_]], middleware: Next): ContainerSnapshot = js.native
  }
}
