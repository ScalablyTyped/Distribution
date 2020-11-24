package typings.jsforce.connectionMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestApiOptions extends js.Object {
  
  var allOrNone: js.UndefOr[Boolean] = js.native
  
  var allowRecursive: js.UndefOr[Boolean] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
}
object RestApiOptions {
  
  @scala.inline
  def apply(): RestApiOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestApiOptions]
  }
  
  @scala.inline
  implicit class RestApiOptionsOps[Self <: RestApiOptions] (val x: Self) extends AnyVal {
    
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
    def setAllOrNone(value: Boolean): Self = this.set("allOrNone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllOrNone: Self = this.set("allOrNone", js.undefined)
    
    @scala.inline
    def setAllowRecursive(value: Boolean): Self = this.set("allowRecursive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowRecursive: Self = this.set("allowRecursive", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
  }
}
