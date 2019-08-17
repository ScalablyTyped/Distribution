package typings.hat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object hatMod {
  import org.scalablytyped.runtime.StringDictionary

  type CreateRack = js.Function3[
    /* bits */ js.UndefOr[Double], 
    /* base */ js.UndefOr[Double], 
    /* expandBy */ js.UndefOr[Double], 
    Rack
  ]
  type HatsList = StringDictionary[js.Any]
}
