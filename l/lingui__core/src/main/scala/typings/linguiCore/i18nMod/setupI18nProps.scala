package typings.linguiCore.i18nMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait setupI18nProps extends js.Object {
  
  var catalogs: js.UndefOr[Catalogs] = js.native
  
  var development: js.UndefOr[js.Object] = js.native
  
  var language: js.UndefOr[String] = js.native
  
  var locales: js.UndefOr[js.Array[String]] = js.native
  
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.native
}
object setupI18nProps {
  
  @scala.inline
  def apply(): setupI18nProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[setupI18nProps]
  }
  
  @scala.inline
  implicit class setupI18nPropsOps[Self <: setupI18nProps] (val x: Self) extends AnyVal {
    
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
    def setCatalogs(value: Catalogs): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    
    @scala.inline
    def setDevelopment(value: js.Object): Self = this.set("development", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevelopment: Self = this.set("development", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocales: Self = this.set("locales", js.undefined)
    
    @scala.inline
    def setMissingFunction2(value: (/* language */ String, /* id */ String) => String): Self = this.set("missing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMissing(value: String | (js.Function2[/* language */ String, /* id */ String, String])): Self = this.set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMissing: Self = this.set("missing", js.undefined)
  }
}
