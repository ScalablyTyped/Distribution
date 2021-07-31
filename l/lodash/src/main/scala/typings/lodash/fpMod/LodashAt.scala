package typings.lodash.fpMod

import typings.lodash.mod.Dictionary
import typings.lodash.mod.Many
import typings.lodash.mod.NumericDictionary
import typings.lodash.mod.PropertyPath
import typings.lodash.mod.__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashAt extends StObject {
  
  def apply(props: PropertyPath): LodashAt1x1 = js.native
  def apply[T /* <: js.Object */](props: Many[/* keyof T */ String], `object`: T): js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
  ] = js.native
  def apply[T](props: PropertyPath, `object`: Dictionary[T]): js.Array[T] = js.native
  def apply[T](props: PropertyPath, `object`: NumericDictionary[T]): js.Array[T] = js.native
  def apply[T /* <: js.Object */](props: __): LodashAt2x2[T] = js.native
  def apply[T /* <: js.Object */](props: __, `object`: T): LodashAt2x2[T] = js.native
  def apply[T](props: __, `object`: Dictionary[T]): LodashAt1x2[T] = js.native
  def apply[T](props: __, `object`: NumericDictionary[T]): LodashAt1x2[T] = js.native
}
