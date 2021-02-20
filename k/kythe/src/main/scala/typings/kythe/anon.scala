package typings.kythe

import typings.kythe.kytheStrings.ordinal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait OrdinalBrand extends StObject {
    
    var __ordinalBrand: ordinal = js.native
  }
  object OrdinalBrand {
    
    @scala.inline
    def apply(__ordinalBrand: ordinal): OrdinalBrand = {
      val __obj = js.Dynamic.literal(__ordinalBrand = __ordinalBrand.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrdinalBrand]
    }
    
    @scala.inline
    implicit class OrdinalBrandMutableBuilder[Self <: OrdinalBrand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set__ordinalBrand(value: ordinal): Self = StObject.set(x, "__ordinalBrand", value.asInstanceOf[js.Any])
    }
  }
}
