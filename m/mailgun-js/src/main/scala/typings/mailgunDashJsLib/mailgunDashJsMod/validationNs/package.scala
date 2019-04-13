package typings
package mailgunDashJsLib.mailgunDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validationNs {
  type ValidationCallback = js.Function2[
    /* error */ mailgunDashJsLib.mailgunDashJsMod.Error, 
    /* body */ ValidateResponse, 
    scala.Unit
  ]
}
