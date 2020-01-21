package typings.ldapjsClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjsClient.ldapjsClientStrings.add
import typings.ldapjsClient.ldapjsClientStrings.delete
import typings.ldapjsClient.ldapjsClientStrings.replace
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
    val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Change]
  }
}

