package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Location returns the location name, and if the location is recommended for
  * GKE cluster scheduling.
  */
@js.native
trait SchemaLocation extends js.Object {
  
  /**
    * Contains the name of the resource requested. Specified in the format
    * &#39;projects/x/locations/ *&#39;.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Whether the location is recomended for GKE cluster scheduling.
    */
  var recommended: js.UndefOr[Boolean] = js.native
  
  /**
    * Contains the type of location this Location is for. Regional or Zonal.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaLocation {
  
  @scala.inline
  def apply(): SchemaLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLocation]
  }
  
  @scala.inline
  implicit class SchemaLocationOps[Self <: SchemaLocation] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRecommended(value: Boolean): Self = this.set("recommended", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecommended: Self = this.set("recommended", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
