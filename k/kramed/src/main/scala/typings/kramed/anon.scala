package typings.kramed

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kramed.mod.KramedOptions
import typings.kramed.mod.KramedParser
import typings.kramed.mod.KramedRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Align extends StObject {
    
    var align: String
    
    var header: Boolean
  }
  object Align {
    
    inline def apply(align: String, header: Boolean): Align = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    extension [Self <: Align](x: Self) {
      
      inline def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable
    extends StObject
       with Instantiable0[KramedRenderer]
  
  @js.native
  trait InstantiableKramedParser
    extends StObject
       with Instantiable1[/* options */ KramedOptions, KramedParser]
}
