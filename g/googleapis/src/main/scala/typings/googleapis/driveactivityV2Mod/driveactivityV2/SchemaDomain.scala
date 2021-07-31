package typings.googleapis.driveactivityV2Mod.driveactivityV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about a domain.
  */
trait SchemaDomain extends StObject {
  
  /**
    * An opaque string used to identify this domain.
    */
  var legacyId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the domain, e.g. &quot;google.com&quot;.
    */
  var name: js.UndefOr[String] = js.undefined
}
object SchemaDomain {
  
  @scala.inline
  def apply(): SchemaDomain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDomain]
  }
  
  @scala.inline
  implicit class SchemaDomainMutableBuilder[Self <: SchemaDomain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLegacyId(value: String): Self = StObject.set(x, "legacyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegacyIdUndefined: Self = StObject.set(x, "legacyId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
