package typings.jupyterlabServices

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typings.luminoCoreutils.jsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restapiMod {
  
  @JSImport("@jupyterlab/services/lib/kernelspec/restapi", "getSpecs")
  @js.native
  def getSpecs(): js.Promise[ISpecModels] = js.native
  @JSImport("@jupyterlab/services/lib/kernelspec/restapi", "getSpecs")
  @js.native
  def getSpecs(settings: ISettings): js.Promise[ISpecModels] = js.native
  
  @js.native
  trait ISpecModel extends PartialJSONObject {
    
    /**
      * A list of command line arguments used to start the kernel.
      */
    val argv: js.Array[String] = js.native
    
    /**
      * The kernel’s name as it should be displayed in the UI.
      */
    val display_name: String = js.native
    
    /**
      * A dictionary of environment variables to set for the kernel.
      */
    val env: js.UndefOr[PartialJSONObject] = js.native
    
    /**
      * The name of the language of the kernel.
      */
    val language: String = js.native
    
    /**
      * A dictionary of additional attributes about this kernel; used by clients to aid in kernel selection.
      */
    val metadata: js.UndefOr[PartialJSONObject] = js.native
    
    /**
      * The name of the kernel spec.
      */
    val name: String = js.native
    
    /**
      * A mapping of resource file name to download path.
      */
    val resources: StringDictionary[String] = js.native
  }
  object ISpecModel {
    
    @scala.inline
    def apply(
      argv: js.Array[String],
      display_name: String,
      language: String,
      name: String,
      resources: StringDictionary[String]
    ): ISpecModel = {
      val __obj = js.Dynamic.literal(argv = argv.asInstanceOf[js.Any], display_name = display_name.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpecModel]
    }
    
    @scala.inline
    implicit class ISpecModelMutableBuilder[Self <: ISpecModel] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value :_*))
      
      @scala.inline
      def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnv(value: PartialJSONObject): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: PartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpecModels extends PartialJSONObject {
    
    /**
      * The name of the default kernel spec.
      */
    var default: String = js.native
    
    /**
      * A mapping of kernel spec name to spec.
      */
    val kernelspecs: StringDictionary[js.UndefOr[ISpecModel]] = js.native
  }
  object ISpecModels {
    
    @scala.inline
    def apply(default: String, kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]): ISpecModels = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpecModels]
    }
    
    @scala.inline
    implicit class ISpecModelsMutableBuilder[Self <: ISpecModels] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKernelspecs(value: StringDictionary[js.UndefOr[ISpecModel]]): Self = StObject.set(x, "kernelspecs", value.asInstanceOf[js.Any])
    }
  }
}
