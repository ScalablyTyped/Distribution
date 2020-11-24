package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<T[P]> * / object}
    */ typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeepPartial with org.scalablytyped.runtime.TopLevel[js.Any]
  
  type MakeKeysNullable[T1, T2 /* <: /* keyof T1 */ java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MakeKeysNullable with org.scalablytyped.runtime.TopLevel[T1]
  
  type MakeKeysOptional[T1, T2 /* <: /* keyof T1 */ java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typings.std.Partial[typings.std.Pick[T1, T2]])
  
  type MakeKeysRequired[T1, T2 /* <: /* keyof T1 */ java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typings.std.Required[typings.std.Pick[T1, T2]])
  
  type Omit[T, K /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type OmitType[T /* <: typings.mangopay2NodejsSdk.anon.Type */] = typings.mangopay2NodejsSdk.typesMod.Omit[T, typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  
  type PickPartial[T, Par /* <: /* keyof T */ java.lang.String */] = typings.std.Pick[typings.std.Partial[T], Par]
  
  type PickPartialRequired[T, Par /* <: /* keyof T */ java.lang.String */, Req /* <: /* keyof T */ java.lang.String */] = (typings.std.Pick[typings.std.Partial[T], Par]) with (typings.std.Pick[typings.std.Required[T], Req])
  
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
