package typings.htmlDocxJs

import typings.htmlDocxJs.htmlDocxJsStrings.landscape
import typings.htmlDocxJs.htmlDocxJsStrings.portrait
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    /** The bottom page margin (default: 1440). */
    var bottom: js.UndefOr[Double] = js.undefined
    
    /** The margin for the footer (default: 720). */
    var footer: js.UndefOr[Double] = js.undefined
    
    /** The margin for the gutter (default: 0). */
    var gutter: js.UndefOr[Double] = js.undefined
    
    /** The margin for the header (default: 720). */
    var header: js.UndefOr[Double] = js.undefined
    
    /** The left page margin (default: 1440). */
    var left: js.UndefOr[Double] = js.undefined
    
    /** The right page margin (default: 1440). */
    var right: js.UndefOr[Double] = js.undefined
    
    /** The top page margin (default: 1440, i.e. 2.54 cm). */
    var top: js.UndefOr[Double] = js.undefined
  }
  object Bottom {
    
    inline def apply(): Bottom = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
      
      inline def setFooter(value: Double): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGutter(value: Double): Self = StObject.set(x, "gutter", value.asInstanceOf[js.Any])
      
      inline def setGutterUndefined: Self = StObject.set(x, "gutter", js.undefined)
      
      inline def setHeader(value: Double): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
  
  trait Margins extends StObject {
    
    /**
      * A map of margin sizes (expressed in twentieths of point, see
      * [WordprocessingML documentation](http://officeopenxml.com/WPsectionPgMar.php)
      * for details).
      */
    var margins: js.UndefOr[Bottom] = js.undefined
    
    /**
      * Page orientation. Must be `landscape` or `portrait` (default).
      */
    var orientation: js.UndefOr[landscape | portrait] = js.undefined
  }
  object Margins {
    
    inline def apply(): Margins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Margins]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Margins] (val x: Self) extends AnyVal {
      
      inline def setMargins(value: Bottom): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
      
      inline def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
      
      inline def setOrientation(value: landscape | portrait): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    }
  }
}
