package typings.graphqlCompose.mod.graphql

import typings.graphql.maybeMod.Maybe
import typings.graphql.visitorMod.VisitFn
import typings.graphql.visitorMod.Visitor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("graphql-compose", "graphql.getVisitFn")
@js.native
object getVisitFn extends js.Object {
  def apply(
    visitor: Visitor[
      _, 
      /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any] */ js.Any
    ],
    kind: String,
    isLeaving: Boolean
  ): Maybe[VisitFn[_, _]] = js.native
}

