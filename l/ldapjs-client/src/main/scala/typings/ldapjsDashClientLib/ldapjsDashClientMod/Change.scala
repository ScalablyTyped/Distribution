package typings
package ldapjsDashClientLib.ldapjsDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var modification: org.scalablytyped.runtime.StringDictionary[js.Any]
  var operation: ldapjsDashClientLib.ldapjsDashClientLibStrings.add | ldapjsDashClientLib.ldapjsDashClientLibStrings.delete | ldapjsDashClientLib.ldapjsDashClientLibStrings.replace
}

object Change {
  @scala.inline
  def apply(
    modification: org.scalablytyped.runtime.StringDictionary[js.Any],
    operation: ldapjsDashClientLib.ldapjsDashClientLibStrings.add | ldapjsDashClientLib.ldapjsDashClientLibStrings.delete | ldapjsDashClientLib.ldapjsDashClientLibStrings.replace
  ): Change = {
    val __obj = js.Dynamic.literal(modification = modification, operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Change]
  }
}

