package typings.japanPostalCode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback = js.Function1[/* addressData */ typings.japanPostalCode.mod.AddressData, scala.Unit]
  
  type FetchPostalCodeMethod = js.Function2[
    /* stringifiedPostalCode */ java.lang.String, 
    /* callback */ typings.japanPostalCode.mod.Callback, 
    scala.Unit
  ]
}
