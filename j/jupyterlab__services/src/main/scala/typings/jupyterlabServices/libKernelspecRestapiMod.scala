package typings.jupyterlabServices

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabServices.libServerconnectionMod.ServerConnection.ISettings
import typings.luminoCoreutils.typesJsonMod.PartialJSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libKernelspecRestapiMod {
  
  @JSImport("@jupyterlab/services/lib/kernelspec/restapi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSpecs(): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")().asInstanceOf[js.Promise[ISpecModels]]
  inline def getSpecs(settings: ISettings): js.Promise[ISpecModels] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSpecs")(settings.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ISpecModels]]
  
  trait ISpecModel
    extends StObject
       with PartialJSONObject {
    
    /**
      * A list of command line arguments used to start the kernel.
      */
    val argv: js.Array[String]
    
    /**
      * The kernel’s name as it should be displayed in the UI.
      */
    val display_name: String
    
    /**
      * A dictionary of environment variables to set for the kernel.
      */
    val env: js.UndefOr[PartialJSONObject] = js.undefined
    
    /**
      * The name of the language of the kernel.
      */
    val language: String
    
    /**
      * A dictionary of additional attributes about this kernel; used by clients to aid in kernel selection.
      */
    val metadata: js.UndefOr[PartialJSONObject] = js.undefined
    
    /**
      * The name of the kernel spec.
      */
    val name: String
    
    /**
      * A mapping of resource file name to download path.
      */
    val resources: StringDictionary[String]
  }
  object ISpecModel {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: ISpecModel] (val x: Self) extends AnyVal {
      
      inline def setArgv(value: js.Array[String]): Self = StObject.set(x, "argv", value.asInstanceOf[js.Any])
      
      inline def setArgvVarargs(value: String*): Self = StObject.set(x, "argv", js.Array(value*))
      
      inline def setDisplay_name(value: String): Self = StObject.set(x, "display_name", value.asInstanceOf[js.Any])
      
      inline def setEnv(value: PartialJSONObject): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: PartialJSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResources(value: StringDictionary[String]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    }
  }
  
  trait ISpecModels
    extends StObject
       with PartialJSONObject {
    
    /**
      * The name of the default kernel spec.
      */
    var default: String
    
    /**
      * A mapping of kernel spec name to spec.
      */
    val kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]
  }
  object ISpecModels {
    
    inline def apply(default: String, kernelspecs: StringDictionary[js.UndefOr[ISpecModel]]): ISpecModels = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], kernelspecs = kernelspecs.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpecModels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ISpecModels] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setKernelspecs(value: StringDictionary[js.UndefOr[ISpecModel]]): Self = StObject.set(x, "kernelspecs", value.asInstanceOf[js.Any])
    }
  }
}
