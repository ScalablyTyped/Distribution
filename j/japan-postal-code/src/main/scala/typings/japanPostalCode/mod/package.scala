package typings.japanPostalCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function1[/* addressData */ typings.japanPostalCode.mod.AddressData, scala.Unit]
  type FetchPostalCodeMethod = js.Function2[
    /* stringifiedPostalCode */ java.lang.String, 
    /* callback */ typings.japanPostalCode.mod.Callback, 
    scala.Unit
  ]
}
