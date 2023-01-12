package typings.hydraBox

import typings.express.mod.RequestHandler
import typings.express.mod.Router
import typings.hydraBox.apiMod.Api
import typings.hydraBox.mod.ResourceLoader
import typings.rdfjsTypes.dataModelMod.Quad
import typings.rdfjsTypes.datasetMod.DatasetCore
import typings.rdfjsTypes.streamMod.Store
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object middlewareMod {
  
  inline def apply(api: Api[DatasetCore[Quad, Quad]]): Router = ^.asInstanceOf[js.Dynamic].apply(api.asInstanceOf[js.Any]).asInstanceOf[Router]
  inline def apply(api: Api[DatasetCore[Quad, Quad]], options: Options): Router = (^.asInstanceOf[js.Dynamic].apply(api.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router]
  
  @JSImport("hydra-box/middleware", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait HydraBoxMiddleware extends StObject {
    
    var operations: js.UndefOr[
        (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]) | (js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ])
      ] = js.undefined
    
    var resource: js.UndefOr[
        (RequestHandler[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]) | (js.Array[
          RequestHandler[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ]
        ])
      ] = js.undefined
  }
  object HydraBoxMiddleware {
    
    inline def apply(): HydraBoxMiddleware = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HydraBoxMiddleware]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HydraBoxMiddleware] (val x: Self) extends AnyVal {
      
      inline def setOperations(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) | (js.Array[
              RequestHandler[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ]
            ])
      ): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
      
      inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
      
      inline def setOperationsVarargs(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ])*
      ): Self = StObject.set(x, "operations", js.Array(value*))
      
      inline def setResource(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) | (js.Array[
              RequestHandler[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ]
            ])
      ): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      inline def setResourceVarargs(
        value: (RequestHandler[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ])*
      ): Self = StObject.set(x, "resource", js.Array(value*))
    }
  }
  
  trait Options extends StObject {
    
    var baseIriFromRequest: js.UndefOr[Boolean] = js.undefined
    
    var loader: js.UndefOr[ResourceLoader] = js.undefined
    
    var middleware: js.UndefOr[HydraBoxMiddleware] = js.undefined
    
    var store: js.UndefOr[Store[Quad]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setBaseIriFromRequest(value: Boolean): Self = StObject.set(x, "baseIriFromRequest", value.asInstanceOf[js.Any])
      
      inline def setBaseIriFromRequestUndefined: Self = StObject.set(x, "baseIriFromRequest", js.undefined)
      
      inline def setLoader(value: ResourceLoader): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setMiddleware(value: HydraBoxMiddleware): Self = StObject.set(x, "middleware", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareUndefined: Self = StObject.set(x, "middleware", js.undefined)
      
      inline def setStore(value: Store[Quad]): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
}
