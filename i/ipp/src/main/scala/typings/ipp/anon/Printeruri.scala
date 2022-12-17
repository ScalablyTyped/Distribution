package typings.ipp.anon

import typings.ipp.mod.CharacterSet
import typings.ipp.mod.MimeMediaType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Printeruri extends StObject {
  
  var `attributes-charset`: js.UndefOr[CharacterSet] = js.undefined
  
  var `attributes-natural-language`: js.UndefOr[String] = js.undefined
  
  var `document-format`: js.UndefOr[MimeMediaType] = js.undefined
  
  var `printer-uri`: js.UndefOr[String] = js.undefined
  
  var `requested-attributes`: js.UndefOr[
    js.Array[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385, starting with typings.ipp.mod.RequestedPrinterAttributeGroups, typings.ipp.ippStrings.`accuracy-units-supported`, typings.ipp.ippStrings.`baling-type-supported` */ Any
    ]
  ] = js.undefined
  
  var `requesting-user-name`: String
}
object Printeruri {
  
  inline def apply(`requesting-user-name`: String): Printeruri = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("requesting-user-name")(`requesting-user-name`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Printeruri]
  }
  
  extension [Self <: Printeruri](x: Self) {
    
    inline def `setAttributes-charset`(value: CharacterSet): Self = StObject.set(x, "attributes-charset", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-charsetUndefined`: Self = StObject.set(x, "attributes-charset", js.undefined)
    
    inline def `setAttributes-natural-language`(value: String): Self = StObject.set(x, "attributes-natural-language", value.asInstanceOf[js.Any])
    
    inline def `setAttributes-natural-languageUndefined`: Self = StObject.set(x, "attributes-natural-language", js.undefined)
    
    inline def `setDocument-format`(value: MimeMediaType): Self = StObject.set(x, "document-format", value.asInstanceOf[js.Any])
    
    inline def `setDocument-formatUndefined`: Self = StObject.set(x, "document-format", js.undefined)
    
    inline def `setPrinter-uri`(value: String): Self = StObject.set(x, "printer-uri", value.asInstanceOf[js.Any])
    
    inline def `setPrinter-uriUndefined`: Self = StObject.set(x, "printer-uri", js.undefined)
    
    inline def `setRequested-attributes`(
      value: js.Array[
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385, starting with typings.ipp.mod.RequestedPrinterAttributeGroups, typings.ipp.ippStrings.`accuracy-units-supported`, typings.ipp.ippStrings.`baling-type-supported` */ Any
        ]
    ): Self = StObject.set(x, "requested-attributes", value.asInstanceOf[js.Any])
    
    inline def `setRequested-attributesUndefined`: Self = StObject.set(x, "requested-attributes", js.undefined)
    
    inline def `setRequested-attributesVarargs`(
      value: (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 385, starting with typings.ipp.mod.RequestedPrinterAttributeGroups, typings.ipp.ippStrings.`accuracy-units-supported`, typings.ipp.ippStrings.`baling-type-supported` */ Any)*
    ): Self = StObject.set(x, "requested-attributes", js.Array(value*))
    
    inline def `setRequesting-user-name`(value: String): Self = StObject.set(x, "requesting-user-name", value.asInstanceOf[js.Any])
  }
}
