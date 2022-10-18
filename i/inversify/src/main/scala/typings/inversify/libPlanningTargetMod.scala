package typings.inversify

import typings.inversify.libInterfacesInterfacesMod.interfaces.ServiceIdentifier
import typings.inversify.libInterfacesInterfacesMod.interfaces.TargetType
import typings.inversify.libPlanningMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlanningTargetMod {
  
  @JSImport("inversify/lib/planning/target", "Target")
  @js.native
  open class Target protected ()
    extends StObject
       with typings.inversify.libInterfacesInterfacesMod.interfaces.Target {
    def this(`type`: TargetType, identifier: String, serviceIdentifier: ServiceIdentifier[Any]) = this()
    def this(`type`: TargetType, identifier: js.Symbol, serviceIdentifier: ServiceIdentifier[Any]) = this()
    def this(
      `type`: TargetType,
      identifier: String,
      serviceIdentifier: ServiceIdentifier[Any],
      namedOrTagged: String
    ) = this()
    def this(
      `type`: TargetType,
      identifier: String,
      serviceIdentifier: ServiceIdentifier[Any],
      namedOrTagged: Metadata
    ) = this()
    def this(
      `type`: TargetType,
      identifier: js.Symbol,
      serviceIdentifier: ServiceIdentifier[Any],
      namedOrTagged: String
    ) = this()
    def this(
      `type`: TargetType,
      identifier: js.Symbol,
      serviceIdentifier: ServiceIdentifier[Any],
      namedOrTagged: Metadata
    ) = this()
    
    var key: String | js.Symbol = js.native
  }
}
