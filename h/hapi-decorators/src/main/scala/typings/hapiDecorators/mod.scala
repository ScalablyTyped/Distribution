package typings.hapiDecorators

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hapi-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("hapi-decorators", "all")
  @js.native
  val all: IRouteConfig = js.native
  
  @scala.inline
  def cache(cacheConfig: ICacheConfig): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cache")(cacheConfig.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def config(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteAdditionalConfigurationOptions */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @scala.inline
  def controller(baseUrl: String): js.Function1[/* target */ ControllerStatic, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("controller")(baseUrl.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* target */ ControllerStatic, Unit]]
  
  @JSImport("hapi-decorators", "get")
  @js.native
  val get: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "patch")
  @js.native
  val patch: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "post")
  @js.native
  val post: IRouteConfig = js.native
  
  @scala.inline
  def pre(pre: StringDictionary[js.Any]): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("pre")(pre.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @JSImport("hapi-decorators", "put")
  @js.native
  val put: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "route")
  @js.native
  val route: IRouteDecorator = js.native
  
  @scala.inline
  def validate(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteValidationConfigurationObject */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(config.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]]
  
  @js.native
  trait ControllerStatic
    extends StObject
       with Instantiable1[/* args (repeated) */ js.Any, Controller_]
  
  trait Controller_ extends StObject {
    
    var baseUrl: String
    
    def routes(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ js.Any
      ]
  }
  object Controller_ {
    
    @scala.inline
    def apply(
      baseUrl: String,
      routes: () => js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ js.Any
        ]
    ): Controller_ = {
      val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], routes = js.Any.fromFunction0(routes))
      __obj.asInstanceOf[Controller_]
    }
    
    @scala.inline
    implicit class Controller_MutableBuilder[Self <: Controller_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseUrl(value: String): Self = StObject.set(x, "baseUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoutes(
        value: () => js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ js.Any
            ]
      ): Self = StObject.set(x, "routes", js.Any.fromFunction0(value))
    }
  }
  
  trait ICacheConfig extends StObject {
    
    var expiresAt: js.UndefOr[Double] = js.undefined
    
    var expiresIn: js.UndefOr[Double] = js.undefined
    
    var privacy: js.UndefOr[String] = js.undefined
  }
  object ICacheConfig {
    
    @scala.inline
    def apply(): ICacheConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ICacheConfig]
    }
    
    @scala.inline
    implicit class ICacheConfigMutableBuilder[Self <: ICacheConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpiresAt(value: Double): Self = StObject.set(x, "expiresAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresAtUndefined: Self = StObject.set(x, "expiresAt", js.undefined)
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresInUndefined: Self = StObject.set(x, "expiresIn", js.undefined)
      
      @scala.inline
      def setPrivacy(value: String): Self = StObject.set(x, "privacy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivacyUndefined: Self = StObject.set(x, "privacy", js.undefined)
    }
  }
  
  type IRouteConfig = js.Function1[/* path */ String, IRouteSetup]
  
  type IRouteDecorator = js.Function2[/* method */ String, /* path */ String, IRouteSetup]
  
  type IRouteSetup = js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, js.Any]
}
