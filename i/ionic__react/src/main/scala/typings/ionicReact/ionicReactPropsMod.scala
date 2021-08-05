package typings.ionicReact

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ionicReactPropsMod {
  
  trait IonicReactProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  }
  object IonicReactProps {
    
    inline def apply(): IonicReactProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IonicReactProps]
    }
    
    extension [Self <: IonicReactProps](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setStyle(value: StringDictionary[js.Any]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
