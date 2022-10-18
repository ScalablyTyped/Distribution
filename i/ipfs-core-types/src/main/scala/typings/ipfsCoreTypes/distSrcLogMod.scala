package typings.ipfsCoreTypes

import typings.ipfsCoreTypes.distSrcUtilsMod.AbortOptions
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLogMod {
  
  @js.native
  trait API[OptionExtension] extends StObject {
    
    def level(subsystem: String, level: String): js.Promise[Any] = js.native
    def level(subsystem: String, level: String, options: AbortOptions & OptionExtension): js.Promise[Any] = js.native
    
    def ls(): js.Promise[Any] = js.native
    def ls(options: AbortOptions & OptionExtension): js.Promise[Any] = js.native
    
    def tail(): AsyncIterable[Any] = js.native
    def tail(options: AbortOptions & OptionExtension): AsyncIterable[Any] = js.native
  }
}
