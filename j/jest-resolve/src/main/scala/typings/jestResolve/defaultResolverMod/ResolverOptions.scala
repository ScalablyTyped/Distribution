package typings.jestResolve.defaultResolverMod

import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverOptions extends js.Object {
  
  var allowPnp: js.UndefOr[Boolean] = js.native
  
  var basedir: Path = js.native
  
  var browser: js.UndefOr[Boolean] = js.native
  
  def defaultResolver(path: Path, options: this.type): Path = js.native
  @JSName("defaultResolver")
  var defaultResolver_Original: js.Function2[/* path */ Path, /* options */ this.type, Path] = js.native
  
  var extensions: js.UndefOr[js.Array[String]] = js.native
  
  var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
  
  var packageFilter: js.UndefOr[js.Function2[/* pkg */ js.Any, /* pkgfile */ String, _]] = js.native
  
  var paths: js.UndefOr[js.Array[Path]] = js.native
  
  var rootDir: js.UndefOr[Path] = js.native
}
