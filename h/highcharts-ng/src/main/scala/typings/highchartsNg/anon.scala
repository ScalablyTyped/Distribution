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
    
    @scala.inline
    def apply(): CurrentMax = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CurrentMax]
    }
    
    @scala.inline
    implicit class CurrentMaxMutableBuilder[Self <: CurrentMax] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentMax(value: Double): Self = StObject.set(x, "currentMax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMaxUndefined: Self = StObject.set(x, "currentMax", js.undefined)
      
      @scala.inline
      def setCurrentMin(value: Double): Self = StObject.set(x, "currentMin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentMinUndefined: Self = StObject.set(x, "currentMin", js.undefined)
      
      @scala.inline
      def setTitle(value: Text): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Height extends StObject {
    
    var height: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
  }
  object Height {
    
    @scala.inline
    def apply(): Height = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit class HeightMutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Text {
    
    @scala.inline
    def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
