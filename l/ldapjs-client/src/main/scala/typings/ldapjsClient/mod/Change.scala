package typings.ldapjsClient.mod

import org.scalablytyped.runtime.StringDictionary
import typings.ldapjsClient.ldapjsClientStrings.add
import typings.ldapjsClient.ldapjsClientStrings.delete
import typings.ldapjsClient.ldapjsClientStrings.replace
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Change extends js.Object {
  
  var modification: StringDictionary[js.Any] = js.native
  
  var operation: add | delete | replace = js.native
}
object Change {
  
  @scala.inline
  def apply(modification: StringDictionary[js.Any], operation: add | delete | replace): Change = {
    val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
    
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
    def setModification(value: StringDictionary[js.Any]): Self = this.set("modification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: add | delete | replace): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
}
