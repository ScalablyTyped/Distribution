package typings.jss.mod

import typings.std.HTMLStyleElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleSheetFactoryOptions extends StObject {
  
  var classNamePrefix: js.UndefOr[String] = js.undefined
  
  var element: js.UndefOr[HTMLStyleElement] = js.undefined
  
  var generateId: js.UndefOr[GenerateId] = js.undefined
  
  var index: js.UndefOr[Double] = js.undefined
  
  var link: js.UndefOr[Boolean] = js.undefined
  
  var media: js.UndefOr[String] = js.undefined
  
  var meta: js.UndefOr[String] = js.undefined
}
object StyleSheetFactoryOptions {
  
  inline def apply(): StyleSheetFactoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleSheetFactoryOptions]
  }
  
  extension [Self <: StyleSheetFactoryOptions](x: Self) {
    
    inline def setClassNamePrefix(value: String): Self = StObject.set(x, "classNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setClassNamePrefixUndefined: Self = StObject.set(x, "classNamePrefix", js.undefined)
    
    inline def setElement(value: HTMLStyleElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setGenerateId(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): Self = StObject.set(x, "generateId", js.Any.fromFunction2(value))
    
    inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLink(value: Boolean): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    inline def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setMeta(value: String): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
  }
}
