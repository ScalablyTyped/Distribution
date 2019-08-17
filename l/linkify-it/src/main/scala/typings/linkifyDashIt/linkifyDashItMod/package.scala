package typings.linkifyDashIt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkifyDashItMod {
  import org.scalablytyped.runtime.StringDictionary

  type Rule = String | FullRule
  type SchemaRules = StringDictionary[Rule]
  type Validate = js.Function3[/* text */ String, /* pos */ Double, /* self */ LinkifyIt, Double | Boolean]
}
