package typings.graphql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationContextMod {
  type SDLValidationRule = js.Function1[
    /* context */ typings.graphql.validationContextMod.SDLValidationContext, 
    typings.graphql.visitorMod.ASTVisitor
  ]
  type ValidationRule = js.Function1[
    /* context */ typings.graphql.validationContextMod.ValidationContext, 
    typings.graphql.visitorMod.ASTVisitor
  ]
}
