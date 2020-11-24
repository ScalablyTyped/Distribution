package typings.googleapis.v1beta4Mod.sqladminV1beta4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Google Cloud SQL service tier resource.
  */
@js.native
trait SchemaTier extends js.Object {
  
  /**
    * The maximum disk size of this tier in bytes.
    */
  var DiskQuota: js.UndefOr[String] = js.native
  
  /**
    * The maximum RAM usage of this tier in bytes.
    */
  var RAM: js.UndefOr[String] = js.native
  
  /**
    * This is always sql#tier.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The applicable regions for this tier.
    */
  var region: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * An identifier for the machine type, for example, db-n1-standard-1. For
    * related information, see Pricing.
    */
  var tier: js.UndefOr[String] = js.native
}
object SchemaTier {
  
  @scala.inline
  def apply(): SchemaTier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTier]
  }
  
  @scala.inline
  implicit class SchemaTierOps[Self <: SchemaTier] (val x: Self) extends AnyVal {
    
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
    def setDiskQuota(value: String): Self = this.set("DiskQuota", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiskQuota: Self = this.set("DiskQuota", js.undefined)
    
    @scala.inline
    def setRAM(value: String): Self = this.set("RAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRAM: Self = this.set("RAM", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setRegionVarargs(value: String*): Self = this.set("region", js.Array(value :_*))
    
    @scala.inline
    def setRegion(value: js.Array[String]): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTier(value: String): Self = this.set("tier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTier: Self = this.set("tier", js.undefined)
  }
}
