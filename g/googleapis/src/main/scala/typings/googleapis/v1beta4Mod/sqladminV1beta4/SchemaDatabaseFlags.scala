package typings.googleapis.v1beta4Mod.sqladminV1beta4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Database flags for Cloud SQL instances.
  */
@js.native
trait SchemaDatabaseFlags extends StObject {
  
  /**
    * The name of the flag. These flags are passed at instance startup, so
    * include both server options and system variables for MySQL. Flags should
    * be specified with underscores, not hyphens. For more information, see
    * Configuring Database Flags in the Cloud SQL documentation.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The value of the flag. Booleans should be set to on for true and off for
    * false. This field must be omitted if the flag doesn&#39;t take a value.
    */
  var value: js.UndefOr[String] = js.native
}
object SchemaDatabaseFlags {
  
  @scala.inline
  def apply(): SchemaDatabaseFlags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDatabaseFlags]
  }
  
  @scala.inline
  implicit class SchemaDatabaseFlagsMutableBuilder[Self <: SchemaDatabaseFlags] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
