package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicReactPropsMod {
  
  @js.native
  trait IonicReactProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object IonicReactProps {
    
    @scala.inline
    def apply(): IonicReactProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicReactProps]
    }
    
    @scala.inline
    implicit class IonicReactPropsMutableBuilder[Self <: IonicReactProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
