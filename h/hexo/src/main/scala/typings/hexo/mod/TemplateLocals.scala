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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
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
  def _underscore[V](value: V): Underscore[TypeOfCollection[V, scala.Nothing], V] = js.native
  /**
    * Underscore object
    */
  @JSName("_")
  var _underscore_Original: UnderscoreStatic = js.native
  
  /**
    * Site settings in `_config.yml`
    */
  var config: HexoConfig = js.native
  
  var env: Args = js.native
  
  var layout: String = js.native
  
  var page: typings.hexo.mod.Locals.Post | Page | Category | Tag | IndexPage | ArchivePage | CategoryPage | TagPage = js.native
  
  var path: String = js.native
  
  var site: js.Any = js.native
  
  var theme: HexoConfig = js.native
  
  var url: String = js.native
  
  var view_dir: String = js.native
}
