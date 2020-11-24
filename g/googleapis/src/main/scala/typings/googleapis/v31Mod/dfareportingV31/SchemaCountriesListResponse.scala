package typings.googleapis.v31Mod.dfareportingV31

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Country List Response
  */
@js.native
trait SchemaCountriesListResponse extends js.Object {
  
  /**
    * Country collection.
    */
  var countries: js.UndefOr[js.Array[SchemaCountry]] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#countriesListResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}
object SchemaCountriesListResponse {
  
  @scala.inline
  def apply(): SchemaCountriesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCountriesListResponse]
  }
  
  @scala.inline
  implicit class SchemaCountriesListResponseOps[Self <: SchemaCountriesListResponse] (val x: Self) extends AnyVal {
    
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
    def setCountriesVarargs(value: SchemaCountry*): Self = this.set("countries", js.Array(value :_*))
    
    @scala.inline
    def setCountries(value: js.Array[SchemaCountry]): Self = this.set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountries: Self = this.set("countries", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
  }
}
