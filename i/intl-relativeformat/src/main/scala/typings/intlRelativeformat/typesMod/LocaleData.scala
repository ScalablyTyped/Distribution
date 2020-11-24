package typings.intlRelativeformat.typesMod

import typings.intlRelativeformat.anon.finDATAFIELDdisplayNamest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleData extends js.Object {
  
  var fields: js.UndefOr[finDATAFIELDdisplayNamest] = js.native
  
  var locale: String = js.native
  
  var parentLocale: js.UndefOr[String] = js.native
}
object LocaleData {
  
  @scala.inline
  def apply(locale: String): LocaleData = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleData]
  }
  
  @scala.inline
  implicit class LocaleDataOps[Self <: LocaleData] (val x: Self) extends AnyVal {
    
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
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: finDATAFIELDdisplayNamest): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setParentLocale(value: String): Self = this.set("parentLocale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentLocale: Self = this.set("parentLocale", js.undefined)
  }
}
