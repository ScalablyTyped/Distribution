package typings.hapiDecorators

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hapi-decorators", "all")
  @js.native
  val all: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "cache")
  @js.native
  def cache(cacheConfig: ICacheConfig): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  
  @JSImport("hapi-decorators", "config")
  @js.native
  def config(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteAdditionalConfigurationOptions */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  
  @JSImport("hapi-decorators", "controller")
  @js.native
  def controller(baseUrl: String): js.Function1[/* target */ ControllerStatic, Unit] = js.native
  
  @JSImport("hapi-decorators", "get")
  @js.native
  val get: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "patch")
  @js.native
  val patch: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "post")
  @js.native
  val post: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "pre")
  @js.native
  def pre(pre: StringDictionary[js.Any]): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  
  @JSImport("hapi-decorators", "put")
  @js.native
  val put: IRouteConfig = js.native
  
  @JSImport("hapi-decorators", "route")
  @js.native
  val route: IRouteDecorator = js.native
  
  @JSImport("hapi-decorators", "validate")
  @js.native
  def validate(
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteValidationConfigurationObject */ js.Any
  ): js.Function3[/* target */ js.Any, /* key */ js.Any, /* descriptor */ js.Any, _] = js.native
  
  @js.native
  trait ControllerStatic
    extends Instantiable1[/* args (repeated) */ js.Any, Controller_]
  
  @js.native
  trait Controller_ extends StObject {
    
    var baseUrl: String = js.native
    
    def routes(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
      ] = js.native
  }
  object Controller_ {
    
    @scala.inline
    def apply(
      baseUrl: String,
      routes: () => js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
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
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify hapi.RouteConfiguration */ _
            ]
      ): Self = StObject.set(x, "routes", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ICacheConfig extends StObject {
    
    var expiresAt: js.UndefOr[Double] = js.native
    
    var expiresIn: js.UndefOr[Double] = js.native
    
    var privacy: js.UndefOr[String] = js.native
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
