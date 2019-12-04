package typings.jestDashResolve

import typings.atJestTypes.buildConfigMod.Path
import typings.jestDashResolve.buildDefaultResolverMod.ResolverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-resolve/build/defaultResolver", JSImport.Namespace)
@js.native
object buildDefaultResolverMod extends js.Object {
  @js.native
  trait ResolverOptions extends js.Object {
    var basedir: Path = js.native
    var browser: js.UndefOr[Boolean] = js.native
    @JSName("defaultResolver")
    var defaultResolver_Original: js.Function2[/* path */ Path, /* options */ this.type, Path] = js.native
    var extensions: js.UndefOr[js.Array[String]] = js.native
    var moduleDirectory: js.UndefOr[js.Array[String]] = js.native
    var paths: js.UndefOr[js.Array[Path]] = js.native
    var rootDir: js.UndefOr[Path] = js.native
    def defaultResolver(path: Path, options: this.type): Path = js.native
  }
  
  def clearDefaultResolverCache(): Unit = js.native
  def default(path: Path, options: ResolverOptions): Path = js.native
}

