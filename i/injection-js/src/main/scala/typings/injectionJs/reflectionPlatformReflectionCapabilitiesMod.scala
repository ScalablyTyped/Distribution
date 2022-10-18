package typings.injectionJs

import org.scalablytyped.runtime.StringDictionary
import typings.injectionJs.facadeTypeMod.Type
import typings.injectionJs.reflectionTypesMod.GetterFn
import typings.injectionJs.reflectionTypesMod.MethodFn
import typings.injectionJs.reflectionTypesMod.SetterFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionPlatformReflectionCapabilitiesMod {
  
  @js.native
  trait PlatformReflectionCapabilities extends StObject {
    
    def annotations(`type`: Type[Any]): js.Array[Any] = js.native
    
    def factory(`type`: Type[Any]): js.Function = js.native
    
    def getter(name: String): GetterFn = js.native
    
    def hasLifecycleHook(`type`: Any, lcProperty: String): Boolean = js.native
    
    def importUri(`type`: Type[Any]): String = js.native
    
    def isReflectionEnabled(): Boolean = js.native
    
    def method(name: String): MethodFn = js.native
    
    def parameters(`type`: Type[Any]): js.Array[js.Array[Any]] = js.native
    
    def propMetadata(typeOrFunc: Type[Any]): StringDictionary[js.Array[Any]] = js.native
    
    def resolveEnum(enumIdentifier: Any, name: String): Any = js.native
    
    def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: Any): Any = js.native
    def resolveIdentifier(name: String, moduleUrl: String, members: Null, runtime: Any): Any = js.native
    
    def resourceUri(`type`: Type[Any]): String = js.native
    
    def setter(name: String): SetterFn = js.native
  }
}
