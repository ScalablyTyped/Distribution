package typings
package jsDashDataDashAngularLib.jsDashDataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DS extends js.Object {
  def bindAll[T](
    resourceName: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindAll[T](
    resourceName: java.lang.String,
    params: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSFilterParams */ js.Any,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
      /* items */ js.Array[
        T with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any)
      ], 
      scala.Unit
    ]
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: java.lang.String,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: java.lang.String,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
      /* item */ T with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
      scala.Unit
    ]
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: scala.Double,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String
  ): js.Function = js.native
  def bindOne[T](
    resourceName: java.lang.String,
    id: scala.Double,
    scope: angularLib.angularMod.IScope,
    expr: java.lang.String,
    cb: js.Function2[
      /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSError */ /* err */ js.Any, 
      /* item */ T with (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify DSInstanceShorthands<T> */ js.Any), 
      scala.Unit
    ]
  ): js.Function = js.native
}

