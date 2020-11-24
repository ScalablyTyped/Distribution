package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPosDataProviders extends js.Object {
  
  /**
    * Country code.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * A list of POS data providers.
    */
  var posDataProviders: js.UndefOr[js.Array[SchemaPosDataProvidersPosDataProvider]] = js.native
}
object SchemaPosDataProviders {
  
  @scala.inline
  def apply(): SchemaPosDataProviders = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPosDataProviders]
  }
  
  @scala.inline
  implicit class SchemaPosDataProvidersOps[Self <: SchemaPosDataProviders] (val x: Self) extends AnyVal {
    
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setPosDataProvidersVarargs(value: SchemaPosDataProvidersPosDataProvider*): Self = this.set("posDataProviders", js.Array(value :_*))
    
    @scala.inline
    def setPosDataProviders(value: js.Array[SchemaPosDataProvidersPosDataProvider]): Self = this.set("posDataProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosDataProviders: Self = this.set("posDataProviders", js.undefined)
  }
}
