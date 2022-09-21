package typings.googleapis.smartdevicemanagementV1Mod.smartdevicemanagementV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleHomeEnterpriseSdmV1Structure extends StObject {
  
  /**
    * Output only. The resource name of the structure. For example: "enterprises/XYZ/structures/ABC".
    */
  var name: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Structure traits.
    */
  var traits: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
}
object SchemaGoogleHomeEnterpriseSdmV1Structure {
  
  inline def apply(): SchemaGoogleHomeEnterpriseSdmV1Structure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleHomeEnterpriseSdmV1Structure]
  }
  
  extension [Self <: SchemaGoogleHomeEnterpriseSdmV1Structure](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTraits(value: StringDictionary[Any]): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsNull: Self = StObject.set(x, "traits", null)
    
    inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
  }
}
