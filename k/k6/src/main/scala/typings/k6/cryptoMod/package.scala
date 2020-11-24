package typings.k6

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object cryptoMod {
  
  type BinaryEncoding = typings.k6.k6Strings.binary
  
  type Output[OE /* <: typings.k6.cryptoMod.OutputEncoding */] = typings.k6.mod.bytes | java.lang.String
  
  type OutputEncoding = typings.k6.cryptoMod.StringEncoding | typings.k6.cryptoMod.BinaryEncoding
}
