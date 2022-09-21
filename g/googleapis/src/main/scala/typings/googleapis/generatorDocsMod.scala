package typings.googleapis

import typings.execa.mod.ExecaChildProcess
import typings.execa.mod.Options
import typings.googleapis.anon.Call
import typings.googleapis.anon.FnCallPathOptions
import typings.node.anon.MakeDirectoryOptionsrecur
import typings.node.anon.MakeDirectoryOptionsrecurMode
import typings.node.fsMod.MakeDirectoryOptions
import typings.node.fsMod.Mode
import typings.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object generatorDocsMod {
  
  @JSImport("googleapis/build/src/generator/docs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object gfs {
    
    @JSImport("googleapis/build/src/generator/docs", "gfs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("googleapis/build/src/generator/docs", "gfs.execa")
    @js.native
    def execa: Call = js.native
    inline def execa(file: String): ExecaChildProcess[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("execa")(file.asInstanceOf[js.Any]).asInstanceOf[ExecaChildProcess[String]]
    inline def execa(file: String, arguments: js.Array[String]): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execa")(file.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
    inline def execa(file: String, arguments: js.Array[String], options: Options[Null | String]): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execa")(file.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
    inline def execa(file: String, arguments: Unit, options: Options[Null | String]): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execa")(file.asInstanceOf[js.Any], arguments.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
    inline def execa(file: String, options: Options[Null | String]): ExecaChildProcess[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("execa")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ExecaChildProcess[String]]
    inline def execa_=(x: Call): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("execa")(x.asInstanceOf[js.Any])
    
    @JSImport("googleapis/build/src/generator/docs", "gfs.exists")
    @js.native
    def exists: js.Function1[/* path */ PathLike, Boolean] = js.native
    inline def exists(path: PathLike): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exists")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def exists_=(x: js.Function1[/* path */ PathLike, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("exists")(x.asInstanceOf[js.Any])
    
    @JSImport("googleapis/build/src/generator/docs", "gfs.mkdir")
    @js.native
    def mkdir: FnCallPathOptions = js.native
    inline def mkdir(path: PathLike): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecur): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptionsrecurMode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def mkdir(path: PathLike, options: MakeDirectoryOptions): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdir(path: PathLike, options: Mode): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
    inline def mkdir_=(x: FnCallPathOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mkdir")(x.asInstanceOf[js.Any])
    
    inline def mkdir_Unit(path: PathLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def mkdir_Unit(path: PathLike, options: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(path.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @JSImport("googleapis/build/src/generator/docs", "gfs.readdir")
    @js.native
    def readdir: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any = js.native
    inline def readdir_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.readdir.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readdir")(x.asInstanceOf[js.Any])
    
    @JSImport("googleapis/build/src/generator/docs", "gfs.writeFile")
    @js.native
    def writeFile: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any = js.native
    inline def writeFile_=(
      x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof fs.writeFile.__promisify__ */ Any
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFile")(x.asInstanceOf[js.Any])
  }
  
  inline def main(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")().asInstanceOf[js.Promise[Unit]]
}
