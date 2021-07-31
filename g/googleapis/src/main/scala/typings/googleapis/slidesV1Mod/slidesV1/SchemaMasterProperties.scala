package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of Page that are only relevant for pages with page_type
  * MASTER.
  */
trait SchemaMasterProperties extends StObject {
  
  /**
    * The human-readable name of the master.
    */
  var displayName: js.UndefOr[String] = js.undefined
}
object SchemaMasterProperties {
  
  @scala.inline
  def apply(): SchemaMasterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMasterProperties]
  }
  
  @scala.inline
  implicit class SchemaMasterPropertiesMutableBuilder[Self <: SchemaMasterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
  }
}
