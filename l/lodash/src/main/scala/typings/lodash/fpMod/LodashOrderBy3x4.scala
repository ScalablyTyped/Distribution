package typings.lodash.fpMod

import typings.lodash.lodashStrings.asc
import typings.lodash.lodashStrings.desc
import typings.lodash.mod.Many
import typings.lodash.mod.NotVoid
import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashOrderBy3x4[T] extends js.Object {
  def apply(
    iteratees: Many[
      ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ]
    ]
  ): LodashOrderBy4x5[T] = js.native
  def apply(
    iteratees: Many[
      (js.Function1[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ /* value */ js.Any, 
        NotVoid
      ]) | (ValueIteratee[
        /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
      ])
    ],
    orders: Many[Boolean | asc | desc]
  ): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply(iteratees: __, orders: Many[Boolean | asc | desc]): LodashOrderBy3x6[T] = js.native
}

