package typings.kyujitai.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * the path to ivd.json file.
    * Valid only in browser.
    * Default is the same directory to the ivs.js file.
    */
  var ivd: js.UndefOr[String] = js.native
  
  var kyujitai: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setIvd(value: String): Self = this.set("ivd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIvd: Self = this.set("ivd", js.undefined)
    
    @scala.inline
    def setKyujitai(value: String): Self = this.set("kyujitai", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKyujitai: Self = this.set("kyujitai", js.undefined)
  }
}
