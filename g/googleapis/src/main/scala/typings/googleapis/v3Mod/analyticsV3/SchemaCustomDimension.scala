package typings.googleapis.v3Mod.analyticsV3

import typings.googleapis.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * JSON template for Analytics Custom Dimension.
  */
@js.native
trait SchemaCustomDimension extends js.Object {
  
  /**
    * Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  
  /**
    * Boolean indicating whether the custom dimension is active.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * Time the custom dimension was created.
    */
  var created: js.UndefOr[String] = js.native
  
  /**
    * Custom dimension ID.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Index of the custom dimension.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Kind value for a custom dimension. Set to
    * &quot;analytics#customDimension&quot;. It is a read-only field.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Name of the custom dimension.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Parent link for the custom dimension. Points to the property to which the
    * custom dimension belongs.
    */
  var parentLink: js.UndefOr[Href] = js.native
  
  /**
    * Scope of the custom dimension: HIT, SESSION, USER or PRODUCT.
    */
  var scope: js.UndefOr[String] = js.native
  
  /**
    * Link for the custom dimension
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Time the custom dimension was last modified.
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * Property ID.
    */
  var webPropertyId: js.UndefOr[String] = js.native
}
object SchemaCustomDimension {
  
  @scala.inline
  def apply(): SchemaCustomDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCustomDimension]
  }
  
  @scala.inline
  implicit class SchemaCustomDimensionOps[Self <: SchemaCustomDimension] (val x: Self) extends AnyVal {
    
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    
    @scala.inline
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setWebPropertyId(value: String): Self = this.set("webPropertyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebPropertyId: Self = this.set("webPropertyId", js.undefined)
  }
}
