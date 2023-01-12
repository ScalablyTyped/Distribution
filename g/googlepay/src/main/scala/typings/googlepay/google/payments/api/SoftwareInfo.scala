package typings.googlepay.google.payments.api

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The info of the software used by merchants to integrate with GPay.
  */
trait SoftwareInfo extends StObject {
  
  /**
    * The identifier of the software used by merchants to integrate with
    * GPay.
    *
    * Partner's domain name can be used as the identifier.
    *
    * This field is optional.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the software.
    *
    * GPay metrics are provided per version.
    *
    * This field is optional.
    */
  var version: js.UndefOr[String] = js.undefined
}
object SoftwareInfo {
  
  inline def apply(): SoftwareInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SoftwareInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SoftwareInfo] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
