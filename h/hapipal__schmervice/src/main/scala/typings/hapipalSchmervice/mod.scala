package typings.hapipalSchmervice

import org.scalablytyped.runtime.StringDictionary
import typings.hapiHapi.mod.Plugin
import typings.hapiHapi.mod.ServerMethodOptions
import typings.hapiHapi.mod.ServerOptionsCache
import typings.hapiHapi.mod.Server_
import typings.hapipalSchmervice.hapipalSchmerviceStrings.bind
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapipal/schmervice", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapipal/schmervice", "Service")
  @js.native
  open class Service protected ()
    extends StObject
       with _RegisterServiceConfiguration {
    def this(server: Server_, options: ServiceOptions) = this()
    
    def bind(): this.type = js.native
    
    def caching(options: ServiceCachingOptions): Unit = js.native
    
    // object matches https://github.com/DefinitelyTyped/DefinitelyTyped/blob/master/types/hapi__hapi/index.d.ts#L3104
    // null matches else case in schmervice
    def context: js.Object | Null = js.native
    
    var initialize: js.UndefOr[js.Function0[Unit]] = js.native
    
    var options: ServiceOptions = js.native
    
    var server: Server_ = js.native
    
    var static: Any = js.native
    
    var teardown: js.UndefOr[js.Function0[Unit]] = js.native
  }
  /* static members */
  object Service {
    
    @JSImport("@hapipal/schmervice", "Service")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@hapipal/schmervice", "Service.caching")
    @js.native
    def caching: ServiceCachingOptions = js.native
    inline def caching_=(x: ServiceCachingOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caching")(x.asInstanceOf[js.Any])
  }
  
  inline def ServiceFactory(server: Server_, options: js.Object): ServiceRegistrationObject = (^.asInstanceOf[js.Dynamic].applyDynamic("ServiceFactory")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ServiceRegistrationObject]
  
  @JSImport("@hapipal/schmervice", "name")
  @js.native
  val name: js.Symbol = js.native
  
  @JSImport("@hapipal/schmervice", "plugin")
  @js.native
  val plugin: Plugin[js.Object] = js.native
  
  @JSImport("@hapipal/schmervice", "sandbox")
  @js.native
  val sandbox: js.Symbol = js.native
  
  inline def withName(name: String, options: WithNameOptions, serviceFactory: RegisterServiceConfiguration): RegisterServiceConfiguration = (^.asInstanceOf[js.Dynamic].applyDynamic("withName")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], serviceFactory.asInstanceOf[js.Any])).asInstanceOf[RegisterServiceConfiguration]
  
  /* Rewritten from type alias, can be one of: 
    - js.Function2[
  / * server * / typings.hapiHapi.mod.Server_, 
  / * options * / js.Object, 
  typings.hapipalSchmervice.mod.ServiceRegistrationObject]
    - typings.hapipalSchmervice.mod.Service
    - js.Array[typings.hapipalSchmervice.mod.Service]
    - typings.hapipalSchmervice.mod.ServiceRegistrationObject
  */
  type RegisterServiceConfiguration = _RegisterServiceConfiguration | (js.Function2[/* server */ Server_, /* options */ js.Object, ServiceRegistrationObject]) | js.Array[Service]
  
  type RegisteredServices = StringDictionary[Service]
  
  type ServiceCachingOptions = StringDictionary[ServerOptionsCache | (Exclude[ServerMethodOptions, bind])]
  
  type ServiceOptions = Any
  
  @js.native
  trait ServiceRegistrationObject
    extends StObject
       with // any is necessary here as implementation is left to the developers
  // without this member the tests fail as the Schmervice.withName factory
  // has no members in common with this interface
  /* serviceMethod */ StringDictionary[Any]
       with _RegisterServiceConfiguration {
    
    var caching: js.UndefOr[ServiceCachingOptions] = js.native
    
    var name: js.UndefOr[String] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.hapipalSchmervice.hapipalSchmerviceStrings.plugin
    - typings.hapipalSchmervice.hapipalSchmerviceStrings.server
  */
  type ServiceSandbox = _ServiceSandbox | Boolean
  
  trait WithNameOptions extends StObject {
    
    var sandbox: js.UndefOr[ServiceSandbox] = js.undefined
  }
  object WithNameOptions {
    
    inline def apply(): WithNameOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithNameOptions]
    }
    
    extension [Self <: WithNameOptions](x: Self) {
      
      inline def setSandbox(value: ServiceSandbox): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    }
  }
  
  trait _RegisterServiceConfiguration extends StObject
  
  trait _ServiceSandbox extends StObject
  
  // sets up types for the functions added via hapi decorations
  /* augmented module */
  object hapiHapiAugmentingMod {
    
    @js.native
    trait Request extends StObject {
      
      def services(): RegisteredServices = js.native
      def services(all: Boolean): RegisteredServices = js.native
    }
    
    @js.native
    trait ResponseToolkit extends StObject {
      
      def services(): RegisteredServices = js.native
      def services(all: Boolean): RegisteredServices = js.native
    }
    
    @js.native
    trait Server extends StObject {
      
      def registerService(config: RegisterServiceConfiguration): Unit = js.native
      
      def services(): RegisteredServices = js.native
      def services(all: Boolean): RegisteredServices = js.native
    }
  }
}
