package typings.jqueryQrcode

import typings.jqueryQrcode.jqueryQrcodeNumbers.`0`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`1`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`2`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`3`
import typings.jqueryQrcode.jqueryQrcodeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def IMAGE_BOX: `4` = 4.asInstanceOf[`4`]
    
    @scala.inline
    def IMAGE_STRIP: `3` = 3.asInstanceOf[`3`]
    
    @scala.inline
    def LABEL_BOX: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def LABEL_STRIP: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def NORMAL: `0` = 0.asInstanceOf[`0`]
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * Background color or image element, null for transparent background
      * @default null
      */
    var background: js.UndefOr[String] = js.native
    
    /**
      * Error correction level: 'L', 'M', 'Q' or 'H'
      * @default 'L'
      */
    var ecLevel: js.UndefOr[String] = js.native
    
    /**
      * Code color or image element
      * @default '#000'
      */
    var fill: js.UndefOr[String] = js.native
    
    /** @default '#000' */
    var fontcolor: js.UndefOr[String] = js.native
    
    /** @default 'sans' */
    var fontname: js.UndefOr[String] = js.native
    
    /** @default null */
    var image: js.UndefOr[String] = js.native
    
    /** @default 'no label' */
    var label: js.UndefOr[String] = js.native
    
    /**
      * Left offset in pixels, if drawn onto existing canvas
      * @default 0
      */
    var left: js.UndefOr[Double] = js.native
    
    /** @default 0.5 */
    var mPosX: js.UndefOr[Double] = js.native
    
    /** @default 0.5 */
    var mPosY: js.UndefOr[Double] = js.native
    
    /** @default 0.1 */
    var mSize: js.UndefOr[Double] = js.native
    
    /**
      * End of version range, somewhere in 1 .. 40
      * @default 40
      */
    var maxVersion: js.UndefOr[Double] = js.native
    
    /**
      * Start of version range, somewhere in 1 .. 40
      * @default 1
      */
    var minVersion: js.UndefOr[Double] = js.native
    
    /**
      * Mode
      * @default Mode.NORMAL
      */
    var mode: js.UndefOr[Mode] = js.native
    
    /**
      * Quiet zone in modules
      * @default 0
      */
    var quiet: js.UndefOr[Double] = js.native
    
    /**
      * Corner radius relative to module width: 0.0 .. 0.5
      * @default 0
      */
    var radius: js.UndefOr[Double] = js.native
    
    /**
      * Render method: 'canvas', 'image' or 'div'
      * @default 'canvas'
      */
    var render: js.UndefOr[String] = js.native
    
    /**
      * Size in pixel
      * @default 200
      */
    var size: js.UndefOr[Double] = js.native
    
    /**
      * The text content of the QR code.
      * @default 'no text'
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * Top offset in pixels, if drawn onto existing canvas
      * @default 0
      */
    var top: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setEcLevel(value: String): Self = StObject.set(x, "ecLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcLevelUndefined: Self = StObject.set(x, "ecLevel", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setFontcolor(value: String): Self = StObject.set(x, "fontcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontcolorUndefined: Self = StObject.set(x, "fontcolor", js.undefined)
      
      @scala.inline
      def setFontname(value: String): Self = StObject.set(x, "fontname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontnameUndefined: Self = StObject.set(x, "fontname", js.undefined)
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      @scala.inline
      def setMPosX(value: Double): Self = StObject.set(x, "mPosX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPosXUndefined: Self = StObject.set(x, "mPosX", js.undefined)
      
      @scala.inline
      def setMPosY(value: Double): Self = StObject.set(x, "mPosY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMPosYUndefined: Self = StObject.set(x, "mPosY", js.undefined)
      
      @scala.inline
      def setMSize(value: Double): Self = StObject.set(x, "mSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMSizeUndefined: Self = StObject.set(x, "mSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: Double): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMinVersion(value: Double): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setMode(value: Mode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setQuiet(value: Double): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setRender(value: String): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    }
  }
}
