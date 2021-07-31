package typings.googleapis.containerV1beta1Mod.containerV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AutoUpgradeOptions defines the set of options for the user to control how
  * the Auto Upgrades will proceed.
  */
trait SchemaAutoUpgradeOptions extends StObject {
  
  /**
    * [Output only] This field is set when upgrades are about to commence with
    * the approximate start time for the upgrades, in
    * [RFC3339](https://www.ietf.org/rfc/rfc3339.txt) text format.
    */
  var autoUpgradeStartTime: js.UndefOr[String] = js.undefined
  
  /**
    * [Output only] This field is set when upgrades are about to commence with
    * the description of the upgrade.
    */
  var description: js.UndefOr[String] = js.undefined
}
object SchemaAutoUpgradeOptions {
  
  @scala.inline
  def apply(): SchemaAutoUpgradeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAutoUpgradeOptions]
  }
  
  @scala.inline
  implicit class SchemaAutoUpgradeOptionsMutableBuilder[Self <: SchemaAutoUpgradeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpgradeStartTime(value: String): Self = StObject.set(x, "autoUpgradeStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpgradeStartTimeUndefined: Self = StObject.set(x, "autoUpgradeStartTime", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
