package typings.lockfileInfo

import typings.lockfileInfo.lockfileInfoInts.`1`
import typings.lockfileInfo.lockfileInfoInts.`2`
import typings.lockfileInfo.lockfileInfoInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @async */
  inline def apply(): js.Promise[LockfileInfo] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[LockfileInfo]]
  inline def apply(cwd: String): js.Promise[LockfileInfo] = ^.asInstanceOf[js.Dynamic].apply(cwd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LockfileInfo]]
  
  @JSImport("lockfile-info", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait LockfileInfo extends StObject {
    
    var hasLockfile: Boolean
    
    var hasNodeModulesDir: Boolean
    
    var hasPackageJSON: Boolean
    
    var hasPackageLock: Boolean
    
    var hasShrinkwrap: Boolean
    
    var lockfileVersion: Double | `1` | `2` | `3`
  }
  object LockfileInfo {
    
    inline def apply(
      hasLockfile: Boolean,
      hasNodeModulesDir: Boolean,
      hasPackageJSON: Boolean,
      hasPackageLock: Boolean,
      hasShrinkwrap: Boolean,
      lockfileVersion: Double | `1` | `2` | `3`
    ): LockfileInfo = {
      val __obj = js.Dynamic.literal(hasLockfile = hasLockfile.asInstanceOf[js.Any], hasNodeModulesDir = hasNodeModulesDir.asInstanceOf[js.Any], hasPackageJSON = hasPackageJSON.asInstanceOf[js.Any], hasPackageLock = hasPackageLock.asInstanceOf[js.Any], hasShrinkwrap = hasShrinkwrap.asInstanceOf[js.Any], lockfileVersion = lockfileVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[LockfileInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LockfileInfo] (val x: Self) extends AnyVal {
      
      inline def setHasLockfile(value: Boolean): Self = StObject.set(x, "hasLockfile", value.asInstanceOf[js.Any])
      
      inline def setHasNodeModulesDir(value: Boolean): Self = StObject.set(x, "hasNodeModulesDir", value.asInstanceOf[js.Any])
      
      inline def setHasPackageJSON(value: Boolean): Self = StObject.set(x, "hasPackageJSON", value.asInstanceOf[js.Any])
      
      inline def setHasPackageLock(value: Boolean): Self = StObject.set(x, "hasPackageLock", value.asInstanceOf[js.Any])
      
      inline def setHasShrinkwrap(value: Boolean): Self = StObject.set(x, "hasShrinkwrap", value.asInstanceOf[js.Any])
      
      inline def setLockfileVersion(value: Double | `1` | `2` | `3`): Self = StObject.set(x, "lockfileVersion", value.asInstanceOf[js.Any])
    }
  }
}
