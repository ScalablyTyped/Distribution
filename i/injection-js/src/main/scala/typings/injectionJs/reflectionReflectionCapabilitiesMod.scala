package typings.injectionJs

import org.scalablytyped.runtime.StringDictionary
import typings.injectionJs.reflectionPlatformReflectionCapabilitiesMod.PlatformReflectionCapabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionReflectionCapabilitiesMod {
  
  @JSImport("injection-js/reflection/reflection_capabilities", "DELEGATE_CTOR")
  @js.native
  val DELEGATE_CTOR: js.RegExp = js.native
  
  @JSImport("injection-js/reflection/reflection_capabilities", "ReflectionCapabilities")
  @js.native
  open class ReflectionCapabilities ()
    extends StObject
       with PlatformReflectionCapabilities {
    def this(reflect: Any) = this()
    
    /* private */ var _ownAnnotations: Any = js.native
    
    /* private */ var _ownParameters: Any = js.native
    
    /* private */ var _ownPropMetadata: Any = js.native
    
    /* private */ var _reflect: Any = js.native
    
    def importUri(`type`: Any): String = js.native
    
    def propMetadata(typeOrFunc: Any): StringDictionary[js.Array[Any]] = js.native
    
    def resourceUri(`type`: Any): String = js.native
  }
}
