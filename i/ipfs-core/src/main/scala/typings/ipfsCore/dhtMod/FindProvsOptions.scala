package typings.ipfsCore.dhtMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindProvsOptions extends js.Object {
  
  var maxNumProviders: js.UndefOr[Double] = js.native
  
  /**
    * - maximum number of providers to find
    */
  var numProviders: js.UndefOr[Double] = js.native
}
object FindProvsOptions {
  
  @scala.inline
  def apply(): FindProvsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindProvsOptions]
  }
  
  @scala.inline
  implicit class FindProvsOptionsOps[Self <: FindProvsOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxNumProviders(value: Double): Self = this.set("maxNumProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxNumProviders: Self = this.set("maxNumProviders", js.undefined)
    
    @scala.inline
    def setNumProviders(value: Double): Self = this.set("numProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumProviders: Self = this.set("numProviders", js.undefined)
  }
}
