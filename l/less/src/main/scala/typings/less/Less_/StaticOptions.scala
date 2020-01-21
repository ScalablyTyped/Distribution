package typings.less.Less_

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticOptions extends js.Object {
  var async: Boolean
  var fileAsync: Boolean
  var modifyVars: StringDictionary[String]
}

object StaticOptions {
  @scala.inline
  def apply(async: Boolean, fileAsync: Boolean, modifyVars: StringDictionary[String]): StaticOptions = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], fileAsync = fileAsync.asInstanceOf[js.Any], modifyVars = modifyVars.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticOptions]
  }
}

