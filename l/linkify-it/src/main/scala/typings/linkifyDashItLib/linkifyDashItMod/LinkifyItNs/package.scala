package typings
package linkifyDashItLib.linkifyDashItMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object LinkifyItNs {
  type Rule = java.lang.String | FullRule
  type Validate = js.Function3[
    /* text */ java.lang.String, 
    /* pos */ scala.Double, 
    /* self */ LinkifyIt, 
    scala.Double | scala.Boolean
  ]
}
