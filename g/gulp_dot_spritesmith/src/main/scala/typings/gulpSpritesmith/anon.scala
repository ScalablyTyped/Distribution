package typings.gulpSpritesmith

import typings.gulpSpritesmith.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Height extends StObject {
    
    var height: String
    
    var offset_x: String
    
    var offset_y: String
    
    var total_height: String
    
    var total_width: String
    
    var width: String
    
    var x: String
    
    var y: String
  }
  object Height {
    
    inline def apply(
      height: String,
      offset_x: String,
      offset_y: String,
      total_height: String,
      total_width: String,
      width: String,
      x: String,
      y: String
    ): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offset_x = offset_x.asInstanceOf[js.Any], offset_y = offset_y.asInstanceOf[js.Any], total_height = total_height.asInstanceOf[js.Any], total_width = total_width.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    extension [Self <: Height](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffset_x(value: String): Self = StObject.set(x, "offset_x", value.asInstanceOf[js.Any])
      
      inline def setOffset_y(value: String): Self = StObject.set(x, "offset_y", value.asInstanceOf[js.Any])
      
      inline def setTotal_height(value: String): Self = StObject.set(x, "total_height", value.asInstanceOf[js.Any])
      
      inline def setTotal_width(value: String): Self = StObject.set(x, "total_width", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: String): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: String): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index extends StObject {
    
    var index: Double
    
    var name: String
    
    var normal: Sprite
    
    var retina: Sprite
  }
  object Index {
    
    inline def apply(index: Double, name: String, normal: Sprite, retina: Sprite): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], retina = retina.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    extension [Self <: Index](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNormal(value: Sprite): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
      
      inline def setRetina(value: Sprite): Self = StObject.set(x, "retina", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sort extends StObject {
    
    var sort: js.UndefOr[Boolean] = js.undefined
  }
  object Sort {
    
    inline def apply(): Sort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sort]
    }
    
    extension [Self <: Sort](x: Self) {
      
      inline def setSort(value: Boolean): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
      
      inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    }
  }
  
  trait Width extends StObject {
    
    var height: String
    
    var width: String
  }
  object Width {
    
    inline def apply(height: String, width: String): Width = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Width]
    }
    
    extension [Self <: Width](x: Self) {
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
