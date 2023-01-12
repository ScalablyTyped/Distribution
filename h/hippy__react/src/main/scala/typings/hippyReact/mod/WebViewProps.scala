package typings.hippyReact.mod

import typings.hippyReact.anon.Uri
import typings.hippyReact.hippyReactStrings.get
import typings.hippyReact.hippyReactStrings.post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebViewProps extends StObject {
  
  /**
    * Request method
    */
  var method: js.UndefOr[get | post] = js.undefined
  
  /**
    * Invoke when web page loaded.
    *
    * @param {Object} evt - Load event data
    * @param {string} evt.url - Web page url
    */
  var onLoad: js.UndefOr[js.Function1[/* evt */ LoadEvent, Unit]] = js.undefined
  
  /**
    * Invoke when web page load completed
    *
    * @param {Object} evt - Load event data
    * @param {string} evt.url - Web page url
    */
  def onLoadEnd(evt: LoadEvent): Unit
  
  /**
    * Invoke when web page start to load.
    *
    * @param {Object} evt - Load event data
    * @param {string} evt.url - Web page url
    */
  var onLoadStart: js.UndefOr[js.Function1[/* evt */ LoadEvent, Unit]] = js.undefined
  
  /**
    * WebView loads url
    */
  var source: Uri
  
  var style: js.UndefOr[ViewStyleProp] = js.undefined
  
  /**
    * Custom user agent.
    */
  var userAgent: js.UndefOr[String] = js.undefined
}
object WebViewProps {
  
  inline def apply(onLoadEnd: LoadEvent => Unit, source: Uri): WebViewProps = {
    val __obj = js.Dynamic.literal(onLoadEnd = js.Any.fromFunction1(onLoadEnd), source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebViewProps] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: get | post): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOnLoad(value: /* evt */ LoadEvent => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
    
    inline def setOnLoadEnd(value: LoadEvent => Unit): Self = StObject.set(x, "onLoadEnd", js.Any.fromFunction1(value))
    
    inline def setOnLoadStart(value: /* evt */ LoadEvent => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
    
    inline def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setSource(value: Uri): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ViewStyleProp): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "style", js.Array(value*))
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
  }
}
