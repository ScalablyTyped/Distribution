package typings
package graphqlLib.utilitiesIntrospectionQueryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionOptions extends js.Object {
  // Whether to include descriptions in the introspection result.
  // Default: true
  var descriptions: scala.Boolean
}

object IntrospectionOptions {
  @scala.inline
  def apply(descriptions: scala.Boolean): IntrospectionOptions = {
    val __obj = js.Dynamic.literal(descriptions = descriptions)
  
    __obj.asInstanceOf[IntrospectionOptions]
  }
}

