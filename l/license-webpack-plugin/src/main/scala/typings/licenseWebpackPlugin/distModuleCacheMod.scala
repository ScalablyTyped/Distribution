package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.distLicenseIdentifiedModuleMod.LicenseIdentifiedModule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleCacheMod {
  
  trait ModuleCache extends StObject {
    
    def alreadySeenForChunk(chunkName: String, packageName: String): Boolean
    
    def getAllModules(): js.Array[LicenseIdentifiedModule]
    
    def getAllModulesForChunk(chunkName: String): js.Array[LicenseIdentifiedModule]
    
    def getModule(packageName: String): LicenseIdentifiedModule | Null
    
    def markSeenForChunk(chunkName: String, packageName: String): Unit
    
    def registerModule(chunkName: String, module: LicenseIdentifiedModule): Unit
  }
  object ModuleCache {
    
    inline def apply(
      alreadySeenForChunk: (String, String) => Boolean,
      getAllModules: () => js.Array[LicenseIdentifiedModule],
      getAllModulesForChunk: String => js.Array[LicenseIdentifiedModule],
      getModule: String => LicenseIdentifiedModule | Null,
      markSeenForChunk: (String, String) => Unit,
      registerModule: (String, LicenseIdentifiedModule) => Unit
    ): ModuleCache = {
      val __obj = js.Dynamic.literal(alreadySeenForChunk = js.Any.fromFunction2(alreadySeenForChunk), getAllModules = js.Any.fromFunction0(getAllModules), getAllModulesForChunk = js.Any.fromFunction1(getAllModulesForChunk), getModule = js.Any.fromFunction1(getModule), markSeenForChunk = js.Any.fromFunction2(markSeenForChunk), registerModule = js.Any.fromFunction2(registerModule))
      __obj.asInstanceOf[ModuleCache]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModuleCache] (val x: Self) extends AnyVal {
      
      inline def setAlreadySeenForChunk(value: (String, String) => Boolean): Self = StObject.set(x, "alreadySeenForChunk", js.Any.fromFunction2(value))
      
      inline def setGetAllModules(value: () => js.Array[LicenseIdentifiedModule]): Self = StObject.set(x, "getAllModules", js.Any.fromFunction0(value))
      
      inline def setGetAllModulesForChunk(value: String => js.Array[LicenseIdentifiedModule]): Self = StObject.set(x, "getAllModulesForChunk", js.Any.fromFunction1(value))
      
      inline def setGetModule(value: String => LicenseIdentifiedModule | Null): Self = StObject.set(x, "getModule", js.Any.fromFunction1(value))
      
      inline def setMarkSeenForChunk(value: (String, String) => Unit): Self = StObject.set(x, "markSeenForChunk", js.Any.fromFunction2(value))
      
      inline def setRegisterModule(value: (String, LicenseIdentifiedModule) => Unit): Self = StObject.set(x, "registerModule", js.Any.fromFunction2(value))
    }
  }
}
