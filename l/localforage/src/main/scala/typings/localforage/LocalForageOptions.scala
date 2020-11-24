package typings.localforage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalForageOptions extends LocalForageDbInstanceOptions {
  
  var description: js.UndefOr[String] = js.native
  
  var driver: js.UndefOr[String | js.Array[String]] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var version: js.UndefOr[Double] = js.native
}
object LocalForageOptions {
  
  @scala.inline
  def apply(): LocalForageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalForageOptions]
  }
  
  @scala.inline
  implicit class LocalForageOptionsOps[Self <: LocalForageOptions] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDriverVarargs(value: String*): Self = this.set("driver", js.Array(value :_*))
    
    @scala.inline
    def setDriver(value: String | js.Array[String]): Self = this.set("driver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriver: Self = this.set("driver", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setVersion(value: Double): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
