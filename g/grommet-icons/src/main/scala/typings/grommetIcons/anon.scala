package typings.grommetIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Colors extends StObject {
    
    var colors: Icon = js.native
  }
  object Colors {
    
    @scala.inline
    def apply(colors: Icon): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit class ColorsMutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColors(value: Icon): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Icon extends StObject {
    
    var icon: String = js.native
  }
  object Icon {
    
    @scala.inline
    def apply(icon: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Large extends StObject {
    
    var large: String = js.native
    
    var medium: String = js.native
    
    var small: String = js.native
    
    var xlarge: String = js.native
  }
  object Large {
    
    @scala.inline
    def apply(large: String, medium: String, small: String, xlarge: String): Large = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Large]
    }
    
    @scala.inline
    implicit class LargeMutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    var size: Large = js.native
  }
  object Size {
    
    @scala.inline
    def apply(size: Large): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: Large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
