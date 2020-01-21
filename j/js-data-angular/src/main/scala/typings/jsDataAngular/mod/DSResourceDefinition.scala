package typings.jsDataAngular.mod

import typings.angular.mod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DSResourceDefinition[T] extends js.Object {
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

