package typings
package atHapiBasicLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atHapiBasicMod {
  type Validate = js.Function4[
    /* request */ atHapiHapiLib.atHapiHapiMod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ atHapiHapiLib.atHapiHapiMod.ResponseToolkit, 
    js.Promise[ValidateResponse | ValidateCustomResponse]
  ]
}
