package typings
package lessLib.LessNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var async: scala.Boolean
  var fileAsync: scala.Boolean
  var modifyVars: org.scalablytyped.runtime.StringDictionary[java.lang.String]
}

object StaticOptions {
  @scala.inline
  def apply(
    async: scala.Boolean,
    fileAsync: scala.Boolean,
    modifyVars: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): StaticOptions = {
    val __obj = js.Dynamic.literal(async = async, fileAsync = fileAsync, modifyVars = modifyVars)
  
    __obj.asInstanceOf[StaticOptions]
  }
}

