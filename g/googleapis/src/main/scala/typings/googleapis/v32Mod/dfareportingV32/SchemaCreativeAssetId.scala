package typings.googleapis.v32Mod.dfareportingV32

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creative Asset ID.
  */
@js.native
trait SchemaCreativeAssetId extends StObject {
  
  /**
    * Name of the creative asset. This is a required field while inserting an
    * asset. After insertion, this assetIdentifier is used to identify the
    * uploaded asset. Characters in the name must be alphanumeric or one of the
    * following: &quot;.-_ &quot;. Spaces are allowed.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Type of asset to upload. This is a required field. FLASH and IMAGE are no
    * longer supported for new uploads. All image assets should use HTML_IMAGE.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SchemaCreativeAssetId {
  
  @scala.inline
  def apply(): SchemaCreativeAssetId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreativeAssetId]
  }
  
  @scala.inline
  implicit class SchemaCreativeAssetIdMutableBuilder[Self <: SchemaCreativeAssetId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
