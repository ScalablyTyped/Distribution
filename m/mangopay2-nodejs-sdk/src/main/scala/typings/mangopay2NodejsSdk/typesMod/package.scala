package typings.mangopay2NodejsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type DeepPartial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/types.DeepPartial<T[P]> * / object}
    */ typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeepPartial with js.Any
  type MakeKeysNullable[T1, T2 /* <: java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.MakeKeysNullable with T1
  type MakeKeysOptional[T1, T2 /* <: java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typings.std.Partial[typings.std.Pick[T1, T2]])
  type MakeKeysRequired[T1, T2 /* <: java.lang.String */] = (typings.mangopay2NodejsSdk.typesMod.Omit[T1, T2]) with (typings.std.Required[typings.std.Pick[T1, T2]])
  type Omit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
  type OmitType[T /* <: typings.mangopay2NodejsSdk.AnonType */] = typings.mangopay2NodejsSdk.typesMod.Omit[T, typings.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
  type PickPartial[T, Par /* <: java.lang.String */] = typings.std.Pick[typings.std.Partial[T], Par]
  type PickPartialRequired[T, Par /* <: java.lang.String */, Req /* <: java.lang.String */] = (typings.std.Pick[typings.std.Partial[T], Par]) with (typings.std.Pick[typings.std.Required[T], Req])
  type ValueOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: T[keyof T] */ js.Any
}
