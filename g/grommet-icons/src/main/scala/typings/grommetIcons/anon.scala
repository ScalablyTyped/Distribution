package typings.grommetIcons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colors extends StObject {
    
    var colors: Icon
  }
  object Colors {
    
    inline def apply(colors: Icon): Colors = {
      val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Icon): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    }
  }
  
  trait Icon extends StObject {
    
    var icon: String
  }
  object Icon {
    
    inline def apply(icon: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  trait Large extends StObject {
    
    var large: String
    
    var medium: String
    
    var small: String
    
    var xlarge: String
  }
  object Large {
    
    inline def apply(large: String, medium: String, small: String, xlarge: String): Large = {
      val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], xlarge = xlarge.asInstanceOf[js.Any])
      __obj.asInstanceOf[Large]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Large] (val x: Self) extends AnyVal {
      
      inline def setLarge(value: String): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setXlarge(value: String): Self = StObject.set(x, "xlarge", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    var size: Large
  }
  object Size {
    
    inline def apply(size: Large): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Large): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
}
