package typings.jqueryQrcode

import typings.jqueryQrcode.jqueryQrcodeNumbers.`0`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`1`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`2`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`3`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryQRCode {
  
  /* Rewritten from type alias, can be one of: 
    - typings.jqueryQrcode.jqueryQrcodeNumbers.`0`
    - typings.jqueryQrcode.jqueryQrcodeNumbers.`1`
    - typings.jqueryQrcode.jqueryQrcodeNumbers.`2`
    - typings.jqueryQrcode.jqueryQrcodeNumbers.`3`
    - typings.jqueryQrcode.jqueryQrcodeNumbers.`4`
  */
  trait Mode extends StObject
  object Mode {
    
    inline def IMAGE_BOX: `4` = 4.asInstanceOf[`4`]
    
    inline def IMAGE_STRIP: `3` = 3.asInstanceOf[`3`]
    
    inline def LABEL_BOX: `2` = 2.asInstanceOf[`2`]
    
    inline def LABEL_STRIP: `1` = 1.asInstanceOf[`1`]
    
    inline def NORMAL: `0` = 0.asInstanceOf[`0`]
  }
  
  trait Options extends StObject {
    
    /**
      * Background color or image element, null for transparent background
      * @default null
      */
    var background: js.UndefOr[String] = js.undefined
    
    /**
      * Error correction level: 'L', 'M', 'Q' or 'H'
      * @default 'L'
      */
    var ecLevel: js.UndefOr[String] = js.undefined
    
    /**
      * Code color or image element
      * @default '#000'
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /** @default '#000' */
    var fontcolor: js.UndefOr[String] = js.undefined
    
    /** @default 'sans' */
    var fontname: js.UndefOr[String] = js.undefined
    
    /** @default null */
    var image: js.UndefOr[String] = js.undefined
    
    /** @default 'no label' */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * Left offset in pixels, if drawn onto existing canvas
      * @default 0
      */
    var left: js.UndefOr[Double] = js.undefined
    
    /** @default 0.5 */
    var mPosX: js.UndefOr[Double] = js.undefined
    
    /** @default 0.5 */
    var mPosY: js.UndefOr[Double] = js.undefined
    
    /** @default 0.1 */
    var mSize: js.UndefOr[Double] = js.undefined
    
    /**
      * End of version range, somewhere in 1 .. 40
      * @default 40
      */
    var maxVersion: js.UndefOr[Double] = js.undefined
    
    /**
      * Start of version range, somewhere in 1 .. 40
      * @default 1
      */
    var minVersion: js.UndefOr[Double] = js.undefined
    
    /**
      * Mode
      * @default Mode.NORMAL
      */
    var mode: js.UndefOr[Mode] = js.undefined
    
    /**
      * Quiet zone in modules
      * @default 0
      */
    var quiet: js.UndefOr[Double] = js.undefined
    
    /**
      * Corner radius relative to module width: 0.0 .. 0.5
      * @default 0
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * Render method: 'canvas', 'image' or 'div'
      * @default 'canvas'
      */
    var render: js.UndefOr[String] = js.undefined
    
    /**
      * Size in pixel
      * @default 200
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * The text content of the QR code.
      * @default 'no text'
      */
    var text: js.UndefOr[String] = js.undefined
    
    /**
      * Top offset in pixels, if drawn onto existing canvas
      * @default 0
      */
    var top: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setEcLevel(value: String): Self = StObject.set(x, "ecLevel", value.asInstanceOf[js.Any])
      
      inline def setEcLevelUndefined: Self = StObject.set(x, "ecLevel", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFontcolor(value: String): Self = StObject.set(x, "fontcolor", value.asInstanceOf[js.Any])
      
      inline def setFontcolorUndefined: Self = StObject.set(x, "fontcolor", js.undefined)
      
      inline def setFontname(value: String): Self = StObject.set(x, "fontname", value.asInstanceOf[js.Any])
      
      inline def setFontnameUndefined: Self = StObject.set(x, "fontname", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setMPosX(value: Double): Self = StObject.set(x, "mPosX", value.asInstanceOf[js.Any])
      
      inline def setMPosXUndefined: Self = StObject.set(x, "mPosX", js.undefined)
      
      inline def setMPosY(value: Double): Self = StObject.set(x, "mPosY", value.asInstanceOf[js.Any])
      
      inline def setMPosYUndefined: Self = StObject.set(x, "mPosY", js.undefined)
      
      inline def setMSize(value: Double): Self = StObject.set(x, "mSize", value.asInstanceOf[js.Any])
      
      inline def setMSizeUndefined: Self = StObject.set(x, "mSize", js.undefined)
      
      inline def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      inline def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      inline def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      inline def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      inline def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQuiet(value: Double): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
