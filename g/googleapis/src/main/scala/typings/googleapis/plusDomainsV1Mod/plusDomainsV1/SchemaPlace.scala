package typings.googleapis.plusDomainsV1Mod.plusDomainsV1

import typings.googleapis.anon.Latitude
import typings.googleapis.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaPlace extends js.Object {
  
  /**
    * The physical address of the place.
    */
  var address: js.UndefOr[`8`] = js.native
  
  /**
    * The display name of the place.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The id of the place.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Identifies this resource as a place. Value: &quot;plus#place&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The position of the place.
    */
  var position: js.UndefOr[Latitude] = js.native
}
object SchemaPlace {
  
  @scala.inline
  def apply(): SchemaPlace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlace]
  }
  
  @scala.inline
  implicit class SchemaPlaceOps[Self <: SchemaPlace] (val x: Self) extends AnyVal {
    
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
    def setAddress(value: `8`): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setPosition(value: Latitude): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
}
