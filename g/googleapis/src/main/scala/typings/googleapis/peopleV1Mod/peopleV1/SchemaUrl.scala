package typings.googleapis.peopleV1Mod.peopleV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A person&#39;s associated URLs.
  */
trait SchemaUrl extends StObject {
  
  /**
    * The read-only type of the URL translated and formatted in the
    * viewer&#39;s account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  
  /**
    * Metadata about the URL.
    */
  var metadata: js.UndefOr[SchemaFieldMetadata] = js.undefined
  
  /**
    * The type of the URL. The type can be custom or one of these predefined
    * values:  * `home` * `work` * `blog` * `profile` * `homePage` * `ftp` *
    * `reservations` * `appInstallPage`: website for a Google+ application. *
    * `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * The URL.
    */
  var value: js.UndefOr[String] = js.undefined
}
object SchemaUrl {
  
  inline def apply(): SchemaUrl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUrl]
  }
  
  extension [Self <: SchemaUrl](x: Self) {
    
    inline def setFormattedType(value: String): Self = StObject.set(x, "formattedType", value.asInstanceOf[js.Any])
    
    inline def setFormattedTypeUndefined: Self = StObject.set(x, "formattedType", js.undefined)
    
    inline def setMetadata(value: SchemaFieldMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
