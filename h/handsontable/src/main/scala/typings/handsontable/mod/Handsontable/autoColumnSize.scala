package typings.handsontable.mod.Handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object autoColumnSize {
  
  @js.native
  trait Settings extends StObject {
    
    var syncLimit: js.UndefOr[String | Double] = js.native
    
    var useHeaders: js.UndefOr[Boolean] = js.native
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSyncLimit(value: String | Double): Self = StObject.set(x, "syncLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSyncLimitUndefined: Self = StObject.set(x, "syncLimit", js.undefined)
      
      @scala.inline
      def setUseHeaders(value: Boolean): Self = StObject.set(x, "useHeaders", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHeadersUndefined: Self = StObject.set(x, "useHeaders", js.undefined)
    }
  }
}
