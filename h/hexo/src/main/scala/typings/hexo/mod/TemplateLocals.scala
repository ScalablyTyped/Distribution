package typings.hexo.mod

import typings.hexo.anon.Args
import typings.hexo.mod.Locals.Category
import typings.hexo.mod.Locals.Page
import typings.hexo.mod.Locals.Tag
import typings.underscore.mod.TypeOfCollection
import typings.underscore.mod.Underscore
import typings.underscore.mod.UnderscoreStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateLocals extends StObject {
  
  /*******
    * OOP *
    *******/
  /**
    * Underscore OOP Wrapper, all Underscore functions that take an object
    * as the first parameter can be invoked through this function.
    * @param value First argument to Underscore object functions.
    * @returns An Underscore wrapper around the supplied value.
    **/
  /**
    * Underscore object
    */
  @JSName("_")
  def _underscore[V](value: V): Underscore[TypeOfCollection[V, scala.Nothing], V]
  /**
    * Underscore object
    */
  @JSName("_")
  var _underscore_Original: UnderscoreStatic
  
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig
  
  var env: Args
  
  var layout: String
  
  var page: typings.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage
  
  var path: String
  
  var site: Any
  
  var theme: HexoConfig
  
  var url: String
  
  var view_dir: String
}
object TemplateLocals {
  
  inline def apply(
    _underscore: UnderscoreStatic,
    config: HexoConfig,
    env: Args,
    layout: String,
    page: typings.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage,
    path: String,
    site: Any,
    theme: HexoConfig,
    url: String,
    view_dir: String
  ): TemplateLocals = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], site = site.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], view_dir = view_dir.asInstanceOf[js.Any])
    __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateLocals]
  }
  
  extension [Self <: TemplateLocals](x: Self) {
    
    inline def setConfig(value: HexoConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setEnv(value: Args): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: String): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setPage(
      value: typings.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage
    ): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSite(value: Any): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setTheme(value: HexoConfig): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setView_dir(value: String): Self = StObject.set(x, "view_dir", value.asInstanceOf[js.Any])
    
    inline def set_underscore(value: UnderscoreStatic): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
  }
}
