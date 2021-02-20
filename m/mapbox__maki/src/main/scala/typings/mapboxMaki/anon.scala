package typings.mapboxMaki

import typings.mapboxMaki.mod.IconName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait All extends StObject {
    
    var all: js.Array[IconName] = js.native
  }
  object All {
    
    @scala.inline
    def apply(all: js.Array[IconName]): All = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit class AllMutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: js.Array[IconName]): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllVarargs(value: IconName*): Self = StObject.set(x, "all", js.Array(value :_*))
    }
  }
}
