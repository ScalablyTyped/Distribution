package typings.hexo.mod.extend.Generator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Return extends js.Object {
  var data: js.Any
  /**
    * Layout. Specify the layouts for rendering. The value can be a string or an array. If it’s ignored then the route will return data directly.
    */
  var layout: String | js.Array[String]
  /**
    * Path not including the prefixing `/` .
    */
  var path: String
}

object Return {
  @scala.inline
  def apply(data: js.Any, layout: String | js.Array[String], path: String): Return = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Return]
  }
}

