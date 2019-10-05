package typings.graphql.languageVisitorMod

import typings.graphql.tsutilsMaybeMod.Maybe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql/language/visitor", "getVisitFn")
@js.native
object getVisitFn extends js.Object {
  def apply(
    visitor: Visitor[
      _, 
      /* import warning: ImportType.apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
}

