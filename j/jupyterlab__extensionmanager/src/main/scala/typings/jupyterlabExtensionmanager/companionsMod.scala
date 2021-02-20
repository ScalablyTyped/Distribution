package typings.jupyterlabExtensionmanager

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabExtensionmanager.anon.Discovery
import typings.jupyterlabExtensionmanager.anon.Displayname
import typings.jupyterlabServices.restapiMod.ISpecModel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object companionsMod {
  
  @JSImport("@jupyterlab/extensionmanager/lib/companions", "presentCompanions")
  @js.native
  def presentCompanions(kernelCompanions: js.Array[KernelCompanion]): js.Promise[Boolean] = js.native
  @JSImport("@jupyterlab/extensionmanager/lib/companions", "presentCompanions")
  @js.native
  def presentCompanions(kernelCompanions: js.Array[KernelCompanion], serverCompanion: IInstallInfo): js.Promise[Boolean] = js.native
  
  @js.native
  trait IInstallInfo extends StObject {
    
    /**
      * The base/default install info.
      */
    var base: IInstallInfoEntry = js.native
    
    /**
      * Which package managers that have the package/module.
      */
    var managers: js.Array[String] = js.native
    
    /**
      * Overrides of the base install info on a per-manager basis.
      */
    var overrides: js.UndefOr[StringDictionary[js.UndefOr[IInstallInfoEntry]]] = js.native
  }
  object IInstallInfo {
    
    @scala.inline
    def apply(base: IInstallInfoEntry, managers: js.Array[String]): IInstallInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInstallInfo]
    }
    
    @scala.inline
    implicit class IInstallInfoMutableBuilder[Self <: IInstallInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: IInstallInfoEntry): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagers(value: js.Array[String]): Self = StObject.set(x, "managers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagersVarargs(value: String*): Self = StObject.set(x, "managers", js.Array(value :_*))
      
      @scala.inline
      def setOverrides(value: StringDictionary[js.UndefOr[IInstallInfoEntry]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    }
  }
  
  @js.native
  trait IInstallInfoEntry extends StObject {
    
    /**
      * Whether the package also includes the lab extension.
      */
    var bundles_extension: js.UndefOr[Boolean] = js.native
    
    /**
      * The name of the companion package/module.
      */
    var name: js.UndefOr[String] = js.native
  }
  object IInstallInfoEntry {
    
    @scala.inline
    def apply(): IInstallInfoEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInstallInfoEntry]
    }
    
    @scala.inline
    implicit class IInstallInfoEntryMutableBuilder[Self <: IInstallInfoEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBundles_extension(value: Boolean): Self = StObject.set(x, "bundles_extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundles_extensionUndefined: Self = StObject.set(x, "bundles_extension", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait IJupyterLabPackageData extends StObject {
    
    var jupyterlab: js.UndefOr[Discovery] = js.native
  }
  object IJupyterLabPackageData {
    
    @scala.inline
    def apply(): IJupyterLabPackageData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IJupyterLabPackageData]
    }
    
    @scala.inline
    implicit class IJupyterLabPackageDataMutableBuilder[Self <: IJupyterLabPackageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJupyterlab(value: Discovery): Self = StObject.set(x, "jupyterlab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJupyterlabUndefined: Self = StObject.set(x, "jupyterlab", js.undefined)
    }
  }
  
  @js.native
  trait IKernelInstallInfo extends IInstallInfo {
    
    /**
      * A specification of which kernels the current install info applies to.
      */
    var kernel_spec: Displayname = js.native
  }
  object IKernelInstallInfo {
    
    @scala.inline
    def apply(base: IInstallInfoEntry, kernel_spec: Displayname, managers: js.Array[String]): IKernelInstallInfo = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], kernel_spec = kernel_spec.asInstanceOf[js.Any], managers = managers.asInstanceOf[js.Any])
      __obj.asInstanceOf[IKernelInstallInfo]
    }
    
    @scala.inline
    implicit class IKernelInstallInfoMutableBuilder[Self <: IKernelInstallInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKernel_spec(value: Displayname): Self = StObject.set(x, "kernel_spec", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait KernelCompanion extends StObject {
    
    /**
      * The kernel companion install info.
      */
    var kernelInfo: IKernelInstallInfo = js.native
    
    /**
      * The kernels that match the install info.
      */
    var kernels: js.Array[ISpecModel] = js.native
  }
  object KernelCompanion {
    
    @scala.inline
    def apply(kernelInfo: IKernelInstallInfo, kernels: js.Array[ISpecModel]): KernelCompanion = {
      val __obj = js.Dynamic.literal(kernelInfo = kernelInfo.asInstanceOf[js.Any], kernels = kernels.asInstanceOf[js.Any])
      __obj.asInstanceOf[KernelCompanion]
    }
    
    @scala.inline
    implicit class KernelCompanionMutableBuilder[Self <: KernelCompanion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKernelInfo(value: IKernelInstallInfo): Self = StObject.set(x, "kernelInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernels(value: js.Array[ISpecModel]): Self = StObject.set(x, "kernels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelsVarargs(value: ISpecModel*): Self = StObject.set(x, "kernels", js.Array(value :_*))
    }
  }
}
