package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Defaultnetworking extends js.Object {
  
  var `default-networking`: Description = js.native
  
  var `default-power`: Description = js.native
  
  var `local-discovery`: Description = js.native
  
  var lowpower: Description = js.native
  
  var server: Description = js.native
  
  var test: Description = js.native
}
object Defaultnetworking {
  
  @scala.inline
  def apply(
    `default-networking`: Description,
    `default-power`: Description,
    `local-discovery`: Description,
    lowpower: Description,
    server: Description,
    test: Description
  ): Defaultnetworking = {
    val __obj = js.Dynamic.literal(lowpower = lowpower.asInstanceOf[js.Any], server = server.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("default-networking")(`default-networking`.asInstanceOf[js.Any])
    __obj.updateDynamic("default-power")(`default-power`.asInstanceOf[js.Any])
    __obj.updateDynamic("local-discovery")(`local-discovery`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Defaultnetworking]
  }
  
  @scala.inline
  implicit class DefaultnetworkingOps[Self <: Defaultnetworking] (val x: Self) extends AnyVal {
    
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
    def `setDefault-networking`(value: Description): Self = this.set("default-networking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDefault-power`(value: Description): Self = this.set("default-power", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLocal-discovery`(value: Description): Self = this.set("local-discovery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowpower(value: Description): Self = this.set("lowpower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServer(value: Description): Self = this.set("server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: Description): Self = this.set("test", value.asInstanceOf[js.Any])
  }
}
