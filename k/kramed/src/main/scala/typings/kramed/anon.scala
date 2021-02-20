package typings.kramed

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.kramed.mod.KramedOptions
import typings.kramed.mod.KramedParser
import typings.kramed.mod.KramedRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Align extends StObject {
    
    var align: String = js.native
    
    var header: Boolean = js.native
  }
  object Align {
    
    @scala.inline
    def apply(align: String, header: Boolean): Align = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any])
      __obj.asInstanceOf[Align]
    }
    
    @scala.inline
    implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: String): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Instantiable extends Instantiable0[KramedRenderer]
  
  @js.native
  trait InstantiableKramedParser extends Instantiable1[/* options */ KramedOptions, KramedParser]
}
