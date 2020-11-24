package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options to interpret user query.
  */
@js.native
trait SchemaQueryInterpretationOptions extends js.Object {
  
  /**
    * Flag to disable natural language (NL) interpretation of queries. Default
    * is false, Set to true to disable natural language interpretation. NL
    * interpretation only applies to predefined datasources.
    */
  var disableNlInterpretation: js.UndefOr[Boolean] = js.native
}
object SchemaQueryInterpretationOptions {
  
  @scala.inline
  def apply(): SchemaQueryInterpretationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQueryInterpretationOptions]
  }
  
  @scala.inline
  implicit class SchemaQueryInterpretationOptionsOps[Self <: SchemaQueryInterpretationOptions] (val x: Self) extends AnyVal {
    
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
    def setDisableNlInterpretation(value: Boolean): Self = this.set("disableNlInterpretation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableNlInterpretation: Self = this.set("disableNlInterpretation", js.undefined)
  }
}
