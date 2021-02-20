package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Info about the sources of this asset (i.e. assets that were remixed to
  * create this asset).
  */
@js.native
trait SchemaRemixInfo extends StObject {
  
  /**
    * Resource ids for the sources of this remix, of the form:
    * `assets/{ASSET_ID}`
    */
  var sourceAsset: js.UndefOr[js.Array[String]] = js.native
}
object SchemaRemixInfo {
  
  @scala.inline
  def apply(): SchemaRemixInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRemixInfo]
  }
  
  @scala.inline
  implicit class SchemaRemixInfoMutableBuilder[Self <: SchemaRemixInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSourceAsset(value: js.Array[String]): Self = StObject.set(x, "sourceAsset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceAssetUndefined: Self = StObject.set(x, "sourceAsset", js.undefined)
    
    @scala.inline
    def setSourceAssetVarargs(value: String*): Self = StObject.set(x, "sourceAsset", js.Array(value :_*))
  }
}
