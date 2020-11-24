package typings.java

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Callback[T] = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* result */ js.UndefOr[T], scala.Unit]
  
  type Promisify = js.Function2[/* funct */ js.Function, /* receiver */ js.UndefOr[js.Any], js.Function]
  
  type ProxyFunctions = org.scalablytyped.runtime.StringDictionary[js.Function]
}
