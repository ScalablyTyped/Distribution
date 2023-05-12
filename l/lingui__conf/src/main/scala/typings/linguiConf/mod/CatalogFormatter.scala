package typings.linguiConf.mod

import typings.linguiConf.anon.Existing
import typings.linguiConf.anon.Filename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CatalogFormatter extends StObject {
  
  var catalogExtension: String
  
  def parse(content: String, ctx: Filename): js.Promise[CatalogType[CatalogExtra]] | CatalogType[CatalogExtra]
  
  def serialize(catalog: CatalogType[CatalogExtra], ctx: Existing): js.Promise[String] | String
  
  /**
    * Set extension used when extract to template
    * Omit if the extension is the same as catalogExtension
    */
  var templateExtension: js.UndefOr[String] = js.undefined
}
object CatalogFormatter {
  
  inline def apply(
    catalogExtension: String,
    parse: (String, Filename) => js.Promise[CatalogType[CatalogExtra]] | CatalogType[CatalogExtra],
    serialize: (CatalogType[CatalogExtra], Existing) => js.Promise[String] | String
  ): CatalogFormatter = {
    val __obj = js.Dynamic.literal(catalogExtension = catalogExtension.asInstanceOf[js.Any], parse = js.Any.fromFunction2(parse), serialize = js.Any.fromFunction2(serialize))
    __obj.asInstanceOf[CatalogFormatter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CatalogFormatter] (val x: Self) extends AnyVal {
    
    inline def setCatalogExtension(value: String): Self = StObject.set(x, "catalogExtension", value.asInstanceOf[js.Any])
    
    inline def setParse(value: (String, Filename) => js.Promise[CatalogType[CatalogExtra]] | CatalogType[CatalogExtra]): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setSerialize(value: (CatalogType[CatalogExtra], Existing) => js.Promise[String] | String): Self = StObject.set(x, "serialize", js.Any.fromFunction2(value))
    
    inline def setTemplateExtension(value: String): Self = StObject.set(x, "templateExtension", value.asInstanceOf[js.Any])
    
    inline def setTemplateExtensionUndefined: Self = StObject.set(x, "templateExtension", js.undefined)
  }
}
