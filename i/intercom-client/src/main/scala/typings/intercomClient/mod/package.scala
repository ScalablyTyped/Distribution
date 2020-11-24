package typings.intercomClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type callback[T] = (js.Function1[/* d */ T, scala.Unit]) | (js.Function2[
    /* err */ typings.intercomClient.intercomErrorMod.IntercomError, 
    /* d */ T, 
    scala.Unit
  ])
}
