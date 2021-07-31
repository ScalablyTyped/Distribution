package typings.inversify

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.TargetType
import typings.inversify.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetMod {
  
  @JSImport("inversify/dts/planning/target", "Target")
  @js.native
  class Target protected ()
    extends StObject
       with typings.inversify.interfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[js.Any]) = this()
    def this(
      `type`: TargetType,
      name: String,
      serviceIdentifier: ServiceIdentifier[js.Any],
      namedOrTagged: String
    ) = this()
    def this(
      `type`: TargetType,
      name: String,
      serviceIdentifier: ServiceIdentifier[js.Any],
      namedOrTagged: Metadata
    ) = this()
  }
}
