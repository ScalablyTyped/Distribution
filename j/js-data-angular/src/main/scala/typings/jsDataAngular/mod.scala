package typings.jsDataAngular

import typings.angular.mod.IScope
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  @js.native
  trait DS extends StObject {
    
    def bindAll[T](
      resourceName: String,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
      scope: IScope,
      expr: String
    ): js.Function = js.native
    def bindAll[T](
      resourceName: String,
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* items */ js.Array[
            T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any)
          ], 
          Unit
        ]
    ): js.Function = js.native
    
    def bindOne[T](resourceName: String, id: String, scope: IScope, expr: String): js.Function = js.native
    def bindOne[T](
      resourceName: String,
      id: String,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* item */ T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
          Unit
        ]
    ): js.Function = js.native
    def bindOne[T](resourceName: String, id: Double, scope: IScope, expr: String): js.Function = js.native
    def bindOne[T](
      resourceName: String,
      id: Double,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* item */ T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
          Unit
        ]
    ): js.Function = js.native
  }
  
  @js.native
  trait DSProvider extends StObject {
    
    var defaults: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any = js.native
  }
  object DSProvider {
    
    @scala.inline
    def apply(
      defaults: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
    ): DSProvider = {
      val __obj = js.Dynamic.literal(defaults = defaults.asInstanceOf[js.Any])
      __obj.asInstanceOf[DSProvider]
    }
    
    @scala.inline
    implicit class DSProviderMutableBuilder[Self <: DSProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaults(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSConfiguration */ js.Any
      ): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DSResourceDefinition[T] extends StObject {
    
    def bindAll(
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
      scope: IScope,
      expr: String
    ): js.Function = js.native
    def bindAll(
      params: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* items */ js.Array[
            T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any)
          ], 
          Unit
        ]
    ): js.Function = js.native
    
    def bindOne(id: String, scope: IScope, expr: String): js.Function = js.native
    def bindOne(
      id: String,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* item */ T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
          Unit
        ]
    ): js.Function = js.native
    def bindOne(id: Double, scope: IScope, expr: String): js.Function = js.native
    def bindOne(
      id: Double,
      scope: IScope,
      expr: String,
      cb: js.Function2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
          /* item */ T with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
          Unit
        ]
    ): js.Function = js.native
  }
}
