package typings.ldapjsDashClient.ldapjsDashClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjsDashClient.ldapjsDashClientStrings.add
import typings.ldapjsDashClient.ldapjsDashClientStrings.delete
import typings.ldapjsDashClient.ldapjsDashClientStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Change extends js.Object {
  var modification: StringDictionary[js.Any]
  var operation: add | delete | replace
}

object Change {
  @scala.inline
  def apply(modification: StringDictionary[js.Any], operation: add | delete | replace): Change = {
    val __obj = js.Dynamic.literal(modification = modification, operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Change]
  }
}

