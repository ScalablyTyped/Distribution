package typings
package ldapjsLib.ldapjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var modification: org.scalablytyped.runtime.StringDictionary[js.Any]
  var operation: java.lang.String
}

object Change {
  @scala.inline
  def apply(modification: org.scalablytyped.runtime.StringDictionary[js.Any], operation: java.lang.String): Change = {
    val __obj = js.Dynamic.literal(modification = modification, operation = operation)
  
    __obj.asInstanceOf[Change]
  }
}

