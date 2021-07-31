package typings.lodash.fpMod

import typings.lodash.mod.__
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LodashPropOr1x2[TObject, TKey /* <: /* keyof TObject */ String */] extends StObject {
  
  def apply(defaultValue: __): LodashPropOr1x6[TObject, TKey] = js.native
  def apply(defaultValue: __, `object`: TObject): LodashPropOr1x6[TObject, TKey] = js.native
  def apply[TDefault](defaultValue: TDefault): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
  def apply[TDefault](defaultValue: TDefault, `object`: TObject): (Exclude[
    /* import warning: importer.ImportType#apply Failed type conversion: TObject[TKey] */ js.Any, 
    Unit
  ]) | TDefault = js.native
}
