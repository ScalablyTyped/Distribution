package typings.ioTsTypes

import typings.ioTs.mod.BrandC
import typings.ioTs.mod.Branded
import typings.ioTs.mod.StringC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUuidMod {
  
  @JSImport("io-ts-types/lib/UUID", "UUID")
  @js.native
  val UUID: BrandC[StringC, UUIDBrand] = js.native
  type UUID = Branded[String, UUIDBrand]
  
  trait UUIDBrand extends StObject {
    
    val UUID: js.Symbol
  }
  object UUIDBrand {
    
    inline def apply(UUID: js.Symbol): UUIDBrand = {
      val __obj = js.Dynamic.literal(UUID = UUID.asInstanceOf[js.Any])
      __obj.asInstanceOf[UUIDBrand]
    }
    
    extension [Self <: UUIDBrand](x: Self) {
      
      inline def setUUID(value: js.Symbol): Self = StObject.set(x, "UUID", value.asInstanceOf[js.Any])
    }
  }
}
