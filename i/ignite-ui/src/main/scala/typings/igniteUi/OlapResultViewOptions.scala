package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OlapResultViewOptions
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the columns.
    */
  var hasColumns: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="false" a value indicating whether the result has one or more hierarchies in the rows.
    */
  var hasRows: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional="false" an object of type $.ig.OlapResult which represents the full cached result.
    */
  var result: js.UndefOr[js.Any] = js.native
  
  /**
    * Optional="false" an object of type $.ig.OlapResult which represents the visible part of the result.
    */
  var visibleResult: js.UndefOr[js.Any] = js.native
}
object OlapResultViewOptions {
  
  @scala.inline
  def apply(): OlapResultViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OlapResultViewOptions]
  }
  
  @scala.inline
  implicit class OlapResultViewOptionsOps[Self <: OlapResultViewOptions] (val x: Self) extends AnyVal {
    
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
    def setHasColumns(value: Boolean): Self = this.set("hasColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasColumns: Self = this.set("hasColumns", js.undefined)
    
    @scala.inline
    def setHasRows(value: Boolean): Self = this.set("hasRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasRows: Self = this.set("hasRows", js.undefined)
    
    @scala.inline
    def setResult(value: js.Any): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResult: Self = this.set("result", js.undefined)
    
    @scala.inline
    def setVisibleResult(value: js.Any): Self = this.set("visibleResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleResult: Self = this.set("visibleResult", js.undefined)
  }
}
