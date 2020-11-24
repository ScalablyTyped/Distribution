package typings.maximMazurokGapiClientContaineranalysis.gapi.client.containeranalysis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Package extends js.Object {
  
  /** The various channels by which a package is distributed. */
  var distribution: js.UndefOr[js.Array[Distribution]] = js.native
  
  /** Required. Immutable. The name of the package. */
  var name: js.UndefOr[String] = js.native
}
object Package {
  
  @scala.inline
  def apply(): Package = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Package]
  }
  
  @scala.inline
  implicit class PackageOps[Self <: Package] (val x: Self) extends AnyVal {
    
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
    def setDistributionVarargs(value: Distribution*): Self = this.set("distribution", js.Array(value :_*))
    
    @scala.inline
    def setDistribution(value: js.Array[Distribution]): Self = this.set("distribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistribution: Self = this.set("distribution", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
