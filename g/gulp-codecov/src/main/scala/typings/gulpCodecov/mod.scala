package typings.gulpCodecov

import typings.node.streamMod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): Transform = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Transform]
  inline def apply(options: CodecovOptions): Transform = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Transform]
  
  @JSImport("gulp-codecov", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CodecovOptions extends StObject {
    
    var branch: js.UndefOr[String] = js.undefined
    
    var build: js.UndefOr[String] = js.undefined
    
    var clear: js.UndefOr[Boolean] = js.undefined
    
    var commit: js.UndefOr[String] = js.undefined
    
    var disable: js.UndefOr[String] = js.undefined
    
    var dump: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[String] = js.undefined
    
    var file: js.UndefOr[String] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var `gcov-args`: js.UndefOr[String] = js.undefined
    
    var `gcov-exec`: js.UndefOr[String] = js.undefined
    
    var `gcov-glob`: js.UndefOr[String] = js.undefined
    
    var `gcov-root`: js.UndefOr[String] = js.undefined
    
    var pipe: js.UndefOr[Boolean] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
    
    var slug: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
    
    var url: js.UndefOr[String] = js.undefined
    
    var yml: js.UndefOr[String] = js.undefined
  }
  object CodecovOptions {
    
    inline def apply(): CodecovOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CodecovOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodecovOptions] (val x: Self) extends AnyVal {
      
      inline def setBranch(value: String): Self = StObject.set(x, "branch", value.asInstanceOf[js.Any])
      
      inline def setBranchUndefined: Self = StObject.set(x, "branch", js.undefined)
      
      inline def setBuild(value: String): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildUndefined: Self = StObject.set(x, "build", js.undefined)
      
      inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setDisable(value: String): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setDump(value: Boolean): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
      
      inline def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
      
      inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def `setGcov-args`(value: String): Self = StObject.set(x, "gcov-args", value.asInstanceOf[js.Any])
      
      inline def `setGcov-argsUndefined`: Self = StObject.set(x, "gcov-args", js.undefined)
      
      inline def `setGcov-exec`(value: String): Self = StObject.set(x, "gcov-exec", value.asInstanceOf[js.Any])
      
      inline def `setGcov-execUndefined`: Self = StObject.set(x, "gcov-exec", js.undefined)
      
      inline def `setGcov-glob`(value: String): Self = StObject.set(x, "gcov-glob", value.asInstanceOf[js.Any])
      
      inline def `setGcov-globUndefined`: Self = StObject.set(x, "gcov-glob", js.undefined)
      
      inline def `setGcov-root`(value: String): Self = StObject.set(x, "gcov-root", value.asInstanceOf[js.Any])
      
      inline def `setGcov-rootUndefined`: Self = StObject.set(x, "gcov-root", js.undefined)
      
      inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      inline def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      inline def setSlugUndefined: Self = StObject.set(x, "slug", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setYml(value: String): Self = StObject.set(x, "yml", value.asInstanceOf[js.Any])
      
      inline def setYmlUndefined: Self = StObject.set(x, "yml", js.undefined)
    }
  }
}
