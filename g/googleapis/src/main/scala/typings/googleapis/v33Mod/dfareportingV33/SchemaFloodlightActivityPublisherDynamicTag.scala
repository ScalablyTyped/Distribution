package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Publisher Dynamic Tag
  */
@js.native
trait SchemaFloodlightActivityPublisherDynamicTag extends js.Object {
  
  /**
    * Whether this tag is applicable only for click-throughs.
    */
  var clickThrough: js.UndefOr[Boolean] = js.native
  
  /**
    * Directory site ID of this dynamic tag. This is a write-only field that
    * can be used as an alternative to the siteId field. When this resource is
    * retrieved, only the siteId field will be populated.
    */
  var directorySiteId: js.UndefOr[String] = js.native
  
  /**
    * Dynamic floodlight tag.
    */
  var dynamicTag: js.UndefOr[SchemaFloodlightActivityDynamicTag] = js.native
  
  /**
    * Site ID of this dynamic tag.
    */
  var siteId: js.UndefOr[String] = js.native
  
  /**
    * Dimension value for the ID of the site. This is a read-only,
    * auto-generated field.
    */
  var siteIdDimensionValue: js.UndefOr[SchemaDimensionValue] = js.native
  
  /**
    * Whether this tag is applicable only for view-throughs.
    */
  var viewThrough: js.UndefOr[Boolean] = js.native
}
object SchemaFloodlightActivityPublisherDynamicTag {
  
  @scala.inline
  def apply(): SchemaFloodlightActivityPublisherDynamicTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFloodlightActivityPublisherDynamicTag]
  }
  
  @scala.inline
  implicit class SchemaFloodlightActivityPublisherDynamicTagOps[Self <: SchemaFloodlightActivityPublisherDynamicTag] (val x: Self) extends AnyVal {
    
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
    def setClickThrough(value: Boolean): Self = this.set("clickThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickThrough: Self = this.set("clickThrough", js.undefined)
    
    @scala.inline
    def setDirectorySiteId(value: String): Self = this.set("directorySiteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirectorySiteId: Self = this.set("directorySiteId", js.undefined)
    
    @scala.inline
    def setDynamicTag(value: SchemaFloodlightActivityDynamicTag): Self = this.set("dynamicTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicTag: Self = this.set("dynamicTag", js.undefined)
    
    @scala.inline
    def setSiteId(value: String): Self = this.set("siteId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteId: Self = this.set("siteId", js.undefined)
    
    @scala.inline
    def setSiteIdDimensionValue(value: SchemaDimensionValue): Self = this.set("siteIdDimensionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSiteIdDimensionValue: Self = this.set("siteIdDimensionValue", js.undefined)
    
    @scala.inline
    def setViewThrough(value: Boolean): Self = this.set("viewThrough", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewThrough: Self = this.set("viewThrough", js.undefined)
  }
}
