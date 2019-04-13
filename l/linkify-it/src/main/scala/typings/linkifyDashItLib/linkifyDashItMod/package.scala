package typings
package linkifyDashItLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object linkifyDashItMod {
  type Rule = java.lang.String | FullRule
  type SchemaRules = org.scalablytyped.runtime.StringDictionary[Rule]
  type Validate = js.Function3[
    /* text */ java.lang.String, 
    /* pos */ scala.Double, 
    /* self */ LinkifyIt, 
    scala.Double | scala.Boolean
  ]
}
