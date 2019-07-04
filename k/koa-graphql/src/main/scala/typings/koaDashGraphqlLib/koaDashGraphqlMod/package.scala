package typings
package koaDashGraphqlLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object koaDashGraphqlMod {
  type Options = (js.Function3[
    /* request */ koaLib.koaMod.Request, 
    /* repsonse */ koaLib.koaMod.Response, 
    /* ctx */ koaLib.koaMod.Context, 
    OptionsResult
  ]) | OptionsResult
  type OptionsResult = OptionsData | js.Promise[OptionsData]
}
