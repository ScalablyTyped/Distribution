package typings
package hatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hatMod {
  type CreateRack = js.Function3[
    /* bits */ js.UndefOr[scala.Double], 
    /* base */ js.UndefOr[scala.Double], 
    /* expandBy */ js.UndefOr[scala.Double], 
    Rack
  ]
  type HatsList = org.scalablytyped.runtime.StringDictionary[js.Any]
}
