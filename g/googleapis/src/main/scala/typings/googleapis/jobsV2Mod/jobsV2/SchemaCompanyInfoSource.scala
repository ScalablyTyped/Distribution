package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource that represents an external  Google identifier for a company,
  * for example, a Google+ business page or a Google Maps business page. For
  * unsupported types, use `unknown_type_id`.
  */
@js.native
trait SchemaCompanyInfoSource extends js.Object {
  
  /**
    * Optional.  The Google&#39;s Knowledge Graph value for the employer&#39;s
    * company.
    */
  var freebaseMid: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The numeric identifier for the employer&#39;s Google+ business
    * page.
    */
  var gplusId: js.UndefOr[String] = js.native
  
  /**
    * Optional.  The numeric identifier for the employer&#39;s headquarters on
    * Google Maps, namely, the Google Maps CID (cell id).
    */
  var mapsCid: js.UndefOr[String] = js.native
  
  /**
    * Optional.  A Google identifier that does not match any of the other
    * types.
    */
  var unknownTypeId: js.UndefOr[String] = js.native
}
object SchemaCompanyInfoSource {
  
  @scala.inline
  def apply(): SchemaCompanyInfoSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCompanyInfoSource]
  }
  
  @scala.inline
  implicit class SchemaCompanyInfoSourceOps[Self <: SchemaCompanyInfoSource] (val x: Self) extends AnyVal {
    
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
    def setFreebaseMid(value: String): Self = this.set("freebaseMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreebaseMid: Self = this.set("freebaseMid", js.undefined)
    
    @scala.inline
    def setGplusId(value: String): Self = this.set("gplusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGplusId: Self = this.set("gplusId", js.undefined)
    
    @scala.inline
    def setMapsCid(value: String): Self = this.set("mapsCid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMapsCid: Self = this.set("mapsCid", js.undefined)
    
    @scala.inline
    def setUnknownTypeId(value: String): Self = this.set("unknownTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnknownTypeId: Self = this.set("unknownTypeId", js.undefined)
  }
}
