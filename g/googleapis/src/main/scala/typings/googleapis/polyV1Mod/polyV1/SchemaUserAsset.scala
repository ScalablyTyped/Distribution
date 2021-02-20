package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Data about the user&#39;s asset.
  */
@js.native
trait SchemaUserAsset extends StObject {
  
  /**
    * An Asset.
    */
  var asset: js.UndefOr[SchemaAsset] = js.native
}
object SchemaUserAsset {
  
  @scala.inline
  def apply(): SchemaUserAsset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUserAsset]
  }
  
  @scala.inline
  implicit class SchemaUserAssetMutableBuilder[Self <: SchemaUserAsset] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsset(value: SchemaAsset): Self = StObject.set(x, "asset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssetUndefined: Self = StObject.set(x, "asset", js.undefined)
  }
}
