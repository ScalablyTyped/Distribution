package typings.googleapis.runV1alpha1Mod.runV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceSpecPinnedType Pins this service to a specific revision name. The
  * revision must be owned by the configuration provided.  Deprecated and not
  * supported by Cloud Run.
  */
@js.native
trait SchemaServiceSpecPinnedType extends js.Object {
  
  /**
    * The configuration for this service.
    */
  var configuration: js.UndefOr[SchemaConfigurationSpec] = js.native
  
  /**
    * The revision name to pin this service to until changed to a different
    * service type.
    */
  var revisionName: js.UndefOr[String] = js.native
}
object SchemaServiceSpecPinnedType {
  
  @scala.inline
  def apply(): SchemaServiceSpecPinnedType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceSpecPinnedType]
  }
  
  @scala.inline
  implicit class SchemaServiceSpecPinnedTypeOps[Self <: SchemaServiceSpecPinnedType] (val x: Self) extends AnyVal {
    
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
    def setConfiguration(value: SchemaConfigurationSpec): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfiguration: Self = this.set("configuration", js.undefined)
    
    @scala.inline
    def setRevisionName(value: String): Self = this.set("revisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevisionName: Self = this.set("revisionName", js.undefined)
  }
}
