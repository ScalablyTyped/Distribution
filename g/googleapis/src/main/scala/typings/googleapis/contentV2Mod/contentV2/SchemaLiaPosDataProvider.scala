package typings.googleapis.contentV2Mod.contentV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaLiaPosDataProvider extends StObject {
  
  /**
    * The ID of the POS data provider.
    */
  var posDataProviderId: js.UndefOr[String] = js.native
  
  /**
    * The account ID by which this merchant is known to the POS data provider.
    */
  var posExternalAccountId: js.UndefOr[String] = js.native
}
object SchemaLiaPosDataProvider {
  
  @scala.inline
  def apply(): SchemaLiaPosDataProvider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLiaPosDataProvider]
  }
  
  @scala.inline
  implicit class SchemaLiaPosDataProviderMutableBuilder[Self <: SchemaLiaPosDataProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPosDataProviderId(value: String): Self = StObject.set(x, "posDataProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosDataProviderIdUndefined: Self = StObject.set(x, "posDataProviderId", js.undefined)
    
    @scala.inline
    def setPosExternalAccountId(value: String): Self = StObject.set(x, "posExternalAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosExternalAccountIdUndefined: Self = StObject.set(x, "posExternalAccountId", js.undefined)
  }
}
