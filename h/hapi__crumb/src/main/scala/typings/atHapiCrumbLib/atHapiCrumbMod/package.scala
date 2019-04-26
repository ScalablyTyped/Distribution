package typings
package atHapiCrumbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiCrumbMod {
  type SkipFunction = js.Function2[
    /* request */ js.UndefOr[atHapiHapiLib.atHapiHapiMod.Request], 
    /* h */ js.UndefOr[atHapiHapiLib.atHapiHapiMod.ResponseToolkit], 
    scala.Boolean
  ]
}
