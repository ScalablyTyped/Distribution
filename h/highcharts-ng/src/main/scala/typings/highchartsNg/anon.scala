package typings.highchartsNg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CurrentMax extends StObject {
    
    var currentMax: js.UndefOr[Double] = js.undefined
    
    var currentMin: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[Text] = js.undefined
  }
  object CurrentMax {
    
    inline def apply(): CurrentMax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentMax]
    }
    
    extension [Self <: CurrentMax](x: Self) {
      
      inline def setCurrentMax(value: Double): Self = StObject.set(x, "currentMax", value.asInstanceOf[js.Any])
      
      inline def setCurrentMaxUndefined: Self = StObject.set(x, "currentMax", js.undefined)
      
      inline def setCurrentMin(value: Double): Self = StObject.set(x, "currentMin", value.asInstanceOf[js.Any])
      
      inline def setCurrentMinUndefined: Self = StObject.set(x, "currentMin", js.undefined)
      
      inline def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    inline def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
