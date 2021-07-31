package typings.ibmMobilefirst.WL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TabBar {
  
  trait ItemOptions extends StObject {
    
    var badge: js.UndefOr[String] = js.undefined
    
    var image: String
    
    // for iOS
    var imageSelected: js.UndefOr[String] = js.undefined
  }
  object ItemOptions {
    
    @scala.inline
    def apply(image: String): ItemOptions = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
      __obj.asInstanceOf[ItemOptions]
    }
    
    @scala.inline
    implicit class ItemOptionsMutableBuilder[Self <: ItemOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSelected(value: String): Self = StObject.set(x, "imageSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSelectedUndefined: Self = StObject.set(x, "imageSelected", js.undefined)
    }
  }
}
