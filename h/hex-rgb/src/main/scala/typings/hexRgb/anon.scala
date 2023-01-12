package typings.hexRgb

import typings.hexRgb.hexRgbStrings.`object`
import typings.hexRgb.hexRgbStrings.array
import typings.hexRgb.hexRgbStrings.css
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'array'} */
  trait Optionsformatarray extends StObject {
    
    /**
    	Set the alpha of the color.
    	This overrides any existing alpha component in the Hex color string. For example, the `99` in `#22222299`.
    	The number must be in the range 0 to 1.
    	*/
    val alpha: js.UndefOr[Double] = js.undefined
    
    /**
    	The RGB output format.
    	Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    	@default 'object'
    	*/
    val format: js.UndefOr[`object` | array | css] = js.undefined
  }
  object Optionsformatarray {
    
    inline def apply(): Optionsformatarray = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsformatarray]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsformatarray] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: `object` | array | css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'css'} */
  trait Optionsformatcss extends StObject {
    
    /**
    	Set the alpha of the color.
    	This overrides any existing alpha component in the Hex color string. For example, the `99` in `#22222299`.
    	The number must be in the range 0 to 1.
    	*/
    val alpha: js.UndefOr[Double] = js.undefined
    
    /**
    	The RGB output format.
    	Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    	@default 'object'
    	*/
    val format: js.UndefOr[`object` | array | css] = js.undefined
  }
  object Optionsformatcss {
    
    inline def apply(): Optionsformatcss = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsformatcss]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsformatcss] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: `object` | array | css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'object'} */
  trait Optionsformatobject extends StObject {
    
    /**
    	Set the alpha of the color.
    	This overrides any existing alpha component in the Hex color string. For example, the `99` in `#22222299`.
    	The number must be in the range 0 to 1.
    	*/
    val alpha: js.UndefOr[Double] = js.undefined
    
    /**
    	The RGB output format.
    	Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    	@default 'object'
    	*/
    val format: js.UndefOr[`object` | array | css] = js.undefined
  }
  object Optionsformatobject {
    
    inline def apply(): Optionsformatobject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Optionsformatobject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Optionsformatobject] (val x: Self) extends AnyVal {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      inline def setFormat(value: `object` | array | css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
}
