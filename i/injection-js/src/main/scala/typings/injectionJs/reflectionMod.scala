package typings.injectionJs

import typings.injectionJs.platformReflectionCapabilitiesMod.PlatformReflectionCapabilities
import typings.injectionJs.reflectorMod.Reflector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionMod {
  
  @JSImport("injection-js/reflection/reflection", "Reflector")
  @js.native
  open class Reflector_ protected () extends Reflector {
    def this(reflectionCapabilities: PlatformReflectionCapabilities) = this()
  }
  
  @JSImport("injection-js/reflection/reflection", "reflector")
  @js.native
  val reflector: Reflector = js.native
}
