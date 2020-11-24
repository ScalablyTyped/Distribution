package typings.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoublePropertyOptions extends js.Object {
  
  /** If set, describes how the double should be used as a search operator. */
  var operatorOptions: js.UndefOr[DoubleOperatorOptions] = js.native
}
object DoublePropertyOptions {
  
  @scala.inline
  def apply(): DoublePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoublePropertyOptions]
  }
  
  @scala.inline
  implicit class DoublePropertyOptionsOps[Self <: DoublePropertyOptions] (val x: Self) extends AnyVal {
    
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
    def setOperatorOptions(value: DoubleOperatorOptions): Self = this.set("operatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperatorOptions: Self = this.set("operatorOptions", js.undefined)
  }
}
