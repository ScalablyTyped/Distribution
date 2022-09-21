package typings.log4js.mod

import typings.log4js.log4jsStrings.categoryFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CategoryFilterAppender extends StObject {
  
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[String] = js.undefined
  
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var `type`: categoryFilter
}
object CategoryFilterAppender {
  
  inline def apply(): CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("categoryFilter")
    __obj.asInstanceOf[CategoryFilterAppender]
  }
  
  extension [Self <: CategoryFilterAppender](x: Self) {
    
    inline def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    inline def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
    
    inline def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value*))
    
    inline def setType(value: categoryFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
