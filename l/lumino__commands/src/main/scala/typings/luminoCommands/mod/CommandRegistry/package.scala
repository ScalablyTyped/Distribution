package typings.luminoCommands.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object CommandRegistry {
  
  /**
    * A type alias for a user-defined command function.
    */
  type CommandFunc[T] = js.Function1[/* args */ typings.luminoCoreutils.jsonMod.ReadonlyPartialJSONObject, T]
  
  /**
    * A type alias for a simple immutable string dataset.
    */
  type Dataset = org.scalablytyped.runtime.StringDictionary[java.lang.String]
}
