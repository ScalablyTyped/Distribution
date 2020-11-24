package typings.jasmine.jasmine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration that can be used when configuring Jasmine via {@link jasmine.Env.configure}
  */
@js.native
trait EnvConfiguration extends js.Object {
  
  var failFast: js.UndefOr[Boolean] = js.native
  
  var failSpecWithNoExpectations: js.UndefOr[Boolean] = js.native
  
  var hideDisabled: js.UndefOr[Boolean] = js.native
  
  var oneFailurePerSpec: js.UndefOr[Boolean] = js.native
  
  var promise: js.UndefOr[js.Function] = js.native
  
  var random: js.UndefOr[Boolean] = js.native
  
  var seed: js.UndefOr[Double] = js.native
  
  var specFilter: js.UndefOr[js.Function] = js.native
}
object EnvConfiguration {
  
  @scala.inline
  def apply(): EnvConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvConfiguration]
  }
  
  @scala.inline
  implicit class EnvConfigurationOps[Self <: EnvConfiguration] (val x: Self) extends AnyVal {
    
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
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailFast: Self = this.set("failFast", js.undefined)
    
    @scala.inline
    def setFailSpecWithNoExpectations(value: Boolean): Self = this.set("failSpecWithNoExpectations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailSpecWithNoExpectations: Self = this.set("failSpecWithNoExpectations", js.undefined)
    
    @scala.inline
    def setHideDisabled(value: Boolean): Self = this.set("hideDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHideDisabled: Self = this.set("hideDisabled", js.undefined)
    
    @scala.inline
    def setOneFailurePerSpec(value: Boolean): Self = this.set("oneFailurePerSpec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOneFailurePerSpec: Self = this.set("oneFailurePerSpec", js.undefined)
    
    @scala.inline
    def setPromise(value: js.Function): Self = this.set("promise", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePromise: Self = this.set("promise", js.undefined)
    
    @scala.inline
    def setRandom(value: Boolean): Self = this.set("random", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRandom: Self = this.set("random", js.undefined)
    
    @scala.inline
    def setSeed(value: Double): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setSpecFilter(value: js.Function): Self = this.set("specFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecFilter: Self = this.set("specFilter", js.undefined)
  }
}
