package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILanguageInfo extends ILanguageInfoMetadata {
  
  var nbconverter_exporter: js.UndefOr[String] = js.native
  
  var version: String = js.native
}
object ILanguageInfo {
  
  @scala.inline
  def apply(name: String, version: String): ILanguageInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguageInfo]
  }
  
  @scala.inline
  implicit class ILanguageInfoMutableBuilder[Self <: ILanguageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNbconverter_exporter(value: String): Self = StObject.set(x, "nbconverter_exporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbconverter_exporterUndefined: Self = StObject.set(x, "nbconverter_exporter", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
