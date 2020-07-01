package typings.graphqlToolsUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validateDocumentsMod {
  type ValidationRule = js.Function1[
    /* context */ typings.graphql.mod.ValidationContext, 
    typings.graphql.visitorMod.ASTVisitor
  ]
}
