package typings.inversify

import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import typings.inversify.interfacesMod.interfaces.TargetType
import typings.inversify.metadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object targetMod {
  
  @JSImport("inversify/dts/planning/target", "Target")
  @js.native
  class Target protected ()
    extends typings.inversify.interfacesMod.interfaces.Target {
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_]) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: String) = this()
    def this(`type`: TargetType, name: String, serviceIdentifier: ServiceIdentifier[_], namedOrTagged: Metadata) = this()
  }
}
