package typings.log4js.mod

import typings.log4js.log4jsStrings.categoryFilter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoryFilterAppender extends Appender {
  
  // the name of the appender to filter. see https://log4js-node.github.io/log4js-node/layouts.html
  var appender: js.UndefOr[String] = js.native
  
  // the category (or categories if you provide an array of values) that will be excluded from the appender.
  var exclude: js.UndefOr[String | js.Array[String]] = js.native
  
  var `type`: categoryFilter = js.native
}
object CategoryFilterAppender {
  
  @scala.inline
  def apply(`type`: categoryFilter): CategoryFilterAppender = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoryFilterAppender]
  }
  
  @scala.inline
  implicit class CategoryFilterAppenderMutableBuilder[Self <: CategoryFilterAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppender(value: String): Self = StObject.set(x, "appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppenderUndefined: Self = StObject.set(x, "appender", js.undefined)
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setType(value: categoryFilter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
