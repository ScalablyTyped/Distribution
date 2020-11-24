package typings.jupyterlabServices.messagesMod

import typings.jupyterlabNbformat.mod.ILanguageInfoMetadata
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
  implicit class ILanguageInfoOps[Self <: ILanguageInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNbconverter_exporter(value: String): Self = this.set("nbconverter_exporter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNbconverter_exporter: Self = this.set("nbconverter_exporter", js.undefined)
  }
}
