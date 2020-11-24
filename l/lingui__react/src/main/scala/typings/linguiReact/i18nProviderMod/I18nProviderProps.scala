package typings.linguiReact.i18nProviderMod

import typings.linguiCore.i18nMod.Catalogs
import typings.linguiCore.mod.I18n_
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait I18nProviderProps extends js.Object {
  
  var catalogs: js.UndefOr[Catalogs] = js.native
  
  var children: js.UndefOr[ReactNode] = js.native
  
  var defaultRender: js.UndefOr[ReactNode] = js.native
  
  var i18n: js.UndefOr[I18n_] = js.native
  
  var language: String = js.native
  
  var locales: js.UndefOr[String | js.Array[String]] = js.native
  
  var missing: js.UndefOr[String | (js.Function2[/* language */ String, /* id */ String, String])] = js.native
}
object I18nProviderProps {
  
  @scala.inline
  def apply(language: String): I18nProviderProps = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[I18nProviderProps]
  }
  
  @scala.inline
  implicit class I18nProviderPropsOps[Self <: I18nProviderProps] (val x: Self) extends AnyVal {
    
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCatalogs(value: Catalogs): Self = this.set("catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogs: Self = this.set("catalogs", js.undefined)
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setDefaultRender(value: ReactNode): Self = this.set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultRender: Self = this.set("defaultRender", js.undefined)
    
    @scala.inline
    def setI18n(value: I18n_): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setLocalesVarargs(value: String*): Self = this.set("locales", js.Array(value :_*))
    
    @scala.inline
    def setLocales(value: String | js.Array[String]): Self = this.set("locales", value.asInstanceOf[js.Any])
    
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
