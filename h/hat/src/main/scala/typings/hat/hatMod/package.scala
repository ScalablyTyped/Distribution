package typings.hat

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hatMod {
  type CreateRack = js.Function3[
    /* bits */ js.UndefOr[Double], 
    /* base */ js.UndefOr[Double], 
    /* expandBy */ js.UndefOr[Double], 
    Rack
  ]
  type HatsList = StringDictionary[js.Any]
}
