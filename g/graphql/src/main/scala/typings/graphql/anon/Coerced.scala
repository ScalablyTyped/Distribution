package typings.graphql.anon

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.valuesMod.CoercedVariableValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Coerced extends CoercedVariableValues {
  var coerced: StringDictionary[js.Any]
}

object Coerced {
  @scala.inline
  def apply(coerced: StringDictionary[js.Any]): Coerced = {
    val __obj = js.Dynamic.literal(coerced = coerced.asInstanceOf[js.Any])
    __obj.asInstanceOf[Coerced]
  }
}

