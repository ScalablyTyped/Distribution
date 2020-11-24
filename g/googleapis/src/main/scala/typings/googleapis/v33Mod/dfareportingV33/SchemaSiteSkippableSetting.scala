package typings.googleapis.v33Mod.dfareportingV33

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Skippable Settings
  */
@js.native
trait SchemaSiteSkippableSetting extends js.Object {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#siteSkippableSetting&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * Amount of time to play videos served to this site template before
    * counting a view. Applicable when skippable is true.
    */
  var progressOffset: js.UndefOr[SchemaVideoOffset] = js.native
  
  /**
    * Amount of time to play videos served to this site before the skip button
    * should appear. Applicable when skippable is true.
    */
  var skipOffset: js.UndefOr[SchemaVideoOffset] = js.native
  
  /**
    * Whether the user can skip creatives served to this site. This will act as
    * default for new placements created under this site.
    */
  var skippable: js.UndefOr[Boolean] = js.native
}
object SchemaSiteSkippableSetting {
  
  @scala.inline
  def apply(): SchemaSiteSkippableSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSiteSkippableSetting]
  }
  
  @scala.inline
  implicit class SchemaSiteSkippableSettingOps[Self <: SchemaSiteSkippableSetting] (val x: Self) extends AnyVal {
    
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: SchemaVideoOffset): Self = this.set("progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressOffset: Self = this.set("progressOffset", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: SchemaVideoOffset): Self = this.set("skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipOffset: Self = this.set("skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = this.set("skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkippable: Self = this.set("skippable", js.undefined)
  }
}
