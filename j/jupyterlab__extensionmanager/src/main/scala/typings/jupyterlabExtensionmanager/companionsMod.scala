package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Discovery
import typings.jupyterlabExtensionmanager.anon.Displayname
import typings.jupyterlabServices.restapiMod.ISpecModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companionsMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/companions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def presentCompanions(kernelCompanions: js.Array[KernelCompanion]): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("presentCompanions")(kernelCompanions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def presentCompanions(kernelCompanions: js.Array[KernelCompanion], serverCompanion: IInstallInfo): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("presentCompanions")(kernelCompanions.asInstanceOf[js.Any], serverCompanion.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  trait IInstallInfo extends StObject {
    
    /**
      * The base/default install info.
      */
    var base: IInstallInfoEntry
    
    /**
      * Which package managers that have the package/module.
      */
    var managers: js.Array[String]
    
    /**
      * Overrides of the base install info on a per-manager basis.
      */
    var overrides: js.UndefOr[StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.undefined
  }
  object IInstallInfo {
    
    inline def apply(base: IInstallInfoEntry, managers: js.Array[String]): IInstallInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInstallInfo]
    }
    
    extension [Self <: IInstallInfo](x: Self) {
      
      inline def setBase(value: IInstallInfoEntry): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      inline def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      inline def setOverrides(value: StringDictionary[js.UndefOr[IInstallInfoEntry]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  trait IInstallInfoEntry extends StObject {
    
    /**
      * Whether the package also includes the lab extension.
      */
    var bundles_extension: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of the companion package/module.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object IInstallInfoEntry {
    
    inline def apply(): IInstallInfoEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInstallInfoEntry]
    }
    
    extension [Self <: IInstallInfoEntry](x: Self) {
      
      inline def setBundles_extension(value: Boolean): Self = StObject.set(x, "bundles_extension", value.asInstanceOf[js.Any])
      
      inline def setBundles_extensionUndefined: Self = StObject.set(x, "bundles_extension", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait IJupyterLabPackageData extends StObject {
    
    var jupyterlab: js.UndefOr[Discovery] = js.undefined
  }
  object IJupyterLabPackageData {
    
    inline def apply(): IJupyterLabPackageData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJupyterLabPackageData]
    }
    
    extension [Self <: IJupyterLabPackageData](x: Self) {
      
      inline def setJupyterlab(value: Discovery): Self = StObject.set(x, "jupyterlab", value.asInstanceOf[js.Any])
      
      inline def setJupyterlabUndefined: Self = StObject.set(x, "jupyterlab", js.undefined)
    }
  }
  
  trait IKernelInstallInfo
    extends StObject
       with IInstallInfo {
    
    /**
      * A specification of which kernels the current install info applies to.
      */
    var kernel_spec: Displayname
  }
  object IKernelInstallInfo {
    
    inline def apply(base: IInstallInfoEntry, kernel_spec: Displayname, managers: js.Array[String]): IKernelInstallInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], kernel_spec = kernel_spec.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKernelInstallInfo]
    }
    
    extension [Self <: IKernelInstallInfo](x: Self) {
      
      inline def setKernel_spec(value: Displayname): Self = StObject.set(x, "kernel_spec", value.asInstanceOf[js.Any])
    }
  }
  
  trait KernelCompanion extends StObject {
    
    /**
      * The kernel companion install info.
      */
    var kernelInfo: IKernelInstallInfo
    
    /**
      * The kernels that match the install info.
      */
    var kernels: js.Array[ISpecModel]
  }
  object KernelCompanion {
    
    inline def apply(kernelInfo: IKernelInstallInfo, kernels: js.Array[ISpecModel]): KernelCompanion = {
      val __obj = js.Dynamic.literal(kernelInfo = kernelInfo.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelCompanion]
    }
    
    extension [Self <: KernelCompanion](x: Self) {
      
      inline def setKernelInfo(value: IKernelInstallInfo): Self = StObject.set(x, "kernelInfo", value.asInstanceOf[js.Any])
      
      inline def setKernels(value: js.Array[ISpecModel]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
      
      inline def setKernelsVarargs(value: ISpecModel*): Self = StObject.set(x, "kernels", js.Array(value :_*))
    }
  }
}
