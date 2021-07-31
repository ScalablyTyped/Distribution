package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchbarInterfaceMod {
  
  trait SearchbarChangeEventDetail extends StObject {
    
    var value: js.UndefOr[String] = js.undefined
  }
  object SearchbarChangeEventDetail {
    
    @scala.inline
    def apply(): SearchbarChangeEventDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchbarChangeEventDetail]
    }
    
    @scala.inline
    implicit class SearchbarChangeEventDetailMutableBuilder[Self <: SearchbarChangeEventDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
