package typings
package hexoLib.hexoMod.extendNs.GeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Return extends js.Object {
  var data: js.Any
  /**
    * Layout. Specify the layouts for rendering. The value can be a string or an array. If it’s ignored then the route will return data directly.
    */
  var layout: java.lang.String | js.Array[java.lang.String]
  /**
    * Path not including the prefixing `/` .
    */
  var path: java.lang.String
}

object Return {
  @scala.inline
  def apply(data: js.Any, layout: java.lang.String | js.Array[java.lang.String], path: java.lang.String): Return = {
    val __obj = js.Dynamic.literal(data = data, layout = layout.asInstanceOf[js.Any], path = path)
  
    __obj.asInstanceOf[Return]
  }
}

