package typings.ionicCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectInterfaceMod {
  
  @js.native
  trait SelectChangeEventDetail[T] extends StObject {
    
    var value: T = js.native
  }
  object SelectChangeEventDetail {
    
    @scala.inline
    def apply[T](value: T): SelectChangeEventDetail[T] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectChangeEventDetail[T]]
    }
    
    @scala.inline
    implicit class SelectChangeEventDetailMutableBuilder[Self <: SelectChangeEventDetail[_], T] (val x: Self with SelectChangeEventDetail[T]) extends AnyVal {
      
      @scala.inline
      def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type SelectCompareFn = js.Function2[/* currentValue */ js.Any, /* compareValue */ js.Any, Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ionicCore.ionicCoreStrings.`action-sheet`
    - typings.ionicCore.ionicCoreStrings.popover
    - typings.ionicCore.ionicCoreStrings.alert
  */
  trait SelectInterface extends StObject
  object SelectInterface {
    
    @scala.inline
    def `action-sheet`: typings.ionicCore.ionicCoreStrings.`action-sheet` = "action-sheet".asInstanceOf[typings.ionicCore.ionicCoreStrings.`action-sheet`]
    
    @scala.inline
    def alert: typings.ionicCore.ionicCoreStrings.alert = "alert".asInstanceOf[typings.ionicCore.ionicCoreStrings.alert]
    
    @scala.inline
    def popover: typings.ionicCore.ionicCoreStrings.popover = "popover".asInstanceOf[typings.ionicCore.ionicCoreStrings.popover]
  }
}
