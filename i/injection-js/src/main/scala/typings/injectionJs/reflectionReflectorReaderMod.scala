package typings.injectionJs

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reflectionReflectorReaderMod {
  
  /* note: abstract class */ @JSImport("injection-js/reflection/reflector_reader", "ReflectorReader")
  @js.native
  open class ReflectorReader () extends StObject {
    
    def annotations(typeOrFunc: Any): js.Array[Any] = js.native
    
    def importUri(typeOrFunc: Any): String | Null = js.native
    
    def parameters(typeOrFunc: Any): js.Array[js.Array[Any]] = js.native
    
    def propMetadata(typeOrFunc: Any): StringDictionary[js.Array[Any]] = js.native
    
    def resolveEnum(identifier: Any, name: String): Any = js.native
    
    def resolveIdentifier(name: String, moduleUrl: String, members: js.Array[String], runtime: Any): Any = js.native
    
    def resourceUri(typeOrFunc: Any): String = js.native
  }
}
