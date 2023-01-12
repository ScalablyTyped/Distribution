package typings.hippyReact.mod

import typings.hippyReact.anon.Bottom
import typings.hippyReact.anon.NativeEvent
import typings.hippyReact.anon.NativeEventLoaded
import typings.hippyReact.hippyReactStrings.center
import typings.hippyReact.hippyReactStrings.contain
import typings.hippyReact.hippyReactStrings.cover
import typings.hippyReact.hippyReactStrings.repeat
import typings.hippyReact.hippyReactStrings.stretch
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageProps
  extends StObject
     with LayoutableProps
     with ClickableProps
     with TouchableProps {
  
  /**
    * When the image is resized, the corners of the size specified by capInsets
    * will stay a fixed size, but the center content and borders of the image will be stretched.
    * This is useful for creating resizable rounded buttons, shadows, and other resizable assets.
    */
  var capInsets: js.UndefOr[Bottom] = js.undefined
  
  /**
    * Image placeholder when image is loading.
    * Support base64 image only.
    */
  var defaultSource: js.UndefOr[String] = js.undefined
  
  /**
    * Image ref when `Image` have other children.
    */
  var imageRef: js.UndefOr[ReactNode] = js.undefined
  
  /**
    * Image style when `Image` have other children.
    */
  var imageStyle: js.UndefOr[ViewStyleProp] = js.undefined
  
  /**
    * Invoke on loading of `Image` get error.
    *
    * @param {Object} evt - Loading error data.
    * @param {string} evt.nativeEvent.error - Loading error message.
    */
  var onError: js.UndefOr[js.Function1[/* evt */ NativeEvent, Unit]] = js.undefined
  
  /**
    * Invoked on `Image` is loaded.
    */
  var onLoad: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoke on `Image` is end of loading.
    */
  var onLoadEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoke on `Image` is start to loading.
    */
  var onLoadStart: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * Invoke on Image is loading.
    *
    * @param {Object} evt - Image loading progress data.
    * @param {number} evt.nativeEvent.loaded - The image is loaded.
    * @param {number} evt.nativeEvent.total - The loadded progress.
    */
  var onProgress: js.UndefOr[js.Function1[/* evt */ NativeEventLoaded, Unit]] = js.undefined
  
  /**
    * Image resize mode, as same as containMode
    */
  var resizeMode: js.UndefOr[cover | contain | stretch | repeat | center] = js.undefined
  
  /**
    * Image source object
    */
  var source: js.UndefOr[ImageSource | js.Array[ImageSource]] = js.undefined
  
  var sources: js.UndefOr[js.Array[ImageSource]] = js.undefined
  
  /**
    * Single image source
    */
  var src: js.UndefOr[String] = js.undefined
  
  var srcs: js.UndefOr[js.Array[String]] = js.undefined
  
  var style: ViewStyleProp
  
  /**
    * Fill color to the image
    */
  var tintColor: js.UndefOr[Double | String] = js.undefined
  
  var tintColors: js.UndefOr[js.Array[Double | String]] = js.undefined
}
object ImageProps {
  
  inline def apply(style: ViewStyleProp): ImageProps = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageProps] (val x: Self) extends AnyVal {
    
    inline def setCapInsets(value: Bottom): Self = StObject.set(x, "capInsets", value.asInstanceOf[js.Any])
    
    inline def setCapInsetsUndefined: Self = StObject.set(x, "capInsets", js.undefined)
    
    inline def setDefaultSource(value: String): Self = StObject.set(x, "defaultSource", value.asInstanceOf[js.Any])
    
    inline def setDefaultSourceUndefined: Self = StObject.set(x, "defaultSource", js.undefined)
    
    inline def setImageRef(value: ReactNode): Self = StObject.set(x, "imageRef", value.asInstanceOf[js.Any])
    
    inline def setImageRefUndefined: Self = StObject.set(x, "imageRef", js.undefined)
    
    inline def setImageStyle(value: ViewStyleProp): Self = StObject.set(x, "imageStyle", value.asInstanceOf[js.Any])
    
    inline def setImageStyleUndefined: Self = StObject.set(x, "imageStyle", js.undefined)
    
    inline def setImageStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "imageStyle", js.Array(value*))
    
    inline def setOnError(value: /* evt */ NativeEvent => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    
    inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    
    inline def setOnLoad(value: () => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction0(value))
    
    inline def setOnLoadEnd(value: () => Unit): Self = StObject.set(x, "onLoadEnd", js.Any.fromFunction0(value))
    
    inline def setOnLoadEndUndefined: Self = StObject.set(x, "onLoadEnd", js.undefined)
    
    inline def setOnLoadStart(value: () => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction0(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setOnProgress(value: /* evt */ NativeEventLoaded => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
    
    inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    
    inline def setResizeMode(value: cover | contain | stretch | repeat | center): Self = StObject.set(x, "resizeMode", value.asInstanceOf[js.Any])
    
    inline def setResizeModeUndefined: Self = StObject.set(x, "resizeMode", js.undefined)
    
    inline def setSource(value: ImageSource | js.Array[ImageSource]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVarargs(value: ImageSource*): Self = StObject.set(x, "source", js.Array(value*))
    
    inline def setSources(value: js.Array[ImageSource]): Self = StObject.set(x, "sources", value.asInstanceOf[js.Any])
    
    inline def setSourcesUndefined: Self = StObject.set(x, "sources", js.undefined)
    
    inline def setSourcesVarargs(value: ImageSource*): Self = StObject.set(x, "sources", js.Array(value*))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setSrcs(value: js.Array[String]): Self = StObject.set(x, "srcs", value.asInstanceOf[js.Any])
    
    inline def setSrcsUndefined: Self = StObject.set(x, "srcs", js.undefined)
    
    inline def setSrcsVarargs(value: String*): Self = StObject.set(x, "srcs", js.Array(value*))
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setTintColor(value: Double | String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    
    inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    
    inline def setTintColors(value: js.Array[Double | String]): Self = StObject.set(x, "tintColors", value.asInstanceOf[js.Any])
    
    inline def setTintColorsUndefined: Self = StObject.set(x, "tintColors", js.undefined)
    
    inline def setTintColorsVarargs(value: (Double | String)*): Self = StObject.set(x, "tintColors", js.Array(value*))
  }
}
