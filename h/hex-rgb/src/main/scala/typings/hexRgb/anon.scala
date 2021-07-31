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
    		The RGB output format.
    		Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    		@default 'object'
    		*/
    val format: (js.UndefOr[`object` | array | css]) & array
  }
  object Optionsformatarray {
    
    @scala.inline
    def apply(format: (js.UndefOr[`object` | array | css]) & array): Optionsformatarray = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsformatarray]
    }
    
    @scala.inline
    implicit class OptionsformatarrayMutableBuilder[Self <: Optionsformatarray] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (js.UndefOr[`object` | array | css]) & array): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'css'} */
  trait Optionsformatcss extends StObject {
    
    /**
    		The RGB output format.
    		Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    		@default 'object'
    		*/
    val format: (js.UndefOr[`object` | array | css]) & css
  }
  object Optionsformatcss {
    
    @scala.inline
    def apply(format: (js.UndefOr[`object` | array | css]) & css): Optionsformatcss = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsformatcss]
    }
    
    @scala.inline
    implicit class OptionsformatcssMutableBuilder[Self <: Optionsformatcss] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (js.UndefOr[`object` | array | css]) & css): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined hex-rgb.hex-rgb.Options & {  format :'object'} */
  trait Optionsformatobject extends StObject {
    
    /**
    		The RGB output format.
    		Note that when using the `css` format, the value of the alpha channel is rounded to two decimal places.
    		@default 'object'
    		*/
    val format: (js.UndefOr[`object` | array | css]) & `object`
  }
  object Optionsformatobject {
    
    @scala.inline
    def apply(format: (js.UndefOr[`object` | array | css]) & `object`): Optionsformatobject = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsformatobject]
    }
    
    @scala.inline
    implicit class OptionsformatobjectMutableBuilder[Self <: Optionsformatobject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: (js.UndefOr[`object` | array | css]) & `object`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    }
  }
}
