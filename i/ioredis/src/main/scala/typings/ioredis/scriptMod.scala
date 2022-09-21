package typings.ioredis

import typings.ioredis.builtTypesMod.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scriptMod {
  
  @JSImport("ioredis/built/Script", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Script {
    def this(lua: String) = this()
    def this(lua: String, numberOfKeys: Double) = this()
    def this(lua: String, numberOfKeys: Double, keyPrefix: String) = this()
    def this(lua: String, numberOfKeys: Unit, keyPrefix: String) = this()
    def this(lua: String, numberOfKeys: Double, keyPrefix: String, readOnly: Boolean) = this()
    def this(lua: String, numberOfKeys: Double, keyPrefix: Unit, readOnly: Boolean) = this()
    def this(lua: String, numberOfKeys: Unit, keyPrefix: String, readOnly: Boolean) = this()
    def this(lua: String, numberOfKeys: Unit, keyPrefix: Unit, readOnly: Boolean) = this()
  }
  
  @js.native
  trait Script extends StObject {
    
    /* private */ var Command: Any = js.native
    
    def execute(container: Any, args: js.Array[Any], options: Any): Any = js.native
    def execute(container: Any, args: js.Array[Any], options: Any, callback: Callback[Any]): Any = js.native
    
    /* private */ var keyPrefix: Any = js.native
    
    /* private */ var lua: Any = js.native
    
    /* private */ var numberOfKeys: Any = js.native
    
    /* private */ var readOnly: Any = js.native
    
    /* private */ var sha: Any = js.native
  }
}
