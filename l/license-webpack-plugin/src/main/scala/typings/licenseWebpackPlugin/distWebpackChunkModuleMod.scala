package typings.licenseWebpackPlugin

import typings.licenseWebpackPlugin.anon.DescriptionFileData
import typings.licenseWebpackPlugin.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distWebpackChunkModuleMod {
  
  trait WebpackChunkModule extends StObject {
    
    var dependencies: js.UndefOr[js.Array[WebpackChunkModule]] = js.undefined
    
    var fileDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var originModule: js.UndefOr[Resource] = js.undefined
    
    var resource: js.UndefOr[String] = js.undefined
    
    var resourceResolveData: js.UndefOr[DescriptionFileData] = js.undefined
    
    var rootModule: js.UndefOr[Resource] = js.undefined
  }
  object WebpackChunkModule {
    
    inline def apply(): WebpackChunkModule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebpackChunkModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WebpackChunkModule] (val x: Self) extends AnyVal {
      
      inline def setDependencies(value: js.Array[WebpackChunkModule]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: WebpackChunkModule*): Self = StObject.set(x, "dependencies", js.Array(value*))
      
      inline def setFileDependencies(value: js.Array[String]): Self = StObject.set(x, "fileDependencies", value.asInstanceOf[js.Any])
      
      inline def setFileDependenciesUndefined: Self = StObject.set(x, "fileDependencies", js.undefined)
      
      inline def setFileDependenciesVarargs(value: String*): Self = StObject.set(x, "fileDependencies", js.Array(value*))
      
      inline def setOriginModule(value: Resource): Self = StObject.set(x, "originModule", value.asInstanceOf[js.Any])
      
      inline def setOriginModuleUndefined: Self = StObject.set(x, "originModule", js.undefined)
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceResolveData(value: DescriptionFileData): Self = StObject.set(x, "resourceResolveData", value.asInstanceOf[js.Any])
      
      inline def setResourceResolveDataUndefined: Self = StObject.set(x, "resourceResolveData", js.undefined)
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setRootModule(value: Resource): Self = StObject.set(x, "rootModule", value.asInstanceOf[js.Any])
      
      inline def setRootModuleUndefined: Self = StObject.set(x, "rootModule", js.undefined)
    }
  }
}
