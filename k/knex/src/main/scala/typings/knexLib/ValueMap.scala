package typings
package knexLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueMap
  extends /* key */ org.scalablytyped.runtime.StringDictionary[
      Value | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ js.Any)
    ]

object ValueMap {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[
      Value | (/* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Knex.QueryBuilder */ js.Any)
    ] = null
  ): ValueMap = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ValueMap]
  }
}

