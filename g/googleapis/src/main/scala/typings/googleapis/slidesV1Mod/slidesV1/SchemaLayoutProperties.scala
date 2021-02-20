package typings.googleapis.slidesV1Mod.slidesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of Page are only relevant for pages with page_type LAYOUT.
  */
@js.native
trait SchemaLayoutProperties extends StObject {
  
  /**
    * The human-readable name of the layout.
    */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The object ID of the master that this layout is based on.
    */
  var masterObjectId: js.UndefOr[String] = js.native
  
  /**
    * The name of the layout.
    */
  var name: js.UndefOr[String] = js.native
}
object SchemaLayoutProperties {
  
  @scala.inline
  def apply(): SchemaLayoutProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLayoutProperties]
  }
  
  @scala.inline
  implicit class SchemaLayoutPropertiesMutableBuilder[Self <: SchemaLayoutProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setMasterObjectId(value: String): Self = StObject.set(x, "masterObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterObjectIdUndefined: Self = StObject.set(x, "masterObjectId", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
