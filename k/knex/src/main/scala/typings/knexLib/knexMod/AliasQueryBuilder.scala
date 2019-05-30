package typings
package knexLib.knexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AliasQueryBuilder[TRecord /* <: js.Object */, TResult] extends js.Object {
  def apply[AliasUT /* <: js.Array[
    java.lang.String | (Ref[_, _]) | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ] */, TResult2](
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param aliases because its type AliasUT is not an array type */ aliases: AliasUT
  ): QueryBuilder[TRecord, TResult2] = js.native
}

