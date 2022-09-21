package typings.googleapis

import typings.googleapis.anon.FnCallFileDataOptions
import typings.node.fsMod.PathOrFileDescriptor
import typings.node.fsMod.WriteFileOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object disclaimerMod {
  
  @JSImport("googleapis/build/src/generator/disclaimer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object gfs {
    
    @JSImport("googleapis/build/src/generator/disclaimer", "gfs")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("googleapis/build/src/generator/disclaimer", "gfs.writeFileSync")
    @js.native
    def writeFileSync: FnCallFileDataOptions = js.native
    inline def writeFileSync(file: PathOrFileDescriptor, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: String, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: js.typedarray.ArrayBufferView): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync(file: PathOrFileDescriptor, data: js.typedarray.ArrayBufferView, options: WriteFileOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(file.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def writeFileSync_=(x: FnCallFileDataOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeFileSync")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("googleapis/build/src/generator/disclaimer", "libraryListUrl")
  @js.native
  val libraryListUrl: /* "https://raw.githubusercontent.com/googleapis/google-cloud-node/main/libraries.json" */ String = js.native
  
  inline def main(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("main")().asInstanceOf[js.Promise[Unit]]
  
  trait Disclaimer extends StObject {
    
    @JSName("package")
    var _package: String
    
    var api: String
  }
  object Disclaimer {
    
    inline def apply(_package: String, api: String): Disclaimer = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Disclaimer]
    }
    
    extension [Self <: Disclaimer](x: Self) {
      
      inline def setApi(value: String): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  trait LibraryMetadata extends StObject {
    
    var api_id: String
    
    var client_documentation: String
    
    var distribution_name: String
    
    var issue_tracker: String
    
    var language: String
    
    var name: String
    
    var name_pretty: String
    
    var product_documentation: String
    
    var release_level: String
    
    var repo: String
    
    var requires_billing: Boolean
  }
  object LibraryMetadata {
    
    inline def apply(
      api_id: String,
      client_documentation: String,
      distribution_name: String,
      issue_tracker: String,
      language: String,
      name: String,
      name_pretty: String,
      product_documentation: String,
      release_level: String,
      repo: String,
      requires_billing: Boolean
    ): LibraryMetadata = {
      val __obj = js.Dynamic.literal(api_id = api_id.asInstanceOf[js.Any], client_documentation = client_documentation.asInstanceOf[js.Any], distribution_name = distribution_name.asInstanceOf[js.Any], issue_tracker = issue_tracker.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], name_pretty = name_pretty.asInstanceOf[js.Any], product_documentation = product_documentation.asInstanceOf[js.Any], release_level = release_level.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], requires_billing = requires_billing.asInstanceOf[js.Any])
      __obj.asInstanceOf[LibraryMetadata]
    }
    
    extension [Self <: LibraryMetadata](x: Self) {
      
      inline def setApi_id(value: String): Self = StObject.set(x, "api_id", value.asInstanceOf[js.Any])
      
      inline def setClient_documentation(value: String): Self = StObject.set(x, "client_documentation", value.asInstanceOf[js.Any])
      
      inline def setDistribution_name(value: String): Self = StObject.set(x, "distribution_name", value.asInstanceOf[js.Any])
      
      inline def setIssue_tracker(value: String): Self = StObject.set(x, "issue_tracker", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setName_pretty(value: String): Self = StObject.set(x, "name_pretty", value.asInstanceOf[js.Any])
      
      inline def setProduct_documentation(value: String): Self = StObject.set(x, "product_documentation", value.asInstanceOf[js.Any])
      
      inline def setRelease_level(value: String): Self = StObject.set(x, "release_level", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
      
      inline def setRequires_billing(value: Boolean): Self = StObject.set(x, "requires_billing", value.asInstanceOf[js.Any])
    }
  }
}
