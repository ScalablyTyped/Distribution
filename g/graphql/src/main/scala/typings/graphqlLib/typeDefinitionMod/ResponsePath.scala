package typings
package graphqlLib.typeDefinitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePath extends js.Object {
  val key: java.lang.String | scala.Double
  val prev: js.UndefOr[
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias graphql.graphql/type/definition.ResponsePath */ js.Object
  ]
}

object ResponsePath {
  @scala.inline
  def apply(
    key: java.lang.String | scala.Double,
    prev: /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias graphql.graphql/type/definition.ResponsePath */ js.Object = null
  ): ResponsePath = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (prev != null) __obj.updateDynamic("prev")(prev)
    __obj.asInstanceOf[ResponsePath]
  }
}

