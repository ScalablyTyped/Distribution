package typings.hellosignSdk.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined hellosign-sdk.hellosign-sdk.GenericObject<{  related_signature_id :string | undefined,   reported_for_account_id :string,   reported_for_app_id :string} & hellosign-sdk.hellosign-sdk.GenericObject<{}>> */
trait GenericObjectrelatedsigna
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var related_signature_id: js.UndefOr[String] = js.undefined
  
  var reported_for_account_id: String
  
  var reported_for_app_id: String
}
object GenericObjectrelatedsigna {
  
  inline def apply(reported_for_account_id: String, reported_for_app_id: String): GenericObjectrelatedsigna = {
    val __obj = js.Dynamic.literal(reported_for_account_id = reported_for_account_id.asInstanceOf[js.Any], reported_for_app_id = reported_for_app_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenericObjectrelatedsigna]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GenericObjectrelatedsigna] (val x: Self) extends AnyVal {
    
    inline def setRelated_signature_id(value: String): Self = StObject.set(x, "related_signature_id", value.asInstanceOf[js.Any])
    
    inline def setRelated_signature_idUndefined: Self = StObject.set(x, "related_signature_id", js.undefined)
    
    inline def setReported_for_account_id(value: String): Self = StObject.set(x, "reported_for_account_id", value.asInstanceOf[js.Any])
    
    inline def setReported_for_app_id(value: String): Self = StObject.set(x, "reported_for_app_id", value.asInstanceOf[js.Any])
  }
}
