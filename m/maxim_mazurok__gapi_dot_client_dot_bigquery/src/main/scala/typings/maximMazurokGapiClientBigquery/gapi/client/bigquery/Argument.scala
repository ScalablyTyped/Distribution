package typings.maximMazurokGapiClientBigquery.gapi.client.bigquery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argument extends js.Object {
  
  /** Optional. Defaults to FIXED_TYPE. */
  var argumentKind: js.UndefOr[String] = js.native
  
  /** Required unless argument_kind = ANY_TYPE. */
  var dataType: js.UndefOr[StandardSqlDataType] = js.native
  
  /** Optional. Specifies whether the argument is input or output. Can be set for procedures only. */
  var mode: js.UndefOr[String] = js.native
  
  /** Optional. The name of this argument. Can be absent for function return argument. */
  var name: js.UndefOr[String] = js.native
}
object Argument {
  
  @scala.inline
  def apply(): Argument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Argument]
  }
  
  @scala.inline
  implicit class ArgumentOps[Self <: Argument] (val x: Self) extends AnyVal {
    
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
    def setArgumentKind(value: String): Self = this.set("argumentKind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArgumentKind: Self = this.set("argumentKind", js.undefined)
    
    @scala.inline
    def setDataType(value: StandardSqlDataType): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
