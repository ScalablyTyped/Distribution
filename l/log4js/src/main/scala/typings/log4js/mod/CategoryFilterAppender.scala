package typings.log4js.mod

import typings.log4js.log4jsStrings.categoryFilter
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
  implicit class CategoryFilterAppenderOps[Self <: CategoryFilterAppender] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: categoryFilter): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppender(value: String): Self = this.set("appender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppender: Self = this.set("appender", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: String | js.Array[String]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
  }
}
