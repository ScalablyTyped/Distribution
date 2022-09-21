package typings.libp2pInterfaces

import org.scalablytyped.runtime.TopLevel
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait AbortOptions extends StObject {
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object AbortOptions {
    
    inline def apply(): AbortOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AbortOptions]
    }
    
    extension [Self <: AbortOptions](x: Self) {
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  type RecursivePartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P] extends std.Array<infer I>? std.Array<@libp2p/interfaces.@libp2p/interfaces.RecursivePartial<any>> : T[P] extends (args : ...any): any? T[P] : @libp2p/interfaces.@libp2p/interfaces.RecursivePartial<T[P]>}
    */ typings.libp2pInterfaces.libp2pInterfacesStrings.RecursivePartial & TopLevel[Any]
}
