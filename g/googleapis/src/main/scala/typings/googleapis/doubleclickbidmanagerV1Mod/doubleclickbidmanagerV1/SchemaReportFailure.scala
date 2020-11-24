package typings.googleapis.doubleclickbidmanagerV1Mod.doubleclickbidmanagerV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An explanation of a report failure.
  */
@js.native
trait SchemaReportFailure extends js.Object {
  
  /**
    * Error code that shows why the report was not created.
    */
  var errorCode: js.UndefOr[String] = js.native
}
object SchemaReportFailure {
  
  @scala.inline
  def apply(): SchemaReportFailure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportFailure]
  }
  
  @scala.inline
  implicit class SchemaReportFailureOps[Self <: SchemaReportFailure] (val x: Self) extends AnyVal {
    
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
    def setErrorCode(value: String): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
  }
}
