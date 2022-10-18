package typings.ky

import typings.ky.anon._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distributionTypesCommonMod {
  
  type LiteralUnion[LiteralType /* <: BaseType */, BaseType /* <: Primitive */] = LiteralType | (BaseType & _empty)
  
  type Primitive = js.UndefOr[Null | String | Double | Boolean | js.Symbol | js.BigInt]
  
  type Required[T, K /* <: /* keyof T */ String */] = T & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: -? T[P]} */ js.Any)
}
