package typings.googleapis.v33Mod.dfareportingV33

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Skippable Settings
  */
@js.native
trait SchemaSiteSkippableSetting extends StObject {
  
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
  implicit class SchemaSiteSkippableSettingMutableBuilder[Self <: SchemaSiteSkippableSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setProgressOffset(value: SchemaVideoOffset): Self = StObject.set(x, "progressOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressOffsetUndefined: Self = StObject.set(x, "progressOffset", js.undefined)
    
    @scala.inline
    def setSkipOffset(value: SchemaVideoOffset): Self = StObject.set(x, "skipOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipOffsetUndefined: Self = StObject.set(x, "skipOffset", js.undefined)
    
    @scala.inline
    def setSkippable(value: Boolean): Self = StObject.set(x, "skippable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkippableUndefined: Self = StObject.set(x, "skippable", js.undefined)
  }
}
