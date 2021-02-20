package typings.lodash.fpMod

import typings.lodash.mod.ValueIteratee
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashFindLastKey extends StObject {
  
  def apply[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ]
  ): js.UndefOr[String] = js.native
  def apply[T](
    predicate: ValueIteratee[
      /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
    ],
    `object`: T
  ): js.UndefOr[String] = js.native
  def apply[T](predicate: __): LodashFindLastKey1x2[T] = js.native
  def apply[T](predicate: __, `object`: T): LodashFindLastKey1x2[T] = js.native
}
