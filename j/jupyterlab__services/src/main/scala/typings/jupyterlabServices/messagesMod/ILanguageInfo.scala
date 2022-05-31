package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILanguageInfo
  extends StObject
     with ILanguageInfoMetadata {
  
  var nbconverter_exporter: js.UndefOr[String] = js.undefined
  
  var version: String
}
object ILanguageInfo {
  
  inline def apply(name: String, version: String): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
  
  extension [Self <: ILanguageInfo](x: Self) {
    
    inline def setNbconverter_exporter(value: String): Self = StObject.set(x, "nbconverter_exporter", value.asInstanceOf[js.Any])
    
    inline def setNbconverter_exporterUndefined: Self = StObject.set(x, "nbconverter_exporter", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
